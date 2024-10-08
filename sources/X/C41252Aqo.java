package X;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aqo  reason: case insensitive filesystem */
public final class C41252Aqo implements Runnable {
    public final /* synthetic */ C344767sO A00;
    public final /* synthetic */ C345137sz A01;
    public final /* synthetic */ C344697sH A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ CountDownLatch A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C41252Aqo(C344767sO r1, C345137sz r2, C344697sH r3, Integer num, CountDownLatch countDownLatch, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = num;
        this.A04 = countDownLatch;
    }

    public final void run() {
        try {
            C344767sO r5 = this.A00;
            if (r5.A0d) {
                Long l = r5.A0b;
                if (l != null) {
                    GLES20.glFlush();
                    long longValue = l.longValue();
                    GLES30.glWaitSync(longValue, 0, -1);
                    GLES30.glDeleteSync(longValue);
                }
                r5.A0b = null;
                C344697sH r7 = this.A02;
                r5.A0a = C344767sO.A01(r5, this.A01, r7, this.A03, true, this.A06, this.A05);
                r5.A0c = C344767sO.A04(r5, r5.A0c);
            }
        } finally {
            this.A04.countDown();
        }
    }
}
