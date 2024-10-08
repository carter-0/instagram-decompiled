package X;

import android.view.Surface;
import android.view.SurfaceHolder;

public final class LWZ implements SurfaceHolder.Callback {
    public final MUK A00;
    public final /* synthetic */ L7B A01;

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        0qQ.A0B(surfaceHolder, 0);
        MUK muk = this.A00;
        Surface surface = surfaceHolder.getSurface();
        0qQ.A07(surface);
        muk.EzA(surface, i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        0qQ.A07(surfaceHolder.getSurface());
    }

    public LWZ(MUK muk, L7B l7b) {
        this.A01 = l7b;
        this.A00 = muk;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.EzC();
    }
}
