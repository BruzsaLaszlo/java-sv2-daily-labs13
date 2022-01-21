package day05;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransferAggregatorTest {


    @Test
    void readTransfers() throws IOException {

        TransferAggregator ta = new TransferAggregator();

        var expected = Files.readAllLines(Path.of("src/test/resources/transfers-sum.txt"));
        var actual = ta.readTransfers(Path.of("src/main/resources/transfers.csv"));
        Files.write(Path.of("src/test/resources/test_result.txt"), actual.stream().map(TransferPerClient::toString).toList());
        assertEquals(20, actual.size());
        assertEquals(expected,actual);

    }
}