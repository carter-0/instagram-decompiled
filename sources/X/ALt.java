package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

public final class ALt implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass8PZ A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        AnonymousClass8PZ r2 = this.A00;
        if (r2.A04 == null) {
            Surface surface = new Surface(surfaceTexture);
            r2.A04 = surface;
            AnonymousClass4MM r0 = r2.A08;
            if (r0 != null) {
                r0.setSurface(surface);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Check failed.");
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public ALt(AnonymousClass8PZ r1) {
        this.A00 = r1;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass8PZ r2 = this.A00;
        AnonymousClass4MM r1 = r2.A08;
        if (r1 != null) {
            r1.ECQ(false);
        }
        r2.A08 = null;
        Surface surface = r2.A04;
        if (surface != null) {
            surface.release();
        }
        r2.A04 = null;
        return true;
    }
}
