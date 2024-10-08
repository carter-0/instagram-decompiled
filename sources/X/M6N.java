package X;

import android.graphics.SurfaceTexture;

public final class M6N implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C64910LkA A01;

    public M6N(SurfaceTexture surfaceTexture, C64910LkA lkA) {
        this.A01 = lkA;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        C64910LkA lkA = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        lkA.A05.removeCallbacks(lkA.A0A);
        C364988mL r1 = lkA.A02;
        lkA.A02 = null;
        if (r1 == null || lkA.A08.A00 == null) {
            surfaceTexture.release();
            return;
        }
        r1.A0C(new C66015M8a(surfaceTexture, r1, lkA));
        lkA.A07.A02.remove(lkA);
    }
}
