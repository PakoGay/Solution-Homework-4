public class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;
    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }
}

