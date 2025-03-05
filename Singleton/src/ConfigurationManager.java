import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private Map<String, String> config;
    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("maxplayers", "100");
        config.put("defaultlanguage", "en");
        config.put("gamedifficulty", "medium");
    }
    public static ConfigurationManager getInstance() {
        if(instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }
    public String getConfig(String key) {
        return config.get(key);
    }
    public void printAllConfigs() {
        System.out.println("Configuration Settings:");
        for(Map.Entry<String, String> entry : config.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
