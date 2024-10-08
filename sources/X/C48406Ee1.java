package X;

import java.util.List;

/* renamed from: X.Ee1  reason: case insensitive filesystem */
public abstract class C48406Ee1 {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Integer num;
        String A0h = DbY.A0h(r9, 0);
        List list = r9.A00;
        Object obj = list.get(1);
        C277014uI A0O = DbW.A0O(r9);
        C277014uI A0P = DbW.A0P(r9, 3);
        Object obj2 = list.get(4);
        String A0k = AnonymousClass7TF.A0k(A0h);
        if (A0k.equals("KEYSTORE")) {
            num = AnonymousClass05K.A00;
        } else if (A0k.equals("PLAY_INTEGRITY")) {
            num = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A0w(A0k);
        }
        if (num.intValue() != 0) {
            Fl3 fl3 = new Fl3(r8, A0O, A0P, obj);
            C307786Rm r0 = r8.A03;
            if (r0 == null) {
                return null;
            }
            C49130Ept.A00().A01(r0.A00, DbU.A0V(r8), fl3);
            return null;
        }
        C57319IXc iXc = new C57319IXc(r8, A0O, A0P, obj2);
        C307786Rm r02 = r8.A03;
        if (r02 == null) {
            return null;
        }
        C49130Ept.A00().A00(r02.A00, DbU.A0V(r8), iXc);
        return null;
    }
}
