package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5KX  reason: invalid class name */
public final class AnonymousClass5KX {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final 0sL A01;
    public final C262224Cq A02;
    public final C249513ju A03 = new 1HR(Integer.MAX_VALUE);

    public AnonymousClass5KX(0sP r4, 0sL r5, 0sL r6, C262224Cq r7) {
        0qQ.A0B(r5, 3);
        this.A02 = r7;
        this.A01 = r6;
        C262204Co r2 = (C262204Co) r7.ArX().get(C262204Co.A00);
        if (r2 != null) {
            r2.CO3(new AnonymousClass9MC(5, this, r4, r5));
        }
    }

    public final void A00(Object obj) {
        Object FIG = this.A03.FIG(obj);
        if (FIG instanceof C241583Pt) {
            Throwable A012 = 1Wq.A01(FIG);
            if (A012 == null) {
                A012 = new IllegalStateException("Channel was closed normally");
            }
            throw A012;
        } else if (!(!(FIG instanceof AnonymousClass1Ws))) {
            throw new IllegalStateException("Check failed.");
        } else if (this.A00.getAndIncrement() == 0) {
            C262224Cq r3 = this.A02;
            AnonymousClass9K3 r2 = new AnonymousClass9K3(this, (AnonymousClass4D7) null, 7);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
    }
}
