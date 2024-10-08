package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Sr7  reason: case insensitive filesystem */
public final class C12304Sr7 implements C13778Tgt {
    public final CountDownLatch A00 = Pxf.A0y();
    public volatile C7335Q4l A01;

    public final void cancel() {
        AG6((String) null);
    }

    public final void AG6(String str) {
        C7329Q4f q4f;
        C7335Q4l q4l = this.A01;
        if (q4l != null) {
            q4l.A0T = true;
            C13855Tia tia = q4l.A09;
            if (tia != null) {
                tia.cancel();
            }
            C11352SOl sOl = q4l.A06;
            if (sOl != null) {
                sOl.A0H = true;
            }
            if (!q4l.A0C && (q4f = q4l.A05) != null) {
                q4f.A00();
            }
            this.A01 = null;
        }
    }

    public final void FNH() {
        this.A00.await();
    }

    public C12304Sr7(C7335Q4l q4l) {
        this.A01 = q4l;
    }
}
