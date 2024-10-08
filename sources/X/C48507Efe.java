package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Efe  reason: case insensitive filesystem */
public abstract class C48507Efe {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Integer num;
        Integer num2;
        Integer num3;
        Object A03 = r8.A03(0);
        String A0p = DbS.A0p(A03);
        String str = (String) A03;
        String A0k = DbW.A0k(r8, A0p);
        int A04 = DbW.A04(r8.A03(2), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0W = DbX.A0W(r7);
        AnonymousClass0eM r0 = 2c5.A03;
        AnonymousClass424 A00 = 2c6.A00(A0W, String.valueOf(A04));
        boolean A1U = AnonymousClass7TF.A1U(0, str, A0k);
        int hashCode = A0k.hashCode();
        if (hashCode != -817598092) {
            if (hashCode != -314765822) {
                if (hashCode != 1671672458 || !A0k.equals("dismiss")) {
                    return null;
                }
                num = AnonymousClass05K.A0N;
            } else if (!A0k.equals("primary")) {
                return null;
            } else {
                num = AnonymousClass05K.A01;
            }
        } else if (!A0k.equals("secondary")) {
            return null;
        } else {
            num = AnonymousClass05K.A0C;
        }
        int intValue = num.intValue();
        if (intValue == A1U) {
            num2 = AnonymousClass05K.A0Y;
            num3 = AnonymousClass05K.A0j;
        } else if (intValue != 2) {
            AnonymousClass424.A03(A00, AnonymousClass05K.A1F, AnonymousClass05K.A1I, AnonymousClass05K.A01, str);
            return null;
        } else {
            num2 = AnonymousClass05K.A0u;
            num3 = AnonymousClass05K.A15;
        }
        AnonymousClass424.A03(A00, num2, num3, (Integer) null, str);
        return null;
    }
}
