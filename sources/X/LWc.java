package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class LWc implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ K5W A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        K5W k5w = this.A00;
        if (k5w.A05 == null) {
            Surface surface = new Surface(surfaceTexture);
            k5w.A05 = surface;
            C66567MWv mWv = k5w.A0E;
            if (mWv != null) {
                mWv.setSurface(surface);
                L92 l92 = k5w.A0B;
                if (l92 != null && l92.A02 != null) {
                    K5W.A01(l92, k5w);
                    return;
                }
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public LWc(K5W k5w) {
        this.A00 = k5w;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        K5W k5w = this.A00;
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            mWv.release();
            k5w.A0E = null;
        }
        Surface surface = k5w.A05;
        if (surface == null) {
            return true;
        }
        surface.release();
        k5w.A05 = null;
        return true;
    }
}
