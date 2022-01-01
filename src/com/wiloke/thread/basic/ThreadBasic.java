package com.wiloke.thread.basic;

public class ThreadBasic {
    public static void show() throws InterruptedException {
        System.out.println(java.lang.Thread.activeCount());
        // Nhận lại 2
        // Một thread là main thread xử lý Java code
        // Thread còn lại chạy ngầm và là Garbage Collector => Xử lý dọn rác
        // 2 threads này chạy parallel
        System.out.println(Runtime.getRuntime().availableProcessors());
        // In ra 12 => Máy có 3 cores, mỗi core có 4 threads


        // Để khám phá threads cần
        // 1. Các start
        // 2. Cách huỷ Interrupt
        // 3. Cách safely share data giữa chúng (cần cẩn thận)

        System.out.println(Thread.currentThread().getName());

        for (var i = 0; i <= 9; i++) {
           Thread thread = new Thread(new DownloadTask());
           thread.start();
           thread.join();
        }
//
//        Thread thread = new Thread(new DownloadTask());
//        thread.start();


//        thread.join();
//        System.out.println("The file is ready for downloading");

//        Thread.sleep(1000);
//        thread.interrupt();
    }
}
