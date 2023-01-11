public class MessengerFactory implements MultiChatFactory {

    @Override
    public Connection createConnection() {
        return new MessengerConnection();
    }

    @Override
    public Skin createSkin() {
        return new MessengerSkin();
    }
}
