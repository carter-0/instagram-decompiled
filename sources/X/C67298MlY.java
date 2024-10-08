package X;

import android.content.Intent;
import android.os.PowerManager;

/* renamed from: X.MlY  reason: case insensitive filesystem */
public final class C67298MlY extends 0ng {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ PowerManager.WakeLock A01;
    public final /* synthetic */ C67297MlX A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67298MlY(Intent intent, PowerManager.WakeLock wakeLock, C67297MlX mlX, int i, boolean z) {
        super(53, i, false, z);
        this.A02 = mlX;
        this.A00 = intent;
        this.A01 = wakeLock;
    }

    /* JADX WARNING: type inference failed for: r2v36, types: [java.lang.Object, X.6Bt] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0222, code lost:
        if (X.0qQ.A0K(r7.A06, r8.A0j) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0198, code lost:
        if (r3 != null) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b6 A[Catch:{ Exception -> 0x02c8, all -> 0x03df }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c2 A[Catch:{ Exception -> 0x02c8, all -> 0x03df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r32 = r33
            r0 = r32
            X.MlX r4 = r0.A02     // Catch:{ all -> 0x03df }
            android.content.Intent r5 = r0.A00     // Catch:{ all -> 0x03df }
            r8 = 0
            com.facebook.quicklog.QuickPerformanceLogger r1 = r4.A02     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x0015
            r2 = 875309620(0x342c2a34, float:1.6034102E-7)
            java.lang.String r0 = "intent_processing"
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x03df }
        L_0x0015:
            X.0lg r7 = r4.A04     // Catch:{ all -> 0x03df }
            X.0Tu r22 = X.0Tu.A05     // Catch:{ all -> 0x03df }
            r2 = 36321335832290592(0x810a10000d2520, double:3.033097262396226E-306)
            r0 = r22
            boolean r11 = X.182.A06(r0, r7, r2)     // Catch:{ all -> 0x03df }
            r2 = 36321335832421665(0x810a10000f2521, double:3.033097262479117E-306)
            boolean r12 = X.182.A06(r0, r7, r2)     // Catch:{ all -> 0x03df }
            com.facebook.quicklog.QuickPerformanceLogger r2 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()     // Catch:{ all -> 0x03df }
            java.lang.String r6 = r5.getAction()     // Catch:{ all -> 0x03df }
            r0 = 875309620(0x342c2a34, float:1.6034102E-7)
            if (r2 == 0) goto L_0x003f
            java.lang.String r3 = "intent_action"
            r2.markerAnnotate(r0, r3, r6)     // Catch:{ all -> 0x03df }
        L_0x003f:
            java.lang.String r3 = "com.facebook.rti.fbns.intent.RECEIVE"
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x03df }
            r9 = 3
            if (r3 != 0) goto L_0x004d
            if (r2 == 0) goto L_0x03d7
            java.lang.String r1 = "invalid_action"
            goto L_0x007d
        L_0x004d:
            java.lang.String r3 = "receive_type"
            java.lang.String r10 = r5.getStringExtra(r3)     // Catch:{ all -> 0x03df }
            java.lang.String r6 = "push_renew_trigger"
            boolean r3 = r5.hasExtra(r6)     // Catch:{ all -> 0x03df }
            if (r3 == 0) goto L_0x0060
            java.lang.String r14 = r5.getStringExtra(r6)     // Catch:{ all -> 0x03df }
            goto L_0x0062
        L_0x0060:
            java.lang.String r14 = "unknown"
        L_0x0062:
            if (r2 == 0) goto L_0x006e
            java.lang.String r3 = "intent_message_type"
            r2.markerAnnotate(r0, r3, r10)     // Catch:{ all -> 0x03df }
            java.lang.String r3 = "intent_trigger"
            r2.markerAnnotate(r0, r3, r14)     // Catch:{ all -> 0x03df }
        L_0x006e:
            r6 = 0
            if (r11 == 0) goto L_0x0085
            android.content.Context r3 = r4.A00     // Catch:{ all -> 0x03df }
            boolean r3 = X.AnonymousClass0Ph.A00(r3, r5)     // Catch:{ all -> 0x03df }
            if (r3 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x03d7
            java.lang.String r1 = "sender_not_preload_fbns"
        L_0x007d:
            r2.markerPoint(r0, r1)     // Catch:{ all -> 0x03df }
            r2.markerEnd(r0, r9)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x0085:
            java.lang.Object r11 = X.AnonymousClass3RD.A00     // Catch:{ all -> 0x03df }
            X.3RX r11 = (X.AnonymousClass3RX) r11     // Catch:{ all -> 0x03df }
            X.3Rv r3 = r4.A03     // Catch:{ all -> 0x03df }
            X.5Da r3 = r11.A00(r5, r3)     // Catch:{ all -> 0x03df }
            boolean r3 = r3.CeP()     // Catch:{ all -> 0x03df }
            if (r3 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = "sender_not_verified"
            r2.markerPoint(r0, r1)     // Catch:{ all -> 0x03df }
            r2.markerEnd(r0, r9)     // Catch:{ all -> 0x03df }
        L_0x009f:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x03df }
            java.lang.String r1 = "data"
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x00ae
            r2.put(r1, r0)     // Catch:{ all -> 0x03df }
        L_0x00ae:
            java.lang.String r1 = "INVALID_SENDER"
            java.lang.String r0 = "onMessage"
            X.C67297MlX.A00(r0, r1, r6)     // Catch:{ all -> 0x03df }
            android.content.Context r0 = r4.A00     // Catch:{ all -> 0x03df }
            X.AnonymousClass3R7.A01(r0, r5, r1)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x00bc:
            java.lang.String r3 = "message"
            boolean r3 = r3.equals(r10)     // Catch:{ all -> 0x03df }
            java.lang.String r11 = "token_key"
            if (r3 == 0) goto L_0x02e7
            java.lang.String r2 = "token"
            java.lang.String r7 = r5.getStringExtra(r2)     // Catch:{ all -> 0x03df }
            java.lang.String r2 = "extra_notification_id"
            r5.getStringExtra(r2)     // Catch:{ all -> 0x03df }
            if (r12 != 0) goto L_0x011c
            X.45J r3 = r4.A01     // Catch:{ all -> 0x03df }
            java.lang.String r2 = ""
            X.45I r3 = (X.AnonymousClass45I) r3     // Catch:{ all -> 0x03df }
            java.lang.String r3 = r3.getString(r11, r2)     // Catch:{ all -> 0x03df }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x03df }
            if (r2 != 0) goto L_0x010d
            boolean r2 = r3.equals(r7)     // Catch:{ all -> 0x03df }
            if (r2 != 0) goto L_0x010d
            java.lang.String r1 = "FBNSProcessor"
            java.lang.String r0 = "Dropping unintended message."
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x03df }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x03df }
            java.lang.String r1 = "data"
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x00ff
            r2.put(r1, r0)     // Catch:{ all -> 0x03df }
        L_0x00ff:
            java.lang.String r1 = "TOKEN_MISMATCH"
            java.lang.String r0 = "onMessage"
            X.C67297MlX.A00(r0, r1, r6)     // Catch:{ all -> 0x03df }
            android.content.Context r0 = r4.A00     // Catch:{ all -> 0x03df }
            X.AnonymousClass3R7.A01(r0, r5, r1)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x010d:
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x03df }
            java.lang.String r3 = "data"
            java.lang.String r2 = r5.getStringExtra(r3)     // Catch:{ all -> 0x03df }
            if (r2 == 0) goto L_0x011c
            r7.put(r3, r2)     // Catch:{ all -> 0x03df }
        L_0x011c:
            if (r1 == 0) goto L_0x0123
            java.lang.String r2 = "on_message"
            r1.markerPoint(r0, r2)     // Catch:{ all -> 0x03df }
        L_0x0123:
            r10 = 0
            X.5HJ r2 = X.AnonymousClass5HJ.A00(r5, r6, r8)     // Catch:{ IOException -> 0x012c }
            if (r2 == 0) goto L_0x012c
            java.lang.String r10 = r2.A0j     // Catch:{ Exception -> 0x02c8 }
        L_0x012c:
            X.69F r11 = X.AnonymousClass69E.A00(r10)     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x02c8 }
            long r20 = r11.ExJ(r2)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r7 = "FbnsPushNotificationProcessor"
            r2 = r20
            r11.Eac(r7, r2)     // Catch:{ Exception -> 0x02c8 }
            com.facebook.pushlite.model.PushInfraMetaData$Companion r2 = com.facebook.pushlite.model.PushInfraMetaData.Companion     // Catch:{ Exception -> 0x02c8 }
            com.facebook.pushlite.model.PushInfraMetaData r11 = r2.A01(r5)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "FBNS"
            X.5HJ r8 = X.AnonymousClass5HJ.A00(r5, r2, r8)     // Catch:{ IOException -> 0x0151 }
            if (r8 == 0) goto L_0x0152
            r2 = r20
            X.MZZ.A00(r8, r2)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x0152
        L_0x0151:
            r8 = 0
        L_0x0152:
            r7 = 0
            if (r10 == 0) goto L_0x0159
            com.instagram.common.session.UserSession r7 = X.AnonymousClass5HM.A00(r10)     // Catch:{ Exception -> 0x02c8 }
        L_0x0159:
            if (r1 == 0) goto L_0x0160
            java.lang.String r2 = "received_logging"
            r1.markerPoint(r0, r2)     // Catch:{ Exception -> 0x02c8 }
        L_0x0160:
            com.instagram.common.notifications.push.intf.PushChannelType r19 = com.instagram.common.notifications.push.intf.PushChannelType.FBNS     // Catch:{ Exception -> 0x02c8 }
            X.0qQ.A0B(r11, r9)     // Catch:{ Exception -> 0x02c8 }
            if (r8 == 0) goto L_0x0244
            java.lang.String r10 = r19.toString()     // Catch:{ Exception -> 0x02c8 }
            if (r7 == 0) goto L_0x0183
            X.6Bt r2 = X.C304006Bs.A00(r7)     // Catch:{ Exception -> 0x02c8 }
        L_0x0171:
            java.lang.String r3 = r8.A0w     // Catch:{ Exception -> 0x02c8 }
            if (r3 != 0) goto L_0x019a
            java.lang.String r12 = r8.A0X     // Catch:{ Exception -> 0x02c8 }
            if (r12 == 0) goto L_0x0196
            java.lang.String r3 = "direct_v2_delete_item"
            boolean r3 = r12.equals(r3)     // Catch:{ Exception -> 0x02c8 }
            if (r3 == 0) goto L_0x0196
            goto L_0x0205
        L_0x0183:
            X.0wX r3 = X.C61170le.A00     // Catch:{ Exception -> 0x02c8 }
            X.0kM r2 = new X.0kM     // Catch:{ Exception -> 0x02c8 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x02c8 }
            X.0wc r3 = r2.A00()     // Catch:{ Exception -> 0x02c8 }
            X.6Bt r2 = new X.6Bt     // Catch:{ Exception -> 0x02c8 }
            r2.<init>()     // Catch:{ Exception -> 0x02c8 }
            r2.A00 = r3     // Catch:{ Exception -> 0x02c8 }
            goto L_0x0171
        L_0x0196:
            java.lang.String r3 = r8.A11     // Catch:{ Exception -> 0x02c8 }
            if (r3 == 0) goto L_0x0205
        L_0x019a:
            java.lang.String r14 = r8.A1G     // Catch:{ Exception -> 0x02c8 }
            if (r14 != 0) goto L_0x01a0
            java.lang.String r14 = r8.A1F     // Catch:{ Exception -> 0x02c8 }
        L_0x01a0:
            X.0Ae r2 = r2.A00     // Catch:{ Exception -> 0x02c8 }
            if (r2 == 0) goto L_0x023a
            X.1Ln r13 = X.1Ln.A0K(r2)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r18 = "notif_received_push"
            java.lang.String r12 = r11.A05     // Catch:{ Exception -> 0x02c8 }
            if (r12 != 0) goto L_0x01b0
            java.lang.String r12 = "0"
        L_0x01b0:
            java.lang.Long r2 = r11.A00     // Catch:{ Exception -> 0x02c8 }
            if (r2 == 0) goto L_0x0202
            long r16 = r2.longValue()     // Catch:{ Exception -> 0x02c8 }
        L_0x01b8:
            java.lang.String r2 = r11.A06     // Catch:{ Exception -> 0x02c8 }
            r15 = r2
            boolean r2 = X.C282435Db.A01(r11)     // Catch:{ Exception -> 0x02c8 }
            if (r2 == 0) goto L_0x01ee
            java.lang.String r2 = "notif_id"
            r13.A0R(r2, r15)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "message_id"
            r13.A0R(r2, r6)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "notif_event"
            r15 = r18
            r13.A0R(r2, r15)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "channel"
            r13.A0R(r2, r10)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "notif_type"
            r13.A0R(r2, r3)     // Catch:{ Exception -> 0x02c8 }
            r2 = r16
            X.C66583MXo.A19(r13, r11, r12, r2)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "extra_info"
            r13.A0R(r2, r6)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = "thread_id"
            r13.A0R(r2, r14)     // Catch:{ Exception -> 0x02c8 }
            r13.Cgf()     // Catch:{ Exception -> 0x02c8 }
        L_0x01ee:
            X.MlP r23 = X.C67290MlP.A02     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r3 = r8.A12     // Catch:{ Exception -> 0x02c8 }
            X.0qQ.A07(r3)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r6 = r11.A07     // Catch:{ Exception -> 0x02c8 }
            if (r10 != 0) goto L_0x01fb
            java.lang.String r10 = ""
        L_0x01fb:
            java.lang.Integer r11 = r8.A0H     // Catch:{ Exception -> 0x02c8 }
            java.lang.Integer r2 = r8.A0I     // Catch:{ Exception -> 0x02c8 }
            if (r11 == 0) goto L_0x0214
            goto L_0x0207
        L_0x0202:
            r16 = 0
            goto L_0x01b8
        L_0x0205:
            r3 = r12
            goto L_0x019a
        L_0x0207:
            if (r2 == 0) goto L_0x0214
            int r28 = r11.intValue()     // Catch:{ Exception -> 0x02c8 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x02c8 }
            int r28 = r28 - r2
            goto L_0x0216
        L_0x0214:
            r28 = 0
        L_0x0216:
            if (r7 == 0) goto L_0x0224
            java.lang.String r11 = r7.A06     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r2 = r8.A0j     // Catch:{ Exception -> 0x02c8 }
            boolean r2 = X.0qQ.A0K(r11, r2)     // Catch:{ Exception -> 0x02c8 }
            r29 = 1
            if (r2 != 0) goto L_0x0226
        L_0x0224:
            r29 = 0
        L_0x0226:
            boolean r30 = X.14i.A08()     // Catch:{ Exception -> 0x02c8 }
            boolean r2 = r8.A1U     // Catch:{ Exception -> 0x02c8 }
            r24 = r8
            r25 = r3
            r26 = r6
            r27 = r10
            r31 = r2
            r23.A01(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x0244
        L_0x023a:
            java.lang.String r2 = "logger"
            X.0qQ.A0F(r2)     // Catch:{ Exception -> 0x02c8 }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x02c8 }
            throw r2     // Catch:{ Exception -> 0x02c8 }
        L_0x0244:
            if (r7 == 0) goto L_0x02a3
            r2 = 36316637137277476(0x8105ca00011224, double:3.0301257887498055E-306)
            r6 = r22
            boolean r2 = X.182.A06(r6, r7, r2)     // Catch:{ Exception -> 0x02c8 }
            if (r2 == 0) goto L_0x025a
            java.lang.String r3 = "push_notification_received_debug"
            r2 = r19
            X.O1R.A00(r8, r2, r7, r3)     // Catch:{ Exception -> 0x02c8 }
        L_0x025a:
            boolean r2 = X.AnonymousClass5HM.A01(r7)     // Catch:{ Exception -> 0x02c8 }
            if (r2 == 0) goto L_0x02a3
            X.0eM r2 = X.MZr.A00     // Catch:{ Exception -> 0x02c8 }
            X.0Tu r6 = X.0Tu.A06     // Catch:{ Exception -> 0x02c8 }
            r2 = 36320360874123618(0x81092d00042162, double:3.0324806949255904E-306)
            boolean r2 = X.182.A06(r6, r7, r2)     // Catch:{ Exception -> 0x02c8 }
            if (r2 != 0) goto L_0x02a3
            X.OMX r7 = X.O1Q.A00(r7)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r3 = X.AnonymousClass3FH.A00(r19)     // Catch:{ Exception -> 0x02c8 }
            X.1XZ r2 = X.AnonymousClass3F2.A00()     // Catch:{ Exception -> 0x02c8 }
            boolean r2 = r2.A0A()     // Catch:{ Exception -> 0x02c8 }
            X.5HJ r6 = X.AnonymousClass5HJ.A00(r5, r3, r2)     // Catch:{ IOException -> 0x0286 }
            if (r6 == 0) goto L_0x028e
            goto L_0x0288
        L_0x0286:
            r6 = 0
            goto L_0x028e
        L_0x0288:
            java.lang.Long r2 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x02c8 }
            r6.A0K = r2     // Catch:{ Exception -> 0x02c8 }
        L_0x028e:
            java.lang.String r2 = "message_type"
            java.lang.String r3 = r5.getStringExtra(r2)     // Catch:{ Exception -> 0x02c8 }
            if (r6 == 0) goto L_0x0299
            java.lang.String r2 = r6.A0N     // Catch:{ Exception -> 0x02c8 }
            goto L_0x029a
        L_0x0299:
            r2 = 0
        L_0x029a:
            if (r3 != 0) goto L_0x029d
            r3 = r2
        L_0x029d:
            r2 = r19
            r7.A00(r6, r2, r3)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x02b4
        L_0x02a3:
            X.1XZ r7 = X.AnonymousClass3F2.A00()     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r6 = X.AnonymousClass3FH.A00(r19)     // Catch:{ Exception -> 0x02c8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r20)     // Catch:{ Exception -> 0x02c8 }
            r2 = r19
            r7.A06(r5, r2, r3, r6)     // Catch:{ Exception -> 0x02c8 }
        L_0x02b4:
            if (r1 == 0) goto L_0x02bb
            java.lang.String r2 = "ack_notification"
            r1.markerPoint(r0, r2)     // Catch:{ Exception -> 0x02c8 }
        L_0x02bb:
            android.content.Context r2 = r4.A00     // Catch:{ Exception -> 0x02c8 }
            X.AnonymousClass3R7.A00(r2, r5)     // Catch:{ Exception -> 0x02c8 }
            if (r1 == 0) goto L_0x03d7
            r2 = 2
            r1.markerEnd(r0, r2)     // Catch:{ Exception -> 0x02c8 }
            goto L_0x03d7
        L_0x02c8:
            r6 = move-exception
            if (r1 == 0) goto L_0x02d7
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x03df }
            java.lang.String r2 = "on_message_error"
            r1.markerAnnotate(r0, r2, r3)     // Catch:{ all -> 0x03df }
            r1.markerEnd(r0, r9)     // Catch:{ all -> 0x03df }
        L_0x02d7:
            java.lang.String r1 = "onMessage"
            java.lang.String r0 = "Unable to process notification"
            X.C67297MlX.A00(r1, r0, r6)     // Catch:{ all -> 0x03df }
            android.content.Context r1 = r4.A00     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "ON_MESSAGE_FAILED"
            X.AnonymousClass3R7.A01(r1, r5, r0)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x02e7:
            java.lang.String r3 = "registered"
            boolean r13 = r3.equals(r10)     // Catch:{ all -> 0x03df }
            java.lang.String r3 = "FBNSProcessor"
            java.lang.String r12 = "data"
            if (r13 == 0) goto L_0x036c
            java.lang.String r13 = r5.getStringExtra(r12)     // Catch:{ all -> 0x03df }
            X.45J r9 = r4.A01     // Catch:{ all -> 0x03df }
            X.TiS r10 = r9.AR1()     // Catch:{ all -> 0x03df }
            r10.E5e(r11, r13)     // Catch:{ all -> 0x03df }
            java.lang.String r9 = "PreferencesManager failed to store token."
            r10.AIR(r3, r9)     // Catch:{ all -> 0x03df }
            java.lang.String r5 = X.C241903Rv.A00(r5)     // Catch:{ all -> 0x03df }
            if (r2 == 0) goto L_0x031a
            java.lang.String r3 = "token_registration"
            r2.markerPoint(r0, r3)     // Catch:{ all -> 0x03df }
            java.lang.String r3 = "sender"
            r2.markerAnnotate(r0, r3, r5)     // Catch:{ all -> 0x03df }
            java.lang.String r3 = "trigger"
            r2.markerAnnotate(r0, r3, r14)     // Catch:{ all -> 0x03df }
        L_0x031a:
            boolean r2 = X.C241833Rj.A02(r5)     // Catch:{ all -> 0x03df }
            X.AnonymousClass7TF.A1B(r13, r8, r14)     // Catch:{ all -> 0x03df }
            X.1XZ r10 = X.AnonymousClass3F2.A00()     // Catch:{ all -> 0x03df }
            android.content.Context r4 = r4.A00     // Catch:{ all -> 0x03df }
            android.content.Context r11 = r4.getApplicationContext()     // Catch:{ all -> 0x03df }
            com.instagram.common.notifications.push.intf.PushChannelType r12 = com.instagram.common.notifications.push.intf.PushChannelType.FBNS     // Catch:{ all -> 0x03df }
            r15 = 2
            if (r2 == 0) goto L_0x0331
            r15 = 3
        L_0x0331:
            X.3R2 r2 = X.AnonymousClass3QY.A00()     // Catch:{ all -> 0x03df }
            com.instagram.common.notifications.push.intf.PushChannelType r2 = r2.BiL()     // Catch:{ all -> 0x03df }
            boolean r16 = r12.equals(r2)     // Catch:{ all -> 0x03df }
            r10.A05(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x0349
            java.lang.String r3 = "on_registration_success"
            java.lang.String r2 = "success"
            r1.markerAnnotate(r0, r3, r2)     // Catch:{ all -> 0x03df }
        L_0x0349:
            X.1XZ r1 = X.AnonymousClass3FH.A00     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x0364
            r0 = 1
            r1.A03(r4, r12, r14, r0)     // Catch:{ all -> 0x03df }
        L_0x0351:
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x03d7
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7     // Catch:{ all -> 0x03df }
            X.0xY r1 = X.AnonymousClass7TF.A0N(r7)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "fbns_token"
            r1.E5g(r0, r13)     // Catch:{ all -> 0x03df }
            r1.apply()     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x0364:
            java.lang.String r1 = "onRegistered"
            java.lang.String r0 = "Unable to log because delegate was null"
            X.C67297MlX.A00(r1, r0, r6)     // Catch:{ all -> 0x03df }
            goto L_0x0351
        L_0x036c:
            java.lang.String r7 = "reg_error"
            boolean r7 = r7.equals(r10)     // Catch:{ all -> 0x03df }
            if (r7 == 0) goto L_0x03ab
            java.lang.String r13 = r5.getStringExtra(r12)     // Catch:{ all -> 0x03df }
            if (r2 == 0) goto L_0x037f
            java.lang.String r3 = "registration_error"
            r2.markerAnnotate(r0, r3, r13)     // Catch:{ all -> 0x03df }
        L_0x037f:
            java.lang.String r3 = "TOKEN_REGISTRATION_ERROR"
            java.lang.String r2 = "onMessage"
            X.C67297MlX.A00(r2, r3, r6)     // Catch:{ all -> 0x03df }
            boolean r15 = X.AnonymousClass7TF.A1U(r8, r13, r14)     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x0394
            java.lang.String r2 = "on_registration_error"
            r1.markerAnnotate(r0, r2, r13)     // Catch:{ all -> 0x03df }
            r1.markerEnd(r0, r9)     // Catch:{ all -> 0x03df }
        L_0x0394:
            java.lang.String r1 = "onRegistrationError"
            X.C67297MlX.A00(r1, r13, r6)     // Catch:{ all -> 0x03df }
            X.1XZ r10 = X.AnonymousClass3FH.A00     // Catch:{ all -> 0x03df }
            if (r10 == 0) goto L_0x03a5
            android.content.Context r11 = r4.A00     // Catch:{ all -> 0x03df }
            com.instagram.common.notifications.push.intf.PushChannelType r12 = com.instagram.common.notifications.push.intf.PushChannelType.FBNS     // Catch:{ all -> 0x03df }
            r10.A04(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x03a5:
            java.lang.String r0 = "Unable to log because delegate was null"
            X.C67297MlX.A00(r1, r0, r6)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x03ab:
            java.lang.String r1 = "deleted"
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x03b8
            if (r2 == 0) goto L_0x03d7
            java.lang.String r1 = "on_message_deleted"
            goto L_0x03c4
        L_0x03b8:
            java.lang.String r1 = "unregistered"
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x03df }
            if (r1 == 0) goto L_0x03c8
            if (r2 == 0) goto L_0x03d7
            java.lang.String r1 = "on_unregistered"
        L_0x03c4:
            r2.markerPoint(r0, r1)     // Catch:{ all -> 0x03df }
            goto L_0x03d7
        L_0x03c8:
            if (r2 == 0) goto L_0x03d2
            java.lang.String r1 = "unknown_message_type"
            r2.markerPoint(r0, r1)     // Catch:{ all -> 0x03df }
            r2.markerEnd(r0, r9)     // Catch:{ all -> 0x03df }
        L_0x03d2:
            java.lang.String r0 = "Unknown message type"
            X.0KC.A0C(r3, r0)     // Catch:{ all -> 0x03df }
        L_0x03d7:
            r0 = r32
            android.os.PowerManager$WakeLock r0 = r0.A01
            X.C60270fk.A01(r0)
            return
        L_0x03df:
            r1 = move-exception
            r0 = r32
            android.os.PowerManager$WakeLock r0 = r0.A01
            X.C60270fk.A01(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67298MlY.run():void");
    }
}
