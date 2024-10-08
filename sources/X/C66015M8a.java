package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.M8a  reason: case insensitive filesystem */
public final class C66015M8a implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C364988mL A01;
    public final /* synthetic */ C64910LkA A02;

    public C66015M8a(SurfaceTexture surfaceTexture, C364988mL r2, C64910LkA lkA) {
        this.A02 = lkA;
        this.A01 = r2;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        C364988mL r1 = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        r1.A03();
        surfaceTexture.release();
    }
}
