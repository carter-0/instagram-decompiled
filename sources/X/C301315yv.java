package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.5yv  reason: invalid class name and case insensitive filesystem */
public final class C301315yv implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ AnonymousClass4OM A02;

    public C301315yv(SurfaceTexture surfaceTexture, Surface surface, AnonymousClass4OM r3) {
        this.A01 = surface;
        this.A02 = r3;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        Surface surface = this.A01;
        if (surface != null) {
            surface.release();
        }
        this.A00.release();
    }
}
