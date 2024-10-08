package X;

import android.os.Process;

/* renamed from: X.3w2  reason: invalid class name and case insensitive filesystem */
public final class C256603w2 extends Thread {
    public final void run() {
        int myTid = Process.myTid();
        AnonymousClass3w4 r2 = AnonymousClass3w4.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (r2) {
            if (valueOf != null) {
                r2.A01.remove(valueOf);
                r2.A00.remove(valueOf);
            }
        }
    }
}
