package com.wiloke.thread.multithreadsissue;

import java.util.ArrayList;
import java.util.List;

public class RaceCondition {
    public static void show() throws InterruptedException {
        // Sử dụng lock trong  DownloadStatus để lock tiến trình và bắt mọi thứ chạy theo trình tự
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
    }
}
