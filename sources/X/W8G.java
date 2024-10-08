package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class W8G implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ U1A A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public W8G(U1A u1a) {
        this.A00 = u1a;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        U1A u1a = this.A00;
        if (u1a.isVisible() && u1a.A0A) {
            U1A.A05(u1a);
        }
    }
}
