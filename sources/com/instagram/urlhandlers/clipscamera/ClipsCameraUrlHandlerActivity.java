package com.instagram.urlhandlers.clipscamera;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ClipsCameraUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (X.182.A06(X.0Tu.A05, r9.A05(r5), 36324973668807195L) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        if (X.C71172bH.A00() != null) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = -1042551834(0xffffffffc1dbebe6, float:-27.490185)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r5 = r17
            r0 = r18
            super.onCreate(r0)
            android.os.Bundle r2 = X.DbX.A0A(r5)
            if (r2 == 0) goto L_0x0144
            java.lang.String r6 = X.DbS.A0m(r2)
            if (r6 == 0) goto L_0x0144
            X.08y r9 = X.09i.A0A
            X.0wW r1 = r9.A05(r5)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = "reels-camera-modal"
            r1 = 2
            r8 = 0
            boolean r0 = X.DbU.A1a(r6, r0)
            if (r0 == 0) goto L_0x008c
            X.0wW r2 = r9.A05(r5)
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0153
            if (r2 == 0) goto L_0x0153
            android.net.Uri r11 = X.DbT.A09(r6)
            java.lang.String r0 = "collab_nux_enabled"
            java.lang.String r0 = r11.getQueryParameter(r0)
            if (r0 == 0) goto L_0x008a
            java.lang.Boolean r7 = X.00l.A0A(r0)
        L_0x0048:
            r3 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.0qQ.A0K(r7, r6)
            if (r0 != 0) goto L_0x0065
            X.0wW r10 = r9.A05(r5)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36324973668807195(0x810d5f0001321b, double:3.035397844857718E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            r10 = 0
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r10 = 1
        L_0x0066:
            java.lang.String r16 = X.DbZ.A0h(r11)
            X.28D[] r14 = X.28D.values()
            int r13 = r14.length
            r9 = 0
        L_0x0070:
            r15 = 0
            if (r9 >= r13) goto L_0x00c4
            r12 = r14[r9]
            long r0 = r12.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r16 == 0) goto L_0x0081
            java.lang.Long r15 = X.AnonymousClass7TE.A10(r16)
        L_0x0081:
            boolean r0 = X.0qQ.A0K(r0, r15)
            if (r0 != 0) goto L_0x00cc
            int r9 = r9 + 1
            goto L_0x0070
        L_0x008a:
            r7 = r8
            goto L_0x0048
        L_0x008c:
            android.content.Intent r3 = X.DbX.A08(r5)
            r0 = 1469(0x5bd, float:2.059E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri$Builder r2 = X.DbW.A07(r0)
            android.net.Uri r0 = X.DbT.A09(r6)
            java.util.List r0 = r0.getPathSegments()
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0O(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00b8
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "ar_effect_id"
            r2.appendQueryParameter(r0, r1)
        L_0x00b8:
            android.net.Uri r0 = r2.build()
            r3.setData(r0)
            X.DbV.A19(r5, r3)
            goto L_0x0153
        L_0x00c4:
            boolean r0 = X.0qQ.A0K(r7, r6)
            if (r0 == 0) goto L_0x014c
            X.28D r12 = X.28D.A1z
        L_0x00cc:
            java.lang.String r0 = "feed"
            java.lang.String r0 = r11.getQueryParameter(r0)
            if (r0 == 0) goto L_0x014a
            java.lang.Boolean r13 = X.00l.A0A(r0)
        L_0x00d8:
            java.lang.String r0 = "story"
            java.lang.String r0 = r11.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0148
            java.lang.Boolean r9 = X.00l.A0A(r0)
        L_0x00e4:
            java.lang.String r0 = "live"
            java.lang.String r0 = r11.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.Boolean r8 = X.00l.A0A(r0)
        L_0x00f0:
            X.Hrt r1 = X.C250563lf.A0C(r12)
            r1.A0m = r3
            r1.A0n = r10
            boolean r0 = X.0qQ.A0K(r13, r6)
            if (r0 == 0) goto L_0x0103
            X.8jC r0 = X.C363138jC.A00
            r1.A01(r0)
        L_0x0103:
            boolean r0 = X.0qQ.A0K(r9, r6)
            if (r0 == 0) goto L_0x010e
            X.9QA r0 = X.AnonymousClass9QA.A00
            r1.A01(r0)
        L_0x010e:
            boolean r0 = X.0qQ.A0K(r8, r6)
            if (r0 == 0) goto L_0x0119
            X.80L r0 = X.AnonymousClass80L.A00
            r1.A01(r0)
        L_0x0119:
            boolean r0 = X.0qQ.A0K(r7, r6)
            if (r0 == 0) goto L_0x0130
            r1.A0z = r3
            X.8jC r0 = X.C363138jC.A00
            r1.A01(r0)
            X.9QA r0 = X.AnonymousClass9QA.A00
            r1.A01(r0)
            X.80L r0 = X.AnonymousClass80L.A00
            r1.A01(r0)
        L_0x0130:
            android.os.Bundle r1 = r1.A00()
            java.lang.String r0 = "modal_dismiss_on_cancel"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "clips_camera"
            X.Dba.A0l(r5, r1, r2, r0)
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0153
        L_0x0144:
            r5.finish()
            goto L_0x0153
        L_0x0148:
            r9 = r8
            goto L_0x00e4
        L_0x014a:
            r13 = r8
            goto L_0x00d8
        L_0x014c:
            X.28D r12 = X.28D.A27
            goto L_0x00cc
        L_0x0150:
            X.FFQ.A01(r5, r2, r1)
        L_0x0153:
            r5.finish()
            r0 = -15612932(0xffffffffff11c3fc, float:-1.9375567E38)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipscamera.ClipsCameraUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
