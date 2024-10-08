package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.util.List;

public final class THS implements Runnable {
    public final /* synthetic */ SSF A00;
    public final /* synthetic */ List A01;

    public THS(SSF ssf, List list) {
        this.A01 = list;
        this.A00 = ssf;
    }

    public final void run() {
        for (Bitmap bitmap : 00k.A0X(this.A01)) {
            C346327uz r0 = new C346327uz("Poses");
            r0.A05 = bitmap;
            C346337v0 r9 = new C346337v0(r0);
            try {
                SSF ssf = this.A00;
                C369008tg r5 = new C369008tg(ssf.A07, ssf.A06);
                GLES20.glBindFramebuffer(36160, r5.A00);
                GLES20.glViewport(0, 0, r5.A02, r5.A01);
                C11419SSu sSu = ssf.A02;
                if (sSu != null) {
                    C368538so r3 = ssf.A0A;
                    r3.A01(r9, (float[]) null, 0);
                    C11419SSu.A04(r3, sSu);
                    C361258fv A012 = C11419SSu.A01(sSu, AnonymousClass05K.A00);
                    A012.A03("sTexture", r3.A00());
                    sSu.A05(A012, r3);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    r9.A01();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    GLES20.glFinish();
                    ssf.A0C.add(r5);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } catch (RuntimeException unused) {
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glBindTexture(3553, 0);
                r9.A01();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.A00.A0C.clear();
                return;
            }
        }
        SSF.A02(this.A00);
    }
}
