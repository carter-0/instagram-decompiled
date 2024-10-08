package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OMn  reason: case insensitive filesystem */
public final class C70818OMn {
    public final Context A00;
    public final UserSession A01;
    public final O9K A02;
    public final OK8 A03;
    public final C70590OCn A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity r11, java.lang.String r12, X.0sP r13) {
        /*
            r10 = this;
            r2 = 0
            r9 = 1
            X.0qQ.A0B(r12, r9)
            r7 = 2
            java.lang.Integer r0 = r11.A08
            int r0 = r0.intValue()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "RtcSignalingShim"
            if (r0 != r9) goto L_0x00d9
            com.instagram.model.rtc.RtcIgNotification r3 = r11.A04
            r0 = 0
            if (r3 == 0) goto L_0x00d2
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r3.A06
        L_0x001d:
            com.instagram.video.common.events.IgRtcEventHeader r6 = r11.A06
            if (r1 != 0) goto L_0x00d5
            if (r0 != 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00dc
            X.OK8 r3 = r10.A03
            X.OCn r5 = r10.A04
            java.lang.String r0 = "mqtt: "
            java.lang.String r8 = X.002.A0R(r0, r12)
            r0 = 25
            java.lang.Object[] r4 = new java.lang.Object[r0]
            X.G9w.A1Z(r4, r7, r2)
            java.lang.String r1 = r6.A04
            r0 = 4
            if (r1 != 0) goto L_0x003d
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x003d:
            r4[r0] = r1
            java.lang.Integer r1 = r6.A00
            r0 = 12
            if (r1 != 0) goto L_0x0047
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0047:
            r4[r0] = r1
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x004f
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x004f:
            r4[r9] = r0
            java.lang.String r0 = r6.A05
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0057:
            r4[r7] = r0
            java.lang.Integer r0 = r6.A01
            if (r0 == 0) goto L_0x00d0
            int r0 = r0.intValue()
            short r0 = (short) r0
        L_0x0062:
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
            r0 = 3
            if (r1 != 0) goto L_0x006b
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x006b:
            r4[r0] = r1
            long r6 = r5.A00
            r0 = 1
            long r0 = r0 + r6
            r5.A00 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0 = 7
            if (r1 != 0) goto L_0x007d
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x007d:
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r4 = X.C66583MXo.A0J(r1, r4, r0)
            r0 = 30
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r8 != 0) goto L_0x008d
            java.lang.Object r8 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x008d:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8}
            java.lang.Object[] r2 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r0)
            com.facebook.fbwebrtc.multiway.HangupRequest r1 = new com.facebook.fbwebrtc.multiway.HangupRequest
            r1.<init>()
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.HangupRequest"
            r1.A02(r0, r2)
            r0 = 4
            r6[r0] = r1
            java.lang.Object[] r1 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r6)
            com.facebook.fbwebrtc.multiway.RtcMessageBody r2 = new com.facebook.fbwebrtc.multiway.RtcMessageBody
            r2.<init>()
            r0 = 73
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            X.0eM r0 = r5.A01
            java.lang.Object r1 = r0.getValue()
            X.OWY r1 = (X.OWY) r1
            X.JwL r0 = new X.JwL
            r0.<init>((com.facebook.fbwebrtc.multiway.RtcMessageBody) r2, (com.facebook.fbwebrtc.multiway.RtcMessageHeader) r4)
            byte[] r2 = r1.A04(r0)
            r1 = 32
            X.JFv r0 = new X.JFv
            r0.<init>(r13, r1)
            r3.A00(r0, r2)
            return
        L_0x00d0:
            r0 = 0
            goto L_0x0062
        L_0x00d2:
            r1 = r0
            goto L_0x001d
        L_0x00d5:
            r10.A01(r1, r0, r12, r13)
            return
        L_0x00d9:
            java.lang.String r0 = "Can't decline incoming call. Incorrect signalling protocol."
            goto L_0x00de
        L_0x00dc:
            java.lang.String r0 = "Can't decline incoming call. eventHeader and rtcMessage are missing."
        L_0x00de:
            X.0KC.A0E(r4, r0)
            r13.invoke(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70818OMn.A00(com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity, java.lang.String, X.0sP):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.Deprecated(message = "use APIs with CallConnectionEntity")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.0sP r14) {
        /*
            r10 = this;
            r7 = 4
            java.lang.String r1 = "RtcSignalingShim"
            r2 = 0
            if (r11 != 0) goto L_0x0011
            if (r12 != 0) goto L_0x0011
            java.lang.String r0 = "Can't decline incoming call. VideoCallId and rtcMessage are missing."
            X.0KC.A0E(r1, r0)
            X.C51968G9o.A1O(r14, r2)
            return
        L_0x0011:
            X.OK8 r3 = r10.A03
            X.OCn r9 = r10.A04
            X.0eM r6 = r9.A01
            java.lang.Object r0 = r6.getValue()
            X.OWY r0 = (X.OWY) r0
            if (r11 == 0) goto L_0x00c9
            X.JwL r0 = r0.A01(r11)
        L_0x0023:
            java.lang.Object r4 = r0.A01
            com.facebook.hyperthrift.HyperThriftBase r4 = (com.facebook.hyperthrift.HyperThriftBase) r4
            r5 = 2
            r0 = 25
            java.lang.Object[] r8 = new java.lang.Object[r0]
            X.G9w.A1Z(r8, r5, r2)
            java.lang.Object r0 = r4.A00(r7)
            if (r0 != 0) goto L_0x0037
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0037:
            r8[r7] = r0
            r1 = 12
            java.lang.Object r0 = r4.A00(r1)
            if (r0 != 0) goto L_0x0043
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0043:
            r8[r1] = r0
            r1 = 1
            java.lang.Object r0 = r4.A00(r1)
            if (r0 != 0) goto L_0x004e
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x004e:
            r8[r1] = r0
            java.lang.Object r0 = r4.A00(r5)
            if (r0 != 0) goto L_0x0058
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0058:
            r8[r5] = r0
            r1 = 17
            java.lang.Object r0 = r4.A00(r1)
            if (r0 != 0) goto L_0x0064
            java.lang.Object r0 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0064:
            r8[r1] = r0
            long r4 = r9.A00
            r0 = 1
            long r0 = r0 + r4
            r9.A00 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0 = 7
            if (r1 != 0) goto L_0x0076
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0076:
            r8[r0] = r1
            java.lang.Short r1 = java.lang.Short.valueOf(r2)
            r0 = 3
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r4 = X.C66583MXo.A0J(r1, r8, r0)
            r0 = 30
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r13}
            java.lang.Object[] r2 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r0)
            com.facebook.fbwebrtc.multiway.HangupRequest r1 = new com.facebook.fbwebrtc.multiway.HangupRequest
            r1.<init>()
            java.lang.String r0 = "com.facebook.fbwebrtc.multiway.HangupRequest"
            r1.A02(r0, r2)
            r5[r7] = r1
            java.lang.Object[] r1 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r5)
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
            r1 = 31
            X.JFv r0 = new X.JFv
            r0.<init>(r14, r1)
            r3.A00(r0, r2)
            return
        L_0x00c9:
            if (r12 == 0) goto L_0x00d1
            X.JwL r0 = r0.A02(r12)
            goto L_0x0023
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70818OMn.A01(java.lang.String, java.lang.String, java.lang.String, X.0sP):void");
    }

    public /* synthetic */ C70818OMn(Context context, UserSession userSession) {
        OK8 ok8 = new OK8(userSession);
        C70590OCn oCn = new C70590OCn(context);
        O9K o9k = new O9K(userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = ok8;
        this.A04 = oCn;
        this.A02 = o9k;
    }
}
