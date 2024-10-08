package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PPv  reason: case insensitive filesystem */
public final class C72937PPv implements 0Jp {
    public final C268194cw A00;
    public final AnonymousClass5HJ A01;
    public final C70792OLn A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final 0sP A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final void ATC(UserSession userSession, 0Jv r32) {
        UserSession userSession2 = userSession;
        0Jv r7 = r32;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, r7);
        AnonymousClass5HJ r4 = this.A01;
        C268194cw r5 = this.A00;
        r5.A0F("skips_sync", false);
        AnonymousClass6EB r8 = (AnonymousClass6EB) this.A06.invoke(userSession2);
        String str = this.A04;
        String str2 = this.A05;
        String obj = r5.toString();
        String str3 = r4.A1G;
        if (str3 == null) {
            str3 = r4.A1F;
        }
        if (str3 == null) {
            str3 = "";
        }
        Boolean valueOf = Boolean.valueOf(r4.A1S);
        boolean z = this.A08;
        AnonymousClass6EB.A01(r8, valueOf, Boolean.valueOf(z), "ARMADILLO_NOTIFICATIONS_PUSH_PAYLOAD_RECEIVED", str, str2, obj, str3);
        if (r4.A1S) {
            String str4 = this.A03;
            if (str4 == null) {
                str4 = OQ0.A00(userSession2);
            }
            String str5 = r4.A0z;
            if (str5 == null) {
                str5 = str4;
            }
            r4.A0z = str5;
            if (str5 != null) {
                AnonymousClass65S A002 = AnonymousClass6ED.A00(userSession2);
                String str6 = r4.A0B.A01;
                boolean z2 = this.A09;
                Boolean valueOf2 = Boolean.valueOf(this.A07);
                boolean z3 = r4.A1S;
                String A022 = AnonymousClass6ED.A02(z, r4.A1U);
                Integer num = r4.A0I;
                Integer num2 = r4.A0H;
                String str7 = r4.A0T;
                String str8 = str4;
                String str9 = str6;
                String str10 = str7;
                Integer num3 = num2;
                String str11 = str5;
                Integer num4 = num;
                A002.A04(valueOf2, num4, num3, str11, str8, str9, A022, str10, C74178PqK.A00(userSession2, 32), new C59110J6s(userSession2, 43), z2, false, z3);
            }
        }
        this.A02.A00(A1U);
        r7.AId((Object) null);
    }

    public C72937PPv(C268194cw r2, AnonymousClass5HJ r3, C70792OLn oLn, String str, String str2, String str3, 0sP r8, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r8, 10);
        this.A01 = r3;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A09 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A00 = r2;
        this.A02 = oLn;
        this.A06 = r8;
    }
}
