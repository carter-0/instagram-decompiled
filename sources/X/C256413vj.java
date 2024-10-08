package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.3vj  reason: invalid class name and case insensitive filesystem */
public final class C256413vj implements Runnable {
    public final /* synthetic */ VpsEventCallback A00;
    public final /* synthetic */ C256243vS A01;
    public final /* synthetic */ 2A4 A02;

    public C256413vj(VpsEventCallback vpsEventCallback, C256243vS r2, 2A4 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = vpsEventCallback;
    }

    public final void run() {
        2A4 r2 = this.A02;
        2A4.A05(this.A00, this.A01, r2);
    }
}
