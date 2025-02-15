import java.util.*;

class Process {
    int id, burstTime, remainingTime, priority;

    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

public class ProcessScheduler {
    public static void roundRobinScheduling(Queue<Process> queue, int timeQuantum) {
        int time = 0;
        while (!queue.isEmpty()) {
            Process current = queue.poll();
            if (current.remainingTime > timeQuantum) {
                time += timeQuantum;
                current.remainingTime -= timeQuantum;
                queue.add(current);
            } else {
                time += current.remainingTime;
                System.out.println("Process " + current.id + " completed at time " + time);
            }
        }
    }

    public static void priorityScheduling(List<Process> processes) {
        processes.sort(Comparator.comparingInt(p -> p.priority));
        int time = 0;
        for (Process process : processes) {
            time += process.burstTime;
            System.out.println("Process " + process.id + " completed at time " + time);
        }
    }
}
