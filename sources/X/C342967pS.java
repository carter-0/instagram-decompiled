package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.7pS  reason: invalid class name and case insensitive filesystem */
public final class C342967pS implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C342947pQ A00;

    public C342967pS(C342947pQ r1) {
        this.A00 = r1;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C342947pQ r2 = this.A00;
        r2.A01 = i;
        r2.A00 = i2;
        C340547lR r1 = r2.A02;
        if (!r1.A0G) {
            r1.A03();
            C340547lR r0 = r2.A02;
            r0.A0R.A00(r0.A0S).Dh6(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A02.A0I(new C364328lF(surfaceTexture, this), "onSurfaceTextureDestroyed");
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C342947pQ r3 = this.A00;
        r3.A01 = i;
        r3.A00 = i2;
        C340547lR r2 = r3.A02;
        if (!r2.A0G) {
            r2.A0R.A00(r2.A0S).Dh5(i, i2);
            r3.A02.A05();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C342947pQ r1 = this.A00;
        C340337l6 r0 = r1.A03;
        if (r0 != null) {
            C353008Fx r02 = r0.A00;
            if (r02 != null) {
                r02.Dpo();
            }
            r1.A03 = null;
        }
        r1.A02.A0N.Cru();
        C364268l9.A00().A03();
    }
}
