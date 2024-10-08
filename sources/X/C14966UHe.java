package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.UHe  reason: case insensitive filesystem */
public final class C14966UHe extends AnonymousClass8KT implements AnonymousClass8KU {
    public Surface A00;
    public final SurfaceTexture A01;

    public final boolean AFP() {
        return false;
    }

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "FakeVideoOutput";
    }

    public final void Dpd() {
    }

    public final int getHeight() {
        return 0;
    }

    public final int getWidth() {
        return 0;
    }

    public final AnonymousClass8KV CED() {
        return AnonymousClass8KV.PREVIEW;
    }

    public final void release() {
        Surface surface = this.A00;
        if (surface != null) {
            surface.release();
            this.A00 = null;
        }
        super.release();
    }

    public C14966UHe(SurfaceTexture surfaceTexture) {
        this.A01 = surfaceTexture;
    }

    public final void CMW(C365228mk r3, C365248mm r4) {
        release();
        Surface surface = new Surface(this.A01);
        this.A00 = surface;
        r3.EzB(surface, this);
    }

    public final void destroy() {
        release();
    }
}
