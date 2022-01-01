package com.wiloke.thread.multithreadsissue;


public class DownloadTask implements Runnable {
    private final DownloadStatus status;
    private final Integer order;

    public DownloadTask(DownloadStatus status, Integer order) {
        this.status = status;
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + order  + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (var i = 0; i < 100; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            this.status.increaseBytes();
//            System.out.println("Downloading " + i + " bytes");
        }

//        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}
