package com.org.commons.environment;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:conf/project.properties" })
public interface ProjectEnvironment extends Config {

	@Key("local")
	boolean getLocal();

}
