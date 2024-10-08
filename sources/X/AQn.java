package X;

import java.util.HashMap;
import java.util.List;

public final class AQn implements C341737nR {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341737nR A01;
    public final /* synthetic */ C341627nG A02;
    public final /* synthetic */ List A03;

    public AQn(C341737nR r1, C341737nR r2, C341627nG r3, List list) {
        this.A02 = r3;
        this.A03 = list;
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onError(Throwable th) {
        this.A02.A06(new AUS(this.A00, th, 1));
    }

    public final void onSuccess() {
        C341627nG r6 = this.A02;
        List<C343477qH> list = this.A03;
        C341737nR r3 = this.A01;
        HashMap A1E = AnonymousClass7TE.A1E();
        for (C343477qH CAE : list) {
            C341717nP r2 = (C341717nP) r6.A05.get(CAE.CAE());
            if (r2 != null && r2.CQQ()) {
                if (r2.BZW() != null) {
                    A1E.put(r2.CAE(), r2.BZW());
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("One of the configured tracks ");
                    A1A.append(r2.CAE());
                    r3.onError(new C391719tX(21002, AnonymousClass7TF.A0l(" has null Output MediaFormatProvider", A1A)));
                    return;
                }
            }
        }
        C341667nK r1 = r6.A03;
        r1.A01 = A1E;
        r1.A04(C341667nK.A0I);
        r1.A0E = false;
        r3.onSuccess();
    }
}
