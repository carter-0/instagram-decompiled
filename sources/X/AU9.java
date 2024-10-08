package X;

import android.graphics.SurfaceTexture;

public final class AU9 implements C341127mN, SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture A00;
    public final /* synthetic */ C345827u9 A01;

    public AU9(C345827u9 r1) {
        this.A01 = r1;
    }

    public final void EEt(Long l) {
        C18849W5t w5t = this.A01.A0K;
        SurfaceTexture surfaceTexture = this.A00;
        if (w5t != null && surfaceTexture != null) {
            w5t.onFrameAvailable(surfaceTexture);
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00 = surfaceTexture;
        C341147mP r0 = this.A01.A0J;
        if (r0 != null) {
            r0.DGm();
        }
    }
}
