package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.Wnx  reason: case insensitive filesystem */
public final class C20258Wnx implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ LPE A01;

    public C20258Wnx(SurfaceTexture surfaceTexture, LPE lpe) {
        this.A01 = lpe;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        LPE lpe = this.A01;
        if (lpe != null) {
            lpe.A0G(this.A00);
        }
    }
}
