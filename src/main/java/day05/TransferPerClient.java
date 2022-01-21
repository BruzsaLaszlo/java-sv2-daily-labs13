package day05;

import java.util.Objects;

public class TransferPerClient implements Comparable<TransferPerClient>{

    private final String uuid;
    private long sum = 0;
    private int numberOfTransactions = 0;

    public TransferPerClient(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int compareTo(TransferPerClient o) {
        return uuid.compareTo(o.uuid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferPerClient that = (TransferPerClient) o;
        return Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }

    @Override
    public String toString() {
        return String.format("%s%12s%5s",uuid,sum,numberOfTransactions);
    }

    public void increaseAmount(long amount) {
        sum += amount;
        numberOfTransactions++;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}
