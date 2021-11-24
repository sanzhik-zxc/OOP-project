public class Channel {
    private String name;

    static Channel addChannel(String name) {
        Channel channel = new Channel();
        channel.name = name;
        return channel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
