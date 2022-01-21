package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TransferAggregator {


    public List<TransferPerClient> readTransfers(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            var map = new TreeMap<String, TransferPerClient>();
            while (reader.ready()) {
                var data = reader.readLine().split(",");
                int amount = Integer.parseInt(data[2]);
                newTransfer(map,data[0],amount);
                newTransfer(map,data[1],amount);
            }
            return List.copyOf(map.values());
        } catch (IOException e) {
            throw new IllegalArgumentException("invalid path");
        }
    }

    private void newTransfer(Map<String, TransferPerClient> map, String uuid, int amount) {
        if (map.containsKey(uuid)) {
            map.get(uuid).increaseAmount(amount > 0 ? amount : -amount);
        } else {
            map.put(uuid, new TransferPerClient(uuid));
        }
    }

}
