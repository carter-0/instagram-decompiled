package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class LNz {
    public final Surface A00;
    public final Integer A01;
    public final SurfaceTexture A02;

    public final SurfaceTexture A00() {
        if (this.A01.intValue() != 0) {
            return null;
        }
        return this.A02;
    }

    public LNz(SurfaceTexture surfaceTexture) {
        this.A02 = surfaceTexture;
        this.A00 = new Surface(surfaceTexture);
        this.A01 = AnonymousClass05K.A00;
    }

    public LNz() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = AnonymousClass05K.A01;
    }
}
