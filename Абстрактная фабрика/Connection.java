public interface Connection {

    void send(String message);
    String receive();
}
