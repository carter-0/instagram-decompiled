package X;

import android.graphics.SurfaceTexture;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.Q0i  reason: case insensitive filesystem */
public final class C7236Q0i implements SurfaceTexture.OnFrameAvailableListener {
    public boolean A00;
    public final VideoFilter A01;
    public final C14273Tsw A02;

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public C7236Q0i(VideoFilter videoFilter, C14273Tsw tsw) {
        this.A02 = tsw;
        this.A01 = videoFilter;
    }
}
