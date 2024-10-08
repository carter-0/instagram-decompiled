package com.instagram.urlhandlers.smbeditpartner;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class SmbEditPartnerUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = 1087118831(0x40cc1def, float:6.378654)
            int r2 = X.AnonymousClass0fD.A00(r0)
            r15 = r21
            r0 = r22
            super.onCreate(r0)
            android.content.Intent r1 = r15.getIntent()
            android.os.Bundle r4 = X.DbT.A0A(r1)
            if (r4 == 0) goto L_0x001e
            X.0wW r0 = X.DbT.A0W(r4)
            r15.A00 = r0
        L_0x001e:
            java.lang.String r8 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "servicetype"
            java.lang.String r0 = r1.getStringExtra(r0)
            r0.getClass()
            com.instagram.api.schemas.SMBPartnerType r7 = X.C253543qx.A00(r0)
            java.lang.String r0 = "service type in deep link should not be null"
            X.17k.A07(r7, r0)
            java.lang.String r0 = "entrypoint"
            java.lang.String r13 = r1.getStringExtra(r0)
            X.0wW r3 = r15.A00
            if (r3 == 0) goto L_0x00f9
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0052
            X.1WK r1 = X.FFQ.A00()
            X.0wW r0 = r15.A00
            r1.A00(r15, r4, r0)
            r0 = 1752060101(0x686e50c5, float:4.5016526E24)
        L_0x004e:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x0052:
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r1.A01(r3)
            X.4os r0 = X.C324066yY.A00(r7, r0)
            if (r0 == 0) goto L_0x008b
            X.0wW r1 = r15.A00
            r1.getClass()
            java.lang.String r9 = r0.Ac5()
            java.lang.String r10 = r0.Bao()
            java.lang.String r11 = r0.getUrl()
            java.lang.String r12 = r0.getUrl()
            r13.getClass()
            r0 = 3
            X.0qQ.A0B(r8, r0)
            X.F3v r6 = X.DbU.A0R()
            com.instagram.business.fragment.SupportServiceEditUrlFragment r0 = r6.A06(r7, r8, r9, r10, r11, r12, r13)
            X.Dbb.A13(r0, r15, r1)
        L_0x0087:
            r0 = -878286441(0xffffffffcba66997, float:-2.1812014E7)
            goto L_0x004e
        L_0x008b:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.DONATION
            if (r0 != r7) goto L_0x00bb
            X.0gy r0 = X.AnonymousClass07i.A00(r15)
            X.2lw r4 = new X.2lw
            r4.<init>(r15, r0)
            r20 = 2
            X.EC9 r14 = new X.EC9
            r16 = r7
            r17 = r15
            r18 = r8
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.1NY r3 = X.DbZ.A0M(r3)
            java.lang.String r0 = "business/instant_experience/get_donation_button_partners_bundle/"
            r3.A0A(r0)
            java.lang.Class<X.Dv1> r1 = X.C47334Dv1.class
            java.lang.Class<X.F58> r0 = X.F58.class
            X.DbV.A1N(r3, r1, r0)
            X.DbW.A1E(r3, r14, r4)
            goto L_0x0087
        L_0x00bb:
            X.0wW r6 = r15.A00
            r6.getClass()
            r13.getClass()
            com.instagram.user.model.User r5 = r1.A01(r3)
            com.instagram.api.schemas.SMBPartnerType[] r4 = com.instagram.api.schemas.SMBPartnerType.values()
            int r3 = r4.length
            r1 = 0
        L_0x00cd:
            if (r1 >= r3) goto L_0x00da
            r0 = r4[r1]
            X.4os r0 = X.C324066yY.A00(r0, r5)
            if (r0 != 0) goto L_0x00da
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x00da:
            r0 = 3
            X.AnonymousClass7TF.A1D(r8, r0, r13)
            X.DbU.A0v()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            X.Dba.A0v(r1, r13, r8)
            java.lang.String r0 = "args_service_type"
            r1.putSerializable(r0, r7)
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r0 = new com.instagram.business.fragment.SupportServicePartnerSelectionFragment
            r0.<init>()
            r0.setArguments(r1)
            X.Dbb.A13(r0, r15, r6)
            goto L_0x0087
        L_0x00f9:
            java.lang.String r0 = "Both UserSession and LoggedOutSession are null"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 651524962(0x26d57b62, float:1.4813287E-15)
            X.AnonymousClass0fD.A07(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.smbeditpartner.SmbEditPartnerUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        r0.getClass();
        return r0;
    }
}
