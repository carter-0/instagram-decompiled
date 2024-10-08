package X;

import java.util.Iterator;

public final class ATM implements C341687nM {
    public final /* synthetic */ B16 A00;
    public final /* synthetic */ C341627nG A01;

    public ATM(B16 b16, C341627nG r2) {
        this.A01 = r2;
        this.A00 = b16;
    }

    public final void DCg(C391719tX r3) {
        boolean z = r3 instanceof C382309dU;
        C341627nG r1 = this.A01;
        if (z) {
            r1.A04(r3);
        } else {
            r1.A04(new C382309dU(r3));
        }
        r1.A06(this.A00);
    }

    public final void onSuccess() {
        C341627nG r3 = this.A01;
        r3.A00 = 3;
        r3.A08.Cjl(19, "recording_stop_finished");
        C41827B2i b2i = r3.A0A;
        if (b2i != null) {
            r3.A0A = null;
            r3.A06.post(new C40960Am6(b2i, r3));
        }
        Iterator A0v = AnonymousClass7TF.A0v(r3.A05);
        while (A0v.hasNext()) {
            ((C341717nP) A0v.next()).Ep5((C341667nK) null);
        }
        r3.A06(this.A00);
    }
}
