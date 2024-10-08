package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.4OM  reason: invalid class name */
public final class AnonymousClass4OM implements TextureView.SurfaceTextureListener {
    public Surface A00;
    public boolean A01;
    public final AnonymousClass4NF A02;
    public final C263624Ms A03;
    public final C263624Ms A04;
    public final AnonymousClass4ND A05;

    public AnonymousClass4OM(C263624Ms r2, C263624Ms r3, AnonymousClass4ND r4, AnonymousClass4NF r5) {
        0qQ.A0B(r4, 2);
        this.A03 = r2;
        this.A05 = r4;
        this.A02 = r5;
        this.A04 = r3;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        Surface surface = new Surface(surfaceTexture);
        this.A00 = surface;
        this.A02.Dpm(surfaceTexture, surface, i, i2);
        this.A03.A0I.A0D(surface);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        AnonymousClass4NF r1 = this.A02;
        Surface surface = this.A00;
        r1.Dpn(surfaceTexture, surface);
        this.A03.A0D(new C301325yw(new C301315yv(surfaceTexture, surface, this)));
        this.A00 = null;
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AnonymousClass4NB r0;
        0qQ.A0B(surfaceTexture, 0);
        if (!this.A01) {
            this.A01 = true;
            this.A02.DKe(surfaceTexture, this.A00);
        }
        this.A02.onSurfaceTextureUpdated(surfaceTexture);
        C263624Ms r1 = this.A04;
        if (r1.A0G.A01 && (r0 = r1.A05) != null) {
            synchronized (r0) {
            }
        }
    }
}
