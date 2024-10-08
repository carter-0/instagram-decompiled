package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PaI  reason: case insensitive filesystem */
public final /* synthetic */ class C73297PaI implements Runnable {
    public final /* synthetic */ C74328Pt4 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AtomicBoolean A02;

    public /* synthetic */ C73297PaI(C74328Pt4 pt4, String str, AtomicBoolean atomicBoolean) {
        this.A02 = atomicBoolean;
        this.A00 = pt4;
        this.A01 = str;
    }

    public final void run() {
        AtomicBoolean atomicBoolean = this.A02;
        C74328Pt4 pt4 = this.A00;
        String str = this.A01;
        if (!atomicBoolean.get()) {
            pt4.D53(str);
        }
    }
}
