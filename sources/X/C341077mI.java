package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.7mI  reason: invalid class name and case insensitive filesystem */
public final class C341077mI implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C341057mG A00;

    public C341077mI(C341057mG r1) {
        this.A00 = r1;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C346267ut r0;
        C341057mG r1 = this.A00;
        if (surfaceTexture == r1.A05 && (r0 = r1.A06) != null) {
            r0.DGm();
        }
    }
}
