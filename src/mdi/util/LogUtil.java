package mdi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.util.StatusPrinter;

public class LogUtil {

	
	public static void main(String[] args) {
		LoggerContext logContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		logContext.reset();
		StatusPrinter.print(logContext);
		JoranConfigurator configurator = new JoranConfigurator();
		configurator.setContext(logContext);
		
		//configurator.doConfigure(eventList);
		/*
		Logger logger = LoggerFactory.getLogger(LogUtil.class);
		logger.debug("Hello");
		Logger logger2 = LoggerFactory.getLogger(LogUtil.class);
		logger2.debug("Hello");
		*/
	}
	
}
