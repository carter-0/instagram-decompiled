package com.instagram.urlhandlers.fbsurvey;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class InstagramFbSurveyConfirmUserActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPostCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r2 = r28
            r0 = r29
            super.onPostCreate(r0)
            X.0hq r1 = r2.getSupportFragmentManager()
            r0 = 12
            X.C50128FQl.A00(r1, r2, r0)
            android.os.Bundle r0 = X.DbX.A0A(r2)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = X.DbS.A0m(r0)
            if (r0 == 0) goto L_0x0142
            r12 = 0
            android.net.Uri r7 = X.DbT.A09(r0)
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r11 = "survey_fbid"
            java.lang.String r1 = r7.getQueryParameter(r11)
            if (r1 == 0) goto L_0x0036
            java.lang.Long r0 = X.C9744Rg2.A00(r1)
            if (r0 == 0) goto L_0x0036
            r5.put(r11, r1)
        L_0x0036:
            java.lang.String r10 = "id1"
            r1 = 1
            java.lang.String r9 = "id2"
            java.lang.String r8 = "id3"
            java.lang.String[] r0 = new java.lang.String[]{r10, r9, r8}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0049:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.String r4 = X.AnonymousClass7TE.A18(r6)
            java.lang.String r3 = r7.getQueryParameter(r4)
            if (r3 == 0) goto L_0x0049
            boolean r0 = X.00l.A0W(r3)
            if (r0 != 0) goto L_0x0049
            r5.put(r4, r3)
            goto L_0x0049
        L_0x0063:
            X.0wW r0 = X.DbS.A0S(r2)
            X.0Tu r6 = X.0Tu.A05
            r3 = 36323882747309646(0x810c6100042e4e, double:3.0347079417098796E-306)
            boolean r3 = X.182.A06(r6, r0, r3)
            if (r3 == 0) goto L_0x00e1
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            r4 = 0
            java.util.BitSet r6 = X.DbS.A0w(r4)
            java.lang.Object r3 = r5.get(r11)
            r7.put(r11, r3)
            java.lang.Object r3 = r5.get(r10)
            r7.put(r10, r3)
            java.lang.Object r3 = r5.get(r9)
            r7.put(r9, r3)
            java.lang.Object r3 = r5.get(r8)
            r7.put(r8, r3)
            int r3 = r6.nextClearBit(r4)
            if (r3 < r4) goto L_0x00dc
            X.0sm r20 = X.0Yt.A0E()
            java.util.Map r19 = X.0Yt.A0B(r7)
            r22 = 0
            r21 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r16 = "com.bloks.www.sandwich_surveys.confirm_user_screen_query"
            X.ShW r15 = new X.ShW
            r17 = r12
            r18 = r12
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24)
            r3 = 2131962209(0x7f132961, float:1.9561137E38)
            java.lang.String r10 = r2.getString(r3)
            X.Vbz r5 = new X.Vbz
            r6 = r12
            r7 = r12
            r8 = r12
            r9 = r12
            r11 = r12
            r13 = r4
            r14 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.WF5 r3 = new X.WF5
            r3.<init>(r5, r12, r12, r12)
            X.6Qj r0 = X.C48721Ej6.A00(r0, r4)
            X.0qQ.A0B(r0, r1)
            r15.E0s(r2, r3, r0)
            return
        L_0x00dc:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x00e1:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            java.lang.String r3 = "https"
            android.net.Uri$Builder r4 = r4.scheme(r3)
            java.lang.String r3 = "www.instagram.com"
            android.net.Uri$Builder r4 = r4.authority(r3)
            java.lang.String r3 = "/fbsurvey/confirm_user/"
            android.net.Uri$Builder r6 = r4.path(r3)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r5)
        L_0x00fc:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0116
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r5)
            java.lang.String r4 = X.DbT.A13(r3)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = r3.toString()
            r6.appendQueryParameter(r4, r3)
            goto L_0x00fc
        L_0x0116:
            android.net.Uri r3 = r6.build()
            java.lang.String r27 = X.DbT.A10(r3)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            r14 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r11 = new com.instagram.simplewebview.SimpleWebViewConfig
            r13 = r12
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r1
            r20 = r14
            r21 = r14
            r22 = r1
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r12
            r11.<init>((java.lang.String) r12, (java.lang.String) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25, (java.lang.String) r26, (java.lang.String) r27)
            r3.A02(r2, r0, r11)
            return
        L_0x0142:
            r2.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.fbsurvey.InstagramFbSurveyConfirmUserActivity.onPostCreate(android.os.Bundle):void");
    }
}
