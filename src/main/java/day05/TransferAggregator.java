package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TransferAggregator {


    public List<TransferPerClient> readTransfers(Path path) {
        var map = new TreeMap<String, TransferPerClient>();
        for (String line : readAllLinesFromFile(path)) {
            var data = line.split(",");

            int amount = Integer.parseInt(data[2]);
            String uuid1 = data[0];
            String uuid2 = data[1];

            newTransfer(map, uuid1, -amount);
            newTransfer(map, uuid2, amount);
        }
        return List.copyOf(map.values());
    }

    private void newTransfer(Map<String, TransferPerClient> map, String uuid, int amount) {
        map.putIfAbsent(uuid, new TransferPerClient(uuid));
        map.get(uuid).increaseAmount(amount);
    }

    private List<String> readAllLinesFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid path");
        }
    }

}
