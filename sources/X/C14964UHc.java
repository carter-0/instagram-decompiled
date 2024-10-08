package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.UHc  reason: case insensitive filesystem */
public final class C14964UHc extends AnonymousClass8KT {
    public int A00 = 1;
    public int A01 = 1;
    public SurfaceTexture A02;
    public Surface A03;
    public C346337v0 A04;

    public final boolean AFP() {
        return false;
    }

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "OffscreenOutput";
    }

    public final AnonymousClass8KV CED() {
        return AnonymousClass8KV.PREVIEW;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final void release() {
        Surface surface = this.A03;
        if (surface != null) {
            surface.release();
            this.A03 = null;
        }
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A02 = null;
        }
        C346337v0 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
            this.A04 = null;
        }
        super.release();
    }

    public final Surface A00() {
        release();
        C346337v0 r0 = new C346337v0(new C346327uz("OffscreenOutput"));
        this.A04 = r0;
        int i = this.A01;
        int i2 = this.A00;
        r0.A00(i, i2);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.A04.A00);
        this.A02 = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i, i2);
        Surface surface = new Surface(this.A02);
        this.A03 = surface;
        return surface;
    }

    public final void CMW(C365228mk r2, C365248mm r3) {
        r2.EzB(A00(), this);
    }

    public final void destroy() {
        release();
    }
}
