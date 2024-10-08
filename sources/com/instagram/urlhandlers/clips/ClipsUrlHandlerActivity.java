package com.instagram.urlhandlers.clips;

import X.0Tu;
import X.0qQ;
import X.AnonymousClass0wW;
import X.AnonymousClass3GL;
import X.C238833Dp;
import X.C340057kd;
import X.C71172bH;
import X.DbS;
import X.DbY;
import X.DbZ;
import X.Dc1;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ClipsUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;
    public Dc1 A01;
    public boolean A02;

    public final void A0j(Bundle bundle) {
    }

    public final C340057kd getGnvGestureHandler() {
        AnonymousClass0wW r2 = this.A00;
        DbS.A1Z(r2);
        if (!AnonymousClass3GL.A02(r2)) {
            return null;
        }
        C340057kd A002 = C340057kd.A00(r2);
        0qQ.A07(A002);
        C238833Dp A003 = C238833Dp.A00(r2);
        0qQ.A07(A003);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public final void onBackPressed() {
        FragmentActivity A002;
        super.onBackPressed();
        if (DbY.A1Y(0Tu.A05, this.A00, 36323045229406999L) && (A002 = C71172bH.A00()) != null) {
            DbZ.A16(DbY.A0H(A002));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r0 != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if (X.FG7.A02(r1, r9, r5, (X.AnonymousClass4DU) null, false) == false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1162090481(0x454417f1, float:3137.4963)
            int r6 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r10)
            android.os.Bundle r2 = X.DbX.A0A(r9)
            java.lang.String r4 = "Required value was null."
            if (r2 == 0) goto L_0x00bc
            X.0wW r0 = X.DbT.A0W(r2)
            r9.A00 = r0
            r0 = 33
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Parcelable r3 = r2.getParcelable(r0)
            android.content.Intent r3 = (android.content.Intent) r3
            if (r3 == 0) goto L_0x0033
            r1 = 0
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.getBooleanExtra(r0, r1)
            r9.A02 = r0
        L_0x0033:
            X.0wW r0 = r9.A00
            if (r0 == 0) goto L_0x00c4
            X.Dc1 r0 = X.GAH.A00(r0)
            r9.A01 = r0
            java.lang.String r8 = X.DbS.A0m(r2)
            r7 = 1
            if (r8 == 0) goto L_0x00b2
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00b2
            X.0wW r0 = r9.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG"
            r2.putBoolean(r0, r7)
            X.1WK r1 = X.FFQ.A00()
            X.0wW r0 = r9.A00
            if (r0 == 0) goto L_0x006e
            r1.A00(r9, r2, r0)
            X.Dc1 r1 = r9.A01
            if (r1 != 0) goto L_0x00ad
            java.lang.String r0 = "deeplinkPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x006e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            throw r1
        L_0x0073:
            r0 = 1244(0x4dc, float:1.743E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L_0x0088
            java.lang.String r0 = "android-app://com.instagram.android"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            X.0wW r5 = r9.A00
            X.DbS.A1Z(r5)
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r4 = 0
            boolean r3 = r9.A02
            java.lang.String r0 = "reel"
            r2 = 0
            X.0qQ.A0B(r5, r2)
            android.os.Bundle r1 = X.FG7.A00(r5, r8, r0, r1)
            if (r3 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_INTERNAL_LINK"
            r1.putBoolean(r0, r7)
        L_0x00a6:
            boolean r0 = X.FG7.A02(r1, r9, r5, r4, r2)
            if (r0 != 0) goto L_0x00b5
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r0 = "signed out"
            r1.A02(r0)
        L_0x00b2:
            r9.finish()
        L_0x00b5:
            r0 = -933054726(0xffffffffc862b6fa, float:-232155.9)
            X.AnonymousClass0fD.A07(r0, r6)
            return
        L_0x00bc:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            r0 = -1078964824(0xffffffffbfb04da8, float:-1.3773699)
            goto L_0x00cb
        L_0x00c4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r4)
            r0 = 1930348078(0x730ec62e, float:1.1311733E31)
        L_0x00cb:
            X.AnonymousClass0fD.A07(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
