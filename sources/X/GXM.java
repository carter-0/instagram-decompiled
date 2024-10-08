package X;

import com.instagram.common.session.UserSession;

public final class GXM extends C230502pj {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r4 = (X.C296965qw) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r12, X.C252093oY r13) {
        /*
            r11 = this;
            r6 = 0
            X.AnonymousClass7TF.A1H(r12, r13)
            java.lang.Object r5 = r12.A03
            X.0qQ.A06(r5)
            X.5qt r5 = (X.C296935qt) r5
            boolean r0 = r5 instanceof X.C296965qw
            if (r0 == 0) goto L_0x00f5
            r4 = r5
            X.5qw r4 = (X.C296965qw) r4
            X.1Xj r0 = r4.BPf()
            if (r0 == 0) goto L_0x00f5
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x00f5
            java.util.Map r0 = X.AnonymousClass59A.A02
            java.lang.Object r3 = r0.get(r2)
            X.59B r3 = (X.AnonymousClass59B) r3
            java.lang.Integer r1 = r13.CEk(r12)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00f6
            if (r3 == 0) goto L_0x00f2
            java.util.Set r0 = r3.A01
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f2
            X.0qQ.A0B(r5, r6)
            java.util.LinkedHashMap r5 = X.C244083ac.A02(r2)
            X.1Xj r6 = r4.BPf()
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f2
            if (r6 == 0) goto L_0x00f2
            X.0wc r1 = r11.A00
            java.lang.String r0 = "ig_rendering_validation_automatic"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r8 = r11.A01
            java.lang.String r9 = X.C231122qu.A07(r8, r6)
            X.59A r0 = X.AnonymousClass59A.A00
            java.util.ArrayList r7 = X.AnonymousClass59A.A02(r2)
            java.util.ArrayList r1 = r0.A07(r2)
            X.GkG r4 = new X.GkG
            r4.<init>()
            if (r1 == 0) goto L_0x0095
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0095
            r0 = 2159(0x86f, float:3.025E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A07(r0, r7)
            r0 = 3312(0xcf0, float:4.641E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.A07(r0, r1)
            java.lang.Double r1 = X.AnonymousClass59A.A01(r2)
            java.lang.String r0 = "dwell_time"
            r4.A04(r0, r1)
        L_0x0095:
            X.6KP r7 = X.AnonymousClass59A.A00(r2)
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x009e
            r9 = r10
        L_0x009e:
            java.lang.String r0 = "ad_id"
            r3.AAJ(r0, r9)
            java.lang.String r1 = r8.A06
            java.lang.String r0 = "a_pk"
            r3.AAJ(r0, r1)
            X.C51965G9l.A1I(r3, r2)
            java.lang.String r0 = X.C231122qu.A0F(r8, r6)
            if (r0 == 0) goto L_0x00b4
            r10 = r0
        L_0x00b4:
            X.C51965G9l.A1L(r3, r10)
            X.4DU r0 = r11.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "source_of_action"
            r3.AAJ(r0, r1)
            java.lang.String r1 = X.AnonymousClass1Q2.A00()
            java.lang.String r0 = "locale"
            r3.AAJ(r0, r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r0.getCountry()
            java.lang.String r0 = "country"
            r3.AAJ(r0, r1)
            X.1iA r0 = r6.BR7()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "media_type"
            X.C51974G9v.A0t(r3, r0, r1, r5)
            java.lang.String r0 = "creative_optimizations"
            r3.AAK(r4, r0)
            java.lang.String r0 = "layout_info"
            r3.AAK(r7, r0)
            r3.Cgf()
        L_0x00f2:
            X.AnonymousClass59A.A03(r2)
        L_0x00f5:
            return
        L_0x00f6:
            r11.A02(r12, r13, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GXM.ATF(X.30Y, X.3oY):void");
    }

    public GXM(UserSession userSession, AnonymousClass4DU r3) {
        super(userSession);
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = AnonymousClass0kN.A00(r3, 0kJ.A05, userSession);
    }
}
