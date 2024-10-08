package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

/* renamed from: X.Vjr  reason: case insensitive filesystem */
public final class C18015Vjr {
    public C18076Vl5 A00;
    public final SurfaceTexture.OnFrameAvailableListener A01 = new C18848W5s(this, 2);
    public final SurfaceTexture.OnFrameAvailableListener A02 = new C18848W5s(this, 1);
    public final C18656VwB A03;
    public final C18647Vvx A04;
    public final C18647Vvx A05;
    public final W1E A06;
    public volatile boolean A07;

    public final synchronized void A00() {
        C18656VwB vwB = this.A03;
        if (!vwB.A03()) {
            C18647Vvx vvx = this.A05;
            C346027uT r0 = vvx.A09;
            if (r0 != null) {
                vvx.A01();
                r0.A01();
            }
            C18647Vvx vvx2 = this.A04;
            C346027uT r02 = vvx2.A09;
            if (r02 != null) {
                vvx2.A01();
                r02.A01();
            }
            C18076Vl5 vl5 = this.A00;
            this.A00 = null;
            if (vl5 != null) {
                vl5.A03();
            }
            W1E w1e = this.A06;
            C17555Va9 va9 = w1e.A00;
            if (va9 != null) {
                GLES20.glDeleteProgram(va9.A00);
                va9.A00 = -1;
                w1e.A00 = null;
            }
            vwB.A02();
        }
    }

    public final synchronized void A01(float f, float f2, float f3, float f4) {
        W1E w1e = this.A06;
        synchronized (w1e) {
            w1e.A02 = f;
            w1e.A03 = f2;
            w1e.A05 = f3;
            w1e.A04 = f4;
            w1e.A0A = true;
        }
    }

    public C18015Vjr() {
        Object obj = C18656VwB.A05;
        C18656VwB vwB = new C18656VwB(obj);
        this.A03 = vwB;
        vwB.A01();
        this.A06 = new W1E();
        this.A05 = new C18647Vvx(vwB, obj);
        this.A04 = new C18647Vvx(vwB, obj);
    }
}
