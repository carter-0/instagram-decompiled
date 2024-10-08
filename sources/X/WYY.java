package X;

import com.instagram.common.session.UserSession;

public final class WYY implements XB6 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public WYY(AnonymousClass0iw r2, UserSession userSession, Long l, String str, String str2) {
        DbW.A1N(str, 4, str2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = l;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r5 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgq(android.os.Bundle r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            r1 = 0
            if (r9 == 0) goto L_0x0083
            java.lang.String r0 = "form_id"
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r0 = "is_standard_form"
            boolean r7 = r9.getBoolean(r0)
            java.lang.String r0 = "question_type"
            java.lang.String r5 = r9.getString(r0)
            if (r5 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r5 = ""
        L_0x0019:
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0iw r0 = r8.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r3)
            java.lang.String r0 = "ig_lead_gen_organic_consumer"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            r0 = 225(0xe1, float:3.15E-43)
            X.1Ln r4 = new X.1Ln
            r4.<init>(r2, r0)
            X.C13992Tns.A0p(r4, r11, r12, r13)
            java.lang.String r0 = r8.A04
            X.C13992Tns.A0k(r4, r3, r0)
            java.lang.String r0 = X.C13991Tnr.A0h(r3)
            if (r0 == 0) goto L_0x0080
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0080
            long r2 = r0.longValue()
        L_0x0046:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "consumer_ig_user_fbidv2"
            r4.A0Q(r0, r2)
            java.lang.Long r2 = r8.A02
            java.lang.String r0 = "business_ig_user_fbidv2"
            r4.A0Q(r0, r2)
            java.lang.String r0 = r8.A03
            r3 = 10
            java.lang.Long r2 = X.00y.A0n(r3, r0)
            java.lang.String r0 = "business_ig_user_id"
            r4.A0Q(r0, r2)
            if (r6 == 0) goto L_0x0069
            java.lang.Long r1 = X.00y.A0n(r3, r6)
        L_0x0069:
            java.lang.String r0 = "lead_form_id"
            r4.A0Q(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_generic_form"
            r4.A0O(r0, r1)
            java.lang.String r0 = "question_type"
            r4.A0R(r0, r5)
            r4.Cgf()
            return
        L_0x0080:
            r2 = 0
            goto L_0x0046
        L_0x0083:
            r6 = r1
            r7 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WYY.Cgq(android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final 1Ln A00(WYY wyy, String str, String str2) {
        long j;
        Long A10;
        UserSession userSession = wyy.A01;
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wyy.A00, userSession), "ig_lead_gen_organic_consumer"), 225);
        C13992Tns.A0p(r2, "lead_gen_consumer", str, str2);
        C13992Tns.A0k(r2, userSession, wyy.A04);
        String A0h = C13991Tnr.A0h(userSession);
        if (A0h == null || (A10 = AnonymousClass7TE.A10(A0h)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        r2.A0Q("consumer_ig_user_fbidv2", Long.valueOf(j));
        r2.A0Q("business_ig_user_fbidv2", wyy.A02);
        r2.A0Q("business_ig_user_id", AnonymousClass7TE.A10(wyy.A03));
        return r2;
    }

    public static void A02(WYY wyy, String str, String str2, String str3, boolean z) {
        1Ln A002 = A00(wyy, str, "impression");
        A002.A0Q("lead_form_id", 00y.A0n(10, str2));
        A002.A0R("question_type", str3);
        A002.A0O("is_generic_form", Boolean.valueOf(z));
        A002.Cgf();
    }

    public static void A01(WYY wyy, String str, String str2, String str3, boolean z) {
        1Ln A002 = A00(wyy, str, str2);
        A002.A0Q("lead_form_id", 00y.A0n(10, str3));
        A002.A0O("is_generic_form", Boolean.valueOf(z));
        A002.Cgf();
    }
}
