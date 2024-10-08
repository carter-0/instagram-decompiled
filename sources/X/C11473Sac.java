package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.Sac  reason: case insensitive filesystem */
public final class C11473Sac implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ Qe7 A00;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C11473Sac(Qe7 qe7) {
        this.A00 = qe7;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Qe7 qe7 = this.A00;
        Object obj = qe7.A03;
        if (obj != null) {
            if (qe7.A05) {
                synchronized (qe7.A02) {
                    C13861Tih tih = qe7.A00;
                    if (tih != null) {
                        tih.DVi();
                    }
                }
            }
            synchronized (obj) {
                qe7.A06 = true;
                obj.notifyAll();
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Qe7 qe7 = this.A00;
        if (!qe7.A04 || !qe7.A05) {
            return true;
        }
        synchronized (qe7.A02) {
            C13861Tih tih = qe7.A00;
            if (tih != null) {
                tih.DVj();
            }
        }
        return true;
    }
}
