package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.Onh  reason: case insensitive filesystem */
public final class C71606Onh implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final UserSession A00;
    public final OSH A01;

    public C71606Onh(UserSession userSession, OSH osh) {
        0qQ.A0B(osh, 2);
        this.A00 = userSession;
        this.A01 = osh;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r9 == null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getValueForKey(com.facebook.messenger.notification.engine.MSGNotificationEngineContext r15, java.lang.String r16, com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback r17) {
        /*
            r14 = this;
            r3 = 0
            r4 = r17
            X.AnonymousClass7TF.A1B(r15, r3, r4)
            java.util.Map r1 = r15.getNotificationContextDict()
            java.lang.String r0 = "notification.thread_id"
            java.lang.Object r2 = r1.get(r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x00b5
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00b5
            r10 = 0
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r2, r10)
            com.instagram.common.session.UserSession r0 = r14.A00
            X.2Dm r0 = X.1bJ.A00(r0)
            X.2Dr r0 = (X.2Dr) r0
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            X.48S r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x0039
            X.3U9 r1 = r0.A0I
            java.util.List r0 = r0.A0O()
            r2.put(r1, r0)
        L_0x0039:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            X.0qQ.A07(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x004c
            com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage[] r0 = new com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage[r3]
            r4.success(r15, r0)
            return
        L_0x004c:
            java.util.Set r0 = r1.entrySet()
            java.lang.Object r0 = X.00k.A09(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0064:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00b1
            X.3su r6 = X.C66580MXl.A0a(r7)
            X.0qQ.A0B(r6, r3)
            X.2FW r1 = r6.A10
            X.0qQ.A07(r1)
            X.2FW r0 = X.2FW.A1g
            java.lang.String r5 = ""
            if (r1 != r0) goto L_0x00a4
            java.lang.String r9 = r6.A1q
        L_0x007e:
            if (r9 != 0) goto L_0x0081
        L_0x0080:
            r9 = r5
        L_0x0081:
            X.OOT r0 = com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage.Companion
            long r0 = r6.C7c()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r12 = r6.A0g()
            if (r12 != 0) goto L_0x0093
            java.lang.String r12 = "mesg_id"
        L_0x0093:
            com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage r1 = new com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage
            r1.<init>()
            r11 = r10
            r13 = r10
            com.facebook.simplejni.NativeHolder r0 = com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage.initNativeHolder(r8, r9, r10, r11, r12, r13)
            r1.mNativeHolder = r0
            r2.add(r1)
            goto L_0x0064
        L_0x00a4:
            java.lang.Object r1 = r6.A1T
            boolean r0 = r1 instanceof X.AnonymousClass7FN
            if (r0 == 0) goto L_0x0080
            X.7FN r1 = (X.AnonymousClass7FN) r1
            if (r1 == 0) goto L_0x0080
            java.lang.String r9 = r1.A0A
            goto L_0x007e
        L_0x00b1:
            r4.success(r15, r2)
            return
        L_0x00b5:
            java.lang.String r0 = "ThreadId not found, or isn't a String"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            r4.failure(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71606Onh.getValueForKey(com.facebook.messenger.notification.engine.MSGNotificationEngineContext, java.lang.String, com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback):void");
    }
}
