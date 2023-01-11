public class WhatsAppFactory implements MultiChatFactory {

    @Override
    public Connection createConnection() {
        return new WhatsAppConnection();
    }

    @Override
    public Skin createSkin() {
        return new WhatsAppSkin();
    }
}
