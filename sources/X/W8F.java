package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

public final class W8F implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C14711U2w A00;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        int i3 = u2w.A07;
        Surface surface = new Surface(surfaceTexture);
        u2w.A01 = surface;
        u2w.A08.A0D(surface);
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            W1V w1v = ((C19076WKg) x0u).A00;
            int i4 = w1v.A00 % 2;
            if (i3 == i4 && !w1v.A05) {
                C14711U2w u2w2 = w1v.A0D[i4];
                u2w2.setAlpha(1.0f);
                u2w2.bringToFront();
                C263634Mt r0 = u2w2.A08;
                r0.A08();
                if (r0.A08() >= 0) {
                    u2w2.A01();
                }
                u2w2.A00();
            }
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public W8F(C14711U2w u2w) {
        this.A00 = u2w;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        u2w.A08.A0D((Surface) null);
        Surface surface = u2w.A01;
        if (surface == null) {
            return false;
        }
        surface.release();
        return false;
    }
}
