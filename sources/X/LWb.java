package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class LWb implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C59767JXi A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        C59767JXi jXi = this.A00;
        if (jXi.A06 != null) {
            0kD.A07(C59767JXi.__redex_internal_original_name, "surface should be null", (Throwable) null);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        jXi.A06 = surface;
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.setSurface(surface);
            L92 l92 = jXi.A09;
            if (l92 != null && l92.A02 != null && C59767JXi.A0D(jXi)) {
                C59767JXi.A04(l92, jXi);
            }
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public LWb(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C59767JXi jXi = this.A00;
        C66567MWv mWv = jXi.A0B;
        if (mWv != null) {
            mWv.release();
            jXi.A0B = null;
        }
        Surface surface = jXi.A06;
        if (surface == null) {
            return true;
        }
        surface.release();
        jXi.A06 = null;
        return true;
    }
}
