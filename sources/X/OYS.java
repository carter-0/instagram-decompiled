package X;

public final class OYS {
    public static final C71854Orv A00 = new C71854Orv();
    public static final OYS A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v13, types: [X.AA2, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        if (r4 != 0) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r22, com.instagram.common.session.UserSession r23, X.AnonymousClass2Ep r24) {
        /*
            r2 = 1
            X.PFH r3 = new X.PFH
            r1 = r23
            r0 = r24
            r3.<init>(r1, r0)
            boolean r0 = r3.CVr()
            if (r0 == 0) goto L_0x0190
            java.lang.String r20 = r3.C6k()
        L_0x0014:
            if (r20 != 0) goto L_0x0022
            X.NkA r0 = X.C69370NkA.INVALID_REQUEST
        L_0x0018:
            X.OZH r2 = new X.OZH
            r2.<init>(r0)
        L_0x001d:
            java.lang.String r0 = r2.A01()
            return r0
        L_0x0022:
            X.1X9 r0 = X.1X9.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 != 0) goto L_0x002d
            X.NkA r0 = X.C69370NkA.DIRECT_NOT_INIT
            goto L_0x0018
        L_0x002d:
            X.1X9 r4 = X.AnonymousClass38W.A00()
            X.0eE r7 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r9 = r7.A01(r1)
            java.util.List r0 = r3.BRX()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0043:
            boolean r0 = r8.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x0060
            java.lang.Object r5 = r8.next()
            java.lang.Long r0 = r9.BST()
            if (r0 == 0) goto L_0x0058
            java.lang.String r10 = r0.toString()
        L_0x0058:
            boolean r0 = X.0qQ.A0K(r5, r10)
            X.DbV.A1U(r5, r6, r0)
            goto L_0x0043
        L_0x0060:
            java.util.List r17 = r3.Aaq()
            boolean r19 = r3.CUG()
            r0 = r22
            java.lang.String r14 = r3.C6g(r0, r1)
            java.lang.String r15 = r9.getUsername()
            com.instagram.user.model.User r5 = r7.A01(r1)
            com.instagram.common.typedurl.ImageUrl r13 = r5.Bh3()
            java.lang.String r16 = r9.getId()
            com.instagram.model.rtc.RtcCallAudience r12 = new com.instagram.model.rtc.RtcCallAudience
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.Nid r6 = r3.Azh()
            X.Nid r5 = X.C69277Nid.NO_E2EE
            if (r6 == r5) goto L_0x0188
            r22 = r10
            java.lang.String r23 = r3.C6C()
        L_0x0093:
            java.lang.String r21 = r3.C6k()
            com.instagram.model.rtc.RtcThreadKey r6 = new com.instagram.model.rtc.RtcThreadKey
            r24 = r10
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            X.7Rj r5 = X.C331537Rj.WEARABLE_AUDIO_CALL
            com.instagram.model.rtc.RtcCallSource r14 = new com.instagram.model.rtc.RtcCallSource
            r14.<init>(r10, r5, r6)
            X.Nid r11 = r3.Azh()
            boolean r20 = r3.CVE()
            r19 = 0
            r18 = -1
            com.instagram.model.rtc.RtcCreateCallArgs r9 = new com.instagram.model.rtc.RtcCreateCallArgs
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r21 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            int r3 = X.02K.A00(r0, r3)
            if (r3 == 0) goto L_0x0196
            java.lang.String r5 = "notification"
            java.lang.Object r4 = r0.getSystemService(r5)
            boolean r3 = r4 instanceof android.app.NotificationManager
            if (r3 == 0) goto L_0x00e5
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            if (r4 == 0) goto L_0x00e5
            java.lang.String r3 = "ig_direct_video_chat"
            android.app.NotificationChannel r3 = r4.getNotificationChannel(r3)
            if (r3 == 0) goto L_0x00e5
            int r4 = r3.getImportance()
            r3 = 0
            if (r4 == 0) goto L_0x00e6
        L_0x00e5:
            r3 = 1
        L_0x00e6:
            if (r3 == 0) goto L_0x017d
            java.lang.Object r5 = r0.getSystemService(r5)
            java.lang.String r3 = "null cannot be cast to non-null type android.app.NotificationManager"
            X.0qQ.A0C(r5, r3)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            android.content.Intent r6 = X.DbS.A09()
            android.content.Context r3 = r0.getApplicationContext()
            java.lang.String r4 = r3.getPackageName()
            java.lang.String r3 = "com.instagram.rtc.activity.RtcCallIntentHandlerActivity"
            X.C66581MXm.A17(r6, r4, r3)
            java.lang.String r3 = "rtc_call_activity_intent_action_create_or_join_call"
            r6.setAction(r3)
            com.instagram.model.rtc.RtcCallSource r3 = r9.A05
            com.instagram.model.rtc.RtcThreadKey r3 = r3.A02
            java.lang.String r4 = r3.A02
            java.lang.String r3 = "video_call_incoming"
            android.net.Uri r3 = X.O1O.A00(r3, r4)
            r6.setData(r3)
            java.lang.String r3 = r1.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putExtra(r1, r3)
            java.lang.String r1 = "rtc_call_activity_arguments_key_enter_call_args"
            r6.putExtra(r1, r9)
            X.0Sy r3 = new X.0Sy
            r3.<init>()
            r3.A0A(r6)
            r6 = 64278(0xfb16, float:9.0073E-41)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = r3.A01(r0, r6, r1)
            android.content.Context r3 = r0.getApplicationContext()
            r1 = 2131966512(0x7f133a30, float:1.9569864E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r3, r1)
            java.lang.String r1 = "ig_direct_video_chat"
            X.9T8 r3 = new X.9T8
            r3.<init>((android.content.Context) r0, (java.lang.String) r1)
            r1 = 2131231255(0x7f080217, float:1.8078586E38)
            r3.A04(r1)
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131954435(0x7f130b03, float:1.954537E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0C(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r4)
            r3.A0A(r0)
            r3.A0B(r4)
            r3.A0C = r7
            r3.A02 = r2
            r0 = 2
            X.AnonymousClass9T8.A01(r3, r0, r2)
            r3.A0g = r2
            android.app.Notification r0 = r3.A03()
            X.0qQ.A07(r0)
            r5.notify(r6, r0)
        L_0x017d:
            r1 = 19
            java.lang.String r0 = "Missing record audio permission"
            X.OZH r2 = new X.OZH
            r2.<init>(r1, r0)
            goto L_0x001d
        L_0x0188:
            java.lang.String r22 = r3.C6C()
            r23 = r10
            goto L_0x0093
        L_0x0190:
            java.lang.String r20 = r3.C6C()
            goto L_0x0014
        L_0x0196:
            X.Pkq r3 = X.C73853Pkq.A00
            r4.A01(r0, r1, r9, r3)
            org.json.JSONObject r1 = X.DbS.A11()
            java.lang.String r0 = "success"
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x01a5 }
            goto L_0x01a9
        L_0x01a5:
            r0 = move-exception
            X.C66583MXo.A1U(r0)
        L_0x01a9:
            java.lang.String r0 = X.DbT.A10(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYS.A00(android.content.Context, com.instagram.common.session.UserSession, X.2Ep):java.lang.String");
    }
}
