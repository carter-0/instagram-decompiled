package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

public final class LWd implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C340307l3 A00;
    public final /* synthetic */ C64089LMh A01;
    public final /* synthetic */ X7C A02;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public LWd(C340307l3 r1, C64089LMh lMh, X7C x7c) {
        this.A01 = lMh;
        this.A02 = x7c;
        this.A00 = r1;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C64089LMh.A00(this.A00, this.A02, i, i2);
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
