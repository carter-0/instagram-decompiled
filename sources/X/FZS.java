package X;

import java.util.Map;

public final class FZS implements C250603lj {
    public final G5V A00;
    public final C49351EuF A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        double d;
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        r8.B0M(r7);
        float CFe = r8.CFe(r7);
        UO1 uo1 = (UO1) r7.A03;
        int intValue = r8.CEk(r7).intValue();
        if (intValue == 0) {
            0qQ.A0A(uo1);
            this.A00.AH0(uo1.A05);
        } else if (intValue != A1U) {
            C49351EuF euF = this.A01;
            0qQ.A0A(uo1);
            0qQ.A0B(uo1, 0);
            Map map = euF.A00;
            String str = uo1.A05;
            map.get(str);
            map.remove(str);
        } else {
            0qQ.A0A(uo1);
            G5V g5v = this.A00;
            String str2 = uo1.A05;
            g5v.AH0(str2);
            if (uo1.A00 != 0) {
                double d2 = (double) CFe;
                Map map2 = this.A01.A00;
                Number number = (Number) map2.get(str2);
                if (number != null) {
                    d = number.doubleValue();
                } else {
                    d = 0.0d;
                }
                map2.put(str2, Double.valueOf(Math.max(d2, d)));
            }
        }
    }

    public FZS(G5V g5v, C49351EuF euF) {
        this.A00 = g5v;
        this.A01 = euF;
    }
}
