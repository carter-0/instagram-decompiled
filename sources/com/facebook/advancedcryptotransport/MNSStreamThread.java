package com.facebook.advancedcryptotransport;

import X.0KC;
import X.C73547Pee;
import X.MZ7;

public class MNSStreamThread {
    public static volatile MNSStreamThread sInstance;
    public Thread mThread = null;

    public static native void nativeMNSStreamThreadRun(long j);

    public static void mnsStreamAttachLoopToThread(long j) {
        MNSStreamThread mNSStreamThread;
        synchronized (MNSStreamThread.class) {
            if (sInstance == null) {
                sInstance = new MNSStreamThread();
            }
            mNSStreamThread = sInstance;
        }
        synchronized (mNSStreamThread) {
            if (mNSStreamThread.mThread == null) {
                C73547Pee pee = new C73547Pee(mNSStreamThread, j);
                mNSStreamThread.mThread = pee;
                pee.setPriority(5);
                mNSStreamThread.mThread.start();
            } else {
                0KC.A0C("mccw.mns", "attach_thread");
            }
        }
    }

    static {
        MZ7.A00();
    }
}
