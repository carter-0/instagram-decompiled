package X;

import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;

public final class P0P implements C74384Pu0 {
    public static final P0P A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A8C(com.instagram.common.session.UserSession r10, X.OIH r11, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r12, X.C254703su r13, X.C331237Qc r14) {
        /*
            r9 = this;
            r6 = 2
            int r5 = X.DbW.A03(r6, r13, r12)
            int r1 = r12.addMessageContentCase_
            r0 = 8
            if (r1 != r0) goto L_0x0079
            java.lang.Object r4 = r12.addMessageContent_
            com.instagram.direct.armadilloexpress.transportpayload.AdminMessage r4 = (com.instagram.direct.armadilloexpress.transportpayload.AdminMessage) r4
        L_0x000f:
            X.0qQ.A07(r4)
            int r3 = r4.adminMessageSubtypeCase_
            boolean r0 = X.C66581MXm.A1V(r3)
            java.lang.String r2 = "need_update"
            if (r0 == 0) goto L_0x0071
            r1 = 1
            if (r3 != r1) goto L_0x006e
            java.lang.Object r0 = r4.adminMessageSubtype_
            com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage r0 = (com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage) r0
        L_0x0023:
            X.0qQ.A07(r0)
            int r0 = r0.deviceAdminMessageType_
            if (r0 == 0) goto L_0x006b
            if (r0 == r1) goto L_0x0068
            if (r0 == r6) goto L_0x0065
            if (r0 != r5) goto L_0x006b
            X.Nmw r0 = X.C69514Nmw.DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_NEW_LOGIN
        L_0x0032:
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0062
            if (r0 != r5) goto L_0x0071
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
        L_0x003c:
            int r0 = r0.intValue()
            int r0 = 9 - r0
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = "security_alert_key_change"
        L_0x0046:
            r0 = 21
            X.BBV r2 = new X.BBV
            r2.<init>(r1, r0)
            X.2FW r0 = X.2FW.A0G
            r4 = 0
            r8 = 0
            java.lang.String r3 = ""
            X.46n r1 = new X.46n
            r5 = r4
            r6 = r4
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x005b:
            r13.A17(r0, r1)
            return
        L_0x005f:
            java.lang.String r1 = "security_alert_new_login"
            goto L_0x0046
        L_0x0062:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            goto L_0x003c
        L_0x0065:
            X.Nmw r0 = X.C69514Nmw.DEVICE_ADMIN_MESSAGE_TYPE_SECURITY_ALERT_PARTICIPANT_KEY_CHANGE
            goto L_0x0032
        L_0x0068:
            X.Nmw r0 = X.C69514Nmw.DEVICE_ADMIN_MESSAGE_TYPE_LOCAL_USER_CHANGED_IDENTITY_KEY_NAMED_DEVICE
            goto L_0x0032
        L_0x006b:
            X.Nmw r0 = X.C69514Nmw.DEVICE_ADMIN_MESSAGE_TYPE_NONE
            goto L_0x0032
        L_0x006e:
            com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage r0 = com.instagram.direct.armadilloexpress.transportpayload.DeviceAdminMessage.DEFAULT_INSTANCE
            goto L_0x0023
        L_0x0071:
            X.2FW r0 = X.2FW.A1M
            X.57z r1 = new X.57z
            r1.<init>(r2)
            goto L_0x005b
        L_0x0079:
            com.instagram.direct.armadilloexpress.transportpayload.AdminMessage r4 = com.instagram.direct.armadilloexpress.transportpayload.AdminMessage.DEFAULT_INSTANCE
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P0P.A8C(com.instagram.common.session.UserSession, X.OIH, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent, X.3su, X.7Qc):void");
    }

    public final boolean FMq(AddMessageContent addMessageContent) {
        0qQ.A0B(addMessageContent, 0);
        return AnonymousClass7TF.A1S(addMessageContent.addMessageContentCase_, 8);
    }
}
