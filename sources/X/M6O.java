package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import com.facebook.proxygen.LigerSamplePolicy;

public final class M6O implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ C64910LkA A01;

    public M6O(SurfaceTexture surfaceTexture, C64910LkA lkA) {
        this.A01 = lkA;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        C64910LkA lkA = this.A01;
        SurfaceTexture surfaceTexture = this.A00;
        int i = lkA.A01;
        int i2 = lkA.A00;
        JWJ jwj = lkA.A08;
        C344207rU r0 = jwj.A00;
        if (r0 != null) {
            r0.A06();
            C364988mL r02 = lkA.A02;
            if (r02 == null) {
                r02 = jwj.A00(new C64422Lbd(surfaceTexture, lkA, lkA.A09, i, i2));
                lkA.A02 = r02;
            }
            if (r02 != null) {
                Handler handler = lkA.A05;
                Runnable runnable = lkA.A0A;
                handler.removeCallbacks(runnable);
                r02.A04();
                handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                lkA.A07.A00(lkA);
            }
        }
    }
}
