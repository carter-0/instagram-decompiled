package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3DN  reason: invalid class name */
public final class AnonymousClass3DN implements AnonymousClass0hF {
    public final /* synthetic */ 07T A00;
    public final /* synthetic */ 07T A01;
    public final /* synthetic */ 0sL A02;
    public final /* synthetic */ 0rm A03;
    public final /* synthetic */ 1IX A04;
    public final /* synthetic */ C262224Cq A05;
    public final /* synthetic */ 136 A06;

    public AnonymousClass3DN(07T r1, 07T r2, 0sL r3, 0rm r4, 1IX r5, C262224Cq r6, 136 r7) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void Dms(07T r7, AnonymousClass07Z r8) {
        0qQ.A0B(r7, 1);
        if (r7 == this.A01) {
            0rm r4 = this.A03;
            C262224Cq r3 = this.A05;
            AnonymousClass9KM r2 = new AnonymousClass9KM((AnonymousClass4D7) null, this.A02, this.A06);
            r4.A00 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
            return;
        }
        if (r7 == this.A00) {
            0rm r1 = this.A03;
            C262204Co r0 = (C262204Co) r1.A00;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            r1.A00 = null;
        }
        if (r7 == 07T.ON_DESTROY) {
            this.A04.resumeWith(C60340gF.A00);
        }
    }
}
