package X;

import java.util.List;

/* renamed from: X.7u6  reason: invalid class name and case insensitive filesystem */
public final class C345797u6 extends C345477tY implements C345807u7 {
    public int A00 = 0;
    public C364988mL A01;
    public final C3496981j A02 = new C3496981j();

    public final void A09() {
        this.A00 = 1;
        List list = this.A02.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C364988mL) list.get(i)).A02();
        }
    }

    public final C364988mL AMq(C365328mu r9) {
        C343717qg r2 = C344477rv.A01;
        C343837qt r1 = this.A00;
        C364988mL r22 = new C364988mL(((C366418ot) r1.Ape(C366418ot.A00)).B5x(), ((C344477rv) r1.Ape(r2)).Abt(), (C344037rD) r1.Apf(C344037rD.A00), ((C344477rv) r1.Ape(r2)).AMp(), r9);
        if (this.A00 >= 1) {
            r22.A02();
        }
        if (this.A00 >= 2) {
            r22.A0K = true;
        }
        this.A02.A01(r22);
        return r22;
    }

    public final C364988mL Avx() {
        if (this.A01 == null) {
            C343717qg r2 = C344477rv.A01;
            C343837qt r1 = this.A00;
            C364988mL r22 = new C364988mL(((C366418ot) r1.Ape(C366418ot.A00)).B5x(), ((C344477rv) r1.Ape(r2)).Abt(), (C344037rD) r1.Apf(C344037rD.A00), ((C344477rv) r1.Ape(r2)).Avw(), (C365328mu) null);
            this.A01 = r22;
            if (this.A00 >= 1) {
                r22.A02();
            }
            if (this.A00 >= 2) {
                this.A01.A0K = true;
            }
            this.A02.A01(this.A01);
        }
        return this.A01;
    }

    public final C344287rc BJx() {
        return C345807u7.A00;
    }

    public final void ECk(C364988mL r3) {
        if (this.A02.A02(r3)) {
            if (this.A00 >= 2) {
                r3.A0K = false;
            }
            if (this.A00 >= 1) {
                r3.A0C(new C40742AiY(r3));
            }
        }
    }

    public C345797u6(C343837qt r2) {
        super(r2);
    }
}
