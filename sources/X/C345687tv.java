package X;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7tv  reason: invalid class name and case insensitive filesystem */
public final class C345687tv extends C344467ru implements C345697tw {
    public C340607lX A00;
    public final A3C A01 = new A3C(this);
    public final C3496981j A02 = new C3496981j();
    public final Object A03 = new Object();
    public volatile B2M A04;
    public volatile Integer A05 = AnonymousClass05K.A00;

    public final void EP5(boolean z) {
        C342757p7 r2 = new C342757p7();
        r2.A01(C342717p3.A0N, false);
        this.A00.CoY(new C341957no(), r2.A00());
    }

    public final void EyR(boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.A03) {
            if (this.A05 == AnonymousClass05K.A01) {
                this.A00.EyT(new C382559dt(this, countDownLatch), false);
            }
        }
    }

    public static void A00(C345687tv r2) {
        List list = r2.A02.A00;
        if (0 < list.size()) {
            list.get(0);
            throw new NullPointerException("onVideoCaptureError");
        }
    }

    public C345687tv(C343837qt r2) {
        this.A00 = r2;
    }
}
