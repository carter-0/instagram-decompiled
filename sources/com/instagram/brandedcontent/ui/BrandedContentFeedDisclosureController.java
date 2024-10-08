package com.instagram.brandedcontent.ui;

import X.07U;
import X.0qQ;
import X.0sn;
import X.AnonymousClass05K;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0iw;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C252233om;
import X.C58728Iwb;
import X.C59888JbD;
import X.C60384Jkd;
import X.JVF;
import X.LBY;
import X.LLA;
import X.MH4;
import X.MMG;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class BrandedContentFeedDisclosureController extends C252233om implements AnonymousClass0iw {
    public boolean A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(MMG.A00(this, 49));
    public final C60384Jkd A04 = new C60384Jkd(new C58728Iwb(this, 23));

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, java.lang.Object, X.4DH] */
    public BrandedContentFeedDisclosureController(AnonymousClass4DH r8, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r8;
        ? r4 = this.A01;
        07U r2 = 07U.A05;
        AnonymousClass7TE.A1Z(new MH4(r2, this, r4, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(r4));
    }

    public final String getModuleName() {
        return "BrandedContentFeedDisclosureController";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7 A[LOOP:2: B:34:0x00c1->B:36:0x00c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r11, java.util.List r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 21
            boolean r0 = X.MED.A04(r3, r13)
            if (r0 == 0) goto L_0x009f
            r9 = r13
            X.MED r9 = (X.MED) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009f
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r9.A04
            X.1Hj r10 = X.1Hj.A02
            int r0 = r9.A00
            r6 = 5
            r4 = 0
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r8) goto L_0x00e1
            java.lang.Object r2 = r9.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r9.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r11 = r9.A01
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r11 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r11
            X.0eS.A00(r1)
        L_0x0033:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b0
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K15 r0 = (X.K15) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00a6
            java.util.List r0 = X.C51966G9m.A1J(r0)
            r2.addAll(r0)
            java.util.Iterator r3 = r2.iterator()
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b9
            com.instagram.user.model.User r0 = X.DbT.A0k(r3)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            X.4Cl r0 = r0.A03
            r0.EOm(r1)
            goto L_0x004e
        L_0x0060:
            java.util.ArrayList r5 = X.JTQ.A0e(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r12)
            java.util.Iterator r2 = r12.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r2.next()
            X.Jus r1 = (X.C60996Jus) r1
            X.LMD r0 = new X.LMD
            r0.<init>(r1, r7)
            r3.add(r0)
            goto L_0x006c
        L_0x0081:
            r5.addAll(r3)
            int r0 = r5.size()
            if (r0 >= r6) goto L_0x00e9
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r1 = r11.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r0.<init>(r1)
            X.MED.A00(r11, r5, r2, r9, r8)
            java.lang.Object r1 = r0.A0A(r9)
            if (r1 != r10) goto L_0x0033
            return r10
        L_0x009f:
            X.MED r9 = new X.MED
            r9.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x00a6:
            java.lang.String r0 = "_whitelistedUsers"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00b9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b9:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x00c1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e6
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            com.instagram.common.session.UserSession r1 = r11.A02
            java.lang.String r0 = "feed"
            boolean r0 = X.C347037wA.A06(r1, r0, r4, r4)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = new com.instagram.pendingmedia.model.BrandedContentTag
            r1.<init>(r2, r0, r4)
            X.LMD r0 = new X.LMD
            r0.<init>(r7, r1)
            r8.add(r0)
            goto L_0x00c1
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e6:
            r5.addAll(r8)
        L_0x00e9:
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x0119
            X.Jkd r2 = r11.A04
            int r0 = r5.size()
            if (r0 <= r6) goto L_0x00f8
            r0 = 5
        L_0x00f8:
            X.2HY r0 = X.C229632nm.A0C(r4, r0)
            java.util.List r1 = X.00k.A0i(r5, r0)
            X.0qQ.A0B(r1, r4)
            java.util.List r0 = r2.A00
            X.DbW.A0z(r2, r1, r0)
            X.4DH r0 = r11.A01
            boolean r0 = r0.mDetached
            if (r0 != 0) goto L_0x0119
            com.instagram.common.session.UserSession r3 = r11.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0G
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JVF.A02(r11, r3, r2, r1, r0)
        L_0x0119:
            X.0gF r10 = X.C60340gF.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController.A00(com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController, java.util.List, X.4D7):java.lang.Object");
    }

    public final void A01(User user) {
        LBY lby = LLA.A00;
        UserSession userSession = this.A02;
        C59888JbD.A01(userSession, lby.A00((BrandedContentGatingInfoIntf) null, (BrandedContentProjectMetadataIntf) null, userSession, user, 0sn.A00, false, false));
        Integer num = AnonymousClass05K.A0H;
        Integer num2 = AnonymousClass05K.A00;
        JVF.A02(this, userSession, num, num2, num2);
    }
}
