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
