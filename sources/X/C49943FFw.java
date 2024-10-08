package X;

/* renamed from: X.FFw  reason: case insensitive filesystem */
public final class C49943FFw {
    public static C49943FFw A03;
    public static final F1P A04 = new Object();
    public Integer A00;
    public String A01;
    public String A02;

    public final void A02(AnonymousClass0iw r6, 0lg r7, Integer num, Integer num2, String str) {
        String str2 = null;
        0qQ.A0B(num2, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, r7), "instagram_gdpr_consent_flow_actions");
        if (A0e.isSampled()) {
            String str3 = this.A02;
            if (str3 != null) {
                A0e.AAJ(Dbq.A01(), str3);
                Integer num3 = this.A00;
                if (num3 != null) {
                    A0e.AAJ("user_state", C49766F5z.A01(num3));
                    DbS.A1J(A0e, C48930EmU.A00(num));
                    if (num != AnonymousClass05K.A0C) {
                        str = null;
                    }
                    A0e.AAJ("click_point", str);
                    A0e.AAJ("email", (String) null);
                    if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
                        str2 = DbV.A0t();
                    }
                    A0e.AAJ("guid", str2);
                    DbW.A15(A0e, r6);
                    A0e.AAJ("stage", C48929EmT.A00(num2));
                    A0e.AAJ("waterfall_id", C49917FEr.A01());
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final synchronized void A03(String str, Integer num) {
        F1P f1p = A04;
        f1p.A00();
        f1p.A00().A01 = str;
        f1p.A00().A00 = num;
        f1p.A00().A02 = AnonymousClass7TF.A0b();
    }

    public static final synchronized C49943FFw A00() {
        C49943FFw A002;
        synchronized (C49943FFw.class) {
            A002 = A04.A00();
        }
        return A002;
    }

    public static final void A01(AnonymousClass0iw r4, 0lg r5, C49943FFw fFw, Integer num, Integer num2) {
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, r5), "instagram_gdpr_consent_flow_view");
        if (A0e.isSampled()) {
            String str3 = fFw.A02;
            if (str3 != null) {
                A0e.AAJ(Dbq.A01(), str3);
                A0e.AAJ("stage", C48929EmT.A00(num));
                Integer num3 = fFw.A00;
                if (num3 != null) {
                    A0e.AAJ("user_state", C49766F5z.A01(num3));
                    if (num2 != null) {
                        str = C48930EmU.A00(num2);
                    } else {
                        str = null;
                    }
                    DbS.A1J(A0e, str);
                    if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
                        str2 = DbV.A0t();
                    } else {
                        str2 = null;
                    }
                    A0e.AAJ("guid", str2);
                    DbW.A15(A0e, r4);
                    A0e.AAJ("waterfall_id", C49917FEr.A01());
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
