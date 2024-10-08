package X;

import android.graphics.SurfaceTexture;

public final class AL9 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C368618t1 A00;

    public AL9(C368618t1 r1) {
        this.A00 = r1;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.A0M = true;
    }
}
