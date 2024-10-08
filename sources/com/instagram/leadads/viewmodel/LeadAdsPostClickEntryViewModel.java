package com.instagram.leadads.viewmodel;

import X.02z;
import X.05G;
import X.0qQ;
import X.0u9;
import X.106;
import X.1HR;
import X.2YL;
import X.AnonymousClass05K;
import X.AnonymousClass0r6;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C18027Vk5;
import X.C18215Vnf;
import X.C18629VvM;
import X.C18809W3g;
import X.C249513ju;
import X.C318116oQ;
import X.C319836rJ;
import X.C45433CwD;
import X.C63781L6n;
import X.Pxd;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;

public final class LeadAdsPostClickEntryViewModel extends 2YL {
    public final C319836rJ A00;
    public final UserSession A01;
    public final C63781L6n A02;
    public final LeadFormRepository A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;

    public /* synthetic */ LeadAdsPostClickEntryViewModel(C319836rJ r4, UserSession userSession) {
        LeadFormRepository leadFormRepository = new LeadFormRepository(userSession);
        C63781L6n l6n = new C63781L6n(userSession);
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r4;
        this.A03 = leadFormRepository;
        this.A02 = l6n;
        02z A012 = 106.A01(C18629VvM.A00);
        this.A07 = A012;
        this.A06 = A012;
        1HR A0f = C13990Tnq.A0f();
        this.A04 = A0f;
        this.A05 = 0u9.A04(A0f);
        C13991Tnr.A1L(this, C318116oQ.A00(this), 17);
    }

    private final Integer A00(C18027Vk5 vk5) {
        Boolean bool;
        C319836rJ r5 = this.A00;
        boolean z = false;
        boolean A1X = AnonymousClass7TG.A1X((Boolean) r5.A00("submitted"));
        Boolean bool2 = (Boolean) r5.A00("is_first_question_sticker");
        if (bool2 != null) {
            z = bool2.booleanValue();
        }
        if (A1X) {
            if (C18215Vnf.A00(this.A01, C13991Tnr.A1X(r5, "is_sensitive_vertical_ad"))) {
                return AnonymousClass05K.A0Y;
            }
            return AnonymousClass05K.A0N;
        }
        C45433CwD cwD = vk5.A00;
        if (cwD.A00 != null) {
            return AnonymousClass05K.A01;
        }
        boolean A1X2 = C13991Tnr.A1X(r5, "is_pharma_vertical_ad");
        boolean A1X3 = C13991Tnr.A1X(r5, "is_partnership_ad");
        boolean A1X4 = C13991Tnr.A1X(r5, Pxd.A00(270));
        if ((C18809W3g.A08(vk5, A1X2) || cwD.A0E || (((bool = (Boolean) r5.A00("is_sensitive_vertical_ad")) != null && bool.booleanValue()) || A1X3 || A1X4)) && !z && cwD.A03 != null) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r12, X.AnonymousClass4D7 r13, boolean r14) {
        /*
            r3 = 41
            boolean r0 = X.C66137MDp.A02(r3, r13)
            if (r0 == 0) goto L_0x002c
            r5 = r13
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 3
            r11 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r9) goto L_0x0032
            if (r0 == r11) goto L_0x0073
            if (r0 == r6) goto L_0x0032
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002c:
            X.MDp r5 = new X.MDp
            r5.<init>(r12, r13, r3)
            goto L_0x0016
        L_0x0032:
            X.0eS.A00(r1)
            goto L_0x00c1
        L_0x0037:
            X.0eS.A00(r1)
            X.6rJ r1 = r12.A00
            java.lang.String r0 = "formID"
            java.lang.Object r10 = r1.A00(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "trackingToken"
            java.lang.Object r8 = r1.A00(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "adID"
            java.lang.Object r7 = r1.A00(r0)
            java.lang.String r7 = (java.lang.String) r7
            if (r10 == 0) goto L_0x00c1
            com.instagram.leadads.repository.LeadFormRepository r3 = r12.A03
            X.Vtw r0 = X.C18544Vtw.A01
            if (r14 == 0) goto L_0x0095
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r0.remove(r10)
        L_0x0061:
            X.05G r1 = r12.A07
            X.VvL r0 = X.C18628VvL.A00
            r1.Epw(r0)
            r5.A01 = r12
            r5.A00 = r11
            java.lang.Object r1 = r3.A01(r10, r8, r7, r5)
            if (r1 != r4) goto L_0x007a
            return r4
        L_0x0073:
            java.lang.Object r12 = r5.A01
            com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r12 = (com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel) r12
            X.0eS.A00(r1)
        L_0x007a:
            X.X1T r1 = (X.X1T) r1
            boolean r0 = r1 instanceof X.UO5
            if (r0 == 0) goto L_0x00b6
            X.3ju r3 = r12.A04
            X.UO5 r1 = (X.UO5) r1
            X.Vk5 r0 = r1.A00
            java.lang.Integer r0 = r12.A00(r0)
            X.UL8 r1 = new X.UL8
            r1.<init>((java.lang.Integer) r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            goto L_0x00af
        L_0x0095:
            X.Vk5 r2 = r0.A00(r10)
            if (r2 == 0) goto L_0x0061
            X.05G r1 = r12.A07
            X.VvM r0 = X.C18629VvM.A00
            r1.Epw(r0)
            X.3ju r3 = r12.A04
            java.lang.Integer r0 = r12.A00(r2)
            X.UL8 r1 = new X.UL8
            r1.<init>((java.lang.Integer) r0)
            r5.A00 = r9
        L_0x00af:
            java.lang.Object r0 = r3.ELH(r1, r5)
            if (r0 != r4) goto L_0x00c1
            return r4
        L_0x00b6:
            boolean r0 = r1 instanceof X.UO4
            if (r0 == 0) goto L_0x00c4
            X.05G r1 = r12.A07
            X.VvK r0 = X.C18627VvK.A00
            r1.Epw(r0)
        L_0x00c1:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x00c4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel.A01(com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel, X.4D7, boolean):java.lang.Object");
    }
}
