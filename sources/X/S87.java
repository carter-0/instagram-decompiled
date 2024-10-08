package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

public abstract class S87 {
    public static final C60340gF A00(C307896Rx r12, AnonymousClass6Tm r13) {
        int i;
        int i2;
        C10931S1j qqb;
        List list = r13.A00;
        String A0t = DbU.A0t(list, 0);
        String str = (String) DbW.A0d(r13);
        Object A00 = r13.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A00;
        String A0t2 = DbU.A0t(list, 3);
        C277014uI A0P = DbW.A0P(r13, 4);
        C277014uI A0P2 = DbW.A0P(r13, 5);
        C277014uI A0P3 = DbW.A0P(r13, 6);
        C307786Rm r0 = r12.A03;
        if (r0 != null) {
            Context context = r0.A00;
            Number A14 = C51966G9m.A14("connection_timeout", map);
            if (A14 != null) {
                i = A14.intValue();
            } else {
                i = 15000;
            }
            Number A142 = C51966G9m.A14("read_timeout", map);
            if (A142 != null) {
                i2 = A142.intValue();
            } else {
                i2 = 30000;
            }
            C10403Rrf rrf = new C10403Rrf(i, i2);
            C12137Sni sni = new C12137Sni(r12, A0P, A0P2);
            if (A0t2 == null) {
                qqb = new QQA(context, sni, rrf, str);
            } else {
                qqb = new QQB(context, sni, rrf, str, A0t2);
            }
            if (A0t != null) {
                new QQA(context, new C12138Snj(qqb, r12, A0P3, A0P2), rrf, A0t).A00();
            } else {
                qqb.A00();
            }
        } else {
            A01(r12, A0P2, "no_context");
        }
        return C60340gF.A00;
    }

    public static final void A01(C307896Rx r2, C277014uI r3, String str) {
        AnonymousClass7TF.A0D().post(new TII(r2, r3, str));
    }
}
