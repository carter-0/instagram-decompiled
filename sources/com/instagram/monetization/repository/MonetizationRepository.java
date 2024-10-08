package com.instagram.monetization.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.1Au;
import X.1Av;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.AnonymousClass2o7;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.userpay.api.UserPayApi;
import java.util.HashMap;

public final class MonetizationRepository implements AnonymousClass0lh {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final UserSession A07;
    public final MonetizationApi A08;
    public final 1Av A09;
    public final UserPayApi A0A;
    public final HashMap A0B = new HashMap();
    public final HashMap A0C = new HashMap();
    public final HashMap A0D = new HashMap();
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final HashMap A0G = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r1 != true) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C272664lA r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            com.instagram.api.schemas.UserMonetizationProductType r4 = r9.A07
            java.lang.String r0 = r4.A00
            com.instagram.api.schemas.UserMonetizationProductType r7 = X.C272504kq.A00(r0)
            boolean r0 = r9.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r8.A0D
            r0.put(r7, r1)
            boolean r1 = r9.A08
            r6 = 0
            r5 = 1
            r0 = 0
            if (r1 != r5) goto L_0x001f
            r0 = 1
        L_0x001f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r8.A0C
            r0.put(r7, r1)
            com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct r2 = r9.A04
            com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct r1 = com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct.HAS_COMPLETED_ONBOARDING
            r0 = 0
            if (r2 != r1) goto L_0x0030
            r0 = 1
        L_0x0030:
            r8.A03(r7, r0)
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r3 = r9.A02
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r2 = com.instagram.api.schemas.CanUseCreatorMonetizationProduct.CAN_USE_PRODUCT
            r0 = 0
            if (r3 != r2) goto L_0x003b
            r0 = 1
        L_0x003b:
            r8.A02(r7, r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            if (r7 != r0) goto L_0x0050
            X.4ok r0 = r9.A03
            if (r0 == 0) goto L_0x004d
            X.BEk r0 = (X.C42033BEk) r0
            boolean r1 = r0.A00
            r0 = 1
            if (r1 == r5) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r8.A06 = r0
        L_0x0050:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            if (r7 != r0) goto L_0x0066
            X.4l9 r0 = r9.A01
            if (r0 == 0) goto L_0x0064
            X.4l8 r0 = (X.C272654l8) r0
            java.lang.Boolean r1 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r6 = X.0qQ.A0K(r1, r0)
        L_0x0064:
            r8.A05 = r6
        L_0x0066:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.IGTV_REVSHARE
            if (r4 != r0) goto L_0x0094
            if (r3 != r2) goto L_0x0091
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
        L_0x006e:
            java.lang.String r0 = r0.A00
            r8.A03 = r0
            X.JwC r1 = r9.A00
            if (r1 == 0) goto L_0x007c
            java.lang.Object r0 = r1.A00
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto L_0x007e
        L_0x007c:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
        L_0x007e:
            java.lang.String r0 = r0.A00
            r8.A02 = r0
            if (r1 == 0) goto L_0x008a
            java.lang.Object r0 = r1.A02
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto L_0x008c
        L_0x008a:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
        L_0x008c:
            java.lang.String r0 = r0.A00
            r8.A01 = r0
        L_0x0090:
            return
        L_0x0091:
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.NOT_ELIGIBLE
            goto L_0x006e
        L_0x0094:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.REELS_OVERLAY_ADS
            if (r4 != r0) goto L_0x0090
            if (r3 != r2) goto L_0x00b1
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
        L_0x009c:
            java.lang.String r0 = r0.A00
            r8.A04 = r0
            X.JwC r0 = r9.A00
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r0.A03
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto L_0x00ac
        L_0x00aa:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
        L_0x00ac:
            java.lang.String r0 = r0.A00
            r8.A00 = r0
            return
        L_0x00b1:
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.NOT_ELIGIBLE
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.repository.MonetizationRepository.A01(X.4lA):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.UserMonetizationProductType r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 43
            boolean r0 = X.AnonymousClass9JX.A00(r3, r9)
            if (r0 == 0) goto L_0x0061
            r6 = r9
            X.9JX r6 = (X.AnonymousClass9JX) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r3) goto L_0x002a
            if (r0 != r4) goto L_0x0067
            X.0eS.A00(r2)
        L_0x0027:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002a:
            java.lang.Object r3 = r6.A01
            com.instagram.monetization.repository.MonetizationRepository r3 = (com.instagram.monetization.repository.MonetizationRepository) r3
            X.0eS.A00(r2)
            goto L_0x0049
        L_0x0032:
            X.0eS.A00(r2)
            com.instagram.monetization.api.MonetizationApi r1 = r7.A08
            java.lang.String r0 = r8.A00
            r6.A01 = r7
            r6.A00 = r3
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            X.MCA r2 = r1.A01(r0)
            r3 = r7
        L_0x0049:
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            X.MCH r1 = new X.MCH
            r1.<init>(r3)
            r0 = 0
            r6.A01 = r0
            r6.A00 = r4
            com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2 r0 = new com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = r2.collect(r0, r6)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x0061:
            X.9JX r6 = new X.9JX
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0067:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.repository.MonetizationRepository.A00(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    public final boolean A04(UserMonetizationProductType userMonetizationProductType) {
        return 0qQ.A0K(this.A0G.get(userMonetizationProductType), true);
    }

    public final boolean A05(UserMonetizationProductType userMonetizationProductType) {
        return 0qQ.A0K(this.A0B.get(userMonetizationProductType), true);
    }

    public final boolean A06(UserMonetizationProductType userMonetizationProductType) {
        return 0qQ.A0K(this.A0C.get(userMonetizationProductType), true);
    }

    public final boolean A07(UserMonetizationProductType userMonetizationProductType) {
        return 0qQ.A0K(this.A0D.get(userMonetizationProductType), true);
    }

    public final void onSessionWillEnd() {
        this.A0D.clear();
    }

    public MonetizationRepository(UserSession userSession) {
        this.A07 = userSession;
        this.A09 = 1Au.A00(userSession);
        this.A08 = new MonetizationApi(userSession);
        this.A0A = new UserPayApi(userSession);
        02z r0 = new 02z(AnonymousClass2o7.LOADING);
        this.A0E = r0;
        this.A0F = r0;
        String str = IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF.A00;
        this.A02 = str;
        this.A01 = str;
        this.A00 = str;
        this.A03 = "not_eligible";
        this.A04 = "not_eligible";
    }

    public final void A02(UserMonetizationProductType userMonetizationProductType, boolean z) {
        this.A0G.put(userMonetizationProductType, Boolean.valueOf(z));
    }

    public final void A03(UserMonetizationProductType userMonetizationProductType, boolean z) {
        this.A0B.put(userMonetizationProductType, Boolean.valueOf(z));
    }
}
