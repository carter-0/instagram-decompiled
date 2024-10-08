package com.instagram.urlhandlers.exploreexternal;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ExploreExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.exploreexternal.ExploreExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        if ("explore".equals(r1) != false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = 533932735(0x1fd32abf, float:8.9432693E-20)
            int r2 = X.AnonymousClass0fD.A00(r0)
            r6 = r15
            r0 = r16
            super.onCreate(r0)
            android.os.Bundle r3 = X.DbX.A0A(r15)
            if (r3 != 0) goto L_0x001d
            r15.finish()
            r0 = 1858584555(0x6ec7bfeb, float:3.0909766E28)
        L_0x0019:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x001d:
            X.0wW r0 = X.DbT.A0W(r3)
            r15.A00 = r0
            java.lang.String r0 = X.DbS.A0m(r3)
            if (r0 != 0) goto L_0x0030
            r15.finish()
            r0 = -372547515(0xffffffffe9cb6045, float:-3.073332E25)
            goto L_0x0019
        L_0x0030:
            r7 = 0
            android.net.Uri r5 = X.DbT.A09(r0)
            java.lang.String r1 = r5.getScheme()
            X.EVh r0 = X.C48089EVh.HTTP
            java.lang.String r0 = r0.toString()
            r14 = 1
            boolean r0 = X.00p.A0j(r0, r1, r14)
            if (r0 != 0) goto L_0x0132
            X.EVh r0 = X.C48089EVh.HTTPS
            java.lang.String r0 = r0.toString()
            boolean r0 = X.00p.A0j(r0, r1, r14)
            if (r0 != 0) goto L_0x0132
            X.EVh r0 = X.C48089EVh.INSTAGRAM
            java.lang.String r0 = r0.toString()
            boolean r0 = X.00p.A0j(r0, r1, r14)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = r5.getHost()
            if (r1 == 0) goto L_0x01aa
            java.lang.String r4 = "tag"
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x014b
            java.util.Set r0 = r5.getQueryParameterNames()
            java.lang.String r1 = "name"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = r5.getQueryParameter(r1)
            if (r1 == 0) goto L_0x01aa
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = " "
            boolean r0 = X.DbU.A1a(r1, r0)
            if (r0 != 0) goto L_0x01aa
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "explore_type"
            r5.putString(r0, r4)
        L_0x0095:
            java.lang.String r0 = "explore_param"
            r5.putString(r0, r1)
        L_0x009a:
            r3.putAll(r5)
            X.0wW r9 = r15.A00
            boolean r0 = r9 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x00ad
            if (r9 == 0) goto L_0x00a8
            X.FFQ.A01(r15, r3, r9)
        L_0x00a8:
            r0 = 1162111953(0x45446bd1, float:3142.7385)
            goto L_0x0019
        L_0x00ad:
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r0 = "explore_type"
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "explore_param"
            java.lang.String r1 = r3.getString(r0)
            if (r4 == 0) goto L_0x0115
            if (r1 == 0) goto L_0x0115
            java.lang.String r0 = "tags"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "locations"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00a8
            X.1Wr r0 = X.1Wr.A00
            if (r0 == 0) goto L_0x00a8
            java.lang.String r12 = ""
            com.instagram.model.venue.Venue r10 = new com.instagram.model.venue.Venue
            r10.<init>()
            r10.A06(r1)
            r8 = r7
            r11 = r7
            r13 = r7
            X.C16923VBa.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00a8
        L_0x00ec:
            if (r9 == 0) goto L_0x00a8
            java.lang.String r4 = r9.A05
            if (r4 == 0) goto L_0x00a8
            com.instagram.model.hashtag.HashtagImpl r3 = X.C281965Ag.A00(r1)
            java.lang.String r1 = "from_url"
            java.lang.String r0 = "DEFAULT"
            androidx.fragment.app.Fragment r1 = X.W0l.A02(r9, r3, r1, r0)
            android.os.Bundle r0 = r1.requireArguments()
            X.DbS.A1A(r0, r4)
            r1.setArguments(r0)
            X.0wW r0 = r15.A00
            X.6Yo r0 = X.Dba.A0B(r15, r0)
            r0.A0B(r7, r1)
            r0.A04()
            goto L_0x00a8
        L_0x0115:
            android.content.Intent r1 = X.DbX.A08(r15)
            java.lang.String r0 = "instagram://explore"
            android.net.Uri$Builder r0 = X.DbW.A07(r0)
            android.net.Uri r0 = r0.build()
            android.content.Intent r0 = r1.setData(r0)
            X.0qQ.A07(r0)
            X.DbV.A19(r15, r0)
            r15.finish()
            goto L_0x00a8
        L_0x0132:
            java.util.List r4 = r5.getPathSegments()
            int r0 = r4.size()
            if (r0 != r14) goto L_0x0159
            java.lang.String r1 = "explore"
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0159
            goto L_0x0153
        L_0x014b:
            java.lang.String r0 = "explore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01aa
        L_0x0153:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            goto L_0x009a
        L_0x0159:
            java.util.List r4 = r5.getPathSegments()
            int r1 = r4.size()
            r0 = 3
            if (r1 < r0) goto L_0x01aa
            java.lang.String r1 = "explore"
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r1 = r4.get(r14)
            X.0qQ.A07(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r1 = X.DbT.A12(r0, r1)
            java.lang.String r0 = "tags"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0196
            java.lang.String r0 = "locations"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01aa
        L_0x0196:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = X.AnonymousClass7TE.A19(r4, r14)
            java.lang.String r0 = "explore_type"
            r5.putString(r0, r1)
            r0 = 2
            java.lang.String r1 = X.AnonymousClass7TE.A19(r4, r0)
            goto L_0x0095
        L_0x01aa:
            r15.finish()
            r0 = -269057788(0xffffffffeff68104, float:-1.5257857E29)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.exploreexternal.ExploreExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
