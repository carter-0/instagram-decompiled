package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3wk  reason: invalid class name and case insensitive filesystem */
public final class C257033wk extends C256443vm {
    public final VpsEventCallback A00;
    public final 29t A01;
    public final boolean A02;
    public final long A03;
    public final 28m A04;
    public final C250813m6 A05;
    public final HeroPlayerSetting A06;
    public final AnonymousClass27W A07;
    public final C256733wG A08;
    public final AtomicReference A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r2.A2p != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C257033wk(X.28m r11, X.C256423vk r12, com.facebook.exoplayer.monitor.VpsEventCallback r13, X.C250813m6 r14, X.29t r15, X.C256243vS r16, X.AnonymousClass5MV r17, com.facebook.video.heroplayer.setting.HeroPlayerSetting r18, X.AnonymousClass27W r19, X.C256733wG r20, java.lang.String r21, java.lang.String r22, java.util.concurrent.atomic.AtomicReference r23, long r24, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r10 = this;
            r9 = r26
            r5 = r16
            r3 = r10
            r4 = r12
            r6 = r17
            r7 = r21
            r8 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = r18
            r10.A06 = r2
            r10.A01 = r15
            r10.A04 = r11
            r10.A05 = r14
            r10.A00 = r13
            r0 = r19
            r10.A07 = r0
            r0 = r27
            r10.A0C = r0
            r0 = r28
            r10.A0A = r0
            r0 = r29
            r10.A0B = r0
            r0 = r24
            r10.A03 = r0
            r0 = r23
            r10.A09 = r0
            r0 = r20
            r10.A08 = r0
            boolean r0 = r2.A2n
            if (r0 != 0) goto L_0x0040
            boolean r1 = r2.A2p
            r0 = 0
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 1
        L_0x0041:
            r10.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257033wk.<init>(X.28m, X.3vk, com.facebook.exoplayer.monitor.VpsEventCallback, X.3m6, X.29t, X.3vS, X.5MV, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.27W, X.3wG, java.lang.String, java.lang.String, java.util.concurrent.atomic.AtomicReference, long, boolean, boolean, boolean, boolean):void");
    }

    public static C257353xG A00(C257033wk r9, String str) {
        C256733wG r0 = r9.A08;
        String str2 = str;
        if (r0 == null) {
            return new C257353xG(r9.A02, str2, "", "", -1.0f, -1, -1, -1, -1);
        }
        C256683wB r1 = r0.A02;
        C256243vS r2 = r9.A02;
        String str3 = r1.A0R;
        String str4 = "";
        String str5 = str4;
        if (str3 != null) {
            str5 = str3;
        }
        String str6 = r1.A0S;
        if (str6 != null) {
            str4 = str6;
        }
        return new C257353xG(r2, str2, str5, str4, r1.A01, r1.A0A, r1.A0L, r1.A04, r1.A0D);
    }

