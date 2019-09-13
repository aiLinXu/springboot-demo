package cn.itcast.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Component
@ConfigurationProperties("jdbc")
public class Config {
    private String driverClassName;
    private String url;
    private String username;
    private String passwordassName;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordassName() {
        return passwordassName;
    }

    public void setPasswordassName(String passwordassName) {
        this.passwordassName = passwordassName;
    }
}
