package com.instagram.rtc.signaling.processor;

import X.0sL;
import X.1XE;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C74562PxB;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1", f = "RtcCallSignalingProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallSignalingProcessor$onShowIncomingUI$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C74562PxB A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ RtcConnectionEntity A02;
    public final /* synthetic */ 1XE A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallSignalingProcessor$onShowIncomingUI$1(C74562PxB pxB, UserSession userSession, RtcConnectionEntity rtcConnectionEntity, 1XE r5, AnonymousClass4D7 r6, boolean z) {
        super(2, r6);
        this.A03 = r5;
        this.A01 = userSession;
        this.A02 = rtcConnectionEntity;
        this.A04 = z;
        this.A00 = pxB;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        1XE r4 = this.A03;
        return new RtcCallSignalingProcessor$onShowIncomingUI$1(this.A00, this.A01, this.A02, r4, r9, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcCallSignalingProcessor$onShowIncomingUI$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v71, types: [X.AA2, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02d7, code lost:
        if (r9.priorityCallSenders == 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02db, code lost:
        if (r10 != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0314, code lost:
        if (((android.os.PowerManager) r7).isInteractive() == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a4, code lost:
        if (r12 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0211, code lost:
        if (r7 != 4) goto L_0x0213;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            X.0eS.A00(r29)
            r2 = r28
            X.1XE r1 = r2.A03
            X.0eM r0 = r1.A08
            java.lang.Object r6 = r0.getValue()
            X.OZL r6 = (X.OZL) r6
            android.content.Context r7 = r1.A01
            com.instagram.common.session.UserSession r0 = r2.A01
            r22 = r0
            com.instagram.rtc.signaling.models.RtcConnectionEntity r3 = r2.A02
            boolean r4 = r2.A04
            X.PxB r0 = r2.A00
            r2 = 0
            r1 = r22
            X.C51973G9u.A1E(r7, r1, r3)
            r1 = 4
            X.0qQ.A0B(r0, r1)
            r5 = 0
            if (r4 == 0) goto L_0x0050
            boolean r4 = r3 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r4 == 0) goto L_0x0050
            X.OZB r10 = X.OZB.A00     // Catch:{ IllegalStateException -> 0x004c }
            X.1X9 r9 = r6.A03     // Catch:{ IllegalStateException -> 0x004c }
            android.content.Context r8 = r6.A01     // Catch:{ IllegalStateException -> 0x004c }
            r4 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r4 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r4     // Catch:{ IllegalStateException -> 0x004c }
            r11 = r8
            r12 = r0
            r13 = r22
            r14 = r9
            r15 = r4
            android.content.Intent r17 = r10.A01(r11, r12, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x004c }
            r4 = r17
            X.0Sy r8 = X.C66582MXn.A0K(r7, r4)     // Catch:{ IllegalStateException -> 0x0055 }
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r21 = r8.A01(r7, r2, r4)     // Catch:{ IllegalStateException -> 0x0055 }
            goto L_0x0061
        L_0x004c:
            r10 = move-exception
            r17 = r5
            goto L_0x0056
        L_0x0050:
            r17 = r5
            r21 = r5
            goto L_0x0061
        L_0x0055:
            r10 = move-exception
        L_0x0056:
            X.OWb r9 = X.C71004OWb.A00
            java.lang.String r8 = "RtcCallNotificationManager"
            java.lang.String r4 = "Can't create full screen intent"
            r9.A03(r8, r4, r10)
            r21 = r5
        L_0x0061:
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            java.lang.String r4 = "com.instagram.rtc.notifications.service.entity"
            r11.putParcelable(r4, r3)
            boolean r4 = r3 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            r16 = r4
            if (r4 == 0) goto L_0x03f4
            r10 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r10 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r10
            if (r10 == 0) goto L_0x03f5
            java.lang.String r9 = r10.A0D
            boolean r4 = r10.A0L
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r4)
            java.lang.String r5 = r10.A0C
        L_0x007f:
            boolean r4 = r3 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity
            if (r4 == 0) goto L_0x03b6
            r13 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$LiveInviteConnectionEntity r13 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity) r13
            com.instagram.model.rtc.RtcIgNotification r12 = r13.A01
            if (r12 == 0) goto L_0x017a
            android.content.Context r8 = r6.A01
            java.lang.String r4 = "ig://"
            java.lang.String r15 = r12.A01
            java.lang.String r4 = X.002.A0R(r4, r15)
            android.net.Uri$Builder r9 = X.DbW.A07(r4)
            java.lang.String r14 = r12.A03
            java.lang.String r4 = "push_category"
            r9.appendQueryParameter(r4, r14)
            java.lang.String r5 = r12.A05
            java.lang.String r4 = "rtc_message"
            r9.appendQueryParameter(r4, r5)
            android.net.Uri r10 = r9.build()
            X.14C r4 = X.AnonymousClass14B.A03
            X.14B r5 = r4.A00()
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r9 = r5.A02(r8, r4)
            r9.setData(r10)
            java.lang.String r4 = r12.A04
            r5 = r4
            java.lang.String r4 = "from_notification_id"
            r9.putExtra(r4, r5)
            java.lang.String r4 = "from_notification_category"
            r9.putExtra(r4, r14)
            java.lang.String r4 = "landing_path"
            r9.putExtra(r4, r15)
            java.lang.String r5 = r12.A02
            X.0qQ.A0A(r10)
            java.lang.String r4 = "via_push_notification"
            X.OP0.A01(r8, r9, r10, r5, r4)
            X.0Sy r5 = new X.0Sy
            r5.<init>()
            r5.A0A(r9)
            r4 = 64278(0xfb16, float:9.0073E-41)
            android.app.PendingIntent r5 = r5.A01(r8, r4, r2)
            java.lang.Class<com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService> r4 = com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService.class
            android.content.Intent r9 = X.C66580MXl.A0A(r8, r4)
            java.lang.String r4 = "DISMISS_LIVE_NOTIFICATION"
            r9.setAction(r4)
            r9.putExtras(r11)
            r14 = 1
            X.0Sy r9 = X.C66582MXn.A0K(r8, r9)
            X.2SP r4 = X.2SP.A01
            int r4 = r4.A03()
            int r4 = java.lang.Math.abs(r4)
            android.app.PendingIntent r15 = r9.A03(r8, r4, r2)
            X.AIZ r10 = r6.A04
            java.lang.String r9 = r12.A09
            if (r9 != 0) goto L_0x0114
            android.content.Context r4 = r10.A00
            X.0qQ.A06(r4)
            java.lang.String r9 = X.0lz.A00(r4)
        L_0x0114:
            android.content.Context r11 = r10.A00
            java.lang.String r4 = "ig_direct_video_chat"
            X.9T8 r10 = new X.9T8
            r10.<init>((android.content.Context) r11, (java.lang.String) r4)
            r10.A0C = r5
            r10.A0E(r14)
            r10.A0C(r9)
            java.lang.String r9 = r13.A07
            r10.A0B(r9)
            android.app.Notification r5 = r10.A0A
            r5.deleteIntent = r15
            java.lang.String r4 = r12.A08
            r10.A0D(r4)
            r4 = 2130969230(0x7f04028e, float:1.7547136E38)
            r15 = 2131239376(0x7f0821d0, float:1.8095057E38)
            int r4 = X.2Yu.A0H(r11, r4)
            if (r4 == 0) goto L_0x0140
            r15 = r4
        L_0x0140:
            r10.A04(r15)
            androidx.core.app.NotificationCompat$BigTextStyle r4 = new androidx.core.app.NotificationCompat$BigTextStyle
            r4.<init>()
            r4.A07(r9)
            r10.A0A(r4)
            java.lang.String r9 = r12.A07
            java.lang.String r4 = "default"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x015a
            r5.defaults = r14
        L_0x015a:
            com.instagram.common.typedurl.ImageUrl r5 = r13.A00
            if (r5 == 0) goto L_0x016f
            X.1NK r4 = X.1NK.A00()
            android.graphics.Bitmap r4 = r4.A0G(r5)
            if (r4 == 0) goto L_0x016f
            android.graphics.Bitmap r4 = X.C71141Odp.A02(r11, r4)
            r10.A07(r4)
        L_0x016f:
            android.app.Notification r10 = r10.A03()
        L_0x0173:
            if (r10 != 0) goto L_0x017d
            java.lang.String r1 = "Could not create notification"
            r0.AUZ(r1)
        L_0x017a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x017d:
            r5 = 0
            if (r16 == 0) goto L_0x033a
            r9 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r9 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r9
            if (r9 == 0) goto L_0x033b
            java.lang.String r18 = r9.A00()
        L_0x0189:
            X.2HA r4 = X.2HA.A0A
            r11 = 1
            java.lang.Boolean r4 = X.2Gm.A00(r8, r4, r11)
            boolean r12 = X.AnonymousClass7TG.A1X(r4)
            android.app.NotificationManager r8 = r6.A00
            int r13 = r8.getCurrentInterruptionFilter()
            r4 = 2
            if (r13 == r4) goto L_0x0337
            r4 = 3
            if (r13 == r4) goto L_0x0337
            if (r13 == r1) goto L_0x0337
            r13 = 0
            r15 = 0
            if (r12 != 0) goto L_0x01a7
        L_0x01a6:
            r15 = 1
        L_0x01a7:
            java.lang.String r4 = "is_dnd"
            r0.CmG(r4, r13)
            boolean r14 = X.14i.A08()
            java.lang.String r4 = "is_background"
            r0.CmG(r4, r14)
            java.lang.String r4 = "is_ring_notif_enabled"
            r0.CmG(r4, r12)
            boolean r4 = X.14i.A08()
            if (r4 != 0) goto L_0x02f5
            if (r15 == 0) goto L_0x02f5
            if (r17 == 0) goto L_0x02f5
            r4 = r17
            X.0kR.A0B(r7, r4)
        L_0x01c9:
            X.C70320O1y.A00(r22)
            java.lang.String r7 = r3.Bse()
            r4 = 11
            X.OWf.A00(r7, r4)
            r4 = r22
            X.OZL.A01(r0, r4, r6)
            X.1Fs r12 = r6.A02
            java.lang.String r6 = X.C70907OQz.A01(r3)
            r4 = 1910377639(0x71de0ca7, float:2.199071E30)
            r12.A00(r6, r4, r10)
            X.1X9 r4 = X.AnonymousClass38W.A00()
            X.1X8 r4 = (X.1X8) r4
            X.1XB r6 = r4.A01
            if (r9 == 0) goto L_0x02ef
            X.Nid r7 = r9.A01
            if (r7 == 0) goto L_0x02ef
            X.Nid r4 = X.C69277Nid.NO_E2EE
            if (r7 == r4) goto L_0x02ef
            r19 = r5
            if (r16 == 0) goto L_0x0201
            r4 = r3
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r4 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r4
            java.lang.String r5 = r4.A0E
        L_0x0201:
            r4 = 1
            r11 = 1
            int r7 = r8.getCurrentInterruptionFilter()
            if (r7 == 0) goto L_0x0213
            if (r7 == r4) goto L_0x0213
            r4 = 2
            if (r7 == r4) goto L_0x02b9
            r4 = 3
            if (r7 == r4) goto L_0x02df
            if (r7 == r1) goto L_0x02df
        L_0x0213:
            java.lang.String r4 = "notif_displayed"
            if (r11 == 0) goto L_0x033f
            int r8 = r8.getCurrentInterruptionFilter()
            r7 = 2
            if (r8 == r7) goto L_0x02b5
            r7 = 3
            if (r8 == r7) goto L_0x02b5
            if (r8 == r1) goto L_0x02b5
            java.lang.Integer r12 = X.AnonymousClass05K.A01
        L_0x0225:
            java.lang.Integer r10 = r3.BWf()
            com.instagram.model.rtc.RtcCallKey r9 = r3.AjW()
            com.instagram.model.rtc.RtcIgNotification r14 = r3.Bot()
            java.lang.Integer r8 = r3.BwQ()
            java.lang.String r7 = r3.BkA()
            r21 = 0
            r3 = r22
            boolean r11 = X.C51966G9m.A1W(r3, r7)
            X.0qQ.A0B(r10, r2)
            X.AnonymousClass7TG.A1P(r9, r8)
            X.0qQ.A0B(r7, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r10 != r1) goto L_0x0284
            if (r14 == 0) goto L_0x0284
            java.lang.String r1 = r9.A00
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            r20 = r5
            r15 = r6
            r17 = r1
            X.0xI r3 = X.1XB.A02(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x027c
            int r1 = r12.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x0281
            java.lang.String r2 = "incoming_call_on_dnd"
        L_0x0269:
            java.lang.String r1 = "display_type"
            r3.A0C(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = "is_current_user"
            r3.A09(r1, r2)
            java.lang.String r1 = r14.A02
            X.1XC.A00(r3, r1)
        L_0x027c:
            r0.AIe(r4)
            goto L_0x017a
        L_0x0281:
            java.lang.String r2 = "incoming_call"
            goto L_0x0269
        L_0x0284:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r10 != r1) goto L_0x027c
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            r13 = r9
            r14 = r6
            r16 = r8
            r17 = r7
            r20 = r5
            X.0xI r3 = X.1XB.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r12.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x02b2
            java.lang.String r2 = "incoming_call_on_dnd"
        L_0x02a0:
            java.lang.String r1 = "display_type"
            r3.A0C(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = "is_current_user"
            r3.A09(r1, r2)
            X.1XC.A00(r3, r7)
            goto L_0x027c
        L_0x02b2:
            java.lang.String r2 = "incoming_call"
            goto L_0x02a0
        L_0x02b5:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            goto L_0x0225
        L_0x02b9:
            java.lang.String r7 = "ig_direct_video_chat"
            android.app.NotificationManager r4 = r12.A00
            android.app.NotificationChannel r4 = r4.getNotificationChannel(r7)
            if (r4 == 0) goto L_0x02c8
            boolean r10 = r4.canBypassDnd()
            goto L_0x02c9
        L_0x02c8:
            r10 = 0
        L_0x02c9:
            android.app.NotificationManager$Policy r9 = r8.getNotificationPolicy()     // Catch:{ SecurityException -> 0x02e2 }
            int r4 = r9.priorityCategories
            r7 = 8
            r4 = r4 & 8
            if (r4 != r7) goto L_0x02db
            int r4 = r9.priorityCallSenders
            if (r4 != 0) goto L_0x02db
            goto L_0x0213
        L_0x02db:
            if (r10 == 0) goto L_0x02df
            goto L_0x0213
        L_0x02df:
            r11 = 0
            goto L_0x0213
        L_0x02e2:
            r4 = move-exception
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "RtcNotificationHelper"
            X.0KC.A0E(r4, r7)
            r11 = r10
            goto L_0x0213
        L_0x02ef:
            java.lang.String r19 = r3.C6C()
            goto L_0x0201
        L_0x02f5:
            java.lang.Object r4 = X.C66582MXn.A0o(r7)
            android.app.KeyguardManager r4 = (android.app.KeyguardManager) r4
            if (r13 != 0) goto L_0x0335
            boolean r4 = r4.isKeyguardLocked()
            if (r4 != 0) goto L_0x0316
            java.lang.String r4 = "power"
            java.lang.Object r7 = r7.getSystemService(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.os.PowerManager"
            X.0qQ.A0C(r7, r4)
            android.os.PowerManager r7 = (android.os.PowerManager) r7
            boolean r4 = r7.isInteractive()
            if (r4 != 0) goto L_0x0335
        L_0x0316:
            java.lang.String r4 = "should_expect_incoming_fullscreen"
            r0.CmG(r4, r11)
            if (r11 == 0) goto L_0x031f
            if (r12 != 0) goto L_0x01c9
        L_0x031f:
            java.lang.String r4 = "incoming_call_screen_displayed"
            r0.Ey1(r4)
            java.lang.String r4 = "reach_rtc_intent_handler_activity"
            r0.Ey1(r4)
            java.lang.String r4 = "launch_call_activity"
            r0.Ey1(r4)
            java.lang.String r4 = "call_activity_on_resume"
            r0.Ey1(r4)
            goto L_0x01c9
        L_0x0335:
            r11 = 0
            goto L_0x0316
        L_0x0337:
            r13 = 1
            goto L_0x01a6
        L_0x033a:
            r9 = r5
        L_0x033b:
            r18 = r5
            goto L_0x0189
        L_0x033f:
            boolean r7 = X.14i.A08()
            if (r7 == 0) goto L_0x03b3
            java.lang.Integer r17 = X.AnonymousClass05K.A0j
        L_0x0347:
            java.lang.Integer r10 = r3.BWf()
            com.instagram.model.rtc.RtcCallKey r9 = r3.AjW()
            com.instagram.model.rtc.RtcIgNotification r16 = r3.Bot()
            java.lang.Integer r8 = r3.BwQ()
            java.lang.String r7 = r3.BkA()
            X.0qQ.A0B(r10, r2)
            X.AnonymousClass7TG.A1P(r9, r8)
            X.0qQ.A0B(r7, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r10 != r1) goto L_0x038b
            if (r16 == 0) goto L_0x038b
            java.lang.String r1 = r9.A00
            r15 = r6
            r20 = r5
            r21 = r1
            r15.A03(r16, r17, r18, r19, r20, r21)
        L_0x0374:
            int r1 = r17.intValue()
            int r1 = 4 - r1
            if (r1 == 0) goto L_0x0388
            java.lang.String r2 = "background and dnd"
        L_0x037e:
            java.lang.String r1 = "ignore_reason"
            r0.CmF(r1, r2)
            r0.Ey1(r4)
            goto L_0x017a
        L_0x0388:
            java.lang.String r2 = "foreground and dnd"
            goto L_0x037e
        L_0x038b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r10 != r1) goto L_0x0374
            r10 = r6
            r11 = r1
            r12 = r8
            r13 = r7
            r14 = r18
            r15 = r19
            r16 = r5
            X.0xI r3 = X.1XB.A00(r9, r10, r11, r12, r13, r14, r15, r16)
            int r1 = r17.intValue()
            int r1 = 4 - r1
            if (r1 == 0) goto L_0x03b0
            java.lang.String r2 = "background and dnd"
        L_0x03a7:
            java.lang.String r1 = "reason"
            r3.A0C(r1, r2)
            X.1XC.A00(r3, r7)
            goto L_0x0374
        L_0x03b0:
            java.lang.String r2 = "foreground and dnd"
            goto L_0x03a7
        L_0x03b3:
            java.lang.Integer r17 = X.AnonymousClass05K.A0Y
            goto L_0x0347
        L_0x03b6:
            r4 = r22
            android.app.PendingIntent r19 = X.O2H.A00(r7, r4, r3)
            android.content.Context r8 = r6.A01
            java.lang.Class<com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService> r4 = com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService.class
            android.content.Intent r12 = X.C66580MXl.A0A(r8, r4)
            java.lang.String r4 = "DECLINE"
            r12.setAction(r4)
            r12.putExtras(r11)
            X.0Sy r11 = X.C66582MXn.A0K(r8, r12)
            X.2SP r4 = X.2SP.A01
            int r4 = r4.A03()
            int r4 = java.lang.Math.abs(r4)
            android.app.PendingIntent r20 = r11.A03(r8, r4, r2)
            X.AIZ r4 = r6.A04
            java.lang.String r24 = r3.BWc()
            boolean r27 = X.AnonymousClass7TF.A1V(r10)
            r18 = r4
            r25 = r9
            r26 = r5
            android.app.Notification r10 = r18.A04(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0173
        L_0x03f4:
            r10 = r5
        L_0x03f5:
            r9 = r5
            r23 = r5
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
