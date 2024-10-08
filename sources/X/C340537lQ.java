package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.7lQ  reason: invalid class name and case insensitive filesystem */
public final class C340537lQ {
    public C18015Vjr A00;
    public C341047mF A01;
    public C341047mF A02;
    public volatile float A03;
    public volatile float A04;
    public volatile float A05;
    public volatile float A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public final C341047mF A00(boolean z) {
        if (z) {
            C341047mF r2 = this.A01;
            if (r2 != null) {
                return r2;
            }
            C341807nY r22 = new C341807nY(new C343217pr(), this, true);
            this.A01 = r22;
            return r22;
        }
        C341047mF r23 = this.A02;
        if (r23 != null) {
            return r23;
        }
        C341807nY r24 = new C341807nY(new AV5((SurfaceTexture) null), this, false);
        this.A02 = r24;
        return r24;
    }
}
