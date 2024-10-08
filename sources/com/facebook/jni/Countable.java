package com.facebook.jni;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    public void finalize() {
        dispose();
    }
}
