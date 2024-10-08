package com.instagram.urlhandlers.clipschaining;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class IgClipsChainingUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.clipschaining.IgClipsChainingUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.clipschaining.IgClipsChainingUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (isDestroyed() == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1977370183(0x75dc4647, float:5.5846226E32)
            int r7 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r13)
            if (r13 == 0) goto L_0x0013
            r0 = 1473513980(0x57d409fc, float:4.66278695E14)
        L_0x000f:
            X.AnonymousClass0fD.A07(r0, r7)
            return
        L_0x0013:
            android.os.Bundle r1 = X.DbX.A0A(r12)
            if (r1 != 0) goto L_0x0020
            r12.finish()
            r0 = 1226019105(0x49139121, float:604434.06)
            goto L_0x000f
        L_0x0020:
            java.lang.String r3 = X.DbS.A0m(r1)
            if (r3 != 0) goto L_0x002d
            r12.finish()
            r0 = -1660126002(0xffffffff9d0c7cce, float:-1.8593368E-21)
            goto L_0x000f
        L_0x002d:
            X.0wW r8 = r12.getSession()
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x003c
            X.FFQ.A01(r12, r1, r8)
        L_0x0038:
            r0 = -670479539(0xffffffffd8094b4d, float:-6.0382603E14)
            goto L_0x000f
        L_0x003c:
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r6 = 0
            X.0qQ.A0B(r8, r6)
            r5 = 1
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0038
            X.2ZQ r1 = X.C71172bH.A00()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.0qQ.A0C(r1, r2)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0hq r0 = X.C229102mq.A00(r1)
            boolean r0 = r0.A12()
            if (r0 != 0) goto L_0x008d
            X.0hq r0 = X.C229102mq.A00(r1)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x008d
            android.net.Uri r1 = X.DbT.A09(r3)
            java.lang.String r0 = "media_ids"
            java.lang.String r4 = r1.getQueryParameter(r0)
            if (r4 == 0) goto L_0x0038
            java.lang.String r0 = "source"
            java.lang.String r11 = r1.getQueryParameter(r0)
            com.instagram.clips.intf.ClipsViewerSource[] r10 = com.instagram.clips.intf.ClipsViewerSource.values()
            int r3 = r10.length
            r1 = 0
        L_0x007e:
            if (r1 >= r3) goto L_0x009a
            r9 = r10[r1]
            java.lang.String r0 = r9.A00
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x009c
            int r1 = r1 + 1
            goto L_0x007e
        L_0x008d:
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r12.isDestroyed()
            if (r0 != 0) goto L_0x0038
            goto L_0x00d2
        L_0x009a:
            com.instagram.clips.intf.ClipsViewerSource r9 = com.instagram.clips.intf.ClipsViewerSource.THIRD_PARTY_URL
        L_0x009c:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            boolean r0 = X.00l.A0W(r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d2
            java.util.List r0 = X.DbX.A0x(r4)
            r1.addAll(r0)
            X.2ZQ r3 = X.C71172bH.A00()
            X.0qQ.A0C(r3, r2)
            r2 = r3
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.4h3 r1 = new X.4h3
            r1.<init>(r9, r8)
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2131953214(0x7f13063e, float:1.9542893E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0o = r0
            r1.A0s = r4
            r1.A1g = r5
            r1.A1c = r6
            X.DbU.A1M(r2, r1, r8)
        L_0x00d2:
            r12.finish()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipschaining.IgClipsChainingUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
