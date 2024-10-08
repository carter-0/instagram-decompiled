package com.instagram.urlhandlers.personalinformation;

import X.AnonymousClass06Q;
import X.AnonymousClass0wW;
import X.C50128FQl;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class PersonalInformationUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass06Q A00 = new C50128FQl(this, 22);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.personalinformation.PersonalInformationUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (X.C49955FGk.A05(r5, r6, r7, "personal_info", "personal_info", false) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 131010761(0x7cf10c9, float:3.1155764E-34)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r5 = r11
            super.onCreate(r12)
            android.os.Bundle r1 = X.DbX.A0A(r11)
            if (r1 != 0) goto L_0x001b
            r11.finish()
            r0 = 1792169240(0x6ad25518, float:1.2713813E26)
        L_0x0017:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x001b:
            X.08y r4 = X.09i.A0A
            X.0wW r0 = r4.A05(r11)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0071
            X.0wW r0 = r4.A05(r11)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.session.UserSession"
            X.0qQ.A0C(r0, r2)
            boolean r0 = X.DbY.A1a(r0)
            if (r0 == 0) goto L_0x005d
            X.0hq r1 = r11.getSupportFragmentManager()
            X.06Q r0 = r11.A00
            r1.A0s(r0)
            java.lang.String r0 = "PERSONAL_INFO_HANDLER_ACTIVITY"
            X.0xG r6 = X.DbS.A0O(r0)
            X.0wW r7 = r4.A05(r11)
            X.0qQ.A0C(r7, r2)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            r10 = 0
            java.lang.String r8 = "personal_info"
            r9 = r8
            boolean r0 = X.C49955FGk.A05(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L_0x0059
        L_0x0056:
            r11.finish()
        L_0x0059:
            r0 = -1865582644(0xffffffff90cd77cc, float:-8.104282E-29)
            goto L_0x0017
        L_0x005d:
            X.0wW r0 = r4.A05(r11)
            X.6Yo r1 = X.C46447Df9.A01(r11, r0)
            X.E3E r0 = new X.E3E
            r0.<init>()
            r1.A0D(r0)
            X.DbV.A1O(r1)
            goto L_0x0059
        L_0x0071:
            X.FFQ.A02(r11, r1, r4)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.personalinformation.PersonalInformationUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
