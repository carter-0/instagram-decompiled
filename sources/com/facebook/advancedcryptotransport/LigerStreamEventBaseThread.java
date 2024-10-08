package com.facebook.advancedcryptotransport;

import X.0KC;
import X.AnonymousClass5oI;
import X.MZ7;

public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    public static native void nativeLigerStreamEventBaseThreadRun(long j);

    public static void ligerStreamEventBaseAttachToThread(long j) {
        LigerStreamEventBaseThread ligerStreamEventBaseThread;
        synchronized (LigerStreamEventBaseThread.class) {
            if (sInstance == null) {
                sInstance = new LigerStreamEventBaseThread();
            }
            ligerStreamEventBaseThread = sInstance;
        }
        synchronized (ligerStreamEventBaseThread) {
            if (ligerStreamEventBaseThread.mThread == null) {
                AnonymousClass5oI r1 = new AnonymousClass5oI(ligerStreamEventBaseThread, j);
                ligerStreamEventBaseThread.mThread = r1;
                r1.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            } else {
                0KC.A0C("mccw.liger", "attach_thread");
            }
        }
    }

    static {
        MZ7.A00();
    }
}
