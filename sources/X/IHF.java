package X;

import java.util.concurrent.CancellationException;

public final class IHF implements AnonymousClass0hF {
    public final /* synthetic */ 07T A00;
    public final /* synthetic */ 07T A01;
    public final /* synthetic */ 0sL A02;
    public final /* synthetic */ 0rm A03;
    public final /* synthetic */ 1IX A04;
    public final /* synthetic */ C262224Cq A05;

    public IHF(07T r1, 07T r2, 0sL r3, 0rm r4, 1IX r5, C262224Cq r6) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void Dms(07T r7, AnonymousClass07Z r8) {
        0qQ.A0B(r7, 1);
        if (r7 == this.A01) {
            0rm r4 = this.A03;
            if (r4.A00 == null) {
                r4.A00 = C51966G9m.A1L(new C58099ImL(this.A02, (AnonymousClass4D7) null, 12), this.A05);
                return;
            }
            throw AnonymousClass7TE.A0z("job should only be launched once");
        } else if (r7 == this.A00) {
            C262204Co r0 = (C262204Co) this.A03.A00;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            this.A04.resumeWith(C60340gF.A00);
        }
    }
}
