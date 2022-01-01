package com.wiloke.thread.multithreadsissue;

public class DownloadStatus {
    private int bytes;

    public int getBytes() {
        return bytes;
    }

    public void increaseBytes() {
        this.bytes = this.bytes + 1;
    }
}
