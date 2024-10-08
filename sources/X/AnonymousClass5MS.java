package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.5MS  reason: invalid class name */
public final class AnonymousClass5MS extends AnonymousClass4X6 {
    public SurfaceTexture A00;
    public boolean A01;
    public final AnonymousClass4X5 A02;

    public final void A00() {
        this.A00 = null;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        if (this.A00 == null) {
            this.A00 = surfaceTexture;
            for (TextureView.SurfaceTextureListener onSurfaceTextureAvailable : this.A00) {
                onSurfaceTextureAvailable.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        this.A01 = true;
        if (this.A00 != null) {
            return false;
        }
        boolean z = true;
        for (TextureView.SurfaceTextureListener onSurfaceTextureDestroyed : this.A00) {
            z &= onSurfaceTextureDestroyed.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return z;
    }

    public final void A01() {
        SurfaceTexture surfaceTexture = this.A00;
        if (this.A01 && surfaceTexture != null) {
            AnonymousClass4X5 r1 = this.A02;
            if (r1.getSurfaceTexture() == null) {
                r1.setSurfaceTexture(surfaceTexture);
            } else {
                0wb.A03("SurfaceTextureManagedMultiListenerDelegate", "trying to set a surface texture when we have already set one");
            }
        }
    }

    public AnonymousClass5MS(AnonymousClass4X5 r1, AnonymousClass4X6 r2) {
        super(r2);
        this.A02 = r1;
    }
}
