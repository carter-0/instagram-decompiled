package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.3m5  reason: invalid class name and case insensitive filesystem */
public final class C250803m5 implements C250813m6 {
    public int A00 = 0;
    public int A01;
    public long A02 = 0;
    public long A03;
    public long A04 = 0;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final 28m A0A;
    public final C697227w A0B;
    public final /* synthetic */ 28m A0C;

    public final void DFs(C257183wz r1, long j, long j2, long j3) {
    }

    public final void DFt(long j, long j2) {
    }

    public final void DtW() {
        A00(true);
    }

    public final void EUi(String str) {
    }

    public C250803m5(28m r3, 28m r4, C697227w r5) {
        this.A0C = r3;
        this.A0B = r5;
        this.A0A = r4;
    }

    public final void Czk(C257113ws r7, C257263x7 r8, int i, boolean z) {
        int i2;
        int i3 = this.A01 + i;
        this.A01 = i3;
        if (this.A04 <= 0 && this.A09 && (i2 = this.A00) > 0 && i3 >= i2) {
            this.A04 = SystemClock.elapsedRealtime();
        }
    }

    public final void DtX(C257113ws r6, C257263x7 r7, boolean z) {
        if (this.A05 != 0) {
            A00(false);
        }
    }

    public final void DtY(IOException iOException) {
        if (this.A05 != 0) {
            A00(true);
        }
    }

