package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class ALs implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass8HG A00;

    public ALs(AnonymousClass8HG r1) {
        this.A00 = r1;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass8HG r0 = this.A00;
        r0.A02 = surfaceTexture;
        r0.A01 = i;
        r0.A00 = i2;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass8HG r1 = this.A00;
        r1.A01 = 0;
        r1.A00 = 0;
        r1.A02 = null;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass8HG r0 = this.A00;
        r0.A01 = i;
        r0.A00 = i2;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.A00.A02 = surfaceTexture;
    }
}
