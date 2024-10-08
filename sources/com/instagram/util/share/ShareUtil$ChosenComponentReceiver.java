package com.instagram.util.share;

import android.content.BroadcastReceiver;

public class ShareUtil$ChosenComponentReceiver extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        if (r10 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (r7 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r8 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r11 = (java.lang.String) r8.get("share_surface");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r11 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r15 = (java.lang.String) r8.get("ranking_token");
        r7 = r5.getStringExtra("log_event_module_name");
        r2 = X.0xI.A01(r2, new X.C50238FUu(r7).getModuleName());
        r1 = r5.getSerializableExtra("log_event_extras");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if ((r1 instanceof java.util.HashMap) == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        r2.A0F((java.util.HashMap) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        r6 = r5.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if ((r6 instanceof android.content.ComponentName) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0122, code lost:
        r6 = (android.content.ComponentName) r6;
        r2.A0C("selection_package", r6.getPackageName());
        r2.A0C("selection_class", r6.getClassName());
        r2.A0C("selection_short_class", r6.getShortClassName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0141, code lost:
        if ((r3 instanceof com.instagram.common.session.UserSession) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0143, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0155, code lost:
        if (X.AnonymousClass7TF.A0R(X.0Tu.A05, r9, 36323942876589693L).booleanValue() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r8 = new X.C50239FUv(r7);
        r14 = r6.getPackageName();
        X.DbY.A1S(r9, r10);
        X.C22031Xty.A0K(r8, r9, r10, r11, "system_share_sheet", r13, r14, r15, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016a, code lost:
        X.DbU.A1R(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r18, android.content.Intent r19) {
        /*
            r17 = this;
            r0 = 1572473312(0x5dba09e0, float:1.67568651E18)
            int r4 = X.AnonymousClass0fD.A01(r0)
            r1 = r17
            r0 = r18
            r5 = r19
            X.AnonymousClass0fQ.A01(r1, r0, r5)
            android.os.Bundle r0 = r5.getExtras()
            X.08y r3 = X.09i.A0A
            r3.A07(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "log_event_extras"
            r8 = 0
            r0 = 33
            if (r2 < r0) goto L_0x0033
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            java.io.Serializable r8 = r5.getSerializableExtra(r1, r0)
            java.util.HashMap r8 = (java.util.HashMap) r8
        L_0x002a:
            if (r8 != 0) goto L_0x005e
        L_0x002c:
            r0 = -2018545383(0xffffffff87af7119, float:-2.6397546E-34)
        L_0x002f:
            X.AnonymousClass0fD.A0E(r0, r4, r5)
            return
        L_0x0033:
            java.lang.String r0 = r5.getStringExtra(r1)
            if (r0 == 0) goto L_0x002c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x002a }
            int r0 = r9.length()     // Catch:{ JSONException -> 0x002a }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ JSONException -> 0x002a }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x002a }
            java.util.Iterator r6 = r9.keys()     // Catch:{ JSONException -> 0x005d }
        L_0x004b:
            boolean r0 = r6.hasNext()     // Catch:{ JSONException -> 0x005d }
            if (r0 == 0) goto L_0x005d
            java.lang.String r2 = X.AnonymousClass7TE.A18(r6)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r0 = r9.getString(r2)     // Catch:{ JSONException -> 0x005d }
            r7.put(r2, r0)     // Catch:{ JSONException -> 0x005d }
            goto L_0x004b
        L_0x005d:
            r8 = r7
        L_0x005e:
            java.lang.String r2 = "contentType"
            java.lang.String r0 = ""
            java.lang.Object r2 = r8.getOrDefault(r2, r0)
            java.lang.String r0 = "INVITE_CONTACT"
            boolean r0 = X.2Ob.A00(r2, r0)
            if (r0 == 0) goto L_0x00ab
            android.os.Bundle r0 = r5.getExtras()     // Catch:{ IllegalArgumentException -> 0x00a2 }
            com.instagram.common.session.UserSession r7 = r3.A07(r0)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            java.lang.String r0 = "inviteLocation"
            java.lang.String r6 = X.DbS.A0r(r0, r8)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            java.lang.String r0 = "url"
            java.lang.String r3 = X.DbS.A0r(r0, r8)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            java.lang.String r0 = "isContactSynced"
            java.lang.Object r1 = r8.get(r0)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            java.lang.String r0 = "true"
            boolean r2 = X.2Ob.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            if (r7 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00e1
            java.lang.String r0 = r6.toUpperCase()     // Catch:{ IllegalArgumentException -> 0x00a2 }
            X.EZn r1 = X.C48145EZn.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            X.EZk r0 = X.C48142EZk.SYSTEM_SHARE_SHEET     // Catch:{ IllegalArgumentException -> 0x00a2 }
            X.C49947FGb.A02(r1, r0, r7, r3, r2)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            goto L_0x00e1
        L_0x00a2:
            r2 = move-exception
            java.lang.String r1 = "ShareUtil"
            java.lang.String r0 = "logChosenInviteComponent: invalid enum value"
            X.0KC.A0F(r1, r0, r2)
            goto L_0x00e1
        L_0x00ab:
            java.lang.String r0 = "log_event_name"
            java.lang.String r2 = r5.getStringExtra(r0)
            if (r2 == 0) goto L_0x00e1
            android.os.Bundle r0 = r5.getExtras()
            X.0wW r3 = r3.A04(r0)
            java.lang.String r0 = "url"
            java.lang.Object r13 = r8.get(r0)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00e1
            java.lang.String r0 = "media_id"
            java.lang.String r7 = X.DbS.A0r(r0, r8)
            java.lang.String r0 = "reel_id"
            java.lang.String r6 = X.DbS.A0r(r0, r8)
            java.lang.String r0 = "audio_id"
            java.lang.String r10 = X.DbS.A0r(r0, r8)
            if (r7 != 0) goto L_0x00de
            if (r6 == 0) goto L_0x00dc
            r7 = r6
        L_0x00dc:
            if (r10 != 0) goto L_0x00e6
        L_0x00de:
            r10 = r7
            if (r7 != 0) goto L_0x00e6
        L_0x00e1:
            r0 = 2129637009(0x7eefae91, float:1.5929595E38)
            goto L_0x002f
        L_0x00e6:
            java.lang.String r0 = "share_surface"
            java.lang.Object r11 = r8.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00e1
            java.lang.String r0 = "ranking_token"
            java.lang.Object r15 = r8.get(r0)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r0 = "log_event_module_name"
            java.lang.String r7 = r5.getStringExtra(r0)
            X.FUu r0 = new X.FUu
            r0.<init>(r7)
            java.lang.String r0 = r0.getModuleName()
            X.0xI r2 = X.0xI.A01(r2, r0)
            java.io.Serializable r1 = r5.getSerializableExtra(r1)
            boolean r0 = r1 instanceof java.util.HashMap
            if (r0 == 0) goto L_0x0118
            java.util.HashMap r1 = (java.util.HashMap) r1
            r2.A0F(r1)
        L_0x0118:
            java.lang.String r0 = "android.intent.extra.CHOSEN_COMPONENT"
            android.os.Parcelable r6 = r5.getParcelableExtra(r0)
            boolean r0 = r6 instanceof android.content.ComponentName
            if (r0 == 0) goto L_0x016a
            android.content.ComponentName r6 = (android.content.ComponentName) r6
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "selection_package"
            r2.A0C(r0, r1)
            java.lang.String r1 = r6.getClassName()
            java.lang.String r0 = "selection_class"
            r2.A0C(r0, r1)
            java.lang.String r1 = r6.getShortClassName()
            java.lang.String r0 = "selection_short_class"
            r2.A0C(r0, r1)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x016a
            r9 = r3
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323942876589693(0x810c6f00002e7d, double:3.0347459677087025E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r8, r9, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016a
            X.FUv r8 = new X.FUv
            r8.<init>(r7)
            java.lang.String r14 = r6.getPackageName()
            java.lang.String r12 = "system_share_sheet"
            X.DbY.A1S(r9, r10)
            r16 = 0
            X.C22031Xty.A0K(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x016a:
            X.DbU.A1R(r2, r3)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.util.share.ShareUtil$ChosenComponentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
