package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:browserstack.properties")
public interface BrowserstackConfig extends Config {

    String user();
    String key();
    String app();
    String url();
}