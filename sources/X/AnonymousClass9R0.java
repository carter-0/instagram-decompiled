package X;

import java.util.Iterator;

/* renamed from: X.9R0  reason: invalid class name */
public final class AnonymousClass9R0 implements B16 {
    public final /* synthetic */ B16 A00;
    public final /* synthetic */ C341627nG A01;

    public AnonymousClass9R0(B16 b16, C341627nG r2) {
        this.A01 = r2;
        this.A00 = b16;
    }

    public final void onFinished() {
        C341627nG r3 = this.A01;
        C341637nH r4 = r3.A09;
        r4.A00 = null;
        Thread currentThread = Thread.currentThread();
        if (r4.equals(currentThread.getUncaughtExceptionHandler())) {
            currentThread.setUncaughtExceptionHandler(r4.A01);
        }
        r3.A00 = 4;
        C341627nG.A01(r3, AnonymousClass05K.A0u);
        Iterator A0v = AnonymousClass7TF.A0v(r3.A05);
        while (A0v.hasNext()) {
            ((C341717nP) A0v.next()).release();
        }
        r3.A0A = null;
        r3.A01 = 0;
        r3.A00 = 5;
        B16 b16 = this.A00;
        if (b16 != null) {
            b16.onFinished();
        }
    }
}
