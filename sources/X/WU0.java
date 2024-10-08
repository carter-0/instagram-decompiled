package X;

import java.util.List;

public final class WU0 implements C250603lj {
    public final List A00;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        Integer num;
        AnonymousClass7TF.A1H(r6, r7);
        int A0A = C51968G9o.A0A(r6, r7);
        if (A0A == 0) {
            for (C15678Ugj ugj : this.A00) {
                Integer num2 = ugj.A01;
                Integer num3 = AnonymousClass05K.A01;
                if (num2 == num3 || num2 == AnonymousClass05K.A0C) {
                    num3 = AnonymousClass05K.A00;
                }
                ugj.A00 = num3;
            }
        } else if (A0A == 2) {
            for (C15678Ugj ugj2 : this.A00) {
                if (ugj2.A01 == AnonymousClass05K.A01) {
                    num = AnonymousClass05K.A0N;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                ugj2.A00 = num;
            }
        }
    }

    public WU0(List list) {
        this.A00 = list;
    }
}
