package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class ALr implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C345847uB A00;

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public ALr(C345847uB r1) {
        this.A00 = r1;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C345847uB r2 = this.A00;
        C346027uT r1 = r2.A08;
        r2.A08 = null;
        if (r1 != null) {
            r1.A01();
        }
        C346027uT r12 = new C346027uT(surfaceTexture, false);
        r12.A06 = r2.A00;
        r2.A08 = r12;
        r2.A06 = i;
        r2.A05 = i2;
        C345847uB.A01(r2, r12);
        C345847uB.A04(r2, r12, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C345847uB r3 = this.A00;
        C346027uT r2 = r3.A08;
        if (r2 != null && r2.A0B == surfaceTexture) {
            r3.A08 = null;
            r3.A06 = 0;
            r3.A05 = 0;
            C345847uB.A03(r3, r2);
            r2.A01();
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C345847uB r2 = this.A00;
        C346027uT r1 = r2.A08;
        if (r1 != null && r1.A0B == surfaceTexture) {
            r2.A06 = i;
            r2.A05 = i2;
            C345847uB.A04(r2, r1, i, i2);
        }
    }
}
