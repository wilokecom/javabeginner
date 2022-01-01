package com.wiloke.thread.multithreadsissue;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int bytes;
    private final Lock lock = new ReentrantLock();

    public int getBytes() {
        return bytes;
    }

    public void increaseBytes() {
        this.lock.lock();
        this.bytes = this.bytes + 1;
        this.lock.unlock();
    }
}
