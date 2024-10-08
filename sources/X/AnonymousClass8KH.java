package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.8KH  reason: invalid class name */
public final class AnonymousClass8KH implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass80G A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        AnonymousClass80G r0 = this.A00;
        r0.A03 = i;
        r0.A02 = i2;
        r0.A0E.DpX(new Surface(surfaceTexture), i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public AnonymousClass8KH(AnonymousClass80G r1) {
        this.A00 = r1;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass80G r1 = this.A00;
        r1.A0E.Dpb();
        Surface surface = r1.A06;
        if (surface != null) {
            surface.release();
        }
        r1.A06 = null;
        r1.A04 = null;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass80G r0 = this.A00;
        r0.A03 = i;
        r0.A02 = i2;
        r0.A0E.DpU(i, i2);
    }
}
