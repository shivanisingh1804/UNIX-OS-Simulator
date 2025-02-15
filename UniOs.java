import java.util.*;

public class UniOs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSystem fileSystem = new FileSystem();
        TextEditor textEditor = new TextEditor();
        Calculator calculator = new Calculator();
        Sorting sorting = new Sorting();
        AlgorithmVisualizer algoVisualizer = new AlgorithmVisualizer();

        while (true) {
            System.out.println("\n=== UNIX-Style OS Simulator ===");
            System.out.println("1. Process Scheduling");
            System.out.println("2. File System");
            System.out.println("3. Text Editor");
            System.out.println("4. Calculator");
            System.out.println("5. Sorting Visualization");
            System.out.println("6. Algorithm Visualization");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    processScheduling();
                    break;
                case 2:
                    fileSystemOperations(fileSystem, scanner);
                    break;
                case 3:
                    textEditorOperations(textEditor, scanner);
                    break;
                case 4:
                    calculatorOperations(calculator, scanner);
                    break;
                case 5:
                    sortingVisualization(sorting);
                    break;
                case 6:
                    algoVisualizer.run();
                    break;
                case 7:
                    System.out.println("Exiting UNIX-Style OS Simulator...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void processScheduling() {
        Queue<Process> processQueue = new LinkedList<>();
        processQueue.add(new Process(1, 5, 2));
        processQueue.add(new Process(2, 8, 1));
        processQueue.add(new Process(3, 3, 3));

        System.out.println("Running Round Robin Scheduling:");
        ProcessScheduler.roundRobinScheduling(processQueue, 2);

        List<Process> processList = new ArrayList<>();
        processList.add(new Process(1, 5, 2));
        processList.add(new Process(2, 8, 1));
        processList.add(new Process(3, 3, 3));

        System.out.println("Running Priority Scheduling:");
        ProcessScheduler.priorityScheduling(processList);
    }

    private static void fileSystemOperations(FileSystem fileSystem, Scanner scanner) {
        System.out.print("Enter file name: ");
        String name = scanner.next();
        System.out.print("Enter file content: ");
        scanner.nextLine(); 
        String content = scanner.nextLine();
        fileSystem.createFile(name, content);
        fileSystem.readFile(name);
        System.out.print("Delete file? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            fileSystem.deleteFile(name);
        }
    }

    private static void textEditorOperations(TextEditor textEditor, Scanner scanner) {
        System.out.print("Enter text: ");
        scanner.nextLine();
        String text = scanner.nextLine();
        textEditor.writeText(text);
        textEditor.displayText();
    }

    private static void calculatorOperations(Calculator calculator, Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Addition: " + Calculator.add(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));
        System.out.println("Division: " + Calculator.divide(num1, num2));
    }

    private static void sortingVisualization(Sorting sorting) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("Sorting using Bubble Sort:");
        Sorting.bubbleSort(arr);
    }
}
