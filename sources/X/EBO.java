package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.payout.activity.PayoutOnboardingFlowActivity;

public final class EBO extends 1P0 {
    public final /* synthetic */ UserMonetizationProductType A00;
    public final /* synthetic */ PayoutOnboardingFlowActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public EBO(UserMonetizationProductType userMonetizationProductType, PayoutOnboardingFlowActivity payoutOnboardingFlowActivity, String str, String str2, String str3) {
        this.A01 = payoutOnboardingFlowActivity;
        this.A00 = userMonetizationProductType;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.payout.activity.PayoutOnboardingFlowActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (X.0qQ.A0K(r1, "1869943030133816") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 347027203(0x14af3703, float:1.7692183E-26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.371 r12 = (X.AnonymousClass371) r12
            r0 = -1651925700(0xffffffff9d899d3c, float:-3.6426175E-21)
            int r3 = X.AnonymousClass7TG.A0D(r12, r0)
            boolean r0 = r12.isOk()
            r1 = 1
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r12.FH3()
            X.MW6 r0 = (X.MW6) r0
            X.Dsc r0 = (X.C47190Dsc) r0
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0046
            java.lang.Object r0 = r12.FH3()
            X.MW6 r0 = (X.MW6) r0
            X.Dsc r0 = (X.C47190Dsc) r0
            java.util.List r0 = r0.A02
            java.lang.Object r0 = X.00k.A0J(r0)
            X.G8T r0 = (X.G8T) r0
            if (r0 == 0) goto L_0x0065
            X.Dsg r0 = (X.C47194Dsg) r0
            java.lang.String r1 = r0.A02
        L_0x003d:
            java.lang.String r0 = "1869943030133816"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r10 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            com.instagram.payout.activity.PayoutOnboardingFlowActivity r6 = r11.A01
            com.instagram.common.session.UserSession r5 = X.Dbc.A07(r6)
            com.instagram.api.schemas.UserMonetizationProductType r4 = r11.A00
            java.lang.String r7 = r11.A04
            java.lang.String r8 = r11.A02
            java.lang.String r9 = r11.A03
            com.instagram.payout.activity.PayoutOnboardingFlowActivity.A00(r4, r5, r6, r7, r8, r9, r10)
            r0 = -1523694418(0xffffffffa52e44ae, float:-1.5115364E-16)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1245522125(0x4a3d28cd, float:3099187.2)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0065:
            r1 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBO.onSuccess(java.lang.Object):void");
    }
}
