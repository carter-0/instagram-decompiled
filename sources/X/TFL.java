package X;

import java.util.HashMap;

public final class TFL implements Runnable {
    public final /* synthetic */ SF6 A00;
    public final /* synthetic */ C13545TcH A01;

    public TFL(SF6 sf6, C13545TcH tcH) {
        this.A00 = sf6;
        this.A01 = tcH;
    }

    public final void run() {
        Sm0 sm0 = this.A00.A00;
        C13545TcH tcH = this.A01;
        if (sm0.A05) {
            HashMap hashMap = sm0.A03;
            SI1 si1 = C11238SGy.A02;
            tcH.Cx2(si1.A02(hashMap), sm0.A01.A00(hashMap), si1.A01(hashMap), SI1.A00(hashMap));
            return;
        }
        1OC A06 = C318486p2.A06(sm0.A02);
        A06.A00 = new C8766R8r(2, sm0, tcH);
        1ES.A03(A06);
    }
}
