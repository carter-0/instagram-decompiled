package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class W8H implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener A00;
    public final /* synthetic */ U1A A01;

    public W8H(TextureView.SurfaceTextureListener surfaceTextureListener, U1A u1a) {
        this.A01 = u1a;
        this.A00 = surfaceTextureListener;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A00;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        U1A u1a = this.A01;
        if (u1a.isVisible() && u1a.A0A) {
            U1A.A05(u1a);
        }
    }
}
