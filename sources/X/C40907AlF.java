package X;

import android.os.HandlerThread;

/* renamed from: X.AlF  reason: case insensitive filesystem */
public final /* synthetic */ class C40907AlF implements Runnable {
    public final /* synthetic */ AnonymousClass4M1 A00;

    public /* synthetic */ C40907AlF(AnonymousClass4M1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ((HandlerThread) this.A00.A0l.getLooper().getThread()).quit();
    }
}
