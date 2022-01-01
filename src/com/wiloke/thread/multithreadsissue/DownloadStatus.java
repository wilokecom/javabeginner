package com.wiloke.thread.multithreadsissue;

public class DownloadStatus {
    private int bytes;
//    private boolean isDone;
    private volatile boolean isDone;

    public int getBytes() {
        return bytes;
    }

    public void increaseBytes() {
        this.bytes = this.bytes + 1;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }
}
