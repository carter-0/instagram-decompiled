package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.7pr  reason: invalid class name and case insensitive filesystem */
public final class C343217pr implements C341047mF {
    public C18572VuO A00;
    public boolean A01;
    public WeakReference A02 = new WeakReference((Object) null);
    public WeakReference A03 = new WeakReference((Object) null);
    public final C22258XyG A04 = new Object();

    public final /* synthetic */ void D0F(int i) {
    }

    public final /* synthetic */ void D8b(int i) {
    }

    public final /* synthetic */ void Dh5(int i, int i2) {
    }

    public final /* synthetic */ void Dh8(SurfaceTexture surfaceTexture) {
    }

    public final /* synthetic */ void Dh9(Surface surface) {
    }

    public final /* synthetic */ void EgZ(boolean z) {
    }

    public final void A00(Surface surface) {
        C18572VuO vuO = this.A00;
        if (vuO != null) {
            synchronized (vuO) {
                C18656VwB vwB = vuO.A03;
                if (!vwB.A03()) {
                    C18076Vl5 vl5 = vuO.A00;
                    if (vl5 != null) {
                        vl5.A03();
                    }
                    vuO.A00 = null;
                    if (surface != null) {
                        vuO.A00 = vwB.A00(new C346027uT(surface, false));
                    }
                }
            }
        }
    }

    public final /* synthetic */ C343177pn Bc6() {
        return null;
    }

    public final /* synthetic */ C343177pn Bje() {
        return null;
    }

    public final SurfaceTexture C3H(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SurfaceTexture surfaceTexture;
        C18572VuO vuO = this.A00;
        if (vuO != null) {
            vuO.A01();
            this.A00 = null;
        }
        if (!this.A01) {
            return (SurfaceTexture) this.A03.get();
        }
        C18572VuO vuO2 = new C18572VuO();
        this.A00 = vuO2;
        int i9 = i;
        int i10 = i2;
        if (i4 % 180 != 0) {
            i9 = i2;
            i10 = i;
        }
        SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.A03.get();
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i9, i10);
            C18572VuO vuO3 = this.A00;
            synchronized (vuO3) {
                C18656VwB vwB = vuO3.A03;
                if (!vwB.A03()) {
                    C18076Vl5 vl5 = vuO3.A01;
                    if (vl5 != null) {
                        vl5.A03();
                    }
                    vuO3.A01 = null;
                    vuO3.A01 = vwB.A00(new C346027uT(surfaceTexture2, false));
                }
            }
        } else {
            Surface surface = (Surface) this.A02.get();
            if (surface == null) {
                return null;
            }
            synchronized (vuO2) {
                C18656VwB vwB2 = vuO2.A03;
                if (!vwB2.A03()) {
                    C18076Vl5 vl52 = vuO2.A01;
                    if (vl52 != null) {
                        vl52.A03();
                    }
                    vuO2.A01 = null;
                    vuO2.A01 = vwB2.A00(new C346027uT(surface, false));
                }
            }
        }
        C22258XyG xyG = this.A04;
        xyG.A01 = i9;
        xyG.A00 = i10;
        xyG.A03 = this;
        Surface surface2 = xyG.A02;
        if (surface2 != null) {
            A00(surface2);
        }
        C18572VuO vuO4 = this.A00;
        synchronized (vuO4) {
            if (vuO4.A03.A03()) {
                surfaceTexture = null;
            } else {
                C18647Vvx vvx = vuO4.A04;
                C346027uT r1 = vvx.A09;
                if (r1 != null) {
                    vvx.A01();
                    r1.A01();
                }
                surfaceTexture = new SurfaceTexture(vvx.A00);
                surfaceTexture.setOnFrameAvailableListener(vuO4.A02);
                C346027uT r12 = new C346027uT(surfaceTexture, true);
                r12.A02(i, i2, i4, false);
                vvx.A02((SurfaceTexture.OnFrameAvailableListener) null, r12);
            }
        }
        if (surfaceTexture == null) {
            return null;
        }
        surfaceTexture.setDefaultBufferSize(i, i2);
        return surfaceTexture;
    }

    public final Surface C3I() {
        return (Surface) this.A02.get();
    }

    public final SurfaceTexture C3J() {
        return (SurfaceTexture) this.A03.get();
    }

    public final C341827na CEH() {
        if (this.A00 != null) {
            return this.A04;
        }
        return null;
    }

    public final /* synthetic */ C343177pn CHY() {
        return null;
    }

    public final void Dh6(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A03 = new WeakReference(surfaceTexture);
    }

    public final void Dh7(Surface surface, int i, int i2) {
        this.A02 = new WeakReference(surface);
    }

    public final void ECm(SurfaceTexture surfaceTexture) {
        this.A04.A03 = null;
        C18572VuO vuO = this.A00;
        if (vuO != null) {
            vuO.A01();
            this.A00 = null;
        }
    }

    public final /* synthetic */ boolean FNS() {
        return false;
    }

    public final /* synthetic */ Object BYV(C341907ni r2) {
        return null;
    }
}
