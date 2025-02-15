public class TextEditor {
    private String content = "";

    public void writeText(String text) {
        content += text + "\n";
    }

    public void displayText() {
        System.out.println(content);
    }
}
