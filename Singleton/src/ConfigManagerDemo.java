public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxplayers: " + configManager.getConfig("maxplayers"));
        configManager.printAllConfigs();
    }
}
