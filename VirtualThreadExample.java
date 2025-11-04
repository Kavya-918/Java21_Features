public class VirtualThreadExample {
    //  Before Java 21
    public static void beforeJava21() {
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Running task on: " + Thread.currentThread());
            });
            threads[i].start();
        }
        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //  Java 21 – Using Virtual Threads (Lightweight & Scalable)
    public static void java21VirtualThreads() {
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                System.out.println("Running task on (Virtual): " + Thread.currentThread());
            });
        }
        // Wait for all virtual threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Before Java 21 ---");
        beforeJava21();

        System.out.println("\n--- Java 21 Virtual Threads ---");
        java21VirtualThreads();
    }
}



/** Output 
[Running] cd "d:\Practise_Folder\Java21\" && javac VirtualThreadExample.java && java VirtualThreadExample
--- Before Java 21 ---
Running task on: Thread[#21,Thread-0,5,main]
Running task on: Thread[#22,Thread-1,5,main]
Running task on: Thread[#23,Thread-2,5,main]

--- Java 21 Virtual Threads ---
Running task on (Virtual): VirtualThread[#26]/runnable@ForkJoinPool-1-worker-2
Running task on (Virtual): VirtualThread[#24]/runnable@ForkJoinPool-1-worker-1
Running task on (Virtual): VirtualThread[#27]/runnable@ForkJoinPool-1-worker-3

**/

