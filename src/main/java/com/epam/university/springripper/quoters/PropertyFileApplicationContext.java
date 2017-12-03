package com.epam.university.springripper.quoters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {
    private static final Logger logger = LoggerFactory.getLogger(PropertyFileApplicationContext.class);

    public PropertyFileApplicationContext(String fileName) {
        PropertiesBeanDefinitionReader propertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader(this);
        int i = propertiesBeanDefinitionReader.loadBeanDefinitions(fileName);
        logger.debug("Found " + i + " beans.");
        refresh();
    }

    public static void main(String[] args) {
        PropertyFileApplicationContext propertyFileApplicationContext = new PropertyFileApplicationContext("spring/context.properties");
        propertyFileApplicationContext.getBean(Quoter.class).sayQuote();
    }
}
