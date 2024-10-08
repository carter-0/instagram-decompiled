package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class ALv implements TextureView.SurfaceTextureListener {
    public final Context A00;
    public final UserSession A01;
    public final C343747qj A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A00(0eO.A02, new MMQ(this, 1));

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, com.instagram.creation.capture.quickcapture.text.gradient.ShaderFetcher] */
    public ALv(Context context, UserSession userSession) {
        this.A01 = userSession;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        this.A02 = new C343747qj();
        this.A04 = C9874Rin.A00(AnonymousClass7TF.A0A(applicationContext), R.raw.uniform_texture_vertex);
        this.A03 = new Object().getShaderString();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        C41517AvL avL = (C41517AvL) this.A05.getValue();
        synchronized (avL) {
            avL.A00 = surfaceTexture;
        }
        avL.A03 = true;
        avL.start();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C41517AvL avL = (C41517AvL) this.A05.getValue();
        avL.A03 = false;
        avL.A02 = false;
        ALv aLv = avL.A05;
        synchronized (avL) {
            C343747qj r0 = aLv.A02;
            r0.A03();
            r0.A01();
            avL.A00 = null;
            avL.A01 = null;
        }
        return true;
    }
}
