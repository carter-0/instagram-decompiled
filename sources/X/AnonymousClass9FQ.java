package X;

/* renamed from: X.9FQ  reason: invalid class name */
public final class AnonymousClass9FQ implements 0Js {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (r2 == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ATN(com.instagram.common.session.UserSession r21, X.0Jv r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r23
            X.9FP r1 = (X.AnonymousClass9FP) r1
            X.9FS r17 = new X.9FS
            r3 = r20
            r2 = r22
            r0 = r17
            r0.<init>(r3, r2)
            r1.getClass()
            android.content.Context r0 = r1.A01
            r19 = r0
            android.content.Intent r14 = r1.A00
            java.lang.String r13 = "PushRegistrationService.TRIGGER"
            java.lang.String r12 = "PushRegistrationService.LOGGED_IN_USERS"
            java.lang.String r4 = "IgPushRegistrationService"
            android.os.Bundle r11 = r14.getExtras()     // Catch:{ RuntimeException -> 0x0152 }
            if (r11 == 0) goto L_0x0159
            java.lang.String r0 = "PushRegistrationService.GUID"
            java.lang.String r6 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.DEVICE_TOKEN"
            java.lang.String r3 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.PUSH_CHANNEL_TYPE"
            java.lang.String r15 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.HPKE_CIPHERSUITE"
            java.lang.String r10 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.HPKE_CLIENT_PUBLIC_KEY"
            java.lang.String r9 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.HPKE_CLIENT_KEYSTORE_ID"
            java.lang.String r8 = r11.getString(r0)     // Catch:{ RuntimeException -> 0x0152 }
            if (r15 == 0) goto L_0x005f
            com.instagram.common.notifications.push.intf.PushChannelType[] r7 = com.instagram.common.notifications.push.intf.PushChannelType.values()     // Catch:{ RuntimeException -> 0x0152 }
            int r5 = r7.length     // Catch:{ RuntimeException -> 0x0152 }
            r1 = 0
        L_0x0050:
            if (r1 >= r5) goto L_0x0069
            r2 = r7[r1]     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = r2.A01     // Catch:{ RuntimeException -> 0x0152 }
            boolean r0 = X.0qQ.A0K(r0, r15)     // Catch:{ RuntimeException -> 0x0152 }
            if (r0 != 0) goto L_0x006f
            int r1 = r1 + 1
            goto L_0x0050
        L_0x005f:
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_TYPE"
            java.io.Serializable r2 = r11.getSerializable(r0)     // Catch:{ RuntimeException -> 0x0152 }
            com.instagram.common.notifications.push.intf.PushChannelType r2 = (com.instagram.common.notifications.push.intf.PushChannelType) r2     // Catch:{ RuntimeException -> 0x0152 }
            if (r2 != 0) goto L_0x006f
        L_0x0069:
            java.lang.String r0 = "Received null PushChannelType"
            X.0wb.A03(r4, r0)     // Catch:{ RuntimeException -> 0x0152 }
            return
        L_0x006f:
            java.lang.String r0 = "PushRegistrationService.IS_MAIN_PUSH_CHANNEL"
            boolean r18 = r11.getBoolean(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "PushRegistrationService.PUSH_DEVICE_SUB_TYPE"
            int r16 = r11.getInt(r0)     // Catch:{ RuntimeException -> 0x0152 }
            X.1NY r5 = new X.1NY     // Catch:{ RuntimeException -> 0x0152 }
            r15 = r21
            r5.<init>(r15)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ RuntimeException -> 0x0152 }
            r5.A08(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "push/register/"
            r5.A0A(r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "device_token"
            r5.A9m(r0, r3)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "device_type"
            java.lang.String r7 = r2.A01     // Catch:{ RuntimeException -> 0x0152 }
            r5.A9m(r0, r7)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r1 = "is_main_push_channel"
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ RuntimeException -> 0x0152 }
            r5.A9m(r1, r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "guid"
            r5.A9m(r0, r6)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r6 = "family_device_id"
            X.0jg r0 = X.0jh.A04     // Catch:{ RuntimeException -> 0x0152 }
            X.0jh r1 = r0.A01(r15)     // Catch:{ RuntimeException -> 0x0152 }
            X.19f r0 = X.19f.A2E     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = r1.A02(r0)     // Catch:{ RuntimeException -> 0x0152 }
            r5.A9m(r6, r0)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "device_sub_type"
            java.lang.String r6 = java.lang.Integer.toString(r16)     // Catch:{ RuntimeException -> 0x0152 }
            r5.A9m(r0, r6)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r5.A0R(r1, r0)     // Catch:{ RuntimeException -> 0x0152 }
            boolean r0 = r14.hasExtra(r12)     // Catch:{ RuntimeException -> 0x0152 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r1 = r14.getStringExtra(r12)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "users"
            r5.A9m(r0, r1)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x00d6:
            X.1CU r0 = X.AnonymousClass1CT.A00(r15)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r1 = "Authorization-Others"
            java.lang.String r0 = r0.A00()     // Catch:{ RuntimeException -> 0x0152 }
            r5.A0F(r1, r0)     // Catch:{ RuntimeException -> 0x0152 }
            if (r10 == 0) goto L_0x00f8
            if (r9 == 0) goto L_0x00f8
            if (r8 == 0) goto L_0x00f8
            java.lang.String r0 = "hpke_ciphersuite"
            r5.A9m(r0, r10)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "hpke_pubkey"
            r5.A9m(r0, r9)     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r0 = "hpke_keystore_id"
            r5.A9m(r0, r8)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x00f8:
            boolean r0 = r14.hasExtra(r13)     // Catch:{ RuntimeException -> 0x0152 }
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r11.getString(r13)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x0102:
            X.9FY r1 = new X.9FY     // Catch:{ RuntimeException -> 0x0152 }
            r8 = r19
            r1.<init>(r8, r15, r7, r6)     // Catch:{ RuntimeException -> 0x0152 }
            goto L_0x010d
        L_0x010a:
            java.lang.String r0 = "unknown"
            goto L_0x0102
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r13 = r0
            goto L_0x0113
        L_0x0111:
            java.lang.String r13 = "unknown"
        L_0x0113:
            java.lang.String r7 = "registration_initiated"
            r8 = 0
            r14 = 1
            java.lang.String r10 = r1.A01     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r11 = r1.A03     // Catch:{ RuntimeException -> 0x0152 }
            java.lang.String r12 = r1.A02     // Catch:{ RuntimeException -> 0x0152 }
            X.0wc r6 = r1.A00     // Catch:{ RuntimeException -> 0x0152 }
            r9 = r8
            X.C3733695b.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x0152 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r6 = "unknown"
            boolean r6 = r6.equals(r0)     // Catch:{ RuntimeException -> 0x0152 }
            if (r6 != 0) goto L_0x0132
            java.lang.String r6 = "trigger"
            r5.A9m(r6, r0)     // Catch:{ RuntimeException -> 0x0152 }
        L_0x0132:
            X.1OC r5 = r5.A0M()     // Catch:{ RuntimeException -> 0x0152 }
            if (r3 != 0) goto L_0x013a
            java.lang.String r3 = ""
        L_0x013a:
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "unknown"
        L_0x013e:
            X.9Fg r11 = new X.9Fg     // Catch:{ RuntimeException -> 0x0152 }
            r12 = r2
            r13 = r15
            r14 = r17
            r15 = r1
            r16 = r3
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ RuntimeException -> 0x0152 }
            r5.A00 = r11     // Catch:{ RuntimeException -> 0x0152 }
            X.1ES.A02(r5)     // Catch:{ RuntimeException -> 0x0152 }
            return
        L_0x0152:
            r2 = move-exception
            r1 = 1
            java.lang.String r0 = "RegisterPushCallable.Call - runtime exception"
            X.0wb.A05(r4, r0, r1, r2)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FQ.ATN(com.instagram.common.session.UserSession, X.0Jv, java.lang.Object):void");
    }
}
