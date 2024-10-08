package X;

import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3wf  reason: invalid class name and case insensitive filesystem */
public final class C256983wf {
    public int A00 = -1;
    public C257013wi A01 = null;
    public boolean A02;
    public C257003wh A03;
    public C256683wB A04;
    public boolean A05;
    public final VpsEventCallback A06;
    public final C697227w A07;
    public final String A08;
    public final boolean A09;
    public final AtomicInteger A0A;

    public final synchronized void A00() {
        C257003wh r0;
        C257013wi r02;
        if (this.A05 && (r0 = this.A03) != null) {
            C256683wB r2 = r0.A01;
            VpsEventCallback vpsEventCallback = this.A06;
            if (!(vpsEventCallback == null || (r02 = this.A01) == null)) {
                C291455hK.A00(r02, vpsEventCallback, r2, this.A08, this.A00, 1, this.A09, false, true, this.A02);
                this.A01 = null;
            }
        }
    }

    public final synchronized void A01(C257003wh r2, C256683wB r3) {
        SystemClock.elapsedRealtime();
        this.A04 = r3;
        this.A03 = r2;
    }

    public C256983wf(VpsEventCallback vpsEventCallback, C697227w r3, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A08 = str;
        this.A07 = r3;
        this.A06 = vpsEventCallback;
        this.A09 = z;
        this.A0A = new AtomicInteger(i);
        this.A05 = z2;
        this.A02 = z3;
    }
}
