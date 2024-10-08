package X;

import java.util.HashSet;
import java.util.LinkedHashMap;

public final class SMb {
    public static final SMb A00 = new Object();

    /* JADX WARNING: type inference failed for: r4v0, types: [X.RsP, java.lang.Object] */
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        Object A03 = r14.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        C277014uI A0P = DbW.A0P(r14, 2);
        C277014uI A0P2 = DbW.A0P(r14, 3);
        String A0k = Pxf.A0k(09i.A0A.A08(A00).A06);
        LinkedHashMap A07 = 0Yt.A07(Pxg.A1b("device_key", A0k, AnonymousClass7TE.A1L("cred_id", A03), AnonymousClass7TE.A1L("secret_and_key", 002.A0i("proof.", A0k, (String) DbT.A0q(r14, "null cannot be cast to non-null type kotlin.String", 1), '.'))));
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add("secret_and_key");
        C10890Rzq rzq = C11214SFo.A0A;
        SSZ A01 = SOC.A01();
        ? obj = new Object();
        obj.A00 = A07;
        obj.A01 = A1F;
        C11214SFo A002 = rzq.A00(A01, obj, "SEND_E2EE_DATA", 0Yt.A0E(), 0sl.A00);
        C11638Sdg sdg = new C11638Sdg(A0P2, A0P, r13, A0k, 0);
        C7422QCn A012 = SQA.A01(A002);
        0qQ.A07(A012);
        SQB.A01((AnonymousClass07Z) null, A012, sdg);
        return null;
    }
}
