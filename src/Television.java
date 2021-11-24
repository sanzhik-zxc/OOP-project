public class Television {
    int currentChannel;
    int maxChannels;

    Television(int currentChannel, int maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
    }

    void nextChannel() {
        currentChannel += 1;
        if (currentChannel > 9) {
            currentChannel = 0;
        }
    }

    void prevChannel() {
        currentChannel -= 1;
        if (currentChannel < 0) {
            currentChannel = 9;
        }
    }

    void numberChannel(int number) {
        currentChannel = number;
    }

    void outputChannel(Channel[] arr) {
        System.out.println("Текущий канал " + currentChannel + " = " + arr[currentChannel].getName());
    }

    void outputChannelNumber(Channel[] arr, int number) {
        currentChannel = number;
        System.out.println("Номер канала " + number + " = " + arr[currentChannel].getName());
    }

}