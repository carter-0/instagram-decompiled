package X;

import android.view.SurfaceHolder;

public final class RAA extends 0ng {
    public final /* synthetic */ SurfaceHolder.Callback A00;
    public final /* synthetic */ SurfaceHolder A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAA(SurfaceHolder.Callback callback, SurfaceHolder surfaceHolder) {
        super(1738297443, 2, false, false);
        this.A00 = callback;
        this.A01 = surfaceHolder;
    }

    public final void run() {
        this.A00.surfaceCreated(this.A01);
    }
}
