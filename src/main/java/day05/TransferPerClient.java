package day05;

public class TransferPerClient {

    private final String uuid;
    private long sum = 0;
    private int numberOfTransactions = 0;

    public TransferPerClient(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return String.format("%s %,12d %5d", uuid, sum, numberOfTransactions)
                .replace(String.valueOf((char) 160), " ");
    }

    public void increaseAmount(long amount) {
        sum += amount;
        numberOfTransactions++;
    }

}
