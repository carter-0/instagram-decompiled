package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8KX  reason: invalid class name */
public final class AnonymousClass8KX {
    public final UserSession A00;
    public final AnonymousClass7UH A01;
    public final AnonymousClass8KY A02;
    public final AnonymousClass8KZ A03;

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bf, code lost:
        if (java.lang.Boolean.valueOf(r2) == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0160, code lost:
        if (java.lang.Boolean.valueOf(r15) == null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0194, code lost:
        if (java.lang.Boolean.valueOf(r2) == null) goto L_0x0196;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.model.direct.DirectShareTarget r30, com.instagram.model.direct.camera.DirectCameraViewModel r31, X.C381779cJ r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.String r35) {
        /*
            r29 = this;
            r1 = 1
            r10 = r35
            X.0qQ.A0B(r10, r1)
            r17 = r34
            java.lang.Integer r22 = X.AEM.A01(r17)
            r3 = r29
            X.7UH r12 = r3.A01
            X.8KY r11 = r3.A02
            r2 = r31
            if (r31 == 0) goto L_0x0255
            boolean r4 = r2.A08
        L_0x0018:
            r6 = 0
            r5 = 0
            r0 = r30
            r19 = r11
            r20 = r0
            r21 = r6
            r23 = r4
            r24 = r5
            X.3tH r13 = r19.A01(r20, r21, r22, r23, r24)
            r9 = 0
            if (r30 == 0) goto L_0x0250
            boolean r4 = r0.A0M()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
            int r4 = r0.A01
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
        L_0x003b:
            if (r31 == 0) goto L_0x0043
            boolean r4 = r2.A08
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
        L_0x0043:
            r4 = 0
            java.util.Map r20 = X.AnonymousClass8KY.A00(r6, r5, r5)
            if (r31 == 0) goto L_0x024d
            java.lang.Long r8 = r2.A04
        L_0x004c:
            java.lang.String r7 = "ephemeral_lifetime_ms"
            X.0eP r6 = new X.0eP
            r6.<init>(r7, r8)
            java.util.Map r21 = X.0se.A0M(r6)
            if (r30 == 0) goto L_0x0248
            X.3t2 r14 = r0.A09
            r14.getClass()
            X.3sy r24 = r0.A02()
        L_0x0062:
            if (r31 == 0) goto L_0x0066
            boolean r4 = r2.A08
        L_0x0066:
            r23 = r11
            r25 = r9
            r27 = r4
            r28 = r5
            r26 = r22
            java.lang.Boolean r16 = r23.A02(r24, r25, r26, r27, r28)
            r19 = r10
            r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r7 = r32
            if (r32 == 0) goto L_0x007f
            java.lang.String r9 = r7.A06
        L_0x007f:
            java.lang.Integer r4 = X.AEM.A02(r9)
            if (r4 == 0) goto L_0x009f
            X.02m r9 = r12.A01
            int r8 = r12.A00
            int r6 = r10.hashCode()
            int r4 = r4.intValue()
            switch(r4) {
                case 1: goto L_0x0240;
                case 2: goto L_0x0244;
                default: goto L_0x0094;
            }
        L_0x0094:
            java.lang.String r5 = "view_once"
        L_0x0096:
            r4 = 822(0x336, float:1.152E-42)
            java.lang.String r4 = X.C66579MXk.A00(r4)
            r9.markerAnnotate(r8, r6, r4, r5)
        L_0x009f:
            if (r33 == 0) goto L_0x00c0
            int r4 = r33.intValue()
            if (r4 == 0) goto L_0x023c
            if (r4 != r1) goto L_0x00c0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x00ab:
            X.02m r9 = r12.A01
            int r8 = r12.A00
            int r6 = r10.hashCode()
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x0238
            java.lang.String r5 = "gallery"
        L_0x00bb:
            java.lang.String r4 = "media_source"
            r9.markerAnnotate(r8, r6, r4, r5)
        L_0x00c0:
            int r4 = r17.intValue()
            int r4 = 8 - r4
            if (r4 == 0) goto L_0x0234
            com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r9 = com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes.EPHEMERAL_VIDEO
        L_0x00ca:
            java.lang.Integer r14 = X.AEM.A00(r9)
            int r4 = r10.hashCode()
            com.instagram.common.session.UserSession r8 = r3.A00
            r16 = 0
            X.Nhu r6 = X.C328727Fx.A01(r8, r4)
            if (r6 == 0) goto L_0x020f
            r5 = 0
            if (r30 == 0) goto L_0x0231
            boolean r4 = r0.A0M()
        L_0x00e3:
            r6.onStartFlow(r4)
            r6.onLogDataProcessingStart()
            r6.annotateMessageType(r9)
            if (r33 == 0) goto L_0x0103
            int r4 = r33.intValue()
            if (r4 == 0) goto L_0x022d
            if (r4 != r1) goto L_0x0103
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x00f8:
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x0229
            java.lang.String r4 = "gallery"
        L_0x0100:
            r6.annotateMediaSource(r4)
        L_0x0103:
            r4 = 0
            if (r32 == 0) goto L_0x0226
            java.lang.String r9 = r7.A06
        L_0x0108:
            java.lang.Integer r9 = X.AEM.A02(r9)
            if (r9 == 0) goto L_0x011a
            int r9 = r9.intValue()
            switch(r9) {
                case 1: goto L_0x021e;
                case 2: goto L_0x0222;
                default: goto L_0x0115;
            }
        L_0x0115:
            java.lang.String r9 = "view_once"
        L_0x0117:
            r6.annotateEphemeralType(r9)
        L_0x011a:
            if (r31 == 0) goto L_0x0120
            java.lang.String r4 = r2.A00()
        L_0x0120:
            if (r32 == 0) goto L_0x021b
            java.lang.String r7 = r7.A02
            if (r7 == 0) goto L_0x021b
            X.0c5 r2 = X.0c9.A04
            X.0c9 r2 = r2.A01(r8, r7)
            X.3tI r7 = X.C254933tI.A00(r2)
        L_0x0130:
            r8 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0135
            r2 = 1
        L_0x0135:
            r6.annotateIsReply(r2)
            if (r7 == 0) goto L_0x0150
            X.2FW r2 = r7.A0F
            java.lang.String r2 = r2.A00
            r6.annotateReplyToType(r2)
            if (r30 == 0) goto L_0x0213
            X.3sy r2 = r0.A02()
            if (r2 == 0) goto L_0x0213
            boolean r2 = r2 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r2 != r1) goto L_0x0213
        L_0x014d:
            r8 = 0
        L_0x014e:
            r16 = r8
        L_0x0150:
            X.8KZ r3 = r3.A03
            X.3U9 r1 = r3.A00(r4)
            if (r1 == 0) goto L_0x0162
            boolean r15 = r1.CVE()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            if (r1 != 0) goto L_0x0163
        L_0x0162:
            r15 = 0
        L_0x0163:
            X.3U9 r1 = r3.A00(r4)
            if (r1 == 0) goto L_0x0210
            boolean r1 = r1.Axj()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
        L_0x0171:
            r12 = r0
            X.3tH r7 = r11.A01(r12, r13, r14, r15, r16)
            java.lang.String r1 = r7.A00
            r6.annotateTransportType(r1)
            X.3tH r2 = X.C254923tH.ACT
            r1 = 0
            if (r7 != r2) goto L_0x0181
            r1 = 1
        L_0x0181:
            r6.annotateIsEncrypted(r1)
            X.3U9 r2 = r3.A00(r4)
            if (r2 == 0) goto L_0x0196
            com.instagram.common.session.UserSession r1 = r3.A00
            boolean r2 = r2.CVa(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r1 != 0) goto L_0x0197
        L_0x0196:
            r2 = 0
        L_0x0197:
            r6.annotateIsInstamadillo(r2)
            X.3U9 r1 = r3.A00(r4)
            if (r1 == 0) goto L_0x01b1
            int r2 = r1.C6a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x01b1
            java.lang.String r1 = X.AnonymousClass48O.A00(r2)
            r6.annotateThreadType(r2, r1)
        L_0x01b1:
            X.3U9 r1 = r3.A00(r4)
            if (r1 == 0) goto L_0x01c1
            boolean r2 = r1.CVE()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r1 != 0) goto L_0x01c2
        L_0x01c1:
            r2 = 0
        L_0x01c2:
            r6.annotateIsVm(r2)
            java.lang.Long r1 = r3.A01(r4)
            r6.annotateEphemeralLifetimeMs(r1)
            X.3U9 r1 = r3.A00(r4)
            if (r1 == 0) goto L_0x01dd
            boolean r2 = r1.Axj()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r1 == 0) goto L_0x01dd
            r5 = r2
        L_0x01dd:
            r6.annotateIsDm(r5)
            r6.annotateLocalDataId(r10)
            if (r30 == 0) goto L_0x020c
            X.3t2 r1 = r0.A09
            r1.getClass()
            java.lang.String r1 = X.AnonymousClass4KK.A02(r1)
            if (r1 == 0) goto L_0x01f3
            r6.annotateOpenThreadId(r1)
        L_0x01f3:
            X.3t2 r1 = r0.A09
            r1.getClass()
            java.lang.Long r1 = X.AnonymousClass4KK.A01(r1)
            if (r1 == 0) goto L_0x0201
            r6.annotateOccamadilloThreadId(r1)
        L_0x0201:
            X.3sy r0 = r0.A02()
            if (r0 == 0) goto L_0x020c
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r6.annotateIsMsys(r0)
        L_0x020c:
            r6.onLogTransportMessageStart()
        L_0x020f:
            return
        L_0x0210:
            r13 = 0
            goto L_0x0171
        L_0x0213:
            boolean r1 = r7.A05()
            if (r1 != 0) goto L_0x014d
            goto L_0x014e
        L_0x021b:
            r7 = 0
            goto L_0x0130
        L_0x021e:
            java.lang.String r9 = "allow_replay"
            goto L_0x0117
        L_0x0222:
            java.lang.String r9 = "keep_in_chat"
            goto L_0x0117
        L_0x0226:
            r9 = r4
            goto L_0x0108
        L_0x0229:
            java.lang.String r4 = "camera"
            goto L_0x0100
        L_0x022d:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x00f8
        L_0x0231:
            r4 = 0
            goto L_0x00e3
        L_0x0234:
            com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes r9 = com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes.EPHEMERAL_PHOTO
            goto L_0x00ca
        L_0x0238:
            java.lang.String r5 = "camera"
            goto L_0x00bb
        L_0x023c:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x00ab
        L_0x0240:
            java.lang.String r5 = "allow_replay"
            goto L_0x0096
        L_0x0244:
            java.lang.String r5 = "keep_in_chat"
            goto L_0x0096
        L_0x0248:
            r14 = r9
            r24 = r9
            goto L_0x0062
        L_0x024d:
            r8 = r9
            goto L_0x004c
        L_0x0250:
            r15 = r6
            r18 = r6
            goto L_0x003b
        L_0x0255:
            r4 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KX.A00(com.instagram.model.direct.DirectShareTarget, com.instagram.model.direct.camera.DirectCameraViewModel, X.9cJ, java.lang.Integer, java.lang.Integer, java.lang.String):void");
    }

    public /* synthetic */ AnonymousClass8KX(UserSession userSession) {
        AnonymousClass7UH A002 = AnonymousClass7UG.A00(userSession);
        AnonymousClass8KY r2 = new AnonymousClass8KY(userSession);
        AnonymousClass8KZ r1 = new AnonymousClass8KZ(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 2);
        this.A00 = userSession;
        this.A01 = A002;
        this.A02 = r2;
        this.A03 = r1;
    }
}
