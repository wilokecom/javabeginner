package com.wiloke.thread.multithreadsissue;

public class DownloadStatus {
    private int bytes;
    private int totalDownload;
    private final Object increaseByteObject = new Object();
    private final Object totalDownloadObject = new Object();

    public int getBytes() {
        return bytes;
    }

    public int getTotalDownload() {
        return totalDownload;
    }

    // synchronized nhận vào 1 tham số là 1 object, đó chính là object quản lý lock
    // Nếu put this tại đây sẽ rất bad. Ví dụ: Có 2 thread: 1 gọi increaseBytes và 1 gọi increaseTotalDownload
    // increaseTotalDownload sẽ không được gọi do increaseBytes đã lock increaseTotalDownload - cùng quản lý bởi this
    public void increaseBytes() {
//        synchronized (this) {
        synchronized (increaseByteObject) {
            this.bytes = this.bytes + 1;
        }
    }

    public void increaseTotalDownload() {
//        synchronized (this) {
        synchronized (totalDownloadObject) {
            this.totalDownload = this.totalDownload + 1;
        }
    }
}