    public final void Dtb(String str, Object obj) {
        if (this.A08 && "x-fb-response-time-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A02 = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        if ("x-bwe-mean".equalsIgnoreCase(str) && obj != null) {
            try {
                for (String split : ((String) obj).split(";")) {
                    String[] split2 = split.split(":");
                    if (split2.length != 2) {
                        break;
                    }
                    if (split2[0].equalsIgnoreCase("aggressive")) {
                        Long.parseLong(split2[1]);
                    }
                    if (split2[0].equalsIgnoreCase("mean")) {
                        Long.parseLong(split2[1]);
                    }
                    if (split2[0].equalsIgnoreCase("conservative")) {
                        Long.parseLong(split2[1]);
                    }
                }
            } catch (NumberFormatException unused2) {
            }
        }
        if ("x-bwe-std-dev".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused3) {
            }
        }
        if ("x-mrtt-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused4) {
            }
        }
        if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A00 = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused5) {
            }
        }
    }

    public final void Dtd(C257183wz r4, C257263x7 r5) {
        String obj = r5.A06.toString();
        boolean z = r5.A07.A0U;
        try {
            new URL(obj);
        } catch (MalformedURLException unused) {
        }
        boolean z2 = false;
        if (r4 != C257183wz.NOT_CACHED) {
            z2 = true;
        }
        this.A07 = z2;
        this.A05 = SystemClock.elapsedRealtime();
        this.A02 = 0;
        this.A08 = z;
    }

    public final void Dtf(C257113ws r3, C257263x7 r4, boolean z, boolean z2) {
        this.A09 = z2;
        this.A06 = SystemClock.elapsedRealtime();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A00(boolean r32) {
        /*
            r31 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            r6 = r31
            long r2 = r6.A03
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0010
            long r2 = r6.A05
        L_0x0010:
            long r4 = r6.A06
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            long r9 = r6.A05
            long r2 = r2 - r9
            int r12 = (int) r2
            long r2 = r4 - r9
            int r11 = (int) r2
            long r7 = r7 - r4
            int r2 = (int) r7
            r30 = r2
            int r8 = r6.A01
            boolean r2 = r6.A07
            r17 = r2
            if (r32 != 0) goto L_0x0031
            r26 = 0
            if (r8 > 0) goto L_0x0033
        L_0x0031:
            r26 = 1
        L_0x0033:
            boolean r3 = r6.A09
            long r4 = r6.A02
            long r14 = (long) r12
            if (r3 == 0) goto L_0x0056
            X.28m r2 = r6.A0C
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r2 = r2.A02
            X.1xk r2 = r2.abrSetting
            boolean r2 = r2.A0x
            if (r2 != 0) goto L_0x0056
        L_0x0044:
            r6.A05 = r0
            r6.A06 = r0
            r4 = 0
            r6.A01 = r4
            r6.A07 = r4
            r2 = -1
            r6.A03 = r2
            r6.A00 = r4
            r6.A04 = r0
            return
        L_0x0056:
            r28 = r3 ^ 1
            X.28m r7 = r6.A0C
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r12 = r7.A02
            r13 = 0
            X.1xk r3 = r12.abrSetting
            int r2 = r3.A0f
            r29 = 1
            if (r8 >= r2) goto L_0x0069
            r29 = 0
            r28 = 0
        L_0x0069:
            boolean r2 = r3.A0x
            if (r2 == 0) goto L_0x007e
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            long r2 = (long) r11
            int r16 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r16 >= 0) goto L_0x007e
            long r2 = r2 - r4
            int r11 = (int) r2
            r28 = 1
        L_0x007a:
            X.27v r7 = r7.A01
            monitor-enter(r7)
            goto L_0x0083
        L_0x007e:
            if (r28 != 0) goto L_0x007a
            if (r29 == 0) goto L_0x0044
            goto L_0x007a
        L_0x0083:
            java.lang.String r2 = "onTransferFinished"
            X.27d.A01(r2)     // Catch:{ all -> 0x0121 }
            r22 = r9
            r24 = r0
            r27 = r17
            r20 = r14
            r17 = r8
            r18 = r0
            r14 = r7
            r15 = r11
            r16 = r30
            X.27v.A01(r14, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)     // Catch:{ all -> 0x0121 }
            com.facebook.http.historical.NetworkInfoMap r8 = com.facebook.http.historical.NetworkInfoMap.A07     // Catch:{ all -> 0x0121 }
            monitor-enter(r8)     // Catch:{ all -> 0x0121 }
            X.28O r3 = r8.A01     // Catch:{ all -> 0x011e }
            r2 = 0
            if (r3 == 0) goto L_0x00a4
            r2 = 1
        L_0x00a4:
            monitor-exit(r8)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00ae
            X.27s r2 = r7.A05     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00ae
            r2.A00()     // Catch:{ all -> 0x0121 }
        L_0x00ae:
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r3 = r7.A02(r12)     // Catch:{ all -> 0x0121 }
            long r4 = r3.ttfbMs     // Catch:{ all -> 0x0121 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0118
            long r2 = r3.bandwidthBps     // Catch:{ all -> 0x0121 }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0118
            r16 = -1
            monitor-enter(r8)     // Catch:{ all -> 0x0121 }
            java.lang.String r10 = r8.A03     // Catch:{ all -> 0x011e }
            if (r10 == 0) goto L_0x0117
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011e }
            X.2Ak r9 = new X.2Ak     // Catch:{ all -> 0x011e }
            r18 = r4
            r22 = r2
            r14 = r9
            r15 = r10
            r14.<init>(r15, r16, r18, r20, r22)     // Catch:{ all -> 0x011e }
            r8.A02 = r9     // Catch:{ all -> 0x011e }
            android.util.LruCache r2 = r8.A06     // Catch:{ all -> 0x011e }
            r2.put(r10, r9)     // Catch:{ all -> 0x011e }
            X.28O r5 = r8.A01     // Catch:{ all -> 0x011e }
            if (r5 == 0) goto L_0x0117
            boolean r2 = r8.A05     // Catch:{ all -> 0x011e }
            if (r2 != 0) goto L_0x00f1
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011e }
            long r2 = r8.A00     // Catch:{ all -> 0x011e }
            long r9 = r9 - r2
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0117
        L_0x00f1:
            java.util.ArrayList r2 = r8.A01()     // Catch:{ all -> 0x011e }
            r5.A00(r2)     // Catch:{ all -> 0x011e }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x011e }
            r8.A00 = r2     // Catch:{ all -> 0x011e }
            boolean r2 = r8.A04     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0115
            java.lang.String r5 = "com.facebook.http.historical.NetworkInfoMap"
            java.lang.String r4 = "Writing cached bwe to disk: %s for network: %s"
            X.2Ak r3 = r8.A02     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r8.A03     // Catch:{ all -> 0x011e }
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}     // Catch:{ all -> 0x011e }
            java.lang.String r2 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x011e }
            android.util.Log.w(r5, r2)     // Catch:{ all -> 0x011e }
        L_0x0115:
            r8.A05 = r13     // Catch:{ all -> 0x011e }
        L_0x0117:
            monitor-exit(r8)     // Catch:{ all -> 0x0121 }
        L_0x0118:
            X.27d.A00()     // Catch:{ all -> 0x0126 }
            monitor-exit(r7)
            goto L_0x0044
        L_0x011e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0121 }
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            X.27d.A00()     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C250803m5.A00(boolean):void");
    }
}
