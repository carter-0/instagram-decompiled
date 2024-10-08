package X;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Am4  reason: case insensitive filesystem */
public final class C40958Am4 implements Runnable {
    public final /* synthetic */ AV6 A00;
    public final /* synthetic */ CountDownLatch A01;

    public final void run() {
        try {
            AV6 av6 = this.A00;
            C346027uT r1 = av6.A06;
            av6.A06 = null;
            if (r1 != null) {
                r1.A01();
            }
            C345827u9 r2 = av6.A07;
            if (r2.A0B.getLooper() == Looper.myLooper()) {
                C18849W5t w5t = r2.A0K;
                if (w5t == null) {
                    w5t = new C18849W5t(r2.A0F);
                    r2.A0K = w5t;
                    C345827u9.A00(r2);
                }
                av6.A06 = new C346027uT(new SurfaceTexture(w5t.A03.A00), false);
                this.A01.countDown();
                return;
            }
            throw AnonymousClass7TE.A0z("getInputTextureId() must be called at SurfacePipe thread.");
        } catch (RuntimeException e) {
            0KC.A0L("RendererSurfacePipeComponent", "Failed to create SurfaceNode: %s", e, new Object[]{e.getMessage()});
        }
    }

    public C40958Am4(AV6 av6, CountDownLatch countDownLatch) {
        this.A00 = av6;
        this.A01 = countDownLatch;
    }
}
