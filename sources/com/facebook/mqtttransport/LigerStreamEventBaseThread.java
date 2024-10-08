package com.facebook.mqtttransport;

import X.0dV;
import X.C2604345q;
import X.C2604445r;

public class LigerStreamEventBaseThread {
    public static volatile LigerStreamEventBaseThread sInstance;
    public Thread mThread = null;

    public static native void nativeLigerStreamEventBaseThreadRun(long j);

    static {
        synchronized (C2604345q.class) {
            if (!C2604345q.A00) {
                0dV.A0C("mqtttransport_jni");
                C2604345q.A00 = true;
            }
        }
    }

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
                C2604445r r1 = new C2604445r(ligerStreamEventBaseThread, j);
                ligerStreamEventBaseThread.mThread = r1;
                r1.setPriority(5);
                ligerStreamEventBaseThread.mThread.start();
            }
        }
    }
}
