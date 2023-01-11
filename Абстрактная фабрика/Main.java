public class Main {

    public static void main(String[] args) {

        // Chat via Messenger
        MultiChatFactory messengerConnectionFactory = new MessengerFactory();

        MultiChat messengerMultiChat = new MultiChat(messengerConnectionFactory);
        messengerMultiChat.chat();

        // Chat via WhatsApp
        MultiChatFactory whatsAppConnectionFactory = new WhatsAppFactory();

        MultiChat whatsAppMultiChat = new MultiChat(whatsAppConnectionFactory);
        whatsAppMultiChat.chat();
    }
}
