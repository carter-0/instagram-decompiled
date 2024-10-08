package X;

import android.view.Surface;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;

public final class WIT implements SurfaceHolder {
    public final int A00;
    public final int A01;
    public final Surface A02;

    public int getHeight() {
        return this.A00;
    }

    public Surface getSurface() {
        return this.A02;
    }

    public int getWidth() {
        return this.A01;
    }

    public WIT(Surface surface, int i, int i2) {
        this.A02 = surface;
        this.A01 = i;
        this.A00 = i2;
    }
}
