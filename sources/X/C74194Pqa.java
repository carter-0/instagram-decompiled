package X;

import com.instagram.rtc.signaling.models.RtcConnectionEntity;

/* renamed from: X.Pqa  reason: case insensitive filesystem */
public final class C74194Pqa extends 0Yg implements 0sL {
    public final /* synthetic */ C74562PxB A00;
    public final /* synthetic */ RtcConnectionEntity.RtcCallConnectionEntity A01;
    public final /* synthetic */ 1XE A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74194Pqa(C74562PxB pxB, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, 1XE r4, String str, String str2) {
        super(2);
        this.A01 = rtcCallConnectionEntity;
        this.A02 = r4;
        this.A00 = pxB;
        this.A04 = str;
        this.A03 = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r10v2, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31) {
        /*
            r29 = this;
            r10 = r30
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            r9 = 0
            X.0qQ.A0B(r10, r9)
            r0 = r29
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r8 = r0.A01
            if (r8 == 0) goto L_0x011d
            X.1XE r4 = r0.A02
            X.PxB r7 = r0.A00
            java.lang.String r3 = r0.A04
            java.lang.String r2 = r0.A03
            X.1X9 r1 = r4.A06
            android.content.Context r0 = r4.A01
            android.content.Context r0 = X.DbT.A05(r0)
            X.38Y r6 = r1.A00(r0, r10)
            r17 = 3
            X.Pmi r5 = new X.Pmi
            r11 = r5
            r12 = r4
            r13 = r8
            r14 = r10
            r15 = r3
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.1XA r0 = r6.A08
            X.1X8 r0 = r0.A00
            java.util.WeakHashMap r0 = r0.A06
            java.util.Set r0 = r0.keySet()
            X.0qQ.A07(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x0041:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r2 = r15.next()
            X.MYF r2 = (X.MYF) r2
            android.content.Context r12 = r2.A00
            boolean r0 = X.MYF.A00(r12)
            if (r0 == 0) goto L_0x0041
            java.lang.String r10 = r8.A0J
            r4 = 0
            if (r10 == 0) goto L_0x00e1
            com.instagram.common.session.UserSession r0 = r2.A01
            X.3U9 r11 = X.C66582MXn.A0b(r0, r10)
        L_0x0060:
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x00af
            if (r11 == 0) goto L_0x00aa
            java.lang.String r22 = r11.C6f()
            java.util.List r0 = r11.BRZ()
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0088
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            r3.add(r0)
            goto L_0x0076
        L_0x0088:
            java.util.List r23 = X.00k.A0X(r3)
            java.util.List r0 = r11.BRZ()
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0098:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b3
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = r0.B8Q()
            r4.add(r0)
            goto L_0x0098
        L_0x00aa:
            r22 = r4
            r23 = r4
            goto L_0x00b3
        L_0x00af:
            r22 = r4
            r23 = r4
        L_0x00b3:
            X.OVo r16 = X.C70993OVo.A00
            com.instagram.common.session.UserSession r11 = r2.A01
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x00bc
            r10 = r0
        L_0x00bc:
            java.lang.String r3 = r8.A0B
            java.lang.String r2 = r8.A0C
            if (r2 != 0) goto L_0x00c3
            r2 = r0
        L_0x00c3:
            r25 = 2
            boolean r0 = r8.A0L
            r26 = r0 ^ 1
            long r0 = r8.A00
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r13
            r24 = r4
            r27 = r0
            r21 = r2
            r20 = r3
            r19 = r10
            r18 = r11
            r17 = r12
            r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0041
        L_0x00e1:
            r11 = r4
            goto L_0x0060
        L_0x00e4:
            X.0eM r0 = r6.A0C
            java.lang.Object r6 = r0.getValue()
            X.OMn r6 = (X.C70818OMn) r6
            r0 = 46
            X.9LT r3 = new X.9LT
            r3.<init>(r5, r0)
            java.lang.Integer r1 = r8.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r2 = "RtcSignalingShim"
            if (r1 != r0) goto L_0x01ac
            com.instagram.model.rtc.RtcIgNotification r0 = r8.A04
            r1 = 0
            if (r0 == 0) goto L_0x01a9
            java.lang.String r4 = r0.A05
            java.lang.String r1 = r0.A06
        L_0x0108:
            com.instagram.video.common.events.IgRtcEventHeader r0 = r8.A06
            if (r4 != 0) goto L_0x0120
            if (r1 != 0) goto L_0x0120
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "Can't confirm the call ring. eventHeader and rtcMessage are missing."
        L_0x0112:
            X.0KC.A0E(r2, r0)
            r3.invoke(r5)
        L_0x0118:
            java.lang.String r0 = "alert_ack_notification"
            r7.AIe(r0)
        L_0x011d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0120:
            X.OK8 r5 = r6.A03
            X.OCn r2 = r6.A04
            X.0eM r6 = r2.A01
            java.lang.Object r0 = r6.getValue()
            X.OWY r0 = (X.OWY) r0
            if (r4 == 0) goto L_0x01a2
            X.JwL r4 = r0.A01(r4)
        L_0x0132:
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r9)
            java.lang.Object[] r1 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r0)
            com.facebook.fbwebrtc.multiway.RingResponse r10 = new com.facebook.fbwebrtc.multiway.RingResponse
            r10.<init>()
            r0 = 2839(0xb17, float:3.978E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A02(r0, r1)
            java.lang.Object r0 = r4.A01
            com.facebook.hyperthrift.HyperThriftBase r0 = (com.facebook.hyperthrift.HyperThriftBase) r0
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.Object[] r0 = r0.A01
            java.lang.Object[] r4 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r0)
            long r8 = r2.A00
            r0 = 1
            long r0 = r0 + r8
            r2.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2 = 7
            if (r0 != 0) goto L_0x0164
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0164:
            r4[r2] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0 = 5
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r4 = X.C66583MXo.A0J(r1, r4, r0)
            r0 = 30
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            java.lang.Object[] r1 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r0)
            com.facebook.fbwebrtc.multiway.RtcMessageBody r2 = new com.facebook.fbwebrtc.multiway.RtcMessageBody
            r2.<init>()
            r0 = 73
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            java.lang.Object r1 = r6.getValue()
            X.OWY r1 = (X.OWY) r1
            X.JwL r0 = new X.JwL
            r0.<init>((com.facebook.fbwebrtc.multiway.RtcMessageBody) r2, (com.facebook.fbwebrtc.multiway.RtcMessageHeader) r4)
            byte[] r2 = r1.A04(r0)
            r1 = 29
            X.JFv r0 = new X.JFv
            r0.<init>(r3, r1)
            r5.A00(r0, r2)
            goto L_0x0118
        L_0x01a2:
            if (r1 == 0) goto L_0x01b8
            X.JwL r4 = r0.A02(r1)
            goto L_0x0132
        L_0x01a9:
            r4 = r1
            goto L_0x0108
        L_0x01ac:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x01b4
            java.lang.String r0 = "Can't confirm the call ring. videoCallId is missing."
            goto L_0x0112
        L_0x01b4:
            java.lang.String r0 = "Can't confirm the call ring. Incorrect signalling protocol."
            goto L_0x0112
        L_0x01b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74194Pqa.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
