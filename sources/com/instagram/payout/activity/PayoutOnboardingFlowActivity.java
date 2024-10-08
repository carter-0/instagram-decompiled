package com.instagram.payout.activity;

import X.0Yt;
import X.0eP;
import X.0s1;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.DbW;
import X.DbX;
import X.FCM;
import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class PayoutOnboardingFlowActivity extends BaseFragmentActivity {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.instagram.payout.activity.PayoutOnboardingFlowActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j(android.os.Bundle r17) {
        /*
            r16 = this;
            r6 = r16
            androidx.fragment.app.Fragment r3 = X.DbY.A0H(r6)
            android.os.Bundle r1 = X.DbU.A06(r6)
            r9 = 0
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "ARGUMENT_PRODUCT_TYPE"
            java.lang.String r2 = r1.getString(r0)
        L_0x0013:
            android.os.Bundle r1 = X.DbU.A06(r6)
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "ARGUMENT_ORIGIN"
            java.lang.String r7 = r1.getString(r0)
        L_0x001f:
            android.os.Bundle r1 = X.DbU.A06(r6)
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = "ARGUMENT_DEAL_ID"
            java.lang.String r8 = r1.getString(r0)
        L_0x002b:
            android.os.Bundle r1 = X.DbU.A06(r6)
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "ARGUMENT_FE_ID"
            java.lang.String r9 = r1.getString(r0)
        L_0x0037:
            if (r3 != 0) goto L_0x0072
            com.instagram.api.schemas.UserMonetizationProductType r4 = X.C272504kq.A00(r2)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            if (r4 != r0) goto L_0x0079
            com.instagram.common.session.UserSession r3 = X.Dbc.A07(r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324797575147895(0x810d3600013177, double:3.035286482518504E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0079
            com.instagram.common.session.UserSession r2 = X.Dbc.A07(r6)
            r1 = 0
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.1NY r0 = X.DbU.A0M(r2)
            X.1OC r0 = X.C63009Kpz.A00(r0, r1, r1, r1)
            X.EBO r10 = new X.EBO
            r11 = r4
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A00 = r10
            r6.schedule(r0)
        L_0x0072:
            return
        L_0x0073:
            r8 = r9
            goto L_0x002b
        L_0x0075:
            r7 = r9
            goto L_0x001f
        L_0x0077:
            r2 = r9
            goto L_0x0013
        L_0x0079:
            com.instagram.common.session.UserSession r5 = X.Dbc.A07(r6)
            r10 = 0
            A00(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.payout.activity.PayoutOnboardingFlowActivity.A0j(android.os.Bundle):void");
    }

    public static final void A00(UserMonetizationProductType userMonetizationProductType, UserSession userSession, PayoutOnboardingFlowActivity payoutOnboardingFlowActivity, String str, String str2, String str3, boolean z) {
        String str4;
        String valueOf = String.valueOf(DbX.A0m(userSession).getFbidV2());
        if (userMonetizationProductType != UserMonetizationProductType.INCENTIVE_PLATFORM) {
            str2 = valueOf;
        }
        0eP A1L = AnonymousClass7TE.A1L("subtype", FCM.A00(userMonetizationProductType, z).A00);
        if (str == null) {
            str = "";
        }
        0eP A1L2 = AnonymousClass7TE.A1L("entrypoint", str);
        int ordinal = userMonetizationProductType.ordinal();
        if (ordinal == 11) {
            str4 = "ig_incentives_platform_onboarding";
        } else if (ordinal != 5) {
            str4 = "native";
        } else {
            str4 = "ig_branded_content_final_screen";
        }
        AnonymousClass3M3 A02 = C46649DiU.A02(userSession, "com.bloks.www.payout_onboarding", 0Yt.A06(new 0eP[]{A1L, A1L2, AnonymousClass7TE.A1L("exit_destination", str4), AnonymousClass7TE.A1L("payee_id", str2), AnonymousClass7TE.A1L("fe_id", str3)}));
        0s1 A0D = DbW.A0D(payoutOnboardingFlowActivity);
        A0D.A0A(A02, R.id.layout_container_main);
        A0D.A00();
    }
}
