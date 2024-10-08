package X;

import android.os.Looper;

/* renamed from: X.8pp  reason: invalid class name and case insensitive filesystem */
public final class C366878pp extends 0ng {
    public final /* synthetic */ C366868po A00;
    public final /* synthetic */ C312246e4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C366878pp(C366868po r2, C312246e4 r3) {
        super(28);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        C366868po r2 = this.A00;
        C312246e4 r4 = this.A01;
        if (r4.A0I == null) {
            synchronized (r4.A06) {
                if (r4.A0I == null) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        0kD.A01(C273654mx.A00(1283), "hasSufficientStorage() executed in UI thread");
                    }
                    boolean z = true;
                    if (0JN.A01().A09() && 0JN.A01().A0A()) {
                        z = false;
                    }
                    r4.A0I = Boolean.valueOf(z);
                }
            }
        }
        r2.A00(Boolean.TRUE.equals(r4.A0I));
    }
}
