package com.instagram.direct.notifications.armadillo.retry;

import X.002;
import X.08y;
import X.09i;
import X.0Jv;
import X.0KC;
import X.2DU;
import X.AnonymousClass5G1;
import X.AnonymousClass65S;
import X.AnonymousClass6ED;
import X.C255323tw;
import X.C282925Fh;
import X.C282935Fi;
import X.C66580MXl;
import X.C66845Mdd;
import X.C71721Opf;
import X.C72929PPn;
import X.C74178PqK;
import X.DbW;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;
import java.util.Collections;

public final class ArmadilloPushNotificationRetryWorker extends Worker {
    public final int A00;
    public final WorkerParameters A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArmadilloPushNotificationRetryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        int A02 = DbW.A02(1, context, workerParameters);
        this.A01 = workerParameters;
        this.A00 = workerParameters.A02.A02("max_attempts_count", A02);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.5ER, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r4 == null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass5G1 A00(com.instagram.common.session.UserSession r28, com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker r29) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327722448140944(0x810fdf00053a90, double:3.0371361839768267E-306)
            r3 = r28
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.String r1 = "ArmadilloPushNotificationRetryWorker"
            if (r0 == 0) goto L_0x0042
            r0 = r29
            androidx.work.WorkerParameters r0 = r0.A01
            X.3tw r0 = r0.A02
            java.util.Map r0 = r0.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r0)
        L_0x0028:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0049
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r1.put(r2, r0)
            goto L_0x0028
        L_0x0042:
            java.lang.String r0 = "skipped showing generic notification"
            X.0KC.A0D(r1, r0)
            goto L_0x01a8
        L_0x0049:
            r7 = 0
            r2 = 1
            android.content.Context r0 = X.C60960kU.A00
            X.0qQ.A0B(r0, r2)
            r0 = 0
            android.content.Context r4 = X.C60960kU.A00
            android.content.Context r9 = r4.getApplicationContext()
            java.lang.String r4 = "su"
            java.lang.String r4 = X.DbS.A0r(r4, r1)
            java.lang.String r10 = ""
            if (r4 != 0) goto L_0x0062
            r4 = r10
        L_0x0062:
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.DbS.A0V(r4)
            java.lang.String r4 = "sn"
            java.lang.String r5 = X.DbS.A0r(r4, r1)
            if (r5 != 0) goto L_0x006f
            r5 = r10
        L_0x006f:
            java.lang.String r4 = "f"
            java.lang.String r8 = X.DbS.A0r(r4, r1)
            if (r8 == 0) goto L_0x0087
            char[] r6 = new char[r2]
            r4 = 64
            r6[r0] = r4
            java.util.List r4 = X.00l.A0Q(r8, r6, r0)
            java.lang.String r4 = X.C51966G9m.A1G(r4, r0)
            if (r4 != 0) goto L_0x0089
        L_0x0087:
            java.lang.String r4 = "0"
        L_0x0089:
            java.lang.String r6 = "account"
            r1.get(r6)
            java.lang.String r6 = "thread_igid"
            java.lang.String r11 = X.DbS.A0r(r6, r1)
            if (r11 != 0) goto L_0x0097
            r11 = r10
        L_0x0097:
            java.lang.String r6 = "armadillo_is_thread_hidden"
            java.lang.String r6 = X.DbS.A0r(r6, r1)
            if (r6 == 0) goto L_0x01ce
            java.lang.Boolean r6 = X.00l.A0A(r6)
            if (r6 == 0) goto L_0x01ce
            boolean r13 = r6.booleanValue()
        L_0x00a9:
            java.lang.String r6 = "armadillo_is_thread_muted"
            java.lang.String r6 = X.DbS.A0r(r6, r1)
            if (r6 == 0) goto L_0x01cb
            java.lang.Boolean r6 = X.00l.A0A(r6)
            if (r6 == 0) goto L_0x01cb
            boolean r12 = r6.booleanValue()
        L_0x00bb:
            java.lang.String r6 = "is_silent"
            java.lang.String r6 = X.DbS.A0r(r6, r1)
            if (r6 == 0) goto L_0x01c8
            java.lang.Boolean r6 = X.00l.A0A(r6)
            if (r6 == 0) goto L_0x01c8
            boolean r6 = r6.booleanValue()
        L_0x00cd:
            X.0qQ.A0A(r9)
            r8 = 2131963989(0x7f133055, float:1.9564747E38)
            java.lang.String r20 = X.C51967G9n.A0p(r9, r8)
            int r8 = r11.length()
            if (r8 != 0) goto L_0x01be
            java.lang.String r21 = "direct_inbox_account_switch"
        L_0x00df:
            java.lang.String r8 = "id"
            java.lang.String r8 = X.DbS.A0r(r8, r1)
            if (r8 == 0) goto L_0x00e8
            r10 = r8
        L_0x00e8:
            java.lang.String r8 = r3.A06
            java.lang.String r23 = X.002.A0R(r10, r8)
            X.5ER r14 = new X.5ER
            r14.<init>()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r0)
            java.lang.String r19 = "Instagram"
            java.lang.String r22 = "direct_v2_message"
            java.lang.String r24 = "direct_v2_generic_new_message"
            X.5HJ r13 = new X.5HJ
            r25 = r8
            r26 = r7
            r27 = r4
            r28 = r7
            r29 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r13.A1M = r6
            java.lang.String r6 = "is_instamadillo"
            java.lang.Object r8 = r1.get(r6)
            java.lang.String r6 = "1"
            boolean r6 = X.0qQ.A0K(r8, r6)
            if (r6 == 0) goto L_0x0136
            r13.A1S = r2
            java.lang.String r6 = "itt"
            java.lang.String r6 = X.DbS.A0r(r6, r1)
            r13.A0i = r6
            java.lang.String r6 = "wa_push_id"
            java.lang.String r6 = X.DbS.A0r(r6, r1)
            r13.A0U = r6
        L_0x0136:
            java.lang.String r6 = "feature_tags"
            java.lang.Object r8 = r1.get(r6)
            java.lang.String r6 = "15"
            boolean r6 = X.0qQ.A0K(r8, r6)
            if (r6 == 0) goto L_0x0159
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            r12 = 30
            X.N4O r6 = new X.N4O
            r8 = r7
            r9 = r7
            r11 = r0
            r6.<init>((java.lang.Boolean) r7, (java.lang.Boolean) r8, (java.lang.Integer) r9, (java.lang.Long) r10, (int) r11, (int) r12)
            r13.A05 = r6
        L_0x0159:
            r13.A1A = r4
            r13.A19 = r5
            r13.A0b = r5
            X.O5r r5 = new X.O5r
            r5.<init>()
            r5.A00 = r0
            X.OtU r4 = new X.OtU
            r4.<init>(r5)
            r13.A09 = r4
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r13.A0c = r4
            boolean r4 = r13.A1M
            if (r4 != 0) goto L_0x01ae
            boolean r4 = r13.A1Q
            if (r4 != 0) goto L_0x01ae
            boolean r4 = r13.A1P
            if (r4 != 0) goto L_0x01ae
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r1)
            java.lang.String r1 = "notify"
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r1 = "0"
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 != 0) goto L_0x01ae
            X.65S r1 = X.AnonymousClass6ED.A00(r3)
            r0 = 35
            X.PqK r0 = X.C74178PqK.A00(r3, r0)
            r1.A08(r7, r0, r2)
            X.1XZ r1 = X.AnonymousClass3F2.A00()
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.MSYS
            r1.A07(r13, r0, r3, r7)
        L_0x01a8:
            X.5G1 r0 = new X.5G1
            r0.<init>()
            return r0
        L_0x01ae:
            X.65S r4 = X.AnonymousClass6ED.A00(r3)
            r1 = 36
            X.PqK r2 = X.C74178PqK.A00(r3, r1)
            java.lang.String r1 = "generic notification silenced"
            r4.A08(r1, r2, r0)
            goto L_0x01a8
        L_0x01be:
            java.lang.String r9 = "direct_v2?%s=%s"
            java.lang.String r8 = "id"
            java.lang.String r21 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r9, r8, r11)
            goto L_0x00df
        L_0x01c8:
            r6 = 0
            goto L_0x00cd
        L_0x01cb:
            r12 = 0
            goto L_0x00bb
        L_0x01ce:
            r13 = 0
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker.A00(com.instagram.common.session.UserSession, com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker):X.5G1");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.5Fi] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.NAW, com.facebook.msys.mca.MailboxFeature] */
    public final C282935Fi doWork() {
        WorkerParameters workerParameters = this.A01;
        C255323tw r7 = workerParameters.A02;
        String A03 = r7.A03("recipient_id");
        if (A03 == null) {
            0KC.A0C("ArmadilloPushNotificationRetryWorker", "Recipient key is required");
        } else {
            08y r6 = 09i.A0A;
            UserSession A05 = r6.A05(this);
            if (A05 instanceof UserSession) {
                UserSession userSession = A05;
                if (C66580MXl.A1X(userSession, A03)) {
                    int i = this.mWorkerParams.A01;
                    int i2 = this.A00;
                    if (i == i2) {
                        return A00(userSession, this);
                    }
                    AnonymousClass65S A002 = AnonymousClass6ED.A00(userSession);
                    A002.A02(i2 - this.mWorkerParams.A01, C74178PqK.A00(A05, 33));
                    2DU.A00(userSession).A0B(true, "NOTIFICATION_RETRY");
                    new MailboxFeature(C66845Mdd.A00.A00(userSession)).A00(new C71721Opf((Object) A002, 32), Collections.unmodifiableMap(r7.A00));
                } else if (r6.A0A(new Object(), (0Jv) null, new C72929PPn(this, 5), A03)) {
                    return new AnonymousClass5G1();
                }
            }
            int A02 = workerParameters.A02.A02("max_attempts_count", 2);
            int i3 = this.mWorkerParams.A01;
            if (i3 <= A02) {
                0KC.A0D("ArmadilloPushNotificationRetryWorker", 002.A0X("push notification retrying... (", " of ", ')', i3, A02));
                return new Object();
            }
            0KC.A0D("ArmadilloPushNotificationRetryWorker", "push notification retry job failed");
        }
        return new C282925Fh();
    }
}
