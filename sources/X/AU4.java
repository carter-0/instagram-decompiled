package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.CountDownLatch;

public final class AU4 implements C344337rh {
    public final int A00;
    public final Object A01;

    public AU4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DZB(C346027uT r5) {
        CountDownLatch countDownLatch;
        if (2 - this.A00 == 0) {
            0qQ.A0B(r5, 0);
            SurfaceTexture surfaceTexture = r5.A0B;
            C382259dP r2 = (C382259dP) this.A01;
            if (surfaceTexture != null) {
                r2.A03.Dh6(surfaceTexture, 0, 0);
                return;
            }
            synchronized (r2.A04) {
                if (!(r2.A06 == null || (countDownLatch = r2.A01) == null)) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    public final void DZC(C346027uT r5) {
        if (2 - this.A00 == 0) {
            0qQ.A0B(r5, 0);
            SurfaceTexture surfaceTexture = r5.A0B;
            C382259dP r3 = (C382259dP) this.A01;
            if (surfaceTexture != null) {
                r3.A03.Dh8(surfaceTexture);
                return;
            }
            synchronized (r3.A04) {
                if (r3.A06 != null) {
                    r3.A01 = new CountDownLatch(1);
                }
            }
        }
    }

    public final void DZD(C346027uT r4, int i, int i2) {
        CountDownLatch countDownLatch;
        switch (this.A00) {
            case 0:
                C345867uD r2 = (C345867uD) this.A01;
                int A002 = C345867uD.A00(r2);
                if (r2.A01 != A002) {
                    r2.A01 = A002;
                    C345867uD.A01(r2);
                    return;
                }
                return;
            case 1:
                AH4 ah4 = (AH4) this.A01;
                ah4.A02 = i;
                ah4.A01 = i2;
                AH4.A01(ah4);
                return;
            default:
                0qQ.A0B(r4, 0);
                SurfaceTexture surfaceTexture = r4.A0B;
                C382259dP r22 = (C382259dP) this.A01;
                if (surfaceTexture != null) {
                    r22.A03.Dh6(surfaceTexture, i, i2);
                    return;
                }
                synchronized (r22.A04) {
                    if (!(r22.A06 == null || (countDownLatch = r22.A01) == null)) {
                        countDownLatch.countDown();
                    }
                }
                return;
        }
    }

    public final void DZH(View view) {
        SurfaceView surfaceView;
        if (2 - this.A00 == 0) {
            C382259dP r3 = (C382259dP) this.A01;
            synchronized (r3.A04) {
                if (view instanceof SurfaceView) {
                    surfaceView = (SurfaceView) view;
                } else {
                    surfaceView = null;
                }
                r3.A06 = surfaceView;
                SurfaceTexture surfaceTexture = r3.A05;
                if (surfaceTexture != null) {
                    r3.A03.Dh8(surfaceTexture);
                }
            }
        }
    }
}
