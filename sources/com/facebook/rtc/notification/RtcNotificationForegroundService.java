package com.facebook.rtc.notification;

import X.1Fs;
import X.AnonymousClass0fD;
import X.C62320sa;
import X.C70969OTq;
import X.C71004OWb;
import X.C74292PsK;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public final class RtcNotificationForegroundService extends Service {
    public C74292PsK A00;
    public C70969OTq A01;
    public Integer A02;
    public Integer A03;
    public C62320sa A04;
    public String A05;

    /* JADX WARNING: type inference failed for: r13v8, types: [X.AA2, androidx.core.app.NotificationCompat$CallStyle] */
    /* JADX WARNING: type inference failed for: r3v23, types: [X.AA2, androidx.core.app.NotificationCompat$CallStyle] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b0, code lost:
        if (r0 == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0386, code lost:
        if (r12 == null) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x038b, code lost:
        if (r12 != null) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r3.A00 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        if (r5 != 4) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ab, code lost:
        if (r3.getNotificationPolicy().priorityCallSenders != 0) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r41, X.C69662Npk r42, X.OYh r43, X.C68178N3t r44, com.meta.foa.session.FoaUserSession r45, java.lang.Integer r46, java.lang.String r47, int r48, boolean r49, boolean r50) {
        /*
            r40 = this;
            r2 = 1
            r32 = r43
            r0 = r32
            X.0qQ.A0B(r0, r2)
            r17 = 4
            X.OWb r4 = X.C71004OWb.A00
            java.lang.String r9 = "RtcNotificationForegroundService"
            java.lang.String r0 = "doUpdateOngoing"
            r8 = 0
            r4.A00(r9, r0)
            X.2LV r0 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r0)
            r15 = r42
            java.lang.Object r11 = r15.A00(r0)
            com.facebook.rsys.call.gen.CallModel r11 = (com.facebook.rsys.call.gen.CallModel) r11
            boolean r0 = X.C69724Nqo.A00(r11)
            if (r0 != 0) goto L_0x002d
            if (r49 == 0) goto L_0x0619
            boolean r0 = r11.inviteRequestedVideo
            if (r0 == 0) goto L_0x0619
        L_0x002d:
            r36 = 1
        L_0x002f:
            r1 = r40
            r33 = r47
            r38 = r48
            if (r49 == 0) goto L_0x0055
            if (r50 != 0) goto L_0x0055
            java.lang.String r3 = r1.A05
            r0 = r33
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0055
            java.lang.Integer r0 = r1.A02
            if (r0 == 0) goto L_0x0055
            int r3 = r0.intValue()
            r0 = r38
            if (r3 != r0) goto L_0x0055
            java.lang.String r0 = "Incoming notification already posted for this call. Skipping update."
            r4.A00(r9, r0)
        L_0x0054:
            return
        L_0x0055:
            java.lang.Integer r0 = r1.A02
            if (r0 != 0) goto L_0x0067
            X.OTq r3 = r1.A01
            if (r3 == 0) goto L_0x0067
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0067
            boolean r0 = r3.A00
            r28 = 0
            if (r0 == 0) goto L_0x0069
        L_0x0067:
            r28 = 1
        L_0x0069:
            r39 = r45
            if (r49 != 0) goto L_0x0077
            java.lang.String r3 = r1.A05
            r0 = r33
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x01b6
        L_0x0077:
            X.0qQ.A0A(r11)
            boolean r12 = X.OOY.A01(r1)
            java.lang.String r6 = "ig_direct_video_chat"
            r19 = 0
            java.lang.String r0 = "notification"
            java.lang.Object r3 = r1.getSystemService(r0)
            if (r3 == 0) goto L_0x07de
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            int r5 = r3.getCurrentInterruptionFilter()
            if (r5 == 0) goto L_0x009e
            if (r5 == r2) goto L_0x009e
            r0 = 2
            if (r5 == r0) goto L_0x018c
            r0 = 3
            if (r5 == r0) goto L_0x01b2
            r0 = r17
            if (r5 == r0) goto L_0x01b2
        L_0x009e:
            boolean r18 = X.OOY.A00(r1)
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r1.getSystemService(r0)
            r0 = 174(0xae, float:2.44E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            boolean r16 = r2.isBackgroundRestricted()
            java.lang.Object r3 = X.C66582MXn.A0o(r1)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            java.lang.String r0 = "power"
            java.lang.Object r2 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
            X.0qQ.A0C(r2, r0)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            boolean r0 = X.OOY.A01(r1)
            if (r0 != 0) goto L_0x0189
            boolean r0 = r3.isKeyguardLocked()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r2.isInteractive()
            if (r0 != 0) goto L_0x0189
        L_0x00dc:
            r10 = 1
        L_0x00dd:
            r7 = 2
            int[] r6 = new int[r7]
            r6 = {0, 1} // fill-array
            r5 = 0
        L_0x00e4:
            r2 = r6[r5]
            if (r2 == 0) goto L_0x013d
            r0 = 1
            if (r2 != r0) goto L_0x061d
            r0 = 3
            X.0qQ.A0B(r11, r0)
            r0 = r39
            X.PxB r3 = X.C69732NrH.A00(r11, r0)
            if (r3 == 0) goto L_0x012a
            java.lang.String r0 = "is_dnd"
            r3.CmG(r0, r12)
            boolean r2 = X.14i.A08()
            java.lang.String r0 = "is_background"
            r3.CmG(r0, r2)
            r13 = r18 ^ 1
            java.lang.String r0 = "is_ring_notif_enabled"
            r3.CmG(r0, r13)
            java.lang.String r0 = "should_expect_incoming_fullscreen"
            r3.CmG(r0, r10)
            if (r10 != 0) goto L_0x0118
            java.lang.String r0 = "incoming_call_screen_displayed"
            r3.Ey1(r0)
        L_0x0118:
            if (r19 == 0) goto L_0x0136
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "background and dnd"
        L_0x011e:
            java.lang.String r0 = "notif_displayed"
            if (r2 == 0) goto L_0x012f
            java.lang.String r13 = "ignore_reason"
            r3.CmF(r13, r2)
            r3.Ey1(r0)
        L_0x012a:
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x01b6
            goto L_0x00e4
        L_0x012f:
            r3.AIe(r0)
            goto L_0x012a
        L_0x0133:
            java.lang.String r2 = "foreground and dnd"
            goto L_0x011e
        L_0x0136:
            if (r18 == 0) goto L_0x013b
            java.lang.String r2 = "notifications disabled"
            goto L_0x011e
        L_0x013b:
            r2 = 0
            goto L_0x011e
        L_0x013d:
            r0 = 3
            X.0qQ.A0B(r11, r0)
            java.lang.String r3 = "Call ID "
            java.lang.String r2 = " | Call notification shown"
            r0 = r33
            java.lang.String r2 = X.002.A0g(r3, r0, r2)
            java.lang.String r0 = "CallNotificationLogger"
            r4.A00(r0, r2)
            if (r12 == 0) goto L_0x016d
            if (r49 == 0) goto L_0x016a
            X.NlA r3 = X.C69425NlA.A0s
        L_0x0156:
            java.lang.String r14 = r11.sharedCallId
            java.lang.String r2 = java.lang.String.valueOf(r28)
            java.lang.String r0 = "will_post_as_foreground"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r0, r2)
            r2 = r39
            r0 = r33
            X.OX3.A01(r3, r2, r0, r14, r13)
            goto L_0x012a
        L_0x016a:
            X.NlA r3 = X.C69425NlA.A1F
            goto L_0x0156
        L_0x016d:
            if (r18 == 0) goto L_0x0177
            if (r49 == 0) goto L_0x0174
            X.NlA r3 = X.C69425NlA.A0t
            goto L_0x0156
        L_0x0174:
            X.NlA r3 = X.C69425NlA.A1G
            goto L_0x0156
        L_0x0177:
            if (r16 == 0) goto L_0x0181
            if (r49 == 0) goto L_0x017e
            X.NlA r3 = X.C69425NlA.A0r
            goto L_0x0156
        L_0x017e:
            X.NlA r3 = X.C69425NlA.A1E
            goto L_0x0156
        L_0x0181:
            if (r49 == 0) goto L_0x0186
            X.NlA r3 = X.C69425NlA.A0u
            goto L_0x0156
        L_0x0186:
            X.NlA r3 = X.C69425NlA.A1H
            goto L_0x0156
        L_0x0189:
            r10 = 0
            goto L_0x00dd
        L_0x018c:
            android.app.NotificationChannel r0 = r3.getNotificationChannel(r6)
            if (r0 == 0) goto L_0x0197
            boolean r5 = r0.canBypassDnd()
            goto L_0x0198
        L_0x0197:
            r5 = 0
        L_0x0198:
            android.app.NotificationManager$Policy r0 = r3.getNotificationPolicy()     // Catch:{ SecurityException -> 0x01ad }
            int r0 = r0.priorityCategories     // Catch:{ SecurityException -> 0x01ad }
            r2 = 8
            r0 = r0 & 8
            if (r0 != r2) goto L_0x01ad
            android.app.NotificationManager$Policy r0 = r3.getNotificationPolicy()     // Catch:{ SecurityException -> 0x01ad }
            int r2 = r0.priorityCallSenders     // Catch:{ SecurityException -> 0x01ad }
            r0 = 1
            if (r2 == 0) goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r5 != 0) goto L_0x009e
            if (r0 != 0) goto L_0x009e
        L_0x01b2:
            r19 = 1
            goto L_0x009e
        L_0x01b6:
            r0 = r33
            r1.A05 = r0
            r5 = 1
            r19 = 2
            X.2LV r0 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r3 = r15.A00(r0)
            com.facebook.rsys.call.gen.CallModel r3 = (com.facebook.rsys.call.gen.CallModel) r3
            int r6 = r3.inCallState
            java.lang.String r0 = "buildNotification for InCallState: "
            java.lang.String r2 = X.002.A0O(r0, r6)
            java.lang.String r18 = "RtcNotificationCreator"
            r0 = r18
            r4.A00(r0, r2)
            r0 = r41
            if (r6 == 0) goto L_0x05db
            if (r6 == r5) goto L_0x04b1
            r2 = r19
            if (r6 == r2) goto L_0x0287
            r2 = r17
            if (r6 == r2) goto L_0x04b1
            r2 = 5
            if (r6 == r2) goto L_0x04b1
            r2 = 6
            if (r6 == r2) goto L_0x04b1
            r2 = 7
            if (r6 == r2) goto L_0x04b1
            r5 = 0
        L_0x01ef:
            if (r28 != 0) goto L_0x0226
            X.PsK r0 = r1.A00
            if (r0 != 0) goto L_0x0226
            java.lang.Integer r0 = r1.A02
            if (r0 != 0) goto L_0x0226
            java.lang.String r2 = "Not safe to start foreground. Registering callback."
            r0 = r8
            r4.A00(r9, r2)
            X.OTq r3 = r1.A01
            if (r3 == 0) goto L_0x0224
            r0 = 19
            X.Pln r2 = new X.Pln
            r2.<init>(r1, r0)
            boolean r0 = X.C70969OTq.A00(r3)
            if (r0 == 0) goto L_0x07e3
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0281
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0281
            java.util.Set r0 = r3.A04
            r0.add(r2)
            X.OmZ r0 = new X.OmZ
            r0.<init>(r3, r2)
        L_0x0222:
            X.PsK r0 = (X.C74292PsK) r0
        L_0x0224:
            r1.A00 = r0
        L_0x0226:
            if (r5 == 0) goto L_0x0054
            X.OTq r0 = r1.A01
            if (r0 == 0) goto L_0x024e
            java.lang.Integer r3 = r1.A03
            if (r3 == 0) goto L_0x024e
            int r2 = r3.intValue()
            r0 = r38
            if (r2 == r0) goto L_0x024e
            java.lang.Integer r0 = r1.A02
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x024e
            X.1Fs r0 = new X.1Fs
            r0.<init>(r1)
            int r2 = r3.intValue()
            android.app.NotificationManager r0 = r0.A00
            r0.cancel(r8, r2)
        L_0x024e:
            java.lang.Integer r0 = r1.A02
            if (r0 == 0) goto L_0x0273
            int r2 = r0.intValue()
            r0 = r38
            if (r2 != r0) goto L_0x0273
            r0 = r32
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0275
            if (r28 == 0) goto L_0x0275
        L_0x0262:
            java.lang.String r12 = "android.permission.RECORD_AUDIO"
            java.lang.String r7 = "android.permission.CAMERA"
            java.lang.String r2 = "Going foreground for notification id "
            r0 = r38
            java.lang.String r0 = X.002.A0O(r2, r0)
            r4.A00(r9, r0)
            goto L_0x0626
        L_0x0273:
            if (r28 != 0) goto L_0x0262
        L_0x0275:
            X.1Fs r2 = new X.1Fs
            r2.<init>(r1)
            r0 = r38
            r2.A00(r8, r0, r5)
            goto L_0x07d1
        L_0x0281:
            r2.invoke()
            X.Oma r0 = X.C71539Oma.A00
            goto L_0x0222
        L_0x0287:
            r2 = r32
            X.OZt r2 = r2.A01
            r27 = 1
            if (r36 != 0) goto L_0x0291
            r27 = 0
        L_0x0291:
            java.lang.String r25 = "ig_direct_video_chat"
            java.lang.String r26 = "incoming"
            com.instagram.common.session.UserSession r14 = r2.A01
            android.content.Intent r6 = X.C66583MXo.A08(r0, r14)
            r18 = 0
            r12 = 5
            r11 = 134217728(0x8000000, float:3.85186E-34)
            X.0Sy r10 = X.C66582MXn.A0K(r0, r6)
            r10.A09()
            X.0wb r7 = X.0wb.A01
            X.SqQ r6 = new X.SqQ
            r6.<init>(r7)
            r10.A08 = r6
            android.app.PendingIntent r20 = r10.A01(r0, r12, r11)
            r21 = r0
            r22 = r3
            r23 = r32
            r24 = r33
            X.9T8 r6 = X.OYh.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.N3t r10 = r2.A03()
            boolean r10 = r10.A08
            if (r10 == 0) goto L_0x02d9
            r10 = r32
            android.net.Uri r12 = r10.A00
            r10 = r19
            r6.A09(r12, r10)
            r10 = r32
            long[] r12 = r10.A03
            android.app.Notification r10 = r6.A0A
            r10.vibrate = r12
        L_0x02d9:
            r10 = r32
            boolean r10 = r10.A02
            if (r10 == 0) goto L_0x04ad
            if (r28 != 0) goto L_0x02f9
            X.N3t r10 = r2.A03()
            X.0sa r10 = r10.A05
            boolean r10 = X.C51971G9r.A1b(r10)
            if (r10 != 0) goto L_0x02f9
            X.N3t r10 = r2.A03()
            X.0sa r10 = r10.A00
            boolean r10 = X.C51971G9r.A1b(r10)
            if (r10 == 0) goto L_0x04ad
        L_0x02f9:
            r16 = 1
        L_0x02fb:
            java.lang.String r12 = r3.sharedCallId
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r10 = X.C71032OZt.A00(r2, r12)
            if (r10 != 0) goto L_0x0491
            java.lang.String r10 = "Incoming Fullscreen | No connection entity for call with server info data: "
            java.lang.String r12 = X.002.A0R(r10, r12)
            java.lang.String r10 = "IgRtcNotificationConfig"
            r4.A04(r10, r12, r8)
            android.content.Intent r10 = X.DbS.A09()
        L_0x0312:
            X.0Sy r12 = X.C66582MXn.A0K(r0, r10)
            r12.A09()
            X.SqQ r10 = new X.SqQ
            r10.<init>(r7)
            r12.A08 = r10
            r10 = r17
            android.app.PendingIntent r10 = r12.A01(r0, r10, r11)
            r6.A0D = r10
            r10 = 128(0x80, float:1.794E-43)
            X.AnonymousClass9T8.A01(r6, r10, r5)
            java.lang.String r10 = r3.sharedCallId
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r11 = X.C71032OZt.A00(r2, r10)
            if (r11 != 0) goto L_0x0478
            java.lang.String r11 = "Decline call | No connection entity for call with server info data: "
            java.lang.String r11 = X.002.A0R(r11, r10)
            java.lang.String r10 = "IgRtcNotificationConfig"
            r4.A04(r10, r11, r8)
            android.content.Intent r11 = X.DbS.A09()
        L_0x0344:
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            X.0Sy r11 = X.C66582MXn.A0K(r0, r11)
            r11.A09()
            X.0Pj r10 = X.0cQ.A00()
            r11.A00 = r10
            r11.A02 = r5
            r10 = r18
            r11.A03 = r10
            r11.A01 = r8
            X.SqQ r10 = new X.SqQ
            r10.<init>(r7)
            r11.A08 = r10
            android.app.PendingIntent r11 = r11.A02(r0, r5, r12)
            if (r27 != 0) goto L_0x0458
            r2.A03()
            r10 = r8
            java.lang.String r13 = r3.sharedCallId
            android.content.Intent r13 = r2.A02(r0, r13)
            r15 = 6
            X.0Sy r14 = X.C66582MXn.A0K(r0, r13)
            r14.A09()
            X.SqQ r13 = new X.SqQ
            r13.<init>(r7)
            r14.A08 = r13
            android.app.PendingIntent r12 = r14.A01(r0, r15, r12)
            r7 = r12
            if (r12 != 0) goto L_0x038d
        L_0x0388:
            r7 = r10
            if (r10 == 0) goto L_0x038d
            if (r12 != 0) goto L_0x038e
        L_0x038d:
            r10 = r8
        L_0x038e:
            if (r16 == 0) goto L_0x0409
            java.lang.String r12 = "Required value was null."
            if (r11 == 0) goto L_0x07f4
            if (r7 == 0) goto L_0x07ef
            r20 = 0
            java.lang.String r21 = r2.A05(r3)
            java.lang.String r3 = r3.sharedCallId
            if (r3 == 0) goto L_0x03b0
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r2 = X.C71032OZt.A00(r2, r3)
            if (r2 == 0) goto L_0x03b0
            java.lang.String r2 = r2.A0C
            if (r2 == 0) goto L_0x03b0
            int r2 = r2.length()
            if (r2 != 0) goto L_0x03b7
        L_0x03b0:
            r2 = 2131239376(0x7f0821d0, float:1.8095057E38)
            androidx.core.graphics.drawable.IconCompat r20 = androidx.core.graphics.drawable.IconCompat.A00(r0, r2)
        L_0x03b7:
            X.AH5 r2 = new X.AH5
            r19 = r2
            r22 = r8
            r23 = r8
            r24 = r18
            r25 = r18
            r19.<init>(r20, r21, r22, r23, r24, r25)
            androidx.core.app.NotificationCompat$CallStyle r3 = new androidx.core.app.NotificationCompat$CallStyle
            r3.<init>()
            java.lang.CharSequence r12 = r2.A01
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x07e8
            r3.A00 = r5
            r3.A04 = r2
            r3.A01 = r7
            r3.A02 = r11
            r3.A03 = r8
            r2 = 2131099989(0x7f060155, float:1.7812347E38)
            int r2 = r0.getColor(r2)
            r6.A01 = r2
            r6.A0A(r3)
            if (r10 == 0) goto L_0x03fa
            r5 = 2131238979(0x7f082043, float:1.8094252E38)
            r2 = 2131972453(0x7f135165, float:1.9581914E38)
            java.lang.String r0 = r0.getString(r2)
        L_0x03f5:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.A06(r10, r0, r5)
        L_0x03fa:
            android.app.Notification r5 = r6.A03()
            X.0qQ.A07(r5)
            int r0 = r5.flags
            r0 = r0 | 4
            r5.flags = r0
            goto L_0x01ef
        L_0x0409:
            java.lang.String r25 = r2.A05(r3)
            java.lang.String r26 = r2.A04(r3)
            r21 = r10
            r22 = r0
            r23 = r6
            r24 = r2
            r19 = r11
            r20 = r7
            boolean r2 = X.C69731NrG.A00(r19, r20, r21, r22, r23, r24, r25, r26)
            if (r2 != 0) goto L_0x03fa
            r2 = 2131099989(0x7f060155, float:1.7812347E38)
            int r2 = r0.getColor(r2)
            r6.A01 = r2
            r3 = 2131100740(0x7f060444, float:1.781387E38)
            r2 = 2131972455(0x7f135167, float:1.9581918E38)
            android.text.SpannableString r3 = X.OYh.A00(r0, r3, r2)
            r2 = r18
            r6.A06(r11, r3, r2)
            r5 = 2131231255(0x7f080217, float:1.8078586E38)
            r3 = 2131100739(0x7f060443, float:1.7813868E38)
            r2 = 2131972451(0x7f135163, float:1.958191E38)
            android.text.SpannableString r2 = X.OYh.A00(r0, r3, r2)
            r6.A06(r7, r2, r5)
            if (r10 == 0) goto L_0x03fa
            r5 = 2131238979(0x7f082043, float:1.8094252E38)
            r2 = 2131972454(0x7f135166, float:1.9581916E38)
            android.text.SpannableString r0 = X.OYh.A00(r0, r3, r2)
            goto L_0x03f5
        L_0x0458:
            java.lang.String r10 = r3.sharedCallId
            android.content.Intent r10 = r2.A02(r0, r10)
            X.0Sy r10 = X.C66582MXn.A0K(r0, r10)
            r10.A09()
            X.SqQ r13 = new X.SqQ
            r13.<init>(r7)
            r10.A08 = r13
            r7 = r19
            android.app.PendingIntent r10 = r10.A01(r0, r7, r12)
            r2.A03()
            r12 = r8
            goto L_0x0388
        L_0x0478:
            android.os.Bundle r12 = X.AnonymousClass7TE.A0a()
            java.lang.String r10 = "com.instagram.rtc.notifications.service.entity"
            r12.putParcelable(r10, r11)
            java.lang.Class<com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver> r10 = com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver.class
            android.content.Intent r11 = X.C66580MXl.A0A(r0, r10)
            java.lang.String r10 = "DECLINE"
            r11.setAction(r10)
            r11.putExtras(r12)
            goto L_0x0344
        L_0x0491:
            X.OEO r12 = X.O26.A00(r14)
            java.lang.Long r13 = r10.A09
            X.Pvr r12 = r12.A01
            X.PxB r22 = r12.BWh(r13)
            X.OZB r20 = X.OZB.A00
            X.1X9 r12 = r2.A02
            r23 = r14
            r24 = r12
            r25 = r10
            android.content.Intent r10 = r20.A01(r21, r22, r23, r24, r25)
            goto L_0x0312
        L_0x04ad:
            r16 = 0
            goto L_0x02fb
        L_0x04b1:
            X.2LV r2 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r2)
            java.lang.Object r6 = r15.A00(r2)
            com.facebook.rsys.call.gen.CallModel r6 = (com.facebook.rsys.call.gen.CallModel) r6
            r2 = r32
            X.OZt r3 = r2.A01
            com.instagram.common.session.UserSession r10 = r3.A01
            android.content.Intent r2 = X.C66583MXo.A08(r0, r10)
            r12 = 5
            r15 = 134217728(0x8000000, float:3.85186E-34)
            X.0Sy r11 = X.C66582MXn.A0K(r0, r2)
            r11.A09()
            X.0wb r2 = X.0wb.A01
            X.SqQ r7 = new X.SqQ
            r7.<init>(r2)
            r11.A08 = r7
            android.app.PendingIntent r16 = r11.A01(r0, r12, r15)
            java.lang.String r34 = "ig_other"
            java.lang.String r35 = "ongoing"
            r29 = r16
            r30 = r0
            r31 = r6
            r37 = r28
            X.9T8 r7 = X.OYh.A01(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r12 = 2131099989(0x7f060155, float:1.7812347E38)
            int r11 = r0.getColor(r12)
            r7.A01 = r11
            r7.A0d = r5
            r7.A0e = r5
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            java.lang.String r13 = r10.A06
            java.lang.String r10 = "com.instagram.rtc.notifications.service.recipient"
            r11.putString(r10, r13)
            java.lang.Class<com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver> r10 = com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver.class
            android.content.Intent r10 = X.C66580MXl.A0A(r0, r10)
            java.lang.String r13 = "LEAVE"
            r10.setAction(r13)
            r10.putExtras(r11)
            r11 = 0
            r14 = 3
            X.0Sy r13 = X.C66582MXn.A0K(r0, r10)
            r13.A09()
            X.0Pj r10 = X.0cQ.A00()
            r13.A00 = r10
            r13.A02 = r5
            r13.A03 = r11
            r13.A01 = r8
            X.SqQ r10 = new X.SqQ
            r10.<init>(r2)
            r13.A08 = r10
            android.app.PendingIntent r10 = r13.A02(r0, r14, r15)
            X.N3t r2 = r3.A03()
            X.0sa r2 = r2.A00
            boolean r14 = X.C51971G9r.A1b(r2)
            r2 = r32
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x05bf
            if (r28 != 0) goto L_0x0547
            if (r14 == 0) goto L_0x05bf
        L_0x0547:
            if (r10 == 0) goto L_0x0800
            r21 = 0
            java.lang.String r22 = r3.A05(r6)
            java.lang.String r2 = r6.sharedCallId
            if (r2 == 0) goto L_0x0563
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r2 = X.C71032OZt.A00(r3, r2)
            if (r2 == 0) goto L_0x0563
            java.lang.String r2 = r2.A0C
            if (r2 == 0) goto L_0x0563
            int r2 = r2.length()
            if (r2 != 0) goto L_0x056a
        L_0x0563:
            r2 = 2131239376(0x7f0821d0, float:1.8095057E38)
            androidx.core.graphics.drawable.IconCompat r21 = androidx.core.graphics.drawable.IconCompat.A00(r0, r2)
        L_0x056a:
            X.AH5 r2 = new X.AH5
            r23 = r8
            r24 = r8
            r25 = r11
            r26 = r11
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            androidx.core.app.NotificationCompat$CallStyle r13 = new androidx.core.app.NotificationCompat$CallStyle
            r13.<init>()
            java.lang.CharSequence r3 = r2.A01
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x07f9
            r3 = r19
            r13.A00 = r3
            r13.A04 = r2
            r13.A01 = r8
            r13.A02 = r8
            r13.A03 = r10
            int r0 = r0.getColor(r12)
            r7.A01 = r0
            r7.A0A(r13)
            if (r14 == 0) goto L_0x05a6
            r0 = r16
            r7.A0D = r0
            r0 = 128(0x80, float:1.794E-43)
            X.AnonymousClass9T8.A01(r7, r0, r11)
        L_0x05a6:
            long r2 = r6.callConnectedTimestampMs
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ca
            long r10 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r10
            long r10 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r10
            android.app.Notification r0 = r7.A0A
            r0.when = r2
            r7.A0k = r5
            goto L_0x05ca
        L_0x05bf:
            r2 = 2131972457(0x7f135169, float:1.9581922E38)
            java.lang.String r0 = r0.getString(r2)
            r7.A06(r10, r0, r11)
            goto L_0x05a6
        L_0x05ca:
            android.app.Notification r5 = r7.A03()     // Catch:{ NullPointerException -> 0x05d0 }
            goto L_0x01ef
        L_0x05d0:
            r3 = move-exception
            java.lang.String r2 = "buildOngoingNotification"
            r0 = r18
            r4.A02(r0, r2, r3)
            r5 = 0
            goto L_0x01ef
        L_0x05db:
            java.lang.String r23 = "ig_other"
            java.lang.String r24 = "idle"
            r25 = 0
            r2 = r32
            X.OZt r2 = r2.A01
            com.instagram.common.session.UserSession r2 = r2.A01
            android.content.Intent r2 = X.C66583MXo.A08(r0, r2)
            r10 = 5
            r7 = 134217728(0x8000000, float:3.85186E-34)
            X.0Sy r6 = X.C66582MXn.A0K(r0, r2)
            r6.A09()
            X.0wb r5 = X.0wb.A01
            X.SqQ r2 = new X.SqQ
            r2.<init>(r5)
            r6.A08 = r2
            android.app.PendingIntent r18 = r6.A01(r0, r10, r7)
            r19 = r0
            r20 = r3
            r21 = r32
            r22 = r33
            r26 = r25
            X.9T8 r0 = X.OYh.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.app.Notification r5 = r0.A03()
            X.0qQ.A07(r5)
            goto L_0x01ef
        L_0x0619:
            r36 = 0
            goto L_0x002f
        L_0x061d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.IllegalArgumentException r5 = X.DbZ.A0Z(r0)
            throw r5
        L_0x0626:
            r6 = r44
            X.1Fs r0 = new X.1Fs     // Catch:{ Exception -> 0x06c3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06c3 }
            android.app.NotificationManager r10 = r0.A00     // Catch:{ Exception -> 0x06c3 }
            android.service.notification.StatusBarNotification[] r0 = r10.getActiveNotifications()     // Catch:{ Exception -> 0x06c3 }
            if (r0 != 0) goto L_0x0655
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x06c3 }
        L_0x0639:
            X.0qQ.A07(r11)     // Catch:{ Exception -> 0x06c3 }
            java.lang.String r2 = "number of active notifications "
            int r0 = r11.size()     // Catch:{ Exception -> 0x06c3 }
            java.lang.String r0 = X.002.A0O(r2, r0)     // Catch:{ Exception -> 0x06c3 }
            r4.A00(r9, r0)     // Catch:{ Exception -> 0x06c3 }
            int r0 = r11.size()     // Catch:{ Exception -> 0x06c3 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x06c3 }
            X.0sa r0 = r6.A02     // Catch:{ Exception -> 0x06c3 }
            long r13 = X.JTR.A0O(r0)     // Catch:{ Exception -> 0x06c3 }
            goto L_0x065a
        L_0x0655:
            java.util.List r11 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x06c3 }
            goto L_0x0639
        L_0x065a:
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x06c9
            X.0sa r0 = r6.A03     // Catch:{ Exception -> 0x06c3 }
            boolean r0 = X.C51971G9r.A1b(r0)     // Catch:{ Exception -> 0x06c3 }
            if (r0 == 0) goto L_0x06c9
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x06c3 }
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x06c3 }
            if (r0 != 0) goto L_0x0672
            r3 = 0
            goto L_0x069a
        L_0x0672:
            java.lang.Object r3 = r11.next()     // Catch:{ Exception -> 0x06c3 }
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x06c3 }
            if (r0 == 0) goto L_0x069a
            r0 = r3
            android.service.notification.StatusBarNotification r0 = (android.service.notification.StatusBarNotification) r0     // Catch:{ Exception -> 0x06c3 }
            long r15 = r0.getPostTime()     // Catch:{ Exception -> 0x06c3 }
        L_0x0683:
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x06c3 }
            r0 = r2
            android.service.notification.StatusBarNotification r0 = (android.service.notification.StatusBarNotification) r0     // Catch:{ Exception -> 0x06c3 }
            long r13 = r0.getPostTime()     // Catch:{ Exception -> 0x06c3 }
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0694
            r3 = r2
            r15 = r13
        L_0x0694:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x06c3 }
            if (r0 != 0) goto L_0x0683
        L_0x069a:
            android.service.notification.StatusBarNotification r3 = (android.service.notification.StatusBarNotification) r3     // Catch:{ Exception -> 0x06c3 }
            if (r3 == 0) goto L_0x06c9
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x06c3 }
            java.lang.String r0 = "cancel oldest notification {"
            r2.append(r0)     // Catch:{ Exception -> 0x06c3 }
            android.app.Notification r0 = r3.getNotification()     // Catch:{ Exception -> 0x06c3 }
            r2.append(r0)     // Catch:{ Exception -> 0x06c3 }
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.C51967G9n.A0r(r2, r0)     // Catch:{ Exception -> 0x06c3 }
            r4.A00(r9, r0)     // Catch:{ Exception -> 0x06c3 }
            java.lang.String r2 = r3.getTag()     // Catch:{ Exception -> 0x06c3 }
            int r0 = r3.getId()     // Catch:{ Exception -> 0x06c3 }
            r10.cancel(r2, r0)     // Catch:{ Exception -> 0x06c3 }
            goto L_0x06c9
        L_0x06c3:
            r2 = move-exception
            java.lang.String r0 = "DeadSystemException when getting active notifications"
            r4.A02(r9, r0, r2)
        L_0x06c9:
            java.lang.String r11 = "reason"
            r3 = 0
            r10 = r46
            if (r46 == 0) goto L_0x071a
            int r13 = r10.intValue()     // Catch:{ IllegalStateException -> 0x078e }
            boolean r2 = A00(r7, r13)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r0 = "not_present"
            if (r2 == 0) goto L_0x06dd
            goto L_0x06df
        L_0x06dd:
            r7 = r0
            goto L_0x06e7
        L_0x06df:
            int r2 = X.C9157RRi.A00(r1, r7)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalStateException -> 0x078e }
        L_0x06e7:
            boolean r2 = A00(r12, r13)     // Catch:{ IllegalStateException -> 0x078e }
            if (r2 == 0) goto L_0x06f5
            int r0 = X.C9157RRi.A00(r1, r12)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalStateException -> 0x078e }
        L_0x06f5:
            java.lang.StringBuilder r12 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r2 = "PermissionChecker result for current FGS types: Camera: "
            r12.append(r2)     // Catch:{ IllegalStateException -> 0x078e }
            r12.append(r7)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r2 = ", Mic: "
            r12.append(r2)     // Catch:{ IllegalStateException -> 0x078e }
            r12.append(r0)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r2 = " supportedForegroundServiceType "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r10, r2, r12)     // Catch:{ IllegalStateException -> 0x078e }
            r4.A00(r9, r2)     // Catch:{ IllegalStateException -> 0x078e }
            r2 = r38
            r1.startForeground(r2, r5, r13)     // Catch:{ SecurityException -> 0x0718 }
            goto L_0x0786
        L_0x0718:
            r2 = move-exception
            goto L_0x0725
        L_0x071a:
            java.lang.String r0 = "start foreground"
            r4.A00(r9, r0)     // Catch:{ IllegalStateException -> 0x078e }
            r0 = r38
            r1.startForeground(r0, r5)     // Catch:{ IllegalStateException -> 0x078e }
            goto L_0x0786
        L_0x0725:
            X.NlA r12 = X.C69425NlA.A0l     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r13 = "fgs_type_crash"
            X.0eP r18 = X.AnonymousClass7TE.A1L(r11, r13)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r13 = "trace"
            java.lang.String r11 = X.2Og.A00(r2)     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP r19 = X.AnonymousClass7TE.A1L(r13, r11)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r11 = "fgs_type"
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP r20 = X.AnonymousClass7TE.A1L(r11, r10)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r11 = "is_incoming"
            java.lang.String r10 = java.lang.String.valueOf(r49)     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP r21 = X.AnonymousClass7TE.A1L(r11, r10)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r10 = "camera_permission_result"
            java.lang.String r7 = r7.toString()     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP r22 = X.AnonymousClass7TE.A1L(r10, r7)     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r7 = "mic_permission_result"
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP r23 = X.AnonymousClass7TE.A1L(r7, r0)     // Catch:{ IllegalStateException -> 0x078e }
            X.0eP[] r0 = new X.0eP[]{r18, r19, r20, r21, r22, r23}     // Catch:{ IllegalStateException -> 0x078e }
            java.util.LinkedHashMap r10 = X.0Yt.A06(r0)     // Catch:{ IllegalStateException -> 0x078e }
            r7 = r39
            r0 = r33
            X.OX3.A01(r12, r7, r0, r8, r10)     // Catch:{ IllegalStateException -> 0x078e }
            boolean r0 = r6.A06     // Catch:{ IllegalStateException -> 0x078e }
            if (r0 == 0) goto L_0x078d
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalStateException -> 0x078e }
            java.lang.String r0 = "start foreground with exception "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r7)     // Catch:{ IllegalStateException -> 0x078e }
            r4.A00(r9, r0)     // Catch:{ IllegalStateException -> 0x078e }
            r2 = r38
            r0 = r17
            r1.startForeground(r2, r5, r0)     // Catch:{ IllegalStateException -> 0x078e }
        L_0x0786:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r38)     // Catch:{ IllegalStateException -> 0x078e }
            r1.A02 = r0     // Catch:{ IllegalStateException -> 0x078e }
            goto L_0x07d1
        L_0x078d:
            throw r2     // Catch:{ IllegalStateException -> 0x078e }
        L_0x078e:
            r5 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Fail to go foreground exception "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r2)
            r4.A04(r9, r0, r8)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r2 < r0) goto L_0x07e2
            boolean r0 = r5 instanceof android.app.ForegroundServiceStartNotAllowedException
            if (r0 == 0) goto L_0x07e2
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x07e2
            X.0sP r2 = X.O52.A01
            r0 = r33
            java.lang.Object r0 = r2.invoke(r0)
            X.NCY r0 = (X.NCY) r0
            if (r0 == 0) goto L_0x07d8
            com.facebook.rsys.callmanager.gen.CallApi r3 = r0.A00()
        L_0x07ba:
            X.NlA r4 = X.C69425NlA.A0l
            r2 = r39
            r0 = r33
            X.OX3.A01(r4, r2, r0, r8, r8)
            if (r3 == 0) goto L_0x07d1
            r4 = 10
            r2 = r49 ^ 1
            java.lang.String r0 = "foreground_service_start_error"
            r3.end(r4, r0, r2)
            r3.removeWhenEnded()
        L_0x07d1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r38)
            r1.A03 = r0
            return
        L_0x07d8:
            java.lang.String r0 = "Unable to end call because of null call API"
            r4.A00(r9, r0)
            goto L_0x07ba
        L_0x07de:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0y()
        L_0x07e2:
            throw r5
        L_0x07e3:
            java.lang.IllegalStateException r5 = X.DbT.A0m()
            throw r5
        L_0x07e8:
            java.lang.String r0 = "person must have a non-empty a name"
            java.lang.IllegalArgumentException r5 = X.AnonymousClass7TE.A0w(r0)
            throw r5
        L_0x07ef:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0z(r12)
            throw r5
        L_0x07f4:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0z(r12)
            throw r5
        L_0x07f9:
            java.lang.String r0 = "person must have a non-empty a name"
            java.lang.IllegalArgumentException r5 = X.AnonymousClass7TE.A0w(r0)
            throw r5
        L_0x0800:
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0y()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.notification.RtcNotificationForegroundService.A01(android.content.Context, X.Npk, X.OYh, X.N3t, com.meta.foa.session.FoaUserSession, java.lang.Integer, java.lang.String, int, boolean, boolean):void");
    }

    public static final boolean A00(String str, int i) {
        int i2;
        int i3;
        if (str.equals("android.permission.CAMERA")) {
            i2 = 64;
            i3 = i & 64;
        } else if (!str.equals("android.permission.RECORD_AUDIO")) {
            return false;
        } else {
            i2 = 128;
            i3 = i & 128;
        }
        if (i3 == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Binder, X.Mrm, android.os.IBinder] */
    public final IBinder onBind(Intent intent) {
        ? binder = new Binder();
        binder.A00 = this;
        return binder;
    }

    public final boolean onUnbind(Intent intent) {
        C71004OWb.A00.A00("RtcNotificationForegroundService", "onUnbind");
        return super.onUnbind(intent);
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(1158380320);
        super.onCreate();
        AnonymousClass0fD.A0B(1995320425, A042);
    }

    public final void onDestroy() {
        Integer num;
        int A042 = AnonymousClass0fD.A04(1081384214);
        C71004OWb.A00.A00("RtcNotificationForegroundService", "onDestroy");
        super.onDestroy();
        if (!(this.A01 == null || (num = this.A03) == null)) {
            new 1Fs(this).A00.cancel((String) null, num.intValue());
        }
        C74292PsK psK = this.A00;
        if (psK != null) {
            psK.cancel();
        }
        AnonymousClass0fD.A0B(-302414855, A042);
    }
}
