package X;

import java.util.List;

/* renamed from: X.Rgq  reason: case insensitive filesystem */
public abstract class C9794Rgq {
    public static Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        AnonymousClass6Tm r0 = r16;
        List list = r0.A00;
        String A0t = DbU.A0t(list, 1);
        C277014uI A0R = DbV.A0R(list, 2);
        C277014uI A0R2 = DbV.A0R(list, 3);
        1Fc r1 = new 1Fc();
        r1.A05("bank_account_number", (String) r0.A03(0));
        if (A0t != null) {
            r1.A05("payment_dev_cycle", A0t);
        }
        1OC A01 = AnonymousClass9D0.A01(1GK.A06.A00(new TNH(r1, 9), 658, 2, false, false).A02(new 1QY((AnonymousClass1O9) null), 747, 2, true, false).A01(new T7V(0), 748, 2), "FetchPaymentToken", "https://secure.facebook.com/payments/generate_token");
        A01.A00 = new C8765R8q(1, A0R2, A0R, r15);
        1ES.A03(A01);
        return null;
    }
}
