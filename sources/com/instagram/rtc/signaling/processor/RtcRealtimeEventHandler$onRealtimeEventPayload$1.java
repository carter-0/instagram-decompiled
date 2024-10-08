package com.instagram.rtc.signaling.processor;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C2597042t;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1", f = "RtcRealtimeEventHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcRealtimeEventHandler$onRealtimeEventPayload$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C2597042t A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcRealtimeEventHandler$onRealtimeEventPayload$1(C2597042t r2, String str, String str2, String str3, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new RtcRealtimeEventHandler$onRealtimeEventPayload$1(this.A00, this.A02, this.A01, this.A03, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcRealtimeEventHandler$onRealtimeEventPayload$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r2.A0B.getValue() == X.C69278Nie.TEST) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        if (r1 != X.AnonymousClass05K.A0Y) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0eS.A00(r12)
            X.42t r3 = r11.A00
            java.lang.String r2 = r11.A02
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "/pubsub"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0110
            com.instagram.common.session.UserSession r9 = r3.A01
            X.OEO r0 = X.O26.A00(r9)
            X.Pvr r0 = r0.A01
            X.PxB r10 = r0.ExK()
            X.1XK r2 = r3.A02
            java.lang.String r4 = r11.A03
            X.AnonymousClass7TG.A1N(r9, r4)
            java.lang.String r1 = "notification_source"
            java.lang.String r0 = "MQTT"
            r10.CmF(r1, r0)
            X.1X8 r0 = r2.A00
            X.1XE r8 = r0.A05
            X.OWb r7 = X.C71004OWb.A00
            java.lang.String r1 = "handleMqttSignalingMessage("
            java.lang.String r0 = r9.A06
            java.lang.String r0 = X.G9w.A0k(r1, r0)
            java.lang.String r6 = "RtcCallSignalingProcessor"
            r5 = 4
            r7.A00(r6, r0)
            X.0tS r3 = X.DbT.A0h()
            X.0s0 r2 = r3.A32
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 102(0x66, float:1.43E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 != 0) goto L_0x0068
            android.content.Context r1 = r8.A01
            X.OcE r2 = X.C71120OdE.A01(r1, r4)
            if (r2 != 0) goto L_0x006b
            java.lang.String r0 = "No thrift payload, ignoring message "
            java.lang.String r0 = X.002.A0R(r0, r4)
            r7.A01(r6, r0)
        L_0x0068:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x006b:
            r8.A0E(r10, r9, r2, r5)
            X.1X9 r0 = r8.A06
            X.38Y r6 = r0.A00(r1, r9)
            X.AnonymousClass38Y.A04(r6)
            java.lang.Integer r0 = r2.A03()
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x00d3
            X.0eM r1 = r2.A02
            java.lang.String r0 = X.DbS.A0t(r1)
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00a5
            com.instagram.common.session.UserSession r5 = r6.A06
            java.lang.String r7 = r2.A05()
            java.lang.String r8 = X.DbS.A0t(r1)
            java.lang.String r9 = r2.A04()
            java.lang.String r10 = r2.A01
            X.AnonymousClass38Y.A02(r5, r6, r7, r8, r9, r10)
            goto L_0x0068
        L_0x00a5:
            X.0eM r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            X.Nid r0 = X.C69277Nid.NO_E2EE
            if (r1 != r0) goto L_0x00ba
            X.0eM r0 = r2.A0B
            java.lang.Object r1 = r0.getValue()
            X.Nie r0 = X.C69278Nie.TEST
            r3 = 0
            if (r1 != r0) goto L_0x00bb
        L_0x00ba:
            r3 = 1
        L_0x00bb:
            com.instagram.common.session.UserSession r1 = r6.A06
            android.content.Context r0 = r6.A04
            X.OyC r0 = X.C66953Mfm.A00(r0, r1)
            X.OVd r0 = r0.A09
            X.Odx r2 = r0.A0Z
            r0 = 47
            X.MYK r1 = new X.MYK
            r1.<init>(r4, r0)
            r0 = 0
            X.C71143Odx.A06(r2, r1, r3, r0)
            goto L_0x0068
        L_0x00d3:
            com.instagram.common.session.UserSession r0 = r6.A06
            X.OyC r3 = X.C66953Mfm.A01(r0)
            if (r3 == 0) goto L_0x010b
            java.lang.Integer r0 = r2.A03()
            r1 = 5
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x00eb
            r6.A08(r2)
        L_0x00eb:
            X.OVd r5 = r3.A09
            X.Odx r3 = r5.A0Z
            r1 = 49
            X.MYK r0 = new X.MYK
            r0.<init>(r4, r1)
            X.C71143Odx.A05(r3, r0)
            X.Oaz r0 = r5.A0K
            X.N4R r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.N9J r0 = (X.N9J) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x010b
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0068
        L_0x010b:
            X.AnonymousClass38Y.A05(r6, r2)
            goto L_0x0068
        L_0x0110:
            java.lang.String r0 = "/ig_realtime_sub"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "18025651213162780"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            X.1XK r2 = r3.A02
            com.instagram.common.session.UserSession r1 = r3.A01
            java.lang.String r0 = r11.A03
            r2.A00(r1, r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
