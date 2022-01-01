package com.wiloke.thread.multithreadsissue;


public class DownloadTask implements Runnable {
    private final DownloadStatus status;

    public DownloadTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: "  + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (var i = 0; i < 1_000_0000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            this.status.increaseBytes();
//            System.out.println("Downloading " + i + " bytes");
        }

        this.status.done();
        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}
