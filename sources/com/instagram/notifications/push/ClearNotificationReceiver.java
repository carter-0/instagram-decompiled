package com.instagram.notifications.push;

import android.content.BroadcastReceiver;

public class ClearNotificationReceiver extends BroadcastReceiver {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x015b, code lost:
        if (r2.length() == 0) goto L_0x015d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r48, android.content.Intent r49) {
        /*
            r47 = this;
            r1 = -8440095(0xffffffffff7f36e1, float:-3.3923809E38)
            r3 = r47
            r2 = r48
            r0 = r49
            int r22 = X.C66580MXl.A03(r3, r2, r0, r1)
            X.0wX r1 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r2.A0K(r0, r1)
            X.1XZ r21 = X.AnonymousClass3F2.A00()
            X.0wW r5 = X.DbS.A0S(r3)
            android.net.Uri r20 = r0.getData()
            java.lang.String r2 = "ig"
            boolean r1 = X.AnonymousClass7TF.A1V(r20)
            X.17k.A0E(r1)
            java.lang.String r1 = r20.getScheme()
            boolean r1 = r2.equals(r1)
            X.17k.A0E(r1)
            java.lang.String r2 = r20.getAuthority()
            java.lang.String r1 = "notif"
            boolean r1 = r1.equals(r2)
            X.17k.A0E(r1)
            java.lang.String r1 = "notification_in_tray_timestamp"
            r2 = 0
            long r6 = r0.getLongExtra(r1, r2)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0055
            long r2 = X.C51966G9m.A07(r6)
        L_0x0055:
            X.MYV r19 = X.MYV.A01
            r13 = 0
            r18 = 0
            java.lang.String r10 = "push_id"
            java.lang.String r34 = r0.getStringExtra(r10)
            java.lang.String r9 = "recipient_id"
            java.lang.String r1 = r0.getStringExtra(r9)
            java.lang.Long r28 = X.DbZ.A0d(r1)
            java.lang.String r1 = "notification_type"
            java.lang.String r35 = r0.getStringExtra(r1)
            java.lang.String r4 = "push_category"
            java.lang.String r31 = r0.getStringExtra(r4)
            r17 = 1
            java.lang.String r1 = "sender_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.Long r29 = X.DbZ.A0d(r1)
            java.lang.String r1 = "com.instagram.android.igns.logging.sender_id"
            java.lang.String r32 = r0.getStringExtra(r1)
            java.lang.String r8 = "landing_path"
            java.lang.String r33 = r0.getStringExtra(r8)
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            java.lang.String r1 = "is_e2ee"
            boolean r46 = r0.getBooleanExtra(r1, r13)
            java.lang.String r1 = "occamadillo_thread_id"
            r6 = 0
            long r6 = r0.getLongExtra(r1, r6)
            java.lang.Long r27 = java.lang.Long.valueOf(r6)
            java.lang.String r1 = "armadillo_thread_id"
            java.lang.String r30 = r0.getStringExtra(r1)
            java.lang.String r15 = "thread_id"
            java.lang.String r36 = r0.getStringExtra(r15)
            java.lang.String r14 = "from_notification_push_channel_type"
            java.lang.String r1 = r0.getStringExtra(r14)
            com.instagram.common.notifications.push.intf.PushChannelType r24 = X.C69823Nsk.A00(r1)
            java.lang.String r7 = "feature_tags"
            long[] r1 = r0.getLongArrayExtra(r7)
            if (r1 == 0) goto L_0x0261
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.Nmi r16 = X.C69500Nmi.A04
            r11 = 15
            boolean r1 = X.03t.A0Q(r1, r11)
            if (r1 == 0) goto L_0x00d3
            r1 = r16
            r6.add(r1)
        L_0x00d3:
            java.lang.String r1 = "trace_id"
            java.lang.String r40 = r0.getStringExtra(r1)
            java.lang.String r1 = "token_fb_id"
            java.lang.String r39 = r0.getStringExtra(r1)
            java.lang.String r1 = "push_infra_notification_id"
            java.lang.String r38 = r0.getStringExtra(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r42 = r1.toSeconds(r2)
            X.6BJ r1 = new X.6BJ
            r23 = r1
            r26 = r18
            r37 = r18
            r41 = r6
            r44 = r17
            r45 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46)
            java.lang.Boolean r2 = X.MYW.A00()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0142
            r2 = r19
            X.0wc r3 = r2.A00
            java.lang.String r2 = "ig_notification_dismissed"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r2 = r6.isSampled()
            if (r2 == 0) goto L_0x0142
            X.N0n r3 = X.MYV.A01(r1)
            r2 = 1621(0x655, float:2.272E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r6.AAK(r3, r2)
            java.lang.String r2 = r1.A0E
            r6.AAJ(r8, r2)
            java.lang.String r3 = X.MYV.A05(r1)
            java.lang.String r2 = "push_type"
            X.C66583MXo.A15(r6, r1, r2, r3)
            long r2 = r1.A04
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "time_in_push_tray_seconds"
            r6.A9F(r2, r3)
            X.C66583MXo.A14(r6, r1)
            r6.Cgf()
        L_0x0142:
            com.instagram.common.session.UserSession r3 = X.0Gl.A01(r5)
            java.lang.String r1 = "notification_dismissed"
            java.lang.String r11 = r0.getStringExtra(r9)
            X.0xI r6 = X.MYX.A00(r0, r1, r11)
            java.lang.String r2 = r0.getStringExtra(r10)
            if (r2 == 0) goto L_0x015d
            int r12 = r2.length()
            r1 = 0
            if (r12 != 0) goto L_0x015e
        L_0x015d:
            r1 = 1
        L_0x015e:
            java.lang.String r12 = "empty-or-null-ig4a"
            if (r1 == 0) goto L_0x0163
            r2 = r12
        L_0x0163:
            java.lang.String r1 = "pi"
            r6.A0C(r1, r2)
            java.lang.String r2 = r0.getStringExtra(r4)
            if (r2 == 0) goto L_0x0175
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0175
            r12 = r2
        L_0x0175:
            r6.A0C(r4, r12)
            java.lang.String r1 = r0.getStringExtra(r14)
            com.instagram.common.notifications.push.intf.PushChannelType r12 = X.C69823Nsk.A00(r1)
            java.lang.String r1 = "channel"
            java.lang.String r2 = r0.getStringExtra(r1)
            if (r12 == 0) goto L_0x018f
            java.lang.String r1 = r12.name()
            if (r1 == 0) goto L_0x018f
            r2 = r1
        L_0x018f:
            java.lang.String r1 = "push_channel_type"
            r6.A0C(r1, r2)
            if (r11 == 0) goto L_0x01a3
            boolean r1 = X.C282435Db.A02(r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "is_bg_account"
            r6.A09(r1, r2)
        L_0x01a3:
            X.DbU.A1R(r6, r5)
            java.lang.String r6 = r0.getStringExtra(r8)
            if (r6 == 0) goto L_0x01d0
            java.lang.String r1 = "is_instamadillo"
            boolean r8 = r0.getBooleanExtra(r1, r13)
            java.lang.String r11 = r0.getStringExtra(r15)
            long[] r7 = r0.getLongArrayExtra(r7)
            if (r7 == 0) goto L_0x025e
            r1 = 15
            boolean r1 = X.03t.A0Q(r7, r1)
        L_0x01c2:
            java.lang.String r7 = r0.getStringExtra(r9)
            X.Pdx r2 = new X.Pdx
            r2.<init>(r6, r11, r8, r1)
            X.6EC r1 = X.AnonymousClass6EB.A02
            r1.A00(r5, r7, r2)
        L_0x01d0:
            java.lang.String r24 = r0.getStringExtra(r10)
            java.lang.String r26 = r0.getStringExtra(r4)
            if (r6 == 0) goto L_0x025b
            android.net.Uri r2 = X.DbT.A09(r6)
            java.lang.String r1 = "x"
            java.lang.String r25 = r2.getQueryParameter(r1)
        L_0x01e4:
            if (r3 == 0) goto L_0x020a
            X.6Bt r23 = X.C304006Bs.A00(r3)
            r29 = 15
            r27 = r18
            r28 = r18
            r23.A00(r24, r25, r26, r27, r28, r29)
            boolean r1 = X.1CI.A00(r3)
            if (r1 == 0) goto L_0x020a
            X.2Az r2 = X.C69802Az.A00
            java.lang.Class<X.2B3> r1 = X.2B3.class
            java.lang.Object r3 = r3.A01(r1, r2)
            X.2B3 r3 = (X.2B3) r3
            java.lang.String r2 = "NOTIFICATION_DISMISSED"
            r1 = r18
            X.2B3.A00(r3, r2, r6, r1)
        L_0x020a:
            java.util.List r6 = r20.getPathSegments()
            X.2VO r1 = X.AnonymousClass2VO.A01
            r1.A01()
            int r2 = r6.size()
            r4 = 2
            r1 = r17
            if (r2 < r1) goto L_0x0222
            int r2 = r6.size()
            if (r2 <= r4) goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            X.17k.A0E(r1)
            java.lang.String r3 = X.AnonymousClass7TE.A19(r6, r13)
            int r1 = r6.size()
            if (r1 != r4) goto L_0x0246
            r1 = r21
            X.1Xc r2 = r1.A02
            r1 = r17
            java.lang.String r1 = X.AnonymousClass7TE.A19(r6, r1)
            r2.A03(r5, r3, r1)
        L_0x023d:
            r2 = -1888716127(0xffffffff8f6c7aa1, float:-1.1659316E-29)
            r1 = r22
            X.AnonymousClass0fD.A0E(r2, r1, r0)
            return
        L_0x0246:
            r1 = r21
            X.1Xc r4 = r1.A02
            X.3Gp r3 = X.1Xc.A00(r5, r4, r3)
            if (r3 == 0) goto L_0x023d
            X.0nO r2 = r4.A00
            X.NS5 r1 = new X.NS5
            r1.<init>(r3, r4)
            r2.ATE(r1)
            goto L_0x023d
        L_0x025b:
            r25 = 0
            goto L_0x01e4
        L_0x025e:
            r1 = 0
            goto L_0x01c2
        L_0x0261:
            r6 = 0
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.push.ClearNotificationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
