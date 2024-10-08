package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.4NG  reason: invalid class name */
public final class AnonymousClass4NG implements AnonymousClass4NH {
    public final AnonymousClass4NF[] A00;

    public AnonymousClass4NG(AnonymousClass4NF... r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void DKe(SurfaceTexture surfaceTexture, Surface surface) {
        for (AnonymousClass4NF r0 : this.A00) {
            if (r0 != null) {
                r0.DKe(surfaceTexture, surface);
            }
        }
    }

    public final void Dpm(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        for (AnonymousClass4NF r0 : this.A00) {
            if (r0 != null) {
                r0.Dpm(surfaceTexture, surface, i, i2);
            }
        }
    }

    public final void Dpn(SurfaceTexture surfaceTexture, Surface surface) {
        for (AnonymousClass4NF r0 : this.A00) {
            if (r0 != null) {
                r0.Dpn(surfaceTexture, surface);
            }
        }
    }

    public final void E02(Surface surface) {
        for (AnonymousClass4NF r0 : this.A00) {
            if (r0 != null) {
                r0.E02(surface);
            }
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        for (AnonymousClass4NF r0 : this.A00) {
            if (r0 != null) {
                r0.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }
}
