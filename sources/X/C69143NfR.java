package X;

import com.instagram.rtc.rsys.proxies.LoggingProxy;

/* renamed from: X.NfR  reason: case insensitive filesystem */
public final class C69143NfR extends LoggingProxy {
    public final /* synthetic */ C71143Odx A00;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void createAnalyticsEvent(com.instagram.rtc.rsys.models.AnalyticsEvent r11) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.Odx r0 = r10.A00
            X.OWA r0 = r0.A0L
            X.Ods r6 = r0.A03
            if (r6 != 0) goto L_0x0021
            X.0wj r5 = X.0wj.A01
            r4 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r3 = "Waterfall is null: step="
            int r2 = r11.step
            java.lang.String r1 = ", videoCallId="
            java.lang.String r0 = r11.videoCallId
            java.lang.String r0 = X.002.A05(r2, r3, r1, r0)
            X.DbT.A1Q(r5, r0, r4)
            return
        L_0x0021:
            int r1 = r11.step
            r3 = 3
            r2 = 1
            if (r1 == 0) goto L_0x00ef
            if (r1 == r2) goto L_0x00e9
            r0 = 2
            if (r1 == r0) goto L_0x00e3
            if (r1 == r3) goto L_0x00dd
            r0 = 7
            if (r1 != r0) goto L_0x0038
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "infra_first_participant_joined"
        L_0x0035:
            r1.A01(r0)
        L_0x0038:
            int r1 = r11.step
            if (r1 != r2) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A01 = r0
        L_0x0042:
            r0 = 15
            X.PqS r1 = new X.PqS
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r11)
            r0 = 0
            X.ONr r0 = X.C71142Ods.A01(r6, r0)
            r1.invoke(r0)
            X.0iu r1 = r6.A0T
            X.0xI r0 = X.C71142Ods.A00(r0, r6)
            r1.EFq(r0)
            return
        L_0x005b:
            r0 = 6
            if (r1 != r0) goto L_0x00d2
            r6.A0O = r2
            com.facebook.quicklog.reliability.UserFlowLogger r2 = X.C70996OVr.A02
            long r0 = X.C70996OVr.A01
            r2.flowEndSuccess(r0)
            long r4 = r6.A0A
            long r2 = r6.A09
            r0 = 0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0076
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r2
        L_0x0076:
            long r4 = r4 + r0
            r6.A0A = r4
            r4 = 0
            r6.A09 = r4
            X.C71142Ods.A04(r6)
            X.C71142Ods.A05(r6)
            long r1 = r6.A0A
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            X.Nkz r2 = X.C69417Nkz.A0V
            r1 = 45
            X.PqW r0 = new X.PqW
            r0.<init>(r6, r1)
            X.C71142Ods.A02(r2, r6, r0)
            X.Nkz r2 = X.C69417Nkz.A0O
            r1 = 46
            X.PqW r0 = new X.PqW
            r0.<init>(r6, r1)
            X.C71142Ods.A02(r2, r6, r0)
        L_0x00a1:
            long r2 = r6.A0E
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b3
            long r0 = r6.A0I
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r2
            long r0 = r0 + r7
            r6.A0I = r0
            r6.A0E = r4
        L_0x00b3:
            long r2 = r6.A0J
            long r0 = r6.A0B
            r7 = 0
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00c2
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r0
        L_0x00c2:
            long r2 = r2 + r7
            r6.A0J = r2
            r6.A0B = r4
        L_0x00c7:
            X.C71142Ods.A06(r6)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A0F = r0
            goto L_0x0042
        L_0x00d2:
            if (r1 != r3) goto L_0x0042
            r6.A0O = r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A02 = r0
            goto L_0x00c7
        L_0x00dd:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "infra_end_result"
            goto L_0x0035
        L_0x00e3:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "infra_end_attempt"
            goto L_0x0035
        L_0x00e9:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "infa_connect_result"
            goto L_0x0035
        L_0x00ef:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "infra_connect_attempt"
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69143NfR.createAnalyticsEvent(com.instagram.rtc.rsys.models.AnalyticsEvent):void");
    }

    public C69143NfR(C71143Odx odx) {
        this.A00 = odx;
    }
}
