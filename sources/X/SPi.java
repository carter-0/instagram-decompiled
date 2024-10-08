package X;

import java.util.List;

public abstract /* synthetic */ class SPi {
    public static final SPi $redex_init_class = null;

    static {
        C13140TMy tMy = C13891TjE.A00;
    }

    public static C8588QxQ A00(C11230SGo sGo, int i, int i2) {
        try {
            C8576QxE A00 = C8588QxQ.A00();
            C8577QxF A002 = C8587QxP.A00();
            A002.A06(sGo.A00);
            A002.A08(sGo.A01);
            A002.A07(i);
            A00.A07(A002);
            A00.A06(i2);
            return (C8588QxQ) A00.A01();
        } catch (Exception e) {
            SUN.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static C8585QxN A01(int i) {
        try {
            C8574QxC A00 = C8585QxN.A00();
            A00.A06(i);
            return (C8585QxN) A00.A01();
        } catch (Exception e) {
            SUN.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static C8590QxS A02(List list) {
        try {
            C8579QxH A00 = C8590QxS.A00();
            A00.A07(3);
            A00.A0A(list);
            return (C8590QxS) A00.A01();
        } catch (Exception e) {
            SUN.A0B("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
