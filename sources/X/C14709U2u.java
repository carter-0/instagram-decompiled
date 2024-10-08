package X;

import android.view.Surface;
import android.view.SurfaceView;
import java.lang.ref.WeakReference;

/* renamed from: X.U2u  reason: case insensitive filesystem */
public abstract class C14709U2u extends SurfaceView implements C20884X2o {
    public WeakReference A00;

    public Surface getSurface() {
        Surface surface;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (surface = (Surface) weakReference.get()) == null) {
            return getHolder().getSurface();
        }
        return surface;
    }

    public final WeakReference getSurfaceReference() {
        return this.A00;
    }

    public void setSurface(Surface surface) {
        this.A00 = new WeakReference(surface);
    }

    public final void setSurfaceReference(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
