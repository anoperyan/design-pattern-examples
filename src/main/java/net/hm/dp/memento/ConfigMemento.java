package net.hm.dp.memento;

/**
 * 配置备忘录，里面有一个配置
 *
 * @author Yan Jiahong
 * Created on 2022/7/1
 */
public class ConfigMemento {
    private ServerConfig config;

    public ConfigMemento() {
    }

    public ServerConfig getConfig() {
        return config;
    }

    public void setConfig(ServerConfig config) {
        this.config = config;
    }
}
