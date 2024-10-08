package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Re7  reason: case insensitive filesystem */
public abstract class C9627Re7 {
    public static C8294Qna A00(S4g s4g) {
        try {
            C12098Smt smt = (C12098Smt) C41847B3o.A16(C11055S8a.class);
            smt.A00.A04("payment_type", "FBPAY_HUB");
            smt.A02 = true;
            return C8294Qna.A00(s4g, AnonymousClass2E0.A06().A00.A00, smt.build(), new DGZ(9));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
