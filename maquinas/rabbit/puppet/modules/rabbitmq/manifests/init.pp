class rabbitmq::server {

	exec {"install repository":
		command => "/bin/echo 'deb http://www.rabbitmq.com/debian/ testing main' | /usr/bin/tee /etc/apt/sources.list.d/rabbitmq.list",
		cwd => "/home/vagrant",
		user => "root",
		unless => "/bin/grep -Fx 'deb http://www.rabbitmq.com/debian/ testing main' /etc/apt/sources.list.d/rabbitmq.list";
	}
	
	exec {
		"wget aptkey":
		command => "/usr/bin/wget http://www.rabbitmq.com/rabbitmq-signing-key-public.asc",
		cwd => "/home/vagrant",
		creates => "/home/vagrant/rabbitmq-signing-key-public.asc",
		require => Exec["install repository"];
	}
	
	exec {"add repo key":
		command => "/usr/bin/apt-key add /home/vagrant/rabbitmq-signing-key-public.asc",
		cwd => "/home/vagrant",
		user => "root",
		require => Exec["wget aptkey"];
	}
	
	exec { "apt-update":
		command => "/usr/bin/apt-get -y update",
		timeout => 3600,
		require => Exec["add repo key"];
	}

	
	package {"rabbitmq-server":
		ensure => installed,
		require => Exec["apt-update"];
	}
	
	service {"rabbitmq-server":
		ensure => running,
		require => Package["rabbitmq-server"];
	}
	
	 file {"/etc/rabbitmq/rabbitmq.config":
		mode => 0755,
		source => "puppet:///modules/rabbitmq/rabbitmq.config",
		require => Package["rabbitmq-server"],
		notify => Service["rabbitmq-server"];
	}
}
	