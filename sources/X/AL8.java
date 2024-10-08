package X;

import android.graphics.SurfaceTexture;

public final class AL8 implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C368648t4 A00;

    public AL8(C368648t4 r1) {
        this.A00 = r1;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.A08 = true;
    }
}
