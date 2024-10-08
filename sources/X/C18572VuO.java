package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

/* renamed from: X.VuO  reason: case insensitive filesystem */
public final class C18572VuO {
    public C18076Vl5 A00;
    public C18076Vl5 A01;
    public final SurfaceTexture.OnFrameAvailableListener A02 = new C18848W5s((Object) this, 0);
    public final C18656VwB A03;
    public final C18647Vvx A04;
    public final W1I A05;
    public final C346057uW A06;

    public final synchronized void A01() {
        C18656VwB vwB = this.A03;
        if (!vwB.A03()) {
            C18647Vvx vvx = this.A04;
            C346027uT r0 = vvx.A09;
            if (r0 != null) {
                vvx.A01();
                r0.A01();
            }
            C18076Vl5 vl5 = this.A01;
            if (vl5 != null) {
                vl5.A03();
            }
            this.A01 = null;
            C18076Vl5 vl52 = this.A00;
            if (vl52 != null) {
                vl52.A03();
            }
            this.A00 = null;
            W1I w1i = this.A05;
            C17613Vb5 vb5 = w1i.A00;
            if (vb5 != null) {
                GLES20.glDeleteProgram(vb5.A00);
                vb5.A00 = -1;
                w1i.A00 = null;
            }
            vwB.A02();
        }
    }

    public static void A00(C18572VuO vuO, C18076Vl5 vl5) {
        C346027uT r2;
        C18656VwB vwB;
        if (vl5 != null && (r2 = vl5.A00) != null) {
            synchronized (r2) {
                if (r2.A04()) {
                    try {
                        vl5.A02();
                        W1I w1i = vuO.A05;
                        C18647Vvx vvx = vuO.A04;
                        w1i.A02(vvx.A01, vvx.A00, vvx.A07, vvx.A06, vl5.A01(), vl5.A00(), 0, false);
                        vl5.A05(vuO.A06.A00(vvx.A08));
                        vl5.A04();
                        vwB = vuO.A03;
                    } catch (RuntimeException unused) {
                        vwB = vuO.A03;
                    } catch (Throwable th) {
                        vuO.A03.A01();
                        throw th;
                    }
                    vwB.A01();
                }
            }
        }
    }

    public C18572VuO() {
        Object obj = C18656VwB.A05;
        C18656VwB vwB = new C18656VwB(obj);
        this.A03 = vwB;
        vwB.A01();
        this.A05 = new W1I();
        this.A04 = new C18647Vvx(vwB, obj);
        this.A06 = new C346057uW();
    }
}
