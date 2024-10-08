package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Rem  reason: case insensitive filesystem */
public abstract class C9668Rem {
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        C307896Rx r3 = r14;
        C307786Rm r4 = r14.A03;
        AnonymousClass6Tm r5 = r15;
        Object A02 = r15.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0p = DbX.A0p(r15, "null cannot be cast to non-null type kotlin.String");
        String A0n = Pxg.A0n(r15, 3);
        Object A03 = r15.A03(4);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) A03;
        Object A032 = r15.A03(5);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) A032;
        List list2 = (List) DbT.A0q(r5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", 6);
        String A0n2 = Pxg.A0n(r5, 7);
        C277014uI A0P = DbW.A0P(r5, 8);
        C277014uI A0P2 = DbW.A0P(r5, 9);
        Object A033 = r5.A03(10);
        0qQ.A0C(A033, AnonymousClass000.A00(39));
        Boolean bool = (Boolean) A033;
        if (A0n == null || !A0n.equals("VERIFY_FACTOR") || (!str.equals("SMS_OTP") && !str.equals("MFT_SMS_OTP") && !str.equals("MFT_RECOVERY_CODE"))) {
            0qQ.A0A(r4);
            C11395SRo.A02(r4.A00, new C12471Sv3(r3, A0P, A0P2, 3), bool, str, A0n, A0p, (String) null, (String) null, A0n2, list, list2, map);
            return null;
        }
        0qQ.A0A(r4);
        C11395SRo.A03(r4.A00, new C12471Sv3(r3, A0P, A0P2, 2), str, A0p, A0n2, list, list2, map);
        return null;
    }
}
