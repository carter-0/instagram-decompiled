package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.impl.DirectNotificationActionService;

/* renamed from: X.PcA  reason: case insensitive filesystem */
public final class C73413PcA implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C254923tH A01;
    public final /* synthetic */ DirectNotificationActionService A02;
    public final /* synthetic */ C254743sy A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C73413PcA(UserSession userSession, C254923tH r2, DirectNotificationActionService directNotificationActionService, C254743sy r4, String str, String str2, String str3, String str4) {
        this.A02 = directNotificationActionService;
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r3.length() == 0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r9 = r30
            com.instagram.direct.notifications.impl.DirectNotificationActionService r0 = r9.A02
            android.content.Context r5 = r0.getApplicationContext()
            X.0qQ.A0A(r5)
            com.instagram.common.session.UserSession r4 = r9.A00
            X.3tH r7 = r9.A01
            r6 = 0
            X.0qQ.A0B(r5, r6)
            r10 = 2
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x00c8
            X.Mot r2 = X.C67497Mor.A00(r4)
        L_0x001e:
            X.7Zj r2 = (X.C333547Zj) r2
            X.2JA r0 = X.2J9.A04
            java.lang.String r12 = r4.A06
            X.2J9 r17 = r0.A00(r12)
            X.Pox r19 = X.C74094Pox.A00
            X.0nE r15 = X.C61410nE.A00
            X.1Xc r18 = X.1Xc.A01()
            X.0qQ.A07(r18)
            java.lang.Object r1 = X.C66582MXn.A0p(r5)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            X.OTi r0 = new X.OTi
            r13 = r0
            r14 = r1
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            X.3sy r8 = r9.A03
            java.lang.String r3 = r9.A06
            java.lang.String r2 = r9.A07
            java.lang.String r11 = "Required value was null."
            if (r2 == 0) goto L_0x01a8
            java.lang.String r1 = r9.A04
            if (r1 == 0) goto L_0x01a3
            java.lang.String r9 = r9.A05
            X.0qQ.A0B(r8, r10)
            if (r3 == 0) goto L_0x005e
            int r10 = r3.length()
            r11 = 0
            if (r10 != 0) goto L_0x005f
        L_0x005e:
            r11 = 1
        L_0x005f:
            java.lang.String r10 = "ReplyNotificationActionHandler"
            if (r11 == 0) goto L_0x006e
            java.lang.String r3 = "Got notification reply action with no input"
            X.0wb.A03(r10, r3)
            X.1Xc r0 = r0.A03
            X.C70122Nxc.A00(r5, r4, r0, r2, r1)
        L_0x006d:
            return
        L_0x006e:
            X.7Zj r10 = r0.A01
            java.lang.String r18 = "none"
            r15 = 0
            java.lang.String r19 = "push_notification_action"
            r14 = r10
            r16 = r8
            r17 = r3
            r20 = r6
            r14.EMr(r15, r16, r17, r18, r19, r20)
            java.lang.String r10 = "type:"
            java.lang.String r11 = X.AnonymousClass7QG.A01(r10, r2)
            java.lang.String r10 = "rr"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00ce
            android.service.notification.StatusBarNotification r9 = X.C70961OTi.A00(r0, r2, r1)
            if (r9 == 0) goto L_0x006d
            android.app.Notification r3 = r9.getNotification()
            X.9T8 r6 = new X.9T8
            r6.<init>((android.app.Notification) r3, (android.content.Context) r5)
            r3 = 1
            r6.A0j = r3
            android.app.Notification r8 = r6.A03()
            X.0qQ.A07(r8)
            android.app.NotificationManager r7 = r0.A00
            java.lang.String r6 = r9.getTag()
            int r3 = r9.getId()
            r7.notify(r6, r3, r8)
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            X.Pbn r3 = new X.Pbn
            r7 = r3
            r8 = r5
            r9 = r4
            r10 = r0
            r11 = r2
            r12 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 500(0x1f4, double:2.47E-321)
            r6.postDelayed(r3, r0)
            return
        L_0x00c8:
            X.7Zi r2 = X.C333527Zh.A00(r4)
            goto L_0x001e
        L_0x00ce:
            X.0sP r10 = r0.A04
            java.lang.Object r10 = r10.invoke(r4)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r10 = r10.getUsername()
            X.2J9 r11 = r0.A02
            X.3H4 r11 = r11.A00()
            X.3H3 r11 = r11.A00
            int r11 = r11.A02
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r6)
            X.5ER r14 = new X.5ER
            r14.<init>(r11, r11)
            android.service.notification.StatusBarNotification r6 = X.C70961OTi.A00(r0, r2, r1)
            if (r6 == 0) goto L_0x019f
            android.app.Notification r6 = r6.getNotification()
            if (r6 == 0) goto L_0x019f
            android.os.Bundle r11 = r6.extras
            if (r11 == 0) goto L_0x019f
            java.lang.String r6 = "android.title"
            java.lang.String r19 = r11.getString(r6)
        L_0x0103:
            X.0BQ r6 = X.AnonymousClass0BO.A00(r4)
            boolean r13 = r6.CKD()
            r6 = 1
            android.content.res.Resources r11 = r5.getResources()
            if (r13 == 0) goto L_0x0196
            r5 = 2131951697(0x7f130051, float:1.9539816E38)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r10, r3}
        L_0x0119:
            java.lang.String r20 = r11.getString(r5, r10)
            X.0qQ.A07(r20)
            boolean r5 = r8 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r5 == 0) goto L_0x0189
            com.instagram.model.direct.threadkey.impl.MsysThreadId r8 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r8
            long r10 = r8.A00
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
        L_0x012c:
            java.lang.StringBuilder r10 = X.AnonymousClass7TE.A1A()
            java.lang.String r8 = "direct_v2?id="
            r10.append(r8)
            r10.append(r5)
            java.lang.String r5 = "&transport_type="
            r10.append(r5)
            java.lang.String r5 = r7.A00
            java.lang.String r21 = X.AnonymousClass7TF.A0l(r5, r10)
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()
            java.lang.String r5 = "LOCAL_PUSH_ID:"
            r7.append(r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r23 = X.AnonymousClass7TF.A0i(r5, r7)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r6)
            java.lang.String r22 = "direct_v2_message"
            X.5HJ r13 = new X.5HJ
            r17 = r16
            r24 = r15
            r25 = r12
            r26 = r15
            r27 = r12
            r28 = r15
            r29 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13.A0Z = r3
            r13.A0c = r9
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r13.A0u = r3
            r13.A1M = r6
            X.1Xc r0 = r0.A03
            r5 = r0
            r6 = r13
            r7 = r4
            r8 = r15
            r9 = r1
            r10 = r2
            r5.A02(r6, r7, r8, r9, r10)
            return
        L_0x0189:
            com.instagram.model.direct.DirectThreadKey r5 = X.C66647MaG.A04(r8)
            if (r5 == 0) goto L_0x0194
            java.lang.String r5 = X.C66647MaG.A09(r8)
            goto L_0x012c
        L_0x0194:
            r5 = 0
            goto L_0x012c
        L_0x0196:
            r5 = 2131951698(0x7f130052, float:1.9539818E38)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r3}
            goto L_0x0119
        L_0x019f:
            r19 = 0
            goto L_0x0103
        L_0x01a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x01a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73413PcA.run():void");
    }
}
