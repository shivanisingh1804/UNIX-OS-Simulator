import java.util.HashMap;
import java.util.Map;

public class FileSystem {
    private Map<String, String> files = new HashMap<>();

    public void createFile(String name, String content) {
        files.put(name, content);
        System.out.println("File " + name + " created.");
    }

    public void readFile(String name) {
        System.out.println(files.getOrDefault(name, "File not found."));
    }

    public void deleteFile(String name) {
        files.remove(name);
        System.out.println("File " + name + " deleted.");
    }
}
