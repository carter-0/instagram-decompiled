package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class LWa implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C60694Jpf A00;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public LWa(C60694Jpf jpf) {
        this.A00 = jpf;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C60694Jpf jpf = this.A00;
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        02V.A07(DbW.A1a(jpf.A00), (String) null);
        Surface surface = new Surface(surfaceTexture);
        jpf.A00 = surface;
        AnonymousClass4MN r0 = jpf.A03;
        if (r0 != null) {
            r0.setSurface(surface);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C60694Jpf.A01(this.A00);
        return true;
    }
}
