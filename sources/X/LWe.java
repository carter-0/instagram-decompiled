package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class LWe implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ LRF A03;

    public LWe(LRF lrf, String str, int i, int i2) {
        0qQ.A0B(str, 4);
        this.A03 = lrf;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        LRF lrf = this.A03;
        if (lrf.A02 == null) {
            Surface surface = new Surface(surfaceTexture);
            lrf.A02 = surface;
            AnonymousClass4MM r0 = lrf.A03;
            if (r0 != null) {
                r0.setSurface(surface);
            }
            LRF.A01(lrf, this.A02, this.A01, this.A00);
            return;
        }
        throw DbT.A0m();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LRF lrf = this.A03;
        AnonymousClass4MM r1 = lrf.A03;
        if (r1 != null) {
            r1.ECQ(false);
        }
        Surface surface = lrf.A02;
        if (surface != null) {
            surface.release();
        }
        lrf.A02 = null;
        return true;
    }
}
