package X;

/* renamed from: X.NtB  reason: case insensitive filesystem */
public abstract class C69847NtB {
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.OIH A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r28, X.C69405Nkj r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, long r36, long r38) {
        /*
            r6 = r28
            r13 = r31
            int r5 = r6.transportPayloadCase_
            if (r5 == 0) goto L_0x00a0
            r0 = 1
            if (r5 == r0) goto L_0x009c
            r0 = 2
            if (r5 == r0) goto L_0x0098
            r0 = 3
            if (r5 == r0) goto L_0x0094
            r0 = 0
        L_0x0012:
            int r4 = r0.intValue()
            r3 = 0
            r12 = r30
            r18 = r32
            r16 = r34
            r15 = r35
            r0 = r36
            r20 = r38
            if (r4 == r3) goto L_0x00a6
            r2 = 1
            if (r4 == r2) goto L_0x006d
            r2 = 2
            if (r4 != r2) goto L_0x00a4
            com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload r4 = X.C66580MXl.A0S(r6)
            boolean r5 = r6.openEb_
            boolean r6 = r6.isE2EeAttributed_
            int r2 = r4.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = r4.targetMessageOtid_
            if (r2 == 0) goto L_0x00a4
            if (r31 != 0) goto L_0x0043
            java.lang.String r13 = X.C2611348j.A04(r2, r0)
        L_0x0043:
            long r35 = X.C2611348j.A01(r13)
        L_0x0047:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r6)
            r23 = 0
            X.OIH r9 = new X.OIH
            r22 = r9
            r25 = r12
            r26 = r13
            r27 = r2
            r28 = r15
            r29 = r16
            r30 = r23
            r31 = r18
            r32 = r23
            r33 = r20
            r37 = r3
            r38 = r3
            r39 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38, r39)
            return r9
        L_0x006d:
            r2 = 2
            if (r5 != r2) goto L_0x0091
            java.lang.Object r4 = r6.transportPayload_
            com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload r4 = (com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload) r4
        L_0x0074:
            X.0qQ.A07(r4)
            boolean r5 = r6.openEb_
            boolean r6 = r6.isE2EeAttributed_
            int r2 = r4.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = r4.messageOtid_
            if (r2 == 0) goto L_0x00a4
            java.lang.String r0 = X.C2611348j.A04(r2, r0)
            if (r31 != 0) goto L_0x008c
            r13 = r0
        L_0x008c:
            long r35 = X.C2611348j.A01(r0)
            goto L_0x0047
        L_0x0091:
            com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload r4 = com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload.DEFAULT_INSTANCE
            goto L_0x0074
        L_0x0094:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0012
        L_0x0098:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0012
        L_0x009c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0012
        L_0x00a0:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0012
        L_0x00a4:
            r9 = 0
            return r9
        L_0x00a6:
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r4 = r6.A0L()
            X.0qQ.A07(r4)
            boolean r7 = r6.openEb_
            boolean r5 = r6.isE2EeAttributed_
            int r2 = r4.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0168
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r4 = r4.metadata_
            if (r4 != 0) goto L_0x00bd
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r4 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE
        L_0x00bd:
            r14 = r33
            if (r31 != 0) goto L_0x00c5
            java.lang.String r13 = X.C2611348j.A04(r14, r0)
        L_0x00c5:
            long r22 = X.C2611348j.A01(r13)
            r2 = 0
            if (r4 == 0) goto L_0x015e
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x015b
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r6 = r4.repliedToMessage_
            if (r6 != 0) goto L_0x00d8
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r6 = com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage.DEFAULT_INSTANCE
        L_0x00d8:
            if (r6 == 0) goto L_0x015f
            int r1 = r6.bitField0_
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0159
            java.lang.String r11 = r6.repliedToMessageOtid_
        L_0x00e2:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r6.repliedToMessageWaServerTimeSec_
            if (r0 == 0) goto L_0x0157
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
        L_0x00ee:
            if (r11 == 0) goto L_0x015f
            if (r0 == 0) goto L_0x015f
            r9 = 0
            long r0 = r0.longValue()
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x015f
            java.lang.String r17 = X.C2611348j.A04(r11, r0)
        L_0x0100:
            int r8 = r4.bitField0_
            r0 = r8 & 8
            boolean r24 = X.AnonymousClass7TF.A1P(r0)
            int r1 = r29.ordinal()
            r10 = 0
            if (r1 == r3) goto L_0x0152
            r0 = 1
            if (r1 != r0) goto L_0x012c
            r0 = r8 & 16
            if (r0 == 0) goto L_0x0148
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r1 = r4.ephemeralityParams_
            if (r1 != 0) goto L_0x011c
            com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams r1 = com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams.DEFAULT_INSTANCE
        L_0x011c:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0148
            long r0 = r1.ephemeralDurationSec_
        L_0x0124:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.ODs r10 = X.C70875OPo.A01(r0, r2)
        L_0x012c:
            boolean r1 = r4.sendSilently_
        L_0x012e:
            if (r6 == 0) goto L_0x0138
            int r0 = r6.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0138
            java.lang.String r2 = r6.repliedToMessageCollectionItemId_
        L_0x0138:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            X.OIH r9 = new X.OIH
            r19 = r2
            r25 = r1
            r26 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26)
            return r9
        L_0x0148:
            java.lang.String r1 = "ArmadilloExpressProtobufMetadataAdapter"
            java.lang.String r0 = "ephemeralDurationSec is null"
            X.0wb.A03(r1, r0)
            r0 = 0
            goto L_0x0124
        L_0x0152:
            X.ODs r10 = X.C70875OPo.A00()
            goto L_0x012c
        L_0x0157:
            r0 = r2
            goto L_0x00ee
        L_0x0159:
            r11 = 0
            goto L_0x00e2
        L_0x015b:
            r6 = 0
            goto L_0x00d8
        L_0x015e:
            r6 = r2
        L_0x015f:
            r17 = r2
            if (r4 != 0) goto L_0x0100
            r24 = 0
            r10 = r2
            r1 = 0
            goto L_0x012e
        L_0x0168:
            r4 = 0
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69847NtB.A00(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.Nkj, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):X.OIH");
    }
}
