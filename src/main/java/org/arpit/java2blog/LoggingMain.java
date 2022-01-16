package org.arpit.java2blog;
 
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
 
public class LoggingMain {
 
  private static final Logger logger = LogManager.getLogger(LoggingMain.class);
 public static void main(String[] args) {
 
  DOMConfigurator.configure("log4j.xml");
  logger.info("Hello world");
  logger.info("we are in logger info mode");
 
 }
 
}