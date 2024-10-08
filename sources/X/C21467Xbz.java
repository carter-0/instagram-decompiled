package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.Xbz  reason: case insensitive filesystem */
public final class C21467Xbz {
    public int A00 = 3;
    public Integer A01 = AnonymousClass05K.A00;
    public final C256983wf A02;
    public final VpsEventCallback A03;
    public final Xb8 A04;
    public final C257063wn A05;
    public final C290495fP A06;
    public final String A07;

    public C21467Xbz(C256983wf r2, VpsEventCallback vpsEventCallback, Xb8 xb8, C257063wn r5, C290495fP r6, String str) {
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = vpsEventCallback;
        this.A07 = str;
        this.A02 = r2;
        this.A04 = xb8;
    }

    public final void A00(Integer num) {
        synchronized (this.A01) {
            if (this.A01 == AnonymousClass05K.A00) {
                this.A01 = num;
                this.A06.A00();
            }
        }
    }
}
