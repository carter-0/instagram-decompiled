package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* renamed from: X.4uW  reason: invalid class name and case insensitive filesystem */
public final class C277124uW implements Runnable {
    public final /* synthetic */ C277104uR A00;

    public C277124uW(C277104uR r1) {
        this.A00 = r1;
    }

    public final void run() {
        FFSingletonJNILogger.flushHealthCounters();
    }
}
