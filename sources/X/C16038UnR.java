package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;
import java.util.List;

/* renamed from: X.UnR  reason: case insensitive filesystem */
public final class C16038UnR extends U8P {
    public boolean A00;
    public boolean A01;
    public C18027Vk5 A02;
    public final 2Fk A03;
    public final UserSession A04;
    public final LeadFormRepository A05;
    public final C18463VsC A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010e, code lost:
        if (r1 != null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x011a, code lost:
        if (r1 == 0) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16038UnR(X.C319836rJ r13, com.instagram.common.session.UserSession r14, X.WYW r15, com.instagram.leadads.repository.LeadFormRepository r16) {
        /*
            r12 = this;
            r0 = 1
            X.0qQ.A0B(r14, r0)
            r12.<init>()
            r12.A04 = r14
            r0 = r16
            r12.A05 = r0
            java.lang.String r0 = "formID"
            java.lang.Object r0 = r13.A00(r0)
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = (java.lang.String) r0
            r12.A07 = r0
            java.lang.String r2 = X.C13991Tnr.A0f(r13)
            java.lang.String r1 = r12.A07
            X.VsC r0 = new X.VsC
            r0.<init>(r15, r2, r1)
            r12.A06 = r0
            java.lang.String r0 = "is_sensitive_vertical_ad"
            java.lang.Object r0 = r13.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5 = 0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r12.A0G = r0
            java.lang.String r0 = "is_form_multi_submit"
            boolean r0 = X.C13991Tnr.A1X(r13, r0)
            r12.A0F = r0
            java.lang.String r0 = "thank_you_page_id"
            java.lang.Object r1 = r13.A00(r0)
            java.lang.String r1 = (java.lang.String) r1
            r12.A08 = r1
            r7 = 0
            X.02z r0 = X.106.A01(r7)
            r12.A0A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A09 = r0
            X.0sn r0 = X.0sn.A00
            X.02z r0 = X.106.A01(r0)
            r12.A0B = r0
            java.lang.String r0 = "is_from_lead_ad_activity"
            boolean r0 = X.C13991Tnr.A1X(r13, r0)
            r12.A0E = r0
            java.lang.String r0 = "is_bottom_sheet_flow"
            boolean r0 = X.C13991Tnr.A1X(r13, r0)
            r12.A0D = r0
            X.Vtw r2 = X.C18544Vtw.A01
            java.lang.String r0 = r12.A07
            X.Vk5 r2 = r2.A00(r0)
            if (r2 == 0) goto L_0x0181
            r12.A02 = r2
            X.CwD r0 = r2.A00
            X.D9d r3 = r0.A06
            if (r3 == 0) goto L_0x0177
            java.lang.String r4 = r12.A08
            if (r4 == 0) goto L_0x008e
            java.util.Map r0 = r0.A0C
            java.lang.Object r0 = r0.get(r4)
            X.D9d r0 = (X.C45884D9d) r0
            if (r0 == 0) goto L_0x008e
            r3 = r0
        L_0x008e:
            boolean r0 = r12.A0F
            if (r0 != 0) goto L_0x0103
            boolean r4 = r12.A0G
            com.instagram.common.session.UserSession r0 = r12.A04
            boolean r0 = X.C18215Vnf.A00(r0, r4)
            if (r0 == 0) goto L_0x0103
            com.instagram.leadads.repository.LeadFormRepository r0 = r12.A05
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r9 = X.DbU.A0M(r0)
            java.lang.String r8 = "api/"
            java.lang.String r6 = "v1/"
            java.lang.String r4 = "lead_gen/"
            java.lang.String r0 = "get_multi_submit_ads/"
            r9.A04()
            r9.A02()
            java.lang.String r0 = X.002.A0u(r8, r6, r4, r0)
            X.0qQ.A07(r0)
            r9.A0E = r0
            java.lang.Class<X.CEh> r4 = X.C43815CEh.class
            java.lang.Class<X.B6m> r0 = X.C41914B6m.class
            X.1OC r4 = X.DbT.A0R(r7, r9, r4, r0, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.AdMediaResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.AdMediaResponse>>"
            X.0qQ.A0C(r4, r0)
            r0 = 801467801(0x2fc56d99, float:3.5911965E-10)
            X.032 r6 = r4.A03(r0)
            r4 = 19
            X.MFy r0 = new X.MFy
            r0.<init>(r4, r7)
            X.MC0 r6 = X.JUM.A00(r0, r6)
            r4 = 20
            X.MFy r0 = new X.MFy
            r0.<init>(r4, r7)
            X.MCA r6 = X.JUM.A01(r0, r6)
            r4 = 7
            X.WvV r0 = new X.WvV
            r0.<init>(r12, r7, r4)
            X.DbY.A19(r12, r0, r6)
            X.VsC r0 = r12.A06
            X.XB6 r6 = r0.A00
            java.lang.String r8 = r0.A01
            java.lang.String r0 = r0.A02
            android.os.Bundle r7 = X.C18463VsC.A00(r0)
            java.lang.String r9 = "lead_gen_thank_you_screen_with_multi_submit"
            java.lang.String r10 = "fetch_multi_submit_ads_request_sent"
            java.lang.String r11 = "impression"
            r6.Cgq(r7, r8, r9, r10, r11)
        L_0x0103:
            java.lang.String r0 = r3.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r12.A01 = r0
            if (r0 == 0) goto L_0x0110
            r6 = 1
            if (r1 == 0) goto L_0x0111
        L_0x0110:
            r6 = 0
        L_0x0111:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x011c
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x011d
        L_0x011c:
            r0 = 1
        L_0x011d:
            r0 = r0 ^ 1
            r12.A00 = r0
            java.lang.String r4 = ""
            if (r6 == 0) goto L_0x016c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131964736(0x7f133340, float:1.9566262E38)
            X.GKO r5 = new X.GKO
            r5.<init>(r1, r0)
        L_0x012f:
            X.Cu5 r0 = r2.A00()
            java.lang.String r9 = r0.A01
            if (r9 != 0) goto L_0x0138
            r9 = r4
        L_0x0138:
            if (r6 == 0) goto L_0x0161
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            r0 = 2131964735(0x7f13333f, float:1.956626E38)
            X.GKO r6 = new X.GKO
            r6.<init>(r1, r0)
        L_0x0146:
            X.05G r1 = r12.A0C
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x014d
            r4 = r0
        L_0x014d:
            X.GKw r7 = new X.GKw
            r7.<init>(r4)
            X.Cu5 r0 = r2.A00()
            com.instagram.common.typedurl.ImageUrl r8 = r0.A00
            X.JVH r4 = new X.JVH
            r4.<init>((X.C266444Yx) r5, (X.C266444Yx) r6, (X.C266444Yx) r7, (com.instagram.common.typedurl.ImageUrl) r8, (java.lang.String) r9)
            r1.Epw(r4)
            return
        L_0x0161:
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0166
            r0 = r4
        L_0x0166:
            X.GKw r6 = new X.GKw
            r6.<init>(r0)
            goto L_0x0146
        L_0x016c:
            java.lang.String r0 = r3.A04
            if (r0 != 0) goto L_0x0171
            r0 = r4
        L_0x0171:
            X.GKw r5 = new X.GKw
            r5.<init>(r0)
            goto L_0x012f
        L_0x0177:
            java.lang.String r0 = "leadAdsThankYouPage"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0181:
            X.6oS r1 = X.C318116oQ.A00(r12)
            r0 = 11
            X.C13991Tnr.A1L(r12, r1, r0)
            return
        L_0x018b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16038UnR.<init>(X.6rJ, com.instagram.common.session.UserSession, X.WYW, com.instagram.leadads.repository.LeadFormRepository):void");
    }

    public static /* synthetic */ C45884D9d A00(C16038UnR unR) {
        String str;
        C45884D9d d9d;
        C18027Vk5 vk5 = unR.A02;
        if (vk5 == null) {
            str = "cacheData";
        } else {
            C45433CwD cwD = vk5.A00;
            C45884D9d d9d2 = cwD.A06;
            if (d9d2 != null) {
                String str2 = unR.A08;
                if (str2 == null || (d9d = (C45884D9d) cwD.A0C.get(str2)) == null) {
                    return d9d2;
                }
                return d9d;
            }
            str = "leadAdsThankYouPage";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C16038UnR() {
        02z A012 = 106.A01((Object) null);
        this.A0C = A012;
        this.A03 = DbT.A0G(A012);
    }
}
