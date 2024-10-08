package X;

import android.view.Surface;
import android.view.SurfaceHolder;

public class W8D implements SurfaceHolder.Callback {
    public Surface A00;
    public final C263624Ms A01;
    public final AnonymousClass4ND A02;
    public final X68 A03;

    public final void A01(Surface surface) {
        this.A00 = null;
        this.A03.Dpc(surface);
        C20164WmO wmO = new C20164WmO(surface, this);
        if (this.A02.A06) {
            this.A01.A0D(new C19956WiT(wmO));
            return;
        }
        this.A01.A0D((Runnable) null);
        wmO.run();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        Surface surface = surfaceHolder.getSurface();
        0qQ.A07(surface);
        this.A00 = surface;
        this.A01.A0I.A0D(surface);
        this.A03.DpW(surface);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        0qQ.A0B(surfaceHolder, 0);
        Surface surface = surfaceHolder.getSurface();
        0qQ.A07(surface);
        A01(surface);
    }

    public W8D(C263624Ms r1, AnonymousClass4ND r2, X68 x68) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = x68;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
