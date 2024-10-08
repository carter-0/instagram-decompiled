package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.OhM  reason: case insensitive filesystem */
public final class C71281OhM implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C340307l3 A00;
    public final /* synthetic */ C71018OYt A01;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C71281OhM(C340307l3 r1, C71018OYt oYt) {
        this.A01 = oYt;
        this.A00 = r1;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C71018OYt.A01(this.A00, this.A01, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C340307l3 r3 = this.A00;
        boolean z = false;
        if (r3.Esr()) {
            r3.Egd((SurfaceTexture) null, 0, 0);
            z = true;
        }
        r3.EyH((AnonymousClass8GD) null);
        r3.disconnect();
        return z;
    }
}
