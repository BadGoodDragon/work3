package org.example;

public class Watch {
    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public long end() {
        return System.nanoTime() - startTime;
    }
}
