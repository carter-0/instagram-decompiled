package X;

import android.view.Surface;

/* renamed from: X.AqM  reason: case insensitive filesystem */
public final class C41224AqM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Surface A02;
    public final /* synthetic */ C368618t1 A03;

    public C41224AqM(Surface surface, C368618t1 r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = surface;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        C368618t1 r1 = this.A03;
        r1.A0A = this.A02;
        r1.A03 = this.A01;
        r1.A02 = this.A00;
    }
}
