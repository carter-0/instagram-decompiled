package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.7ip  reason: invalid class name and case insensitive filesystem */
public final class C338957ip implements Runnable {
    public final /* synthetic */ AnonymousClass9PE A00;
    public final /* synthetic */ C71162bE A01;

    public C338957ip(AnonymousClass9PE r1, C71162bE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C342857pH r2;
        C262204Co r0;
        2L6 r02;
        C262204Co r1;
        AnonymousClass9PE r5 = this.A00;
        AnonymousClass80Q r22 = r5.A06;
        if (r22 != null) {
            C71162bE r6 = this.A01;
            float f = r6.A01;
            AnonymousClass2a4 r03 = r6.A04;
            0qQ.A07(r03);
            float A012 = r03.A01(f);
            if (A012 == 0.0f) {
                r5.setUserVisibleHint(false);
                2L6 r04 = r5.A0B;
                if (!(r04 == null || (r0 = r04.A00) == null || !r0.isActive() || (r02 = r5.A0B) == null || (r1 = r02.A00) == null)) {
                    r1.AG7((CancellationException) null);
                }
            } else {
                AnonymousClass9PE.A01(r5);
            }
            r22.A00.A18.A00().A0A(C348017xk.A00(r6.A02), AnonymousClass05K.A0C, A012);
            C342817pD r12 = r5.A08;
            if (r12 == null) {
                0qQ.A0F("swipePercentageThresholdController");
                throw AnonymousClass00P.createAndThrow();
            }
            r12.A00 = A012;
            if (A012 >= r12.A02 && (r2 = r12.A01) != null) {
                r2.A00.A01 = null;
                r2.A01.A05(false);
            }
        }
    }
}
