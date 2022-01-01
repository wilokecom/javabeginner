package com.wiloke.thread.basic;

import com.wiloke.thread.multithreadsissue.DownloadStatus;

public class DownloadTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading a file: "  + Thread.currentThread().getName());

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading " + i + " bytes");
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}

