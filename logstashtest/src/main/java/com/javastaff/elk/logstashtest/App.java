package com.javastaff.elk.logstashtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) throws InterruptedException {
		MDC.put("producer", "pippo");
		while(true) {
			LOG.info("Ciao");
			try {
				args[1].equals("ops");
			}
			catch (Exception e) {
				LOG.error(e.toString());
			}
			Thread.currentThread().sleep(1333);
		}
	}
}
