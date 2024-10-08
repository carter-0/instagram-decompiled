package X;

import com.instagram.rtc.rsys.proxies.EngineProxy;

/* renamed from: X.NfL  reason: case insensitive filesystem */
public final class C69140NfL extends EngineProxy {
    public final /* synthetic */ OU3 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r6 != null) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stateChangedHandler(com.instagram.rtc.rsys.models.EngineModel r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.OU3 r4 = r8.A00
            org.webrtc.EglBase$Context r0 = X.OU3.A0m
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x002a
            r0 = 1
            r4.A06 = r0
            X.OKu r5 = r4.A0F
            java.lang.String r1 = r4.A0f
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x002a
            long r2 = r0.longValue()
            java.lang.String r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x002a
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A02
            java.lang.String r0 = "first_engine_model"
            r1.flowMarkPoint(r2, r0)
        L_0x002a:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            r7 = 0
            if (r0 == 0) goto L_0x00bb
            java.lang.String r6 = r0.serverInfoData
        L_0x0031:
            com.instagram.model.rtc.RtcCallKey r0 = r4.A05
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0096
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x0046
        L_0x0041:
            com.instagram.model.rtc.RtcCallKey r7 = new com.instagram.model.rtc.RtcCallKey
            r7.<init>(r6)
        L_0x0046:
            r4.A05 = r7
            int r1 = r9.state
            r6 = 0
            r5 = 4
            r3 = 2
            r2 = 1
            if (r1 == r2) goto L_0x007b
            if (r1 == r3) goto L_0x007b
            r0 = 3
            if (r1 == r0) goto L_0x0078
            if (r1 == r5) goto L_0x0078
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
        L_0x0059:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.serverInfoData
            if (r0 == 0) goto L_0x0066
            com.instagram.model.rtc.RtcCallKey r6 = new com.instagram.model.rtc.RtcCallKey
            r6.<init>(r0)
        L_0x0066:
            java.lang.Integer r1 = r4.A0e
            X.N9J r0 = new X.N9J
            r0.<init>(r6, r2, r1)
            X.N4R r1 = new X.N4R
            r1.<init>((com.instagram.rtc.rsys.models.EngineModel) r9, (X.N9J) r0)
            X.0sP r0 = r4.A0i
            r0.invoke(r1)
            return
        L_0x0078:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x0059
        L_0x007b:
            com.instagram.rtc.rsys.models.IgCallModel r0 = r9.callModel
            if (r0 == 0) goto L_0x0093
            int r1 = r0.inCallState
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0093
            if (r1 == r5) goto L_0x0090
            if (r1 == r2) goto L_0x0090
            if (r1 != r3) goto L_0x0093
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0059
        L_0x0090:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0059
        L_0x0093:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0059
        L_0x0096:
            if (r6 == 0) goto L_0x0046
            X.OKu r5 = r4.A0F
            java.lang.String r1 = r4.A0f
            java.lang.Long r0 = r5.A00
            if (r0 == 0) goto L_0x0041
            long r2 = r0.longValue()
            java.lang.String r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0041
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A02
            java.lang.String r0 = "call_connected"
            r1.flowMarkPoint(r2, r0)
            r1.flowEndSuccess(r2)
            r5.A00 = r7
            r5.A01 = r7
            goto L_0x0041
        L_0x00bb:
            r6 = r7
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69140NfL.stateChangedHandler(com.instagram.rtc.rsys.models.EngineModel):void");
    }

    public C69140NfL(OU3 ou3) {
        this.A00 = ou3;
    }
}
