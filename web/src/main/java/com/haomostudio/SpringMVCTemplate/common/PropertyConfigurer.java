package com.haomostudio.SpringMVCTemplate.common;

/**
 * Created by guanpb on 2017/5/2.
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * Desc:properties配置文件读取类
 * Created by guanpb on 2017/05/01.
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

    private Properties props;       // 存取properties配置文件key-value结果

    public PropertyConfigurer() {

    }

    public PropertyConfigurer(Properties props) {
        this.props = props;
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
            throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        this.props = props;
    }

    public String getProperty(String key){
        return this.props.getProperty(key);
    }

    public String getProperty(String key, String defaultValue) {
        return this.props.getProperty(key, defaultValue);
    }

    public Object setProperty(String key, String value) {
        return this.props.setProperty(key, value);
    }
}