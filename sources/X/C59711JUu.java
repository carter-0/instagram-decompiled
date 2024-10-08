package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.JUu  reason: case insensitive filesystem */
public final /* synthetic */ class C59711JUu implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C313416gP A01;

    public /* synthetic */ C59711JUu(SurfaceTexture surfaceTexture, C313416gP r2) {
        this.A01 = r2;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        C313416gP r1 = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        C316036l0 r0 = r1.A0O;
        if (r0 != null) {
            r0.onSurfaceTextureDestroyed();
        }
    }
}
