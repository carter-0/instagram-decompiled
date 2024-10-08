package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.5gx  reason: invalid class name and case insensitive filesystem */
public final class C291315gx extends SurfaceTexture {
    public final Surface A00 = new Surface(this);
    public final Handler A01;
    public final boolean A02;

    public C291315gx(Handler handler, boolean z) {
        super(0);
        detachFromGLContext();
        this.A01 = handler;
        this.A02 = z;
    }

    public final void release() {
        this.A00.release();
        super.release();
    }

    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        if (handler == null) {
            handler = this.A01;
        }
        super.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public final void detachFromGLContext() {
        try {
            super.detachFromGLContext();
        } catch (RuntimeException e) {
            if (this.A02) {
                Log.e("HeroSurfaceTexture", String.format("Error when detach from GL context", new Object[0]), e);
                return;
            }
            throw e;
        }
    }
}
