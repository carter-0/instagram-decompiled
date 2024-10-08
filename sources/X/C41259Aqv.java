package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.Aqv  reason: case insensitive filesystem */
public final class C41259Aqv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C345827u9 A05;
    public final /* synthetic */ C346027uT A06;
    public final /* synthetic */ boolean A07;

    public C41259Aqv(C345827u9 r1, C346027uT r2, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A05 = r1;
        this.A06 = r2;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A07 = z;
    }

    public final void run() {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
        C345827u9 r4 = this.A05;
        C346027uT r3 = this.A06;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A04;
        int i5 = this.A00;
        boolean z = this.A07;
        r4.A03 = i;
        r4.A01 = i2;
        r4.A02 = i3;
        r4.A04 = i4;
        r4.A00 = i5;
        r4.A06 = z;
        if (r4.A0K == null) {
            r4.A0K = new C18849W5t(r4.A0F);
            C345827u9.A00(r4);
        }
        C346027uT r1 = r4.A0L;
        if (!(r1 == null || r1 == r3)) {
            C18849W5t w5t = r4.A0K;
            if (w5t != null) {
                w5t.A00();
            }
            r1.A01();
        }
        r4.A0L = r3;
        C18849W5t w5t2 = r4.A0K;
        C341147mP r0 = r4.A0J;
        if (w5t2 != null) {
            if (r0 != null) {
                onFrameAvailableListener = r4.A0C;
            } else {
                onFrameAvailableListener = w5t2;
            }
            synchronized (w5t2) {
                if (!w5t2.A02.A03()) {
                    w5t2.A03.A02(onFrameAvailableListener, r3);
                }
            }
        }
        C345827u9.A01(r4);
    }
}
