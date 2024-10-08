package X;

import java.util.AbstractCollection;

public final class FmC implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FmC(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void Cyc() {
        switch (this.A00) {
            case 0:
                ((G74) this.A03).Cyg();
                0r1 r1 = (0r1) this.A02;
                if (r1.A00) {
                    r1.A00 = false;
                    return;
                }
                FEU feu = (FEU) this.A01;
                int size = ((AbstractCollection) this.A04).size();
                0Aj A002 = FEU.A00(feu);
                Dbb.A19(C48138EZg.BOTTOMSHEET, A002);
                A002.A9F("num_requests", DbS.A0j(size));
                FEU.A01(A002, feu);
                return;
            case 1:
                C273384mU r0 = (C273384mU) this.A03;
                if (r0 != null) {
                    r0.EHd();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void Cyf() {
    }
}