    public static void A01(C257033wk r5, String str) {
        VpsEventCallback vpsEventCallback;
        C256243vS r1;
        C255653uU r0;
        String str2;
        if (r5.A02 && (vpsEventCallback = r5.A00) != null && (r1 = r5.A02) != null && (r0 = r1.A0D) != null && (str2 = r0.A0G) != null) {
            vpsEventCallback.callback(new C305706Jf(str2, String.valueOf(r1.A0L), str, true));
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026a A[SYNTHETIC, Splitter:B:136:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02a2 A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05ae A[SYNTHETIC, Splitter:B:288:0x05ae] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0630 A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0643 A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x064a A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:? A[ExcHandler: EOFException (unused java.io.EOFException), SYNTHETIC, Splitter:B:328:0x0713] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x077e A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0783 A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07a0 A[Catch:{ Exception -> 0x0823 }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x07ee A[ExcHandler: all (th java.lang.Throwable), Splitter:B:191:0x0427] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x07f5 A[ExcHandler: 47q (e X.47q), Splitter:B:191:0x0427] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x084f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:444:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:117:0x0232=Splitter:B:117:0x0232, B:431:0x0822=Splitter:B:431:0x0822, B:302:0x05d3=Splitter:B:302:0x05d3, B:375:0x07c6=Splitter:B:375:0x07c6, B:266:0x0568=Splitter:B:266:0x0568, B:414:0x07fa=Splitter:B:414:0x07fa, B:335:0x071f=Splitter:B:335:0x071f} */
    public final void APw() {
        /*
            r103 = this;
            r102 = r103
            r0 = r102
            X.29t r3 = r0.A01
            X.3vS r2 = r0.A02
            X.28m r0 = r0.A04
            r47 = r0
            r0 = r102
            X.3m6 r0 = r0.A05
            r46 = r0
            r0 = r102
            com.facebook.exoplayer.monitor.VpsEventCallback r0 = r0.A00
            r20 = r0
            r0 = r102
            X.27W r0 = r0.A07
            r45 = r0
            r0 = r102
            boolean r0 = r0.A0C
            r44 = r0
            r0 = r102
            boolean r0 = r0.A0A
            r21 = r0
            r0 = r102
            boolean r0 = r0.A0B
            r14 = r0
            r0 = r102
            long r0 = r0.A03
            r18 = r0
            r0 = r102
            java.util.concurrent.atomic.AtomicReference r0 = r0.A09
            r31 = r0
            r0 = r102
            X.3wG r0 = r0.A08
            r30 = r0
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            long r4 = (long) r0     // Catch:{ Exception -> 0x0823 }
            int r0 = r3.A04     // Catch:{ Exception -> 0x0823 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0823 }
            r16 = r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            java.lang.String r4 = X.29t.A0E     // Catch:{ Exception -> 0x0823 }
            X.3uU r13 = r2.A0D     // Catch:{ Exception -> 0x0823 }
            android.net.Uri r0 = r13.A05     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0823 }
        L_0x0059:
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0823 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r0}     // Catch:{ Exception -> 0x0823 }
            java.lang.String r0 = "Attempting to prefetch more bytes than the prefetch size %s %d %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0823 }
            android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0823 }
            goto L_0x07b0
        L_0x0072:
            r3 = 0
            goto L_0x0059
        L_0x0074:
            X.3uU r13 = r2.A0D     // Catch:{ Exception -> 0x0823 }
            if (r13 == 0) goto L_0x02d0
            android.net.Uri r0 = r13.A05     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x02d0
            java.lang.String r1 = r0.getScheme()     // Catch:{ Exception -> 0x0823 }
            java.lang.String r0 = "msys"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x02d0
            X.4SX r5 = r2.A0P     // Catch:{ Exception -> 0x0823 }
            if (r5 == 0) goto L_0x02d0
            r0 = 0
            java.lang.String r10 = r13.A0G     // Catch:{ Exception -> 0x0823 }
            if (r10 == 0) goto L_0x00ca
            android.net.Uri r6 = r13.A05     // Catch:{ Exception -> 0x0823 }
            if (r6 == 0) goto L_0x00ca
            X.29r r14 = r3.A07     // Catch:{ Exception -> 0x0823 }
            if (r14 == 0) goto L_0x00ca
            java.lang.String r24 = X.29t.A0E     // Catch:{ Exception -> 0x0823 }
            java.lang.String r8 = "prefetchToE2EECache() - vid: %s, length: %d, uri: %s"
            r12 = 0
            int r4 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            r23 = 1
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0823 }
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r7, r4}     // Catch:{ Exception -> 0x0823 }
            r4 = r24
            X.27B.A01(r4, r8, r7)     // Catch:{ Exception -> 0x0823 }
            int r7 = r2.A02     // Catch:{ Exception -> 0x0823 }
            if (r7 != 0) goto L_0x00d1
            java.lang.String r5 = "E2EE prefetch request for Vid:%s with length:%d is skipped because bytes to prefetch is 0"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0823 }
            r4[r12] = r10     // Catch:{ Exception -> 0x0823 }
        L_0x00bf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0823 }
            r4[r23] = r3     // Catch:{ Exception -> 0x0823 }
            r3 = r24
            X.27B.A01(r3, r5, r4)     // Catch:{ Exception -> 0x0823 }
        L_0x00ca:
            X.3vi r3 = X.C256403vi.A01     // Catch:{ Exception -> 0x0823 }
            r3.A01(r13, r0)     // Catch:{ Exception -> 0x0823 }
            goto L_0x0849
        L_0x00d1:
            int r4 = r2.A04     // Catch:{ Exception -> 0x0823 }
            java.lang.String r22 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = r3.A09     // Catch:{ Exception -> 0x0823 }
            r39 = r4
            boolean r4 = r4.A2p     // Catch:{ Exception -> 0x0823 }
            r21 = r4
            if (r4 == 0) goto L_0x00f1
            boolean r4 = r2.A0L     // Catch:{ Exception -> 0x0823 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent r7 = new com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent     // Catch:{ Exception -> 0x0823 }
            r4 = r22
            r7.<init>(r10, r8, r4)     // Catch:{ Exception -> 0x0823 }
            r14.A00(r7)     // Catch:{ Exception -> 0x0823 }
        L_0x00f1:
            java.lang.String r9 = r2.A0G     // Catch:{ Exception -> 0x0823 }
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0823 }
            if (r4 == 0) goto L_0x0128
            android.net.Uri r7 = r13.A05     // Catch:{ Exception -> 0x0823 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0823 }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0823 }
            if (r7 == 0) goto L_0x0128
            java.lang.String r8 = r7.toString()     // Catch:{ Exception -> 0x0823 }
            X.0qQ.A07(r8)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r4 = "msys://com.facebook.orca"
            boolean r4 = X.00p.A0k(r8, r4, r12)     // Catch:{ Exception -> 0x0823 }
            if (r4 == 0) goto L_0x0157
            java.util.List r7 = r7.getPathSegments()     // Catch:{ Exception -> 0x0823 }
            int r4 = r7.size()     // Catch:{ Exception -> 0x0823 }
            if (r4 < r6) goto L_0x0128
            r4 = r23
            java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0823 }
            if (r7 != 0) goto L_0x0177
        L_0x0128:
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0823 }
            if (r4 == 0) goto L_0x0137
            java.lang.String r5 = "E2EE prefetch request for Vid:%s with length:%d is skipped because cache key is empty"
        L_0x0130:
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0823 }
            r4[r12] = r10     // Catch:{ Exception -> 0x0823 }
            int r7 = r2.A02     // Catch:{ Exception -> 0x0823 }
            goto L_0x00bf
        L_0x0137:
            int r4 = r2.A02     // Catch:{ Exception -> 0x0823 }
            X.3wl r8 = new X.3wl     // Catch:{ Exception -> 0x0823 }
            r8.<init>(r3, r4)     // Catch:{ Exception -> 0x0823 }
            X.3mW r11 = r2.A0Q     // Catch:{ Exception -> 0x0823 }
            if (r11 == 0) goto L_0x0152
            r11.A98(r8, r9)     // Catch:{ Exception -> 0x0823 }
            X.3wm r4 = new X.3wm     // Catch:{ Exception -> 0x0823 }
            r4.<init>()     // Catch:{ Exception -> 0x0823 }
            r14.A00(r4)     // Catch:{ Exception -> 0x0823 }
            X.3ws r19 = r5.ALo()     // Catch:{ Exception -> 0x0823 }
            goto L_0x0179
        L_0x0152:
            monitor-enter(r3)     // Catch:{ Exception -> 0x0823 }
            monitor-exit(r3)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r5 = "E2EE prefetch request for Vid:%s with length:%d is skipped because E2EE cache is null"
            goto L_0x0130
        L_0x0157:
            r4 = 972(0x3cc, float:1.362E-42)
            java.lang.String r4 = X.C66579MXk.A00(r4)     // Catch:{ Exception -> 0x0823 }
            boolean r4 = X.00p.A0k(r8, r4, r12)     // Catch:{ Exception -> 0x0823 }
            if (r4 == 0) goto L_0x0174
            java.lang.String r4 = "sha256"
        L_0x0165:
            java.lang.String r4 = r7.getQueryParameter(r4)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            int r4 = r7.length()     // Catch:{ Exception -> 0x0823 }
            if (r4 <= 0) goto L_0x0128
            goto L_0x0177
        L_0x0174:
            java.lang.String r4 = "content_token"
            goto L_0x0165
        L_0x0177:
            r9 = r7
            goto L_0x0128
        L_0x0179:
            int r5 = r2.A02     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            if (r5 > 0) goto L_0x0180
            r4 = -1
            if (r5 != r4) goto L_0x0230
        L_0x0180:
            r28 = 0
            java.util.Map r29 = java.util.Collections.emptyMap()     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            android.net.Uri r4 = r13.A05     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r16 = r4
            long r4 = r2.A07     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x0192
            r4 = 0
        L_0x0192:
            int r6 = r2.A02     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            if (r6 <= 0) goto L_0x0198
            long r6 = (long) r6     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            goto L_0x019a
        L_0x0198:
            r6 = -1
        L_0x019a:
            X.C256703wD.A02(r16)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            X.3x7 r15 = X.C257263x7.A0B     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            X.3x6 r27 = new X.3x6     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r27.<init>()     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            X.3x7 r15 = new X.3x7     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r25 = r15
            r26 = r16
            r30 = r28
            r31 = r23
            r32 = r12
            r33 = r0
            r35 = r4
            r37 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r35, r37)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            java.util.Map r4 = r3.A0C     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r26 = r4
            boolean r4 = X.C257273x8.A00(r26)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            if (r4 == 0) goto L_0x01d2
            if (r9 == 0) goto L_0x01d2
            java.util.Map r5 = r3.A0B     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            monitor-enter(r5)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r4 = r19
            r5.put(r9, r4)     // Catch:{ all -> 0x01cf }
            monitor-exit(r5)     // Catch:{ all -> 0x01cf }
            goto L_0x01d2
        L_0x01cf:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01cf }
            throw r4     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
        L_0x01d2:
            r5 = r19
            long r4 = r5.open(r15)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x01e7
            int r7 = r2.A02     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            if (r7 <= 0) goto L_0x01f4
            int r6 = (int) r4     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
        L_0x01e5:
            r2.A02 = r6     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
        L_0x01e7:
            int r4 = r2.A02     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            if (r4 <= 0) goto L_0x0230
            r18 = 65536(0x10000, float:9.18355E-41)
            r4 = r18
            byte[] r4 = new byte[r4]     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            r25 = r4
            goto L_0x01f6
        L_0x01f4:
            int r6 = (int) r4     // Catch:{ 47q -> 0x07c1, IOException -> 0x024e, all -> 0x07ba }
            goto L_0x01e5
        L_0x01f6:
            r4 = 0
        L_0x01f8:
            int r15 = r2.A02     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            long r6 = (long) r15     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0232
            int r6 = (int) r4     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            int r15 = r15 - r6
            r6 = r18
            int r15 = java.lang.Math.min(r6, r15)     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            r7 = r19
            r6 = r25
            int r6 = r7.read(r6, r12, r15)     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            long r6 = (long) r6     // Catch:{ 47q -> 0x0218, IOException -> 0x0216 }
            int r15 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0232
            long r4 = r4 + r6
            goto L_0x01f8
        L_0x0216:
            r7 = move-exception
            goto L_0x0251
        L_0x0218:
            r7 = move-exception
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x07c4
            r19.close()     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r26)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0285
            if (r9 == 0) goto L_0x0285
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r9)     // Catch:{ all -> 0x07b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x0285
        L_0x0230:
            r4 = 0
        L_0x0232:
            r19.close()     // Catch:{ Exception -> 0x0823 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x023c
            r11.EDy(r8, r9)     // Catch:{ Exception -> 0x0823 }
        L_0x023c:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0285
            if (r9 == 0) goto L_0x0285
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r9)     // Catch:{ all -> 0x07b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x07b7 }
            goto L_0x0285
        L_0x024e:
            r7 = move-exception
            r4 = 0
        L_0x0251:
            java.lang.String r12 = "IO Exception E2EE prefetching CacheKey:%s, Read:%d"
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07c5 }
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r6}     // Catch:{ all -> 0x07c5 }
            java.lang.String r12 = java.lang.String.format(r12, r6)     // Catch:{ all -> 0x07c5 }
            r6 = r24
            android.util.Log.e(r6, r12, r7)     // Catch:{ all -> 0x07c5 }
            r6 = r39
            boolean r6 = r6.A37     // Catch:{ all -> 0x07c5 }
            if (r6 != 0) goto L_0x07c4
            r19.close()     // Catch:{ Exception -> 0x0823 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0274
            r11.EDy(r8, r9)     // Catch:{ Exception -> 0x0823 }
        L_0x0274:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0285
            if (r9 == 0) goto L_0x0285
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r9)     // Catch:{ all -> 0x07be }
            monitor-exit(r0)     // Catch:{ all -> 0x07be }
        L_0x0285:
            java.lang.String r6 = "E2EE prefetched VideoId %s, PrefetchLength %d, total read %d, fetched length from network %d, CacheKey %s"
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            long r0 = r8.A00     // Catch:{ Exception -> 0x0823 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r7, r3, r0, r9}     // Catch:{ Exception -> 0x0823 }
            r0 = r24
            X.27B.A01(r0, r6, r1)     // Catch:{ Exception -> 0x0823 }
            if (r21 == 0) goto L_0x02c2
            boolean r0 = r2.A0L     // Catch:{ Exception -> 0x0823 }
            java.lang.String r28 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            long r0 = r8.A00     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r3 = r2.A0E     // Catch:{ Exception -> 0x0823 }
            java.lang.String r30 = X.XVY.A00(r3)     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent r3 = new com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent     // Catch:{ Exception -> 0x0823 }
            r24 = r3
            r25 = r4
            r27 = r10
            r29 = r22
            r31 = r0
            r24.<init>(r25, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0823 }
            r14.A00(r3)     // Catch:{ Exception -> 0x0823 }
        L_0x02c2:
            X.3xD r1 = new X.3xD     // Catch:{ Exception -> 0x0823 }
            r0 = r23
            r1.<init>(r10, r0)     // Catch:{ Exception -> 0x0823 }
            r14.A00(r1)     // Catch:{ Exception -> 0x0823 }
            long r0 = r8.A00     // Catch:{ Exception -> 0x0823 }
            goto L_0x00ca
        L_0x02d0:
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            r84 = 0
            if (r0 == 0) goto L_0x07b0
            X.29r r15 = r3.A07     // Catch:{ Exception -> 0x0823 }
            if (r15 == 0) goto L_0x02f8
            java.lang.String r5 = r13.A0G     // Catch:{ Exception -> 0x0823 }
            if (r5 == 0) goto L_0x02f8
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A09     // Catch:{ Exception -> 0x0823 }
            boolean r0 = r0.A2p     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x02f8
            boolean r0 = r2.A0L     // Catch:{ Exception -> 0x0823 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            int r0 = r2.A04     // Catch:{ Exception -> 0x0823 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent r0 = new com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent     // Catch:{ Exception -> 0x0823 }
            r0.<init>(r5, r4, r1)     // Catch:{ Exception -> 0x0823 }
            r15.A00(r0)     // Catch:{ Exception -> 0x0823 }
        L_0x02f8:
            java.lang.String r0 = r2.A0G     // Catch:{ Exception -> 0x0823 }
            r29 = r0
            java.lang.String r0 = r13.A0G     // Catch:{ Exception -> 0x0823 }
            r27 = r0
            android.net.Uri r5 = r13.A05     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A09     // Catch:{ Exception -> 0x0823 }
            r101 = r0
            r9 = 0
            boolean r0 = r2.A0W     // Catch:{ Exception -> 0x0823 }
            r1 = r101
            boolean r6 = r1.A3G     // Catch:{ Exception -> 0x0823 }
            r4 = r29
            r1 = r27
            java.lang.String r6 = X.27B.A00(r5, r4, r1, r0, r6)     // Catch:{ Exception -> 0x0823 }
            r5 = 2
            r28 = 1
            r1 = r101
            boolean r1 = r1.A3E     // Catch:{ Exception -> 0x0823 }
            if (r1 == 0) goto L_0x033d
            java.util.Map r1 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0823 }
            boolean r4 = r1.containsKey(r6)     // Catch:{ all -> 0x07e5 }
            monitor-exit(r1)     // Catch:{ all -> 0x07e5 }
            if (r4 == 0) goto L_0x033d
            java.lang.String r4 = X.29t.A0E     // Catch:{ Exception -> 0x0823 }
            java.lang.String r3 = "prefetch request for Vid:%s with length:%d is skipped because a prefetch request with the same vid is already in progress"
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            r0 = r27
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ Exception -> 0x0823 }
            X.27B.A01(r4, r3, r0)     // Catch:{ Exception -> 0x0823 }
            goto L_0x07b0
        L_0x033d:
            int r1 = r2.A02     // Catch:{ Exception -> 0x0823 }
            X.3wl r12 = new X.3wl     // Catch:{ Exception -> 0x0823 }
            r12.<init>(r3, r1)     // Catch:{ Exception -> 0x0823 }
            X.2OG r4 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            X.3p9 r26 = X.C252463p9.PROGRESSIVE     // Catch:{ Exception -> 0x0823 }
            r11 = r26
            int r1 = r2.A04     // Catch:{ Exception -> 0x0823 }
            r100 = r1
            r7 = r1
            r1 = r28
            if (r7 != r1) goto L_0x0358
            X.3p9 r26 = X.C252463p9.DASH_AUDIO     // Catch:{ Exception -> 0x0823 }
            goto L_0x035c
        L_0x0358:
            if (r7 != r5) goto L_0x035c
            X.3p9 r26 = X.C252463p9.DASH_VIDEO     // Catch:{ Exception -> 0x0823 }
        L_0x035c:
            if (r4 == 0) goto L_0x0361
            r4.A98(r12, r6)     // Catch:{ Exception -> 0x0823 }
        L_0x0361:
            if (r15 == 0) goto L_0x036d
            if (r27 == 0) goto L_0x036d
            X.3wm r1 = new X.3wm     // Catch:{ Exception -> 0x0823 }
            r1.<init>()     // Catch:{ Exception -> 0x0823 }
            r15.A00(r1)     // Catch:{ Exception -> 0x0823 }
        L_0x036d:
            java.lang.String r25 = X.29t.A0E     // Catch:{ Exception -> 0x0823 }
            java.lang.String r4 = "Prefetch Vid:%s from %s, Format:%s, PrefetchLength:%d, RequestKey:%s, AugmentedKey: %s"
            java.lang.String r10 = r13.A0A     // Catch:{ Exception -> 0x0823 }
            X.3uR r1 = r13.A07     // Catch:{ Exception -> 0x0823 }
            java.lang.String r34 = r1.name()     // Catch:{ Exception -> 0x0823 }
            int r1 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r35 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0823 }
            r32 = r27
            r33 = r10
            r36 = r29
            r37 = r6
            java.lang.Object[] r5 = new java.lang.Object[]{r32, r33, r34, r35, r36, r37}     // Catch:{ Exception -> 0x0823 }
            r1 = r25
            X.27B.A01(r1, r4, r5)     // Catch:{ Exception -> 0x0823 }
            boolean r1 = r2.A0M     // Catch:{ Exception -> 0x0823 }
            r81 = r1 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0823 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r8 = r13.A0B     // Catch:{ Exception -> 0x0823 }
            X.28e r7 = r2.A0B     // Catch:{ Exception -> 0x0823 }
            X.3uT r5 = r13.A06     // Catch:{ Exception -> 0x0823 }
            java.lang.String r39 = ""
            boolean r4 = r2.A0L     // Catch:{ Exception -> 0x0823 }
            X.3wn r72 = new X.3wn     // Catch:{ Exception -> 0x0823 }
            r33 = r72
            r34 = r7
            r35 = r5
            r36 = r27
            r37 = r10
            r38 = r8
            r40 = r39
            r41 = r1
            r42 = r0
            r43 = r4
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0823 }
            r24 = 0
            java.lang.String r8 = r2.A0H     // Catch:{ Exception -> 0x0823 }
            r87 = 0
            r4 = r26
            if (r4 != r11) goto L_0x03c8
            r87 = 1
        L_0x03c8:
            java.util.HashMap r78 = new java.util.HashMap     // Catch:{ Exception -> 0x0823 }
            r78.<init>()     // Catch:{ Exception -> 0x0823 }
            X.27k r0 = r3.A08     // Catch:{ Exception -> 0x0823 }
            r4 = 8
            int r82 = X.27k.A00(r0, r4)     // Catch:{ Exception -> 0x0823 }
            int r83 = X.27k.A00(r0, r9)     // Catch:{ Exception -> 0x0823 }
            boolean r7 = r13.A0M     // Catch:{ Exception -> 0x0823 }
            boolean r5 = r13.A0N     // Catch:{ Exception -> 0x0823 }
            r23 = 0
            if (r30 == 0) goto L_0x0424
            r0 = r30
            X.3wB r0 = r0.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.String r4 = r0.A0R     // Catch:{ Exception -> 0x0823 }
        L_0x03e7:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0823 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0823 }
            r22 = -1
            r67 = r3
            r68 = r47
            r69 = r20
            r70 = r46
            r71 = r26
            r73 = r45
            r74 = r24
            r75 = r8
            r76 = r4
            r77 = r24
            r79 = r1
            r80 = r0
            r86 = r28
            r88 = r7
            r89 = r5
            r90 = r44
            r91 = r21
            r92 = r14
            r93 = r9
            X.3wu r14 = r67.A04(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r86, r87, r88, r89, r90, r91, r92, r93)     // Catch:{ Exception -> 0x0823 }
            X.3x3 r21 = new X.3x3     // Catch:{ Exception -> 0x0823 }
            r4 = r21
            r1 = r27
            r0 = r28
            r4.<init>(r1, r0)     // Catch:{ Exception -> 0x0823 }
            goto L_0x0427
        L_0x0424:
            r4 = r24
            goto L_0x03e7
        L_0x0427:
            int r1 = r2.A02     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
            if (r1 > 0) goto L_0x042f
            r0 = r22
            if (r1 != r0) goto L_0x0566
        L_0x042f:
            X.3x4 r0 = X.C257233x4.A01     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
            X.3x5 r0 = r0.A00     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
            r33 = r0
            r89 = 0
            java.util.Map r90 = java.util.Collections.emptyMap()     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
            android.net.Uri r8 = r13.A05     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
            if (r8 != 0) goto L_0x0441
            android.net.Uri r8 = android.net.Uri.EMPTY     // Catch:{ 47q -> 0x07f5, IOException -> 0x0590, all -> 0x07ee }
        L_0x0441:
            long r4 = r2.A07     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            int r0 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r0 > 0) goto L_0x0449
            r4 = 0
        L_0x0449:
            int r0 = r2.A02     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r0 <= 0) goto L_0x044f
            long r10 = (long) r0     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            goto L_0x0451
        L_0x044f:
            r10 = -1
        L_0x0451:
            java.lang.String r0 = r2.A0I     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r7 = r0
            int r0 = r2.A01     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            long r0 = (long) r0     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r57 = r0
            r0 = r26
            int r0 = r0.A00     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r55 = -1
            X.3x6 r32 = new X.3x6     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r34 = r21
            r35 = r7
            r36 = r24
            r37 = r24
            r38 = r24
            r41 = r24
            r42 = r24
            r43 = r9
            r44 = r9
            r45 = r9
            r46 = r0
            r47 = r28
            r48 = r22
            r49 = r22
            r50 = r22
            r51 = r22
            r52 = r22
            r53 = r57
            r57 = r55
            r59 = r55
            r61 = r55
            r63 = r55
            r65 = r55
            r67 = r9
            r68 = r9
            r69 = r9
            r70 = r9
            r71 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r57, r59, r61, r63, r65, r67, r68, r69, r70, r71)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r29 == 0) goto L_0x04a0
            r89 = r29
        L_0x04a0:
            X.C256703wD.A02(r8)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            X.3x7 r7 = new X.3x7     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r86 = r7
            r87 = r8
            r88 = r32
            r91 = r24
            r92 = r28
            r94 = r84
            r96 = r4
            r98 = r10
            r86.<init>(r87, r88, r89, r90, r91, r92, r93, r94, r96, r98)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            int r0 = (r18 > r84 ? 1 : (r18 == r84 ? 0 : -1))
            if (r0 <= 0) goto L_0x04cf
            java.lang.String r5 = "x-fb-socket-option"
            java.lang.String r4 = "QUIC_MAX_PACING_RATE="
            r0 = r18
            java.lang.String r1 = X.002.A0Q(r4, r0)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r1 == 0) goto L_0x04cf
            X.3x6 r0 = r7.A07     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            java.util.Map r0 = r0.A0Q     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r0.put(r5, r1)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x04cf:
            java.util.Map r11 = r3.A0C     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            boolean r0 = X.C257273x8.A00(r11)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r0 == 0) goto L_0x04e4
            if (r6 == 0) goto L_0x04e4
            java.util.Map r0 = r3.A0B     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            monitor-enter(r0)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r0.put(r6, r14)     // Catch:{ all -> 0x04e1 }
            monitor-exit(r0)     // Catch:{ all -> 0x04e1 }
            goto L_0x04e4
        L_0x04e1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x04e1 }
            goto L_0x052b
        L_0x04e4:
            long r0 = r14.open(r7)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            int r4 = (r0 > r84 ? 1 : (r0 == r84 ? 0 : -1))
            if (r4 <= 0) goto L_0x04f7
            int r5 = r2.A02     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r5 <= 0) goto L_0x04fb
            int r4 = (int) r0     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x04f5:
            r2.A02 = r4     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x04f7:
            int r4 = r2.A02     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            long r0 = (long) r4     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            goto L_0x04fd
        L_0x04fb:
            int r4 = (int) r0     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            goto L_0x04f5
        L_0x04fd:
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x052c
            java.lang.String r4 = "Attempting to completed unbounded prefetch with more bytes than the prefetch size %s %d %d"
            android.net.Uri r0 = r13.A05     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            if (r0 == 0) goto L_0x050b
            java.lang.String r23 = r0.toString()     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x050b:
            int r0 = r2.A02     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r0 = r23
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r5}     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            java.lang.String r1 = java.lang.String.format(r4, r0)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r0 = r25
            android.util.Log.e(r0, r1)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            java.lang.String r0 = "Attempting to cache amount greater than CacheSize"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r1.<init>(r0)     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x052b:
            throw r1     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
        L_0x052c:
            if (r4 <= 0) goto L_0x0566
            r7 = 65536(0x10000, float:9.18355E-41)
            byte[] r10 = new byte[r7]     // Catch:{ 47q -> 0x07f5, IOException -> 0x058e, all -> 0x07ee }
            r4 = 0
        L_0x0534:
            int r8 = r2.A02     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            long r0 = (long) r8     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            int r16 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x0568
            int r0 = (int) r4     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            int r8 = r8 - r0
            int r0 = java.lang.Math.min(r7, r8)     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            int r0 = r14.read(r10, r9, r0)     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            long r0 = (long) r0     // Catch:{ 47q -> 0x054e, IOException -> 0x054c }
            int r8 = (r0 > r55 ? 1 : (r0 == r55 ? 0 : -1))
            if (r8 == 0) goto L_0x0568
            long r4 = r4 + r0
            goto L_0x0534
        L_0x054c:
            r8 = move-exception
            goto L_0x0593
        L_0x054e:
            r8 = move-exception
            int r0 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r0 == 0) goto L_0x07f8
            r14.close()     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r11)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x05d3
            if (r6 == 0) goto L_0x05d3
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r6)     // Catch:{ all -> 0x07e8 }
            monitor-exit(r0)     // Catch:{ all -> 0x07e8 }
            goto L_0x05d3
        L_0x0566:
            r4 = 0
        L_0x0568:
            r14.close()     // Catch:{ Exception -> 0x0823 }
            int r0 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r0 != 0) goto L_0x057c
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x057c
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            r0.EDy(r12, r6)     // Catch:{ Exception -> 0x0823 }
        L_0x057c:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x05d3
            if (r6 == 0) goto L_0x05d3
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r6)     // Catch:{ all -> 0x07eb }
            monitor-exit(r0)     // Catch:{ all -> 0x07eb }
            goto L_0x05d3
        L_0x058e:
            r8 = move-exception
            goto L_0x0591
        L_0x0590:
            r8 = move-exception
        L_0x0591:
            r4 = 0
        L_0x0593:
            java.lang.String r7 = "IO Exception prefetching CacheKey:%s, Read:%d"
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07f9 }
            r0 = r29
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ all -> 0x07f9 }
            java.lang.String r1 = java.lang.String.format(r7, r0)     // Catch:{ all -> 0x07f9 }
            r0 = r25
            android.util.Log.e(r0, r1, r8)     // Catch:{ all -> 0x07f9 }
            r0 = r101
            boolean r0 = r0.A37     // Catch:{ all -> 0x07f9 }
            if (r0 != 0) goto L_0x07f8
            r14.close()     // Catch:{ Exception -> 0x0823 }
            int r0 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r0 != 0) goto L_0x05c2
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x05c2
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            r0.EDy(r12, r6)     // Catch:{ Exception -> 0x0823 }
        L_0x05c2:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x05d3
            if (r6 == 0) goto L_0x05d3
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r6)     // Catch:{ all -> 0x07f2 }
            monitor-exit(r0)     // Catch:{ all -> 0x07f2 }
        L_0x05d3:
            java.util.HashMap r51 = new java.util.HashMap     // Catch:{ Exception -> 0x0823 }
            r51.<init>()     // Catch:{ Exception -> 0x0823 }
            X.3p9 r44 = X.C252463p9.DASH_VIDEO     // Catch:{ Exception -> 0x0823 }
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0823 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0823 }
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x0823 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r48 = "initSeg"
            r40 = r3
            r41 = r24
            r42 = r24
            r43 = r24
            r45 = r72
            r46 = r24
            r47 = r24
            r49 = r24
            r50 = r24
            r52 = r1
            r53 = r0
            r54 = r9
            r55 = r9
            r56 = r9
            r57 = r84
            r59 = r9
            r60 = r9
            r61 = r9
            r62 = r9
            r63 = r9
            r64 = r9
            r65 = r9
            r66 = r28
            X.3wu r10 = r40.A04(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ Exception -> 0x0823 }
            if (r30 == 0) goto L_0x0733
            r55 = -1
            if (r31 == 0) goto L_0x0733
            long r0 = r2.A08     // Catch:{ Exception -> 0x0823 }
            int r3 = (r0 > r55 ? 1 : (r0 == r55 ? 0 : -1))
            if (r3 <= 0) goto L_0x0643
            java.lang.String r1 = r30.A03()     // Catch:{ Exception -> 0x0823 }
            java.lang.String r0 = "webm"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0643
            r0 = r30
            X.3vz r3 = r0.A03     // Catch:{ Exception -> 0x0823 }
            X.3vz r0 = r30.A01()     // Catch:{ Exception -> 0x0823 }
            if (r3 == 0) goto L_0x0733
            java.lang.String r1 = r30.A03()     // Catch:{ Exception -> 0x0823 }
            X.3vz r3 = r3.A01(r0, r1)     // Catch:{ Exception -> 0x0823 }
            goto L_0x0648
        L_0x0643:
            X.3vz r3 = r30.A01()     // Catch:{ Exception -> 0x0823 }
            r0 = r3
        L_0x0648:
            if (r3 == 0) goto L_0x0733
            X.4Sg r40 = X.C264994Sc.A0A     // Catch:{ Exception -> 0x0823 }
            r1 = r30
            java.util.List r1 = r1.A04     // Catch:{ Exception -> 0x0823 }
            r1.get(r9)     // Catch:{ Exception -> 0x0823 }
            r1 = r30
            X.3wB r1 = r1.A02     // Catch:{ Exception -> 0x0823 }
            r23 = r1
            java.util.List r44 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x0823 }
            X.4Rs r42 = X.C264894Rs.A03     // Catch:{ Exception -> 0x0823 }
            r1 = r101
            int r7 = r1.A0H     // Catch:{ Exception -> 0x0823 }
            boolean r1 = r1.A2I     // Catch:{ Exception -> 0x0823 }
            r41 = r23
            r45 = r22
            r46 = r7
            r47 = r9
            r48 = r9
            r49 = r1
            r50 = r9
            X.4Sc r72 = r40.AMh(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ Exception -> 0x0823 }
            r89 = 0
            java.util.Map r90 = java.util.Collections.emptyMap()     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0692
            java.lang.String r1 = r30.A03()     // Catch:{ Exception -> 0x0823 }
            android.net.Uri r87 = r0.A00(r1)     // Catch:{ Exception -> 0x0823 }
        L_0x0687:
            long r0 = r3.A02     // Catch:{ Exception -> 0x0823 }
            r18 = r0
            long r7 = r3.A01     // Catch:{ Exception -> 0x0823 }
            int r0 = (r7 > r84 ? 1 : (r7 == r84 ? 0 : -1))
            if (r0 > 0) goto L_0x0697
            goto L_0x0695
        L_0x0692:
            android.net.Uri r87 = android.net.Uri.EMPTY     // Catch:{ Exception -> 0x0823 }
            goto L_0x0687
        L_0x0695:
            r7 = -1
        L_0x0697:
            java.lang.String r11 = r2.A0I     // Catch:{ Exception -> 0x0823 }
            int r0 = r2.A01     // Catch:{ Exception -> 0x0823 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0823 }
            r16 = r0
            r0 = r26
            int r3 = r0.A00     // Catch:{ Exception -> 0x0823 }
            long r0 = r2.A09     // Catch:{ Exception -> 0x0823 }
            X.3x5 r33 = X.C257243x5.A02     // Catch:{ Exception -> 0x0823 }
            X.3x6 r32 = new X.3x6     // Catch:{ Exception -> 0x0823 }
            r34 = r21
            r35 = r11
            r36 = r24
            r37 = r24
            r38 = r24
            r41 = r24
            r42 = r24
            r43 = r9
            r44 = r9
            r45 = r9
            r46 = r3
            r47 = r28
            r48 = r22
            r49 = r22
            r50 = r22
            r51 = r22
            r52 = r22
            r53 = r16
            r57 = r0
            r59 = r55
            r61 = r55
            r63 = r55
            r65 = r55
            r67 = r9
            r68 = r9
            r69 = r9
            r70 = r9
            r71 = r9
            r40 = r39
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r57, r59, r61, r63, r65, r67, r68, r69, r70, r71)     // Catch:{ Exception -> 0x0823 }
            if (r29 == 0) goto L_0x06e9
            r89 = r29
        L_0x06e9:
            X.C256703wD.A02(r87)     // Catch:{ Exception -> 0x0823 }
            X.3x7 r86 = new X.3x7     // Catch:{ Exception -> 0x0823 }
            r88 = r32
            r91 = r24
            r92 = r28
            r94 = r84
            r96 = r18
            r98 = r7
            r86.<init>(r87, r88, r89, r90, r91, r92, r93, r94, r96, r98)     // Catch:{ Exception -> 0x0823 }
            X.4XK r0 = new X.4XK     // Catch:{ Exception -> 0x0823 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0823 }
            X.4Xw r1 = new X.4Xw     // Catch:{ Exception -> 0x0823 }
            r73 = r0
            r74 = r86
            r75 = r24
            r76 = r9
            r70 = r1
            r71 = r23
            r70.<init>(r71, r72, r73, r74, r75, r76)     // Catch:{ Exception -> 0x0823 }
            r1.Cg1()     // Catch:{ EOFException -> 0x0733, IOException -> 0x071e }
            r0 = r31
            r0.set(r1)     // Catch:{ EOFException -> 0x0733, IOException -> 0x071c }
            goto L_0x0733
        L_0x071c:
            r3 = move-exception
            goto L_0x071f
        L_0x071e:
            r3 = move-exception
        L_0x071f:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0823 }
            java.lang.String r0 = "Failed to load initialization chunk"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x0823 }
            r0 = r25
            android.util.Log.e(r0, r1, r3)     // Catch:{ Exception -> 0x0823 }
            r1 = r31
            r0 = r24
            r1.set(r0)     // Catch:{ Exception -> 0x0823 }
        L_0x0733:
            java.lang.String r7 = "Prefetched VideoId %s, PrefetchLength %d, total read %d, fetched length from network %d, CacheKey %s"
            int r0 = r2.A02     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0823 }
            long r0 = r12.A00     // Catch:{ Exception -> 0x0823 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            r0 = r27
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r8, r3, r1, r6}     // Catch:{ Exception -> 0x0823 }
            r0 = r25
            X.27B.A01(r0, r7, r1)     // Catch:{ Exception -> 0x0823 }
            if (r15 == 0) goto L_0x077a
            r0 = r101
            boolean r0 = r0.A2p     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x077a
            boolean r0 = r2.A0L     // Catch:{ Exception -> 0x0823 }
            java.lang.String r33 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            java.lang.String r34 = java.lang.String.valueOf(r100)     // Catch:{ Exception -> 0x0823 }
            long r0 = r12.A00     // Catch:{ Exception -> 0x0823 }
            java.lang.Integer r3 = r2.A0E     // Catch:{ Exception -> 0x0823 }
            java.lang.String r35 = X.XVY.A00(r3)     // Catch:{ Exception -> 0x0823 }
            com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent r3 = new com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent     // Catch:{ Exception -> 0x0823 }
            r29 = r3
            r30 = r4
            r32 = r27
            r36 = r0
            r29.<init>(r30, r32, r33, r34, r35, r36)     // Catch:{ Exception -> 0x0823 }
            r15.A00(r3)     // Catch:{ Exception -> 0x0823 }
        L_0x077a:
            boolean r0 = r14 instanceof X.C257193x0     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0783
            X.3x0 r14 = (X.C257193x0) r14     // Catch:{ Exception -> 0x0823 }
            long r0 = r14.A02     // Catch:{ Exception -> 0x0823 }
            goto L_0x0785
        L_0x0783:
            r0 = 0
        L_0x0785:
            int r3 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r3 <= 0) goto L_0x079e
            int r3 = (r0 > r84 ? 1 : (r0 == r84 ? 0 : -1))
            if (r3 <= 0) goto L_0x079e
            java.lang.String r3 = "resourceLength of videoId %s is %d"
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0823 }
            r0 = r27
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}     // Catch:{ Exception -> 0x0823 }
            r0 = r25
            X.27B.A01(r0, r3, r1)     // Catch:{ Exception -> 0x0823 }
        L_0x079e:
            if (r15 == 0) goto L_0x07ac
            X.3xD r3 = new X.3xD     // Catch:{ Exception -> 0x0823 }
            r1 = r27
            r0 = r28
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x0823 }
            r15.A00(r3)     // Catch:{ Exception -> 0x0823 }
        L_0x07ac:
            long r0 = r12.A00     // Catch:{ Exception -> 0x0823 }
            goto L_0x00ca
        L_0x07b0:
            r0 = 0
            goto L_0x00ca
        L_0x07b4:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07b4 }
            goto L_0x0822
        L_0x07b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07b7 }
            goto L_0x0822
        L_0x07ba:
            r7 = move-exception
            r4 = 0
            goto L_0x07c6
        L_0x07be:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07be }
            goto L_0x0822
        L_0x07c1:
            r7 = move-exception
            r4 = 0
        L_0x07c4:
            throw r7     // Catch:{ all -> 0x07c5 }
        L_0x07c5:
            r7 = move-exception
        L_0x07c6:
            r19.close()     // Catch:{ Exception -> 0x0823 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x07d0
            r11.EDy(r8, r9)     // Catch:{ Exception -> 0x0823 }
        L_0x07d0:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0822
            if (r9 == 0) goto L_0x0822
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r9)     // Catch:{ all -> 0x07e2 }
            monitor-exit(r0)     // Catch:{ all -> 0x07e2 }
            goto L_0x0822
        L_0x07e2:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07e2 }
            goto L_0x0822
        L_0x07e5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07e5 }
            goto L_0x0822
        L_0x07e8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07e8 }
            goto L_0x0822
        L_0x07eb:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07eb }
            goto L_0x0822
        L_0x07ee:
            r7 = move-exception
            r4 = 0
            goto L_0x07fa
        L_0x07f2:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x07f2 }
            goto L_0x0822
        L_0x07f5:
            r8 = move-exception
            r4 = 0
        L_0x07f8:
            throw r8     // Catch:{ all -> 0x07f9 }
        L_0x07f9:
            r7 = move-exception
        L_0x07fa:
            r14.close()     // Catch:{ Exception -> 0x0823 }
            int r0 = (r4 > r84 ? 1 : (r4 == r84 ? 0 : -1))
            if (r0 != 0) goto L_0x080e
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x080e
            X.2OG r0 = r3.A03()     // Catch:{ Exception -> 0x0823 }
            r0.EDy(r12, r6)     // Catch:{ Exception -> 0x0823 }
        L_0x080e:
            java.util.Map r0 = r3.A0C     // Catch:{ Exception -> 0x0823 }
            boolean r0 = X.C257273x8.A00(r0)     // Catch:{ Exception -> 0x0823 }
            if (r0 == 0) goto L_0x0822
            if (r6 == 0) goto L_0x0822
            java.util.Map r0 = r3.A0B     // Catch:{ Exception -> 0x0823 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0823 }
            r0.remove(r6)     // Catch:{ all -> 0x0820 }
            monitor-exit(r0)     // Catch:{ all -> 0x0820 }
            goto L_0x0822
        L_0x0820:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0820 }
        L_0x0822:
            throw r7     // Catch:{ Exception -> 0x0823 }
        L_0x0823:
            r4 = move-exception
            r0 = 0
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r1 = "VodUriPrefetchTask"
            java.lang.String r0 = "prefetch sync failed with exception"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            android.util.Log.e(r1, r0, r4)
            r0 = r102
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0849
            if (r20 == 0) goto L_0x0849
            if (r2 == 0) goto L_0x0849
            java.lang.String r1 = "FAIL"
            r0 = r102
            X.3xG r1 = A00(r0, r1)
            r0 = r20
            r0.callback(r1)
        L_0x0849:
            r0 = r102
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x085b
            if (r20 == 0) goto L_0x085b
            X.3xF r1 = new X.3xF
            r1.<init>(r2)
            r0 = r20
            r0.callback(r1)
        L_0x085b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257033wk.APw():void");
    }

    public final void onComplete() {
        VpsEventCallback vpsEventCallback;
        super.onComplete();
        if (this.A02 && (vpsEventCallback = this.A00) != null && this.A02 != null) {
            vpsEventCallback.callback(A00(this, "SUCCESS"));
        }
    }
}
