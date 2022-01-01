package com.wiloke.thread.multithreadsissue;

import java.util.ArrayList;
import java.util.List;

public class RaceCondition {
    public static void show() throws InterruptedException {
        var downloadStatus = new DownloadStatus();
        var thread1 = new Thread(new DownloadTask(downloadStatus));
        var thread2 = new Thread(() -> {
            while (!downloadStatus.isDone()) {
            }
            System.out.println(downloadStatus.getBytes());
        });

        thread1.start();
        thread2.start();
        // Ket qua
//        Downloading a file: Thread-0
//        Download completed: Thread-0
        // Thread one da chay nhung thread2 chay forever.
        // Nguyen nhan: Khi chay Java se optimize code de chay nhanh hon
        // Caching value la 1 trong những optimization đó.
        // Ở ví dụ trên, Integer sẽ được cache như sau: https://www.dropbox.com/s/zwmnb63r4tlskwy/Screen%20Shot%202022-01-01%20at%2018.45.28.png?dl=0
        // Giá trị được cache trên Memory và ram.
        // Do có 2 threads, mỗi phần nhỏ của CPU sẽ cache value trên nó https://www.dropbox.com/s/yl1sakqtmtiu054/Screen%20Shot%202022-01-01%20at%2018.46.46.png?dl=0
        // => Dù thread1 chạy xong nhưng nó chỉ cache trên CPU 1
        // Để fix, cần khai báo keyword volatile tạo Boolean
    }
}
