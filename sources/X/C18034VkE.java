package X;

import android.view.Surface;
import android.view.SurfaceControl;

/* renamed from: X.VkE  reason: case insensitive filesystem */
public final class C18034VkE {
    public Surface A00 = null;
    public SurfaceControl A01 = null;

    public C18034VkE() {
        SurfaceControl build = new SurfaceControl.Builder().setName(Integer.toHexString(hashCode())).setBufferSize(0, 0).build();
        0qQ.A07(build);
        this.A01 = build;
        this.A00 = new Surface(build);
    }

    public final Surface A00() {
        return this.A00;
    }

    public final SurfaceControl A01() {
        return this.A01;
    }

    public final void A02() {
        Surface surface = this.A00;
        if (surface != null) {
            surface.release();
        }
        SurfaceControl surfaceControl = this.A01;
        if (surfaceControl != null) {
            surfaceControl.release();
        }
    }
}
