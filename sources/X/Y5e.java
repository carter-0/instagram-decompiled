package X;

import java.util.TimerTask;

public final class Y5e extends TimerTask {
    public final /* synthetic */ OET A00;

    public Y5e(OET oet) {
        this.A00 = oet;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0151, code lost:
        if (r3 == false) goto L_0x0153;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            X.OET r0 = r0.A00
            com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine r0 = r0.A00
            if (r0 == 0) goto L_0x0251
            X.XbK r7 = r0.counters
            if (r7 == 0) goto L_0x0251
            monitor-enter(r7)
            r5 = 0
            r12 = r5
            r11 = r5
            r9 = r5
            r2 = r5
            r8 = r5
            r10 = r5
            r1 = r5
            r0 = r5
            android.util.Pair r3 = r7.A00     // Catch:{ all -> 0x024d }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x024d }
            java.lang.String r4 = "wifi"
            boolean r3 = X.0qQ.A0K(r3, r4)     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0040
            com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine r3 = r7.A0C     // Catch:{ all -> 0x024d }
            X.4sr r3 = r3.wifiInfoProvider     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0040
            X.4sy r3 = r3.A02()     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0040
            java.lang.Integer r0 = r3.A06     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x005d
            int r0 = r0.intValue()     // Catch:{ all -> 0x024d }
        L_0x0036:
            int r0 = r0 + 100
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024d }
            java.lang.Integer r1 = r3.A02     // Catch:{ all -> 0x024d }
            java.lang.Integer r0 = r3.A05     // Catch:{ all -> 0x024d }
        L_0x0040:
            X.1EK r3 = r7.A01     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0182
            android.util.Pair r3 = r7.A00     // Catch:{ all -> 0x024d }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x024d }
            boolean r3 = X.0qQ.A0K(r3, r4)     // Catch:{ all -> 0x024d }
            if (r3 != 0) goto L_0x015a
            X.1EK r3 = r7.A01     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0155
            java.lang.String r4 = r3.A0D     // Catch:{ all -> 0x024d }
            int r3 = r4.hashCode()     // Catch:{ all -> 0x024d }
            switch(r3) {
                case -1092787200: goto L_0x005f;
                case -284840886: goto L_0x006b;
                case 3524: goto L_0x0077;
                case 102657: goto L_0x0083;
                case 107485: goto L_0x008f;
                case 3048885: goto L_0x009b;
                case 3108285: goto L_0x00a6;
                case 3179754: goto L_0x00b1;
                case 3212348: goto L_0x00bc;
                case 3227396: goto L_0x00c8;
                case 3245531: goto L_0x00d4;
                case 3594007: goto L_0x00df;
                case 48940715: goto L_0x00e9;
                case 96487011: goto L_0x00f3;
                case 99571818: goto L_0x00fe;
                case 99582900: goto L_0x0109;
                case 99588155: goto L_0x0114;
                case 112947884: goto L_0x011f;
                case 1687613977: goto L_0x012a;
                case 1870782017: goto L_0x0135;
                case 1870782066: goto L_0x013f;
                case 1870782067: goto L_0x0149;
                default: goto L_0x005b;
            }     // Catch:{ all -> 0x024d }
        L_0x005b:
            goto L_0x0153
        L_0x005d:
            r0 = 0
            goto L_0x0036
        L_0x005f:
            java.lang.String r3 = "lte_ca"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 19
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x006b:
            java.lang.String r3 = "unknown"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 99
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0077:
            java.lang.String r3 = "nr"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 20
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0083:
            java.lang.String r3 = "gsm"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 16
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x008f:
            java.lang.String r3 = "lte"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 13
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x009b:
            java.lang.String r3 = "cdma"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 4
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00a6:
            java.lang.String r3 = "edge"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 2
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00b1:
            java.lang.String r3 = "gprs"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 1
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00bc:
            java.lang.String r3 = "hspa"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 10
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00c8:
            java.lang.String r3 = "iden"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 11
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00d4:
            java.lang.String r3 = "iwan"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 18
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00df:
            java.lang.String r3 = "umts"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 3
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00e9:
            java.lang.String r3 = "1xrtt"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 7
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00f3:
            java.lang.String r3 = "ehrpd"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 14
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x00fe:
            java.lang.String r3 = "hsdpa"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 8
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0109:
            java.lang.String r3 = "hspap"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 15
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0114:
            java.lang.String r3 = "hsupa"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 9
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x011f:
            java.lang.String r3 = "wcdma"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 21
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x012a:
            java.lang.String r3 = "td_scdma"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 17
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0135:
            java.lang.String r3 = "cdma - evdo rev. 0"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 5
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x013f:
            java.lang.String r3 = "cdma - evdo rev. a"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 6
            if (r3 != 0) goto L_0x0156
            goto L_0x0153
        L_0x0149:
            java.lang.String r3 = "cdma - evdo rev. b"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x024d }
            r4 = 12
            if (r3 != 0) goto L_0x0156
        L_0x0153:
            r4 = 0
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x024d }
        L_0x015a:
            X.1EK r4 = r7.A01     // Catch:{ all -> 0x024d }
            if (r4 == 0) goto L_0x0182
            int r2 = r4.A04     // Catch:{ all -> 0x024d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x024d }
            int r2 = r4.A05     // Catch:{ all -> 0x024d }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x024d }
            int r2 = r4.A06     // Catch:{ all -> 0x024d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x024d }
            int r2 = r4.A08     // Catch:{ all -> 0x024d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x024d }
            int r3 = r4.A07     // Catch:{ all -> 0x024d }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x024d }
            int r3 = r4.A00     // Catch:{ all -> 0x024d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x024d }
        L_0x0182:
            com.facebook.rsys.tslog.gen.TslogCounterApi r13 = r7.A09     // Catch:{ all -> 0x024d }
            X.2HY r15 = X.C21952Xmh.A06     // Catch:{ all -> 0x024d }
            com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine r6 = r7.A0C     // Catch:{ all -> 0x024d }
            long r3 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r14 = (int) r3     // Catch:{ all -> 0x024d }
            java.lang.Integer r3 = X.C21952Xmh.A00(r5, r15, r14)     // Catch:{ all -> 0x024d }
            r5 = 0
            if (r3 == 0) goto L_0x024a
            int r3 = r3.intValue()     // Catch:{ all -> 0x024d }
        L_0x0196:
            r13.addSample(r3)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r13 = r7.A03     // Catch:{ all -> 0x024d }
            X.2HY r15 = X.C21952Xmh.A01     // Catch:{ all -> 0x024d }
            long r3 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r14 = (int) r3     // Catch:{ all -> 0x024d }
            java.lang.Integer r3 = X.C21952Xmh.A00(r12, r15, r14)     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0247
            int r3 = r3.intValue()     // Catch:{ all -> 0x024d }
        L_0x01aa:
            r13.addSample(r3)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r13 = r7.A04     // Catch:{ all -> 0x024d }
            X.2HY r14 = X.C21952Xmh.A02     // Catch:{ all -> 0x024d }
            long r3 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r12 = (int) r3     // Catch:{ all -> 0x024d }
            java.lang.Integer r3 = X.C21952Xmh.A00(r11, r14, r12)     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0244
            int r3 = r3.intValue()     // Catch:{ all -> 0x024d }
        L_0x01be:
            r13.addSample(r3)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r13 = r7.A05     // Catch:{ all -> 0x024d }
            X.2HY r12 = X.C21952Xmh.A03     // Catch:{ all -> 0x024d }
            long r3 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r11 = (int) r3     // Catch:{ all -> 0x024d }
            java.lang.Integer r3 = X.C21952Xmh.A00(r9, r12, r11)     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x0242
            int r3 = r3.intValue()     // Catch:{ all -> 0x024d }
        L_0x01d2:
            r13.addSample(r3)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r12 = r7.A07     // Catch:{ all -> 0x024d }
            X.2HY r11 = X.C21952Xmh.A05     // Catch:{ all -> 0x024d }
            long r3 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r9 = (int) r3     // Catch:{ all -> 0x024d }
            java.lang.Integer r2 = X.C21952Xmh.A00(r2, r11, r9)     // Catch:{ all -> 0x024d }
            if (r2 == 0) goto L_0x0240
            int r2 = r2.intValue()     // Catch:{ all -> 0x024d }
        L_0x01e6:
            r12.addSample(r2)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r11 = r7.A06     // Catch:{ all -> 0x024d }
            X.2HY r9 = X.C21952Xmh.A04     // Catch:{ all -> 0x024d }
            long r2 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r4 = (int) r2     // Catch:{ all -> 0x024d }
            java.lang.Integer r2 = X.C21952Xmh.A00(r8, r9, r4)     // Catch:{ all -> 0x024d }
            if (r2 == 0) goto L_0x023e
            int r2 = r2.intValue()     // Catch:{ all -> 0x024d }
        L_0x01fa:
            r11.addSample(r2)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r9 = r7.A02     // Catch:{ all -> 0x024d }
            X.2HY r8 = X.C21952Xmh.A00     // Catch:{ all -> 0x024d }
            long r2 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r4 = (int) r2     // Catch:{ all -> 0x024d }
            java.lang.Integer r2 = X.C21952Xmh.A00(r10, r8, r4)     // Catch:{ all -> 0x024d }
            if (r2 == 0) goto L_0x023c
            int r2 = r2.intValue()     // Catch:{ all -> 0x024d }
        L_0x020e:
            r9.addSample(r2)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r9 = r7.A0A     // Catch:{ all -> 0x024d }
            X.2HY r8 = X.C21952Xmh.A07     // Catch:{ all -> 0x024d }
            long r2 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r4 = (int) r2     // Catch:{ all -> 0x024d }
            java.lang.Integer r1 = X.C21952Xmh.A00(r1, r8, r4)     // Catch:{ all -> 0x024d }
            if (r1 == 0) goto L_0x023a
            int r1 = r1.intValue()     // Catch:{ all -> 0x024d }
        L_0x0222:
            r9.addSample(r1)     // Catch:{ all -> 0x024d }
            com.facebook.rsys.tslog.gen.TslogCounterApi r8 = r7.A0B     // Catch:{ all -> 0x024d }
            X.2HY r4 = X.C21952Xmh.A08     // Catch:{ all -> 0x024d }
            long r2 = r6.kOffset     // Catch:{ all -> 0x024d }
            int r1 = (int) r2     // Catch:{ all -> 0x024d }
            java.lang.Integer r0 = X.C21952Xmh.A00(r0, r4, r1)     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x0236
            int r5 = r0.intValue()     // Catch:{ all -> 0x024d }
        L_0x0236:
            r8.addSample(r5)     // Catch:{ all -> 0x024d }
            goto L_0x0250
        L_0x023a:
            r1 = 0
            goto L_0x0222
        L_0x023c:
            r2 = 0
            goto L_0x020e
        L_0x023e:
            r2 = 0
            goto L_0x01fa
        L_0x0240:
            r2 = 0
            goto L_0x01e6
        L_0x0242:
            r3 = 0
            goto L_0x01d2
        L_0x0244:
            r3 = 0
            goto L_0x01be
        L_0x0247:
            r3 = 0
            goto L_0x01aa
        L_0x024a:
            r3 = 0
            goto L_0x0196
        L_0x024d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0250:
            monitor-exit(r7)
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y5e.run():void");
    }
}
