package com.instagram.urlhandlers.rbs;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class RBSPivotPageUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 947427559(0x387898e7, float:5.927021E-5)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r4 = r16
            r0 = r17
            super.onCreate(r0)
            android.os.Bundle r5 = X.DbX.A0A(r4)
            if (r5 != 0) goto L_0x001e
            r4.finish()
            r0 = 945465142(0x385aa736, float:5.2130978E-5)
        L_0x001a:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x001e:
            java.lang.String r2 = X.DbS.A0m(r5)
            if (r2 != 0) goto L_0x002b
            r4.finish()
            r0 = 392780641(0x17695b61, float:7.5401697E-25)
            goto L_0x001a
        L_0x002b:
            X.0wW r0 = X.DbS.A0S(r4)
            boolean r1 = r0 instanceof com.instagram.common.session.UserSession
            if (r1 != 0) goto L_0x003e
            X.1WK r1 = X.FFQ.A00()
            r1.A00(r4, r5, r0)
        L_0x003a:
            r0 = 1526682811(0x5aff54bb, float:3.59346406E16)
            goto L_0x001a
        L_0x003e:
            r13 = 0
            android.net.Uri r5 = X.DbT.A09(r2)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r1 = "media_id"
            java.lang.String r11 = r5.getQueryParameter(r1)
            r1 = 5038(0x13ae, float:7.06E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r12 = r5.getQueryParameter(r1)
            java.lang.String r1 = "disable_cta"
            r2 = 0
            boolean r15 = r5.getBooleanQueryParameter(r1, r2)
            if (r11 == 0) goto L_0x00b4
            X.1Xj r1 = X.DbV.A0U(r0, r11)
            if (r1 == 0) goto L_0x00b0
            X.JSO r5 = X.C51966G9m.A0l(r1)
            if (r5 == 0) goto L_0x00b0
            com.instagram.user.model.User r1 = r5.Bcj()
            if (r1 == 0) goto L_0x00ae
            boolean r14 = r1.isVerified()
        L_0x0074:
            java.lang.String r6 = r5.Bck()
            if (r1 == 0) goto L_0x00ac
            java.lang.String r7 = r1.getUsername()
        L_0x007e:
            java.lang.String r8 = r5.Bcg()
            java.lang.String r9 = r5.Bci()
            if (r1 == 0) goto L_0x00a9
            com.instagram.common.typedurl.ImageUrl r5 = r1.Bh3()
            java.lang.String r10 = r1.getId()
        L_0x0090:
            android.os.Bundle r5 = X.C55247Hec.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.H1F r1 = new X.H1F
            r1.<init>()
            r1.setArguments(r5)
            X.6Yo r0 = X.DbS.A0M(r4, r0)
            r0.A0B(r13, r1)
            r0.A0D = r2
            r0.A04()
            goto L_0x003a
        L_0x00a9:
            r5 = r13
            r10 = r13
            goto L_0x0090
        L_0x00ac:
            r7 = r13
            goto L_0x007e
        L_0x00ae:
            r14 = 0
            goto L_0x0074
        L_0x00b0:
            r4.finish()
            goto L_0x003a
        L_0x00b4:
            r5 = r13
            r6 = r13
            r7 = r13
            r8 = r13
            r9 = r13
            r10 = r13
            r11 = r13
            r14 = r2
            android.os.Bundle r5 = X.C55247Hec.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.H1F r1 = new X.H1F
            r1.<init>()
            r1.setArguments(r5)
            X.6Yo r0 = X.DbS.A0M(r4, r0)
            r0.A0B(r13, r1)
            r0.A0D = r2
            r0.A04()
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.rbs.RBSPivotPageUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
