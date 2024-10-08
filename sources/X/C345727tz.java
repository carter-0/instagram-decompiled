package X;

import android.os.Handler;

/* renamed from: X.7tz  reason: invalid class name and case insensitive filesystem */
public final class C345727tz extends C344317rf implements C345627tp, C345737u0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C344477rv A04;
    public B3P A05;
    public C344397rn A06;
    public Integer A07;
    public C345697tw A08;
    public final Handler A09;
    public final C341537n7 A0A = new C40074AQe(this);
    public final AVA A0B;
    public final C341027mD A0C = new AUC(this);
    public final C343967r6 A0D;
    public final ADm A0E;
    public final C341567nA A0F;
    public final C341537n7 A0G = new C40075AQf(this);

    public final void A09() {
        this.A05 = (B3P) A0A(B3P.A00);
        C343717qg r1 = C345697tw.A00;
        C343837qt r3 = this.A00;
        if (r3.CQN(r1)) {
            this.A08 = (C345697tw) A0A(r1);
        }
        C343717qg r2 = C344397rn.A00;
        if (r3.CQN(r2)) {
            C344397rn r12 = (C344397rn) A0A(r2);
            this.A06 = r12;
            r12.AAM(this.A0C);
            this.A06.EqK(this.A0B);
        } else {
            C345697tw r0 = this.A08;
            if (r0 != null) {
                AVA ava = this.A0B;
                C343837qt r02 = ((C344467ru) r0).A00;
                r02.getClass();
                ((C344397rn) r02.Ape(r2)).EqK(ava);
            }
        }
        C343717qg r13 = C344477rv.A01;
        if (r3.CQN(r13)) {
            this.A04 = (C344477rv) A0A(r13);
        }
        this.A07 = AnonymousClass05K.A00;
    }

    public final C343717qg BJt() {
        return C345627tp.A00;
    }

    public C345727tz(C343837qt r5) {
        super(r5);
        C343967r6 r0;
        C343937r3 r1 = C343967r6.A00;
        C343837qt r3 = this.A00;
        C344037rD r2 = null;
        if (r3.CQO(r1)) {
            r0 = (C343967r6) r3.Apf(r1);
        } else {
            r0 = null;
        }
        this.A0D = r0;
        C343937r3 r12 = C344037rD.A00;
        r2 = r3.CQO(r12) ? (C344037rD) r3.Apf(r12) : r2;
        this.A09 = ((C343927r2) r3.Apf(C343927r2.A00)).BAM("Lite-Controller-Thread");
        this.A0B = new AVA(this);
        this.A0E = (ADm) r3.Apu(C345737u0.A01);
        this.A0F = new C341557n9(r2);
    }
}
