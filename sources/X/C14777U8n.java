package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.U8n  reason: case insensitive filesystem */
public final class C14777U8n extends 2YL {
    public boolean A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final C18460Vs9 A03;
    public final String A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14777U8n(X.C319836rJ r13, com.instagram.common.session.UserSession r14, X.WYW r15) {
        /*
            r12 = this;
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r12.<init>()
            r12.A02 = r14
            java.lang.String r0 = "formID"
            java.lang.Object r0 = r13.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r12.A04 = r0
            java.lang.String r2 = X.C13991Tnr.A0f(r13)
            java.lang.String r1 = r12.A04
            X.Vs9 r0 = new X.Vs9
            r0.<init>(r15, r2, r1)
            r12.A03 = r0
            java.lang.String r0 = "is_from_lead_ad_activity"
            java.lang.Object r0 = r13.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r2 = 0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r12.A09 = r0
            java.lang.String r0 = "is_bottom_sheet_flow"
            boolean r0 = X.C13991Tnr.A1X(r13, r0)
            r12.A08 = r0
            java.lang.String r0 = "is_sensitive_vertical_ad"
            boolean r0 = X.C13991Tnr.A1X(r13, r0)
            r0 = r0 ^ 1
            r12.A00 = r0
            java.lang.String r1 = r12.A04
            r4 = 0
            if (r1 == 0) goto L_0x00eb
            X.Vtw r0 = X.C18544Vtw.A01
            X.Vk5 r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x00ec
            X.CwD r0 = r1.A00
            X.Jvx r3 = r0.A00
        L_0x0052:
            java.lang.String r0 = "advertiserFollowerCount"
            java.lang.Object r0 = r13.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = X.AnonymousClass7TG.A0A(r0)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x00e9
            if (r1 == 0) goto L_0x00e7
            X.CwD r0 = r1.A00
            X.VcQ r1 = r0.A02
        L_0x0068:
            X.W3g r0 = X.C18809W3g.A00
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r7 = r0.A0A(r1)
            if (r7 == 0) goto L_0x0076
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r7.A00
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = r0.A02
        L_0x0076:
            java.lang.String r0 = "profilePicURI"
            java.lang.Object r6 = r13.A00(r0)
            r1 = 0
            if (r5 > 0) goto L_0x0093
            if (r7 == 0) goto L_0x0099
            com.instagram.leadgen.core.model.LeadGenTrustSignal r0 = r7.A02
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0099
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0099
            int r5 = r0.intValue()
        L_0x0093:
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r5 < r0) goto L_0x0099
            r1 = r5
        L_0x0099:
            r5 = r1
            if (r3 == 0) goto L_0x00af
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = r3.A05
            if (r0 != 0) goto L_0x00af
            java.lang.Object r0 = r3.A06
            if (r0 != 0) goto L_0x00af
            X.05G r1 = r12.A06
            X.UwN r0 = X.C16518UwN.OVERVIEW
            r1.Epw(r0)
        L_0x00af:
            r0 = r4
            r4 = r6
        L_0x00b1:
            X.05G r1 = r12.A05
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r6 = r3.A01
            X.UO9 r6 = (X.UO9) r6
            r6.A00 = r5
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            r6.A01 = r4
            r6.A02 = r0
            java.lang.Object r7 = r3.A03
            X.X4H r7 = (X.X4H) r7
            java.lang.Object r8 = r3.A04
            X.X4H r8 = (X.X4H) r8
            java.lang.Object r9 = r3.A02
            X.X4H r9 = (X.X4H) r9
            java.lang.Object r10 = r3.A05
            X.X4H r10 = (X.X4H) r10
            java.lang.Object r11 = r3.A06
            X.X4H r11 = (X.X4H) r11
            X.X4H[] r0 = new X.X4H[]{r6, r7, r8, r9, r10, r11}
            X.0qQ.A0B(r0, r2)
            java.util.List r0 = X.03t.A0I(r0)
        L_0x00e0:
            r1.Epw(r0)
            return
        L_0x00e4:
            X.0sn r0 = X.0sn.A00
            goto L_0x00e0
        L_0x00e7:
            r1 = r4
            goto L_0x0068
        L_0x00e9:
            r0 = r4
            goto L_0x00b1
        L_0x00eb:
            r1 = r4
        L_0x00ec:
            r3 = r4
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14777U8n.<init>(X.6rJ, com.instagram.common.session.UserSession, X.WYW):void");
    }

    public C14777U8n() {
        02z A012 = 106.A01((Object) null);
        this.A06 = A012;
        02z A013 = 106.A01(0sl.A00);
        this.A07 = A013;
        02z A014 = 106.A01(0sn.A00);
        this.A05 = A014;
        this.A01 = DbT.A0G(AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 4), A014, A012, A013));
    }
}
