package com.instagram.notifications.actions;

import X.002;
import X.0aw;
import X.0bY;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C59850bV;
import X.C59910bu;
import X.C66581MXm;
import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import java.util.Collections;
import java.util.Set;

public final class ActionHandlerIntentService extends IntentService {
    public static final Set A02;
    public 0aw A00 = 0aw.A00;
    public String A01;

    public ActionHandlerIntentService() {
        super("ActionHandlerIntentService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a8, code lost:
        if (r0 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r1 == 0) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r28) {
        /*
            r27 = this;
            java.lang.String r4 = "deny"
            java.lang.String r3 = "onHandleIntent"
            r6 = r27
            r5 = r28
            if (r28 == 0) goto L_0x0022
            X.0Rz r0 = X.C59910bu.A02()
            boolean r0 = r0.A00(r6, r5, r6)
            if (r0 == 0) goto L_0x01aa
            r2 = r6
            monitor-enter(r2)
            X.0aw r1 = r6.A00     // Catch:{ all -> 0x001f }
            r0 = 0
            boolean r0 = r1.A00(r6, r5, r0, r6)     // Catch:{ all -> 0x001f }
            goto L_0x01a7
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0022:
            X.0b1 r2 = X.C59850bV.A00
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "allow"
            r2.A00(r5, r1, r3, r0)
            if (r28 == 0) goto L_0x01be
            android.net.Uri r0 = r5.getData()
            if (r0 == 0) goto L_0x01be
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L_0x01be
            android.os.Bundle r9 = r5.getExtras()
            java.lang.String r16 = "Required value was null."
            if (r9 == 0) goto L_0x0212
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L_0x0050
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            java.lang.String r4 = "ActionHandlerIntentService"
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "NULL or empty session token"
        L_0x0057:
            X.0wb.A03(r4, r0)
            return
        L_0x005b:
            java.lang.String r3 = "notification_category"
            java.lang.String r0 = r9.getString(r3)
            if (r0 == 0) goto L_0x01ba
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01ba
            java.lang.String r7 = "notification_uuid"
            java.lang.String r0 = r9.getString(r7)
            if (r0 == 0) goto L_0x01b6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01b6
            android.net.Uri r2 = r5.getData()
            if (r2 == 0) goto L_0x020d
            java.lang.String r1 = "notification_action_key"
            java.lang.String r0 = r2.getQueryParameter(r1)
            if (r0 == 0) goto L_0x01b2
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01b2
            com.instagram.common.session.UserSession r4 = X.DbS.A0U(r9)
            java.lang.String r8 = r2.getQueryParameter(r1)
            if (r8 == 0) goto L_0x0208
            java.lang.String r3 = r9.getString(r3)
            if (r3 == 0) goto L_0x0203
            java.lang.String r2 = r9.getString(r7)
            if (r2 == 0) goto L_0x01fe
            r11 = 1
            java.lang.String r0 = "survey_response"
            boolean r0 = X.DbU.A1a(r8, r0)
            if (r0 != r11) goto L_0x0171
            java.lang.String r12 = "survey_answer_id"
            java.lang.String r0 = r9.getString(r12)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r15 = "from_notification_id"
            java.lang.String r0 = r9.getString(r15)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r14 = "channel"
            java.lang.String r0 = r9.getString(r14)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r13 = "qp_id"
            java.lang.String r0 = r9.getString(r13)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r7 = "survey_question_id"
            java.lang.String r0 = r9.getString(r7)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r10 = "from_notification_category"
            java.lang.String r0 = r9.getString(r10)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r1 = "igNotification_object"
            java.lang.String r0 = r9.getString(r1)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0171
            java.lang.String r12 = r9.getString(r12)
            java.lang.String r23 = r9.getString(r15)
            java.lang.String r21 = r9.getString(r14)
            java.lang.String r19 = r9.getString(r13)
            java.lang.String r7 = r9.getString(r7)
            java.lang.String r22 = r9.getString(r10)
            java.lang.String r0 = r9.getString(r1)
            if (r0 == 0) goto L_0x01c4
            r1 = 0
            X.5HJ r10 = X.AnonymousClass5HJ.A01(r0, r1)     // Catch:{ IOException -> 0x0130 }
            goto L_0x0131
        L_0x0130:
            r10 = 0
        L_0x0131:
            if (r12 == 0) goto L_0x0171
            if (r23 == 0) goto L_0x0171
            if (r21 == 0) goto L_0x0171
            if (r19 == 0) goto L_0x0171
            if (r7 == 0) goto L_0x0171
            if (r22 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            java.util.Set r9 = A02
            java.lang.String r0 = r10.A12
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = r10.A12
            X.0qQ.A07(r0)
            r9.add(r0)
            r10.A1N = r11
            X.1XZ r9 = X.AnonymousClass3F2.A00()
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.LOCAL
            r9.A08(r10, r0, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r12)
            java.util.Map r26 = X.AnonymousClass7TF.A0w(r7, r0)
            X.F1Q r17 = X.C49285EsU.A00
            java.lang.String r24 = ""
            r20 = r7
            r25 = r1
            r18 = r4
            r17.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0171:
            java.lang.String r0 = "view_profile"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x01b1
            android.net.Uri r9 = r5.getData()
            if (r9 == 0) goto L_0x01f9
            java.lang.String r0 = "ig://user"
            android.net.Uri$Builder r8 = X.DbW.A07(r0)
            java.util.Set r0 = r9.getQueryParameterNames()
            java.util.Iterator r7 = r0.iterator()
        L_0x018d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = X.AnonymousClass7TE.A18(r7)
            java.lang.String r0 = "launch_reel"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = r9.getQueryParameter(r1)
            r8.appendQueryParameter(r1, r0)
            goto L_0x018d
        L_0x01a7:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0022
        L_0x01aa:
            X.0b1 r1 = X.C59850bV.A00
            java.lang.String r0 = r6.A01
            r1.A00(r5, r0, r3, r4)
        L_0x01b1:
            return
        L_0x01b2:
            java.lang.String r0 = "NULL or empty notif action key"
            goto L_0x0057
        L_0x01b6:
            java.lang.String r0 = "NULL or empty notif uuid"
            goto L_0x0057
        L_0x01ba:
            java.lang.String r0 = "NULL or empty notif category"
            goto L_0x0057
        L_0x01be:
            java.lang.String r4 = "ActionHandlerIntentService"
            java.lang.String r0 = "NULL or invalid intent received"
            goto L_0x0057
        L_0x01c4:
            java.lang.String r0 = "Value of FULL_NOTIFICATION_OBJECT will be dereferenced!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01cb:
            android.net.Uri r0 = r8.build()
            X.0qQ.A07(r0)
            r5.setData(r0)
            java.lang.String r1 = "com.instagram.mainactivity.InstagramMainActivity"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r6, r1)
            r5.setComponent(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            java.lang.String r1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r6.sendBroadcast(r0)
            X.0kR.A0B(r6, r5)
            X.1Xc r0 = X.1Xc.A01()
            r0.A04(r4, r3, r2)
            return
        L_0x01f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x01fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0203:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0208:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x020d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x0212:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.actions.ActionHandlerIntentService.onHandleIntent(android.content.Intent):void");
    }

    static {
        Set synchronizedSet = Collections.synchronizedSet(AnonymousClass7TE.A1F());
        0qQ.A07(synchronizedSet);
        A02 = synchronizedSet;
    }

    public final IBinder onBind(Intent intent) {
        boolean A002;
        if (C59910bu.A02().A00(this, intent, this)) {
            synchronized (this) {
                A002 = this.A00.A00(this, intent, (0bY) null, this);
            }
            if (A002) {
                C59850bV.A00.A00(intent, this.A01, "onBind", "allow");
                return null;
            }
        }
        C59850bV.A00.A00(intent, this.A01, "onBind", "deny");
        return null;
    }

    public final void onCreate() {
        int A04 = AnonymousClass0fD.A04(-2051509696);
        super.onCreate();
        this.A01 = 002.A0g(getPackageName(), "/", C66581MXm.A0y(this));
        AnonymousClass0fD.A0B(-458026415, A04);
    }
}
