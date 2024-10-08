package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aog  reason: case insensitive filesystem */
public final /* synthetic */ class C41120Aog implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C365398n2 A01;
    public final /* synthetic */ CountDownLatch A02;

    public /* synthetic */ C41120Aog(Bitmap bitmap, C365398n2 r2, CountDownLatch countDownLatch) {
        this.A01 = r2;
        this.A00 = bitmap;
        this.A02 = countDownLatch;
    }

    public final void run() {
        C365398n2 r0 = this.A01;
        Bitmap bitmap = this.A00;
        CountDownLatch countDownLatch = this.A02;
        try {
            C346337v0 r02 = r0.A02;
            if (r02 != null) {
                GLES20.glBindTexture(3553, r02.A00);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GLES20.glFlush();
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
