package com.wiloke.thread.multithreadsissue;

import java.util.ArrayList;
import java.util.List;

public class RaceCondition {
    public static void show() throws InterruptedException {
        var downloadStatus = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 5; i++) {
            var thread = new Thread(new DownloadTask(downloadStatus, i));
            thread.start();
            threads.add(thread);
        }

        for (var thread: threads) {
            thread.join();
        }

        System.out.println(downloadStatus.getBytes());
        System.out.println(downloadStatus.getTotalDownload());
    }
}
