package X;

/* renamed from: X.TIw  reason: case insensitive filesystem */
public final class C13040TIw implements Runnable {
    public final /* synthetic */ C365488nC A00;
    public final /* synthetic */ SP5 A01;
    public final /* synthetic */ 1RO A02;

    public C13040TIw(C365488nC r1, SP5 sp5, 1RO r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = sp5;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            X.1RO r10 = r1.A02
            X.8nC r0 = r1.A00
            X.SP5 r4 = r1.A01
            java.util.Set r5 = r0.A02
            boolean r0 = r5.isEmpty()
            r9 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0017
            r0 = 3
            r4.A04(r9, r0)
        L_0x0016:
            return
        L_0x0017:
            X.1RL r6 = r10.A04     // Catch:{ IOException -> 0x0291 }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0291 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ Exception -> 0x0280 }
        L_0x0021:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0280 }
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)     // Catch:{ Exception -> 0x0280 }
            X.0gM r0 = r6.A01     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = r0.A02(r1)     // Catch:{ Exception -> 0x0280 }
            r11.add(r0)     // Catch:{ Exception -> 0x0280 }
            goto L_0x0021
        L_0x0035:
            X.1SC r7 = r6.A02     // Catch:{ Exception -> 0x0280 }
            java.io.StringWriter r6 = new java.io.StringWriter     // Catch:{ Exception -> 0x0280 }
            r6.<init>()     // Catch:{ Exception -> 0x0280 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ Exception -> 0x0280 }
            X.17W r2 = r0.A0A(r6)     // Catch:{ Exception -> 0x0280 }
            r2.A0b()     // Catch:{ Exception -> 0x0280 }
            java.util.Iterator r1 = r11.iterator()     // Catch:{ Exception -> 0x0280 }
        L_0x0049:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0280 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ Exception -> 0x0280 }
            r2.A0t(r0)     // Catch:{ Exception -> 0x0280 }
            goto L_0x0049
        L_0x0057:
            r2.A0Y()     // Catch:{ Exception -> 0x0280 }
            r2.close()     // Catch:{ Exception -> 0x0280 }
            X.0lg r0 = r7.A00     // Catch:{ Exception -> 0x0280 }
            X.1NY r2 = new X.1NY     // Catch:{ Exception -> 0x0280 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0280 }
            r2.A04()     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "android_modules/download/"
            r2.A0A(r0)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "hashes"
            r2.AA0(r0, r1)     // Catch:{ Exception -> 0x0280 }
            java.lang.Class<X.R7l> r1 = X.C8747R7l.class
            java.lang.Class<X.SAQ> r0 = X.SAQ.class
            r2.A0R(r1, r0)     // Catch:{ Exception -> 0x0280 }
            X.1Fe r0 = X.1Fe.A02     // Catch:{ Exception -> 0x0280 }
            r2.A05 = r0     // Catch:{ Exception -> 0x0280 }
            r8 = 1
            r2.A0R = r8     // Catch:{ Exception -> 0x0280 }
            X.1OC r6 = r2.A0M()     // Catch:{ Exception -> 0x0280 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0280 }
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Exception -> 0x0280 }
            r2.<init>()     // Catch:{ Exception -> 0x0280 }
            r1 = 7
            X.R8r r0 = new X.R8r     // Catch:{ Exception -> 0x0280 }
            r0.<init>(r1, r7, r2)     // Catch:{ Exception -> 0x0280 }
            r6.A00 = r0     // Catch:{ Exception -> 0x0280 }
            X.1ES.A02(r6)     // Catch:{ Exception -> 0x0280 }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ Exception -> 0x0280 }
            java.lang.Object r0 = r2.get()     // Catch:{ Exception -> 0x0280 }
            if (r0 == 0) goto L_0x0266
            java.lang.Object r0 = r2.get()     // Catch:{ Exception -> 0x0280 }
            java.util.Iterator r7 = X.C51966G9m.A1H(r0)     // Catch:{ Exception -> 0x0280 }
        L_0x00ad:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0280 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x0280 }
            X.S2C r0 = (X.S2C) r0     // Catch:{ Exception -> 0x0280 }
            java.lang.String r6 = r0.A02     // Catch:{ Exception -> 0x0280 }
            java.lang.String r2 = r0.A01     // Catch:{ Exception -> 0x0280 }
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x0280 }
            X.0gC r0 = new X.0gC     // Catch:{ Exception -> 0x0280 }
            r0.<init>(r6, r2, r1)     // Catch:{ Exception -> 0x0280 }
            r12.add(r0)     // Catch:{ Exception -> 0x0280 }
            goto L_0x00ad
        L_0x00c8:
            int r0 = r12.size()     // Catch:{ Exception -> 0x0280 }
            if (r11 != r0) goto L_0x026d
            int r0 = r12.size()     // Catch:{ Exception -> 0x0280 }
            r4.A03(r9, r8, r0)     // Catch:{ Exception -> 0x0280 }
            boolean r0 = r12.isEmpty()     // Catch:{ Exception -> 0x0280 }
            if (r0 == 0) goto L_0x00e5
            r1 = 4
            java.lang.String r0 = "Failed to download module - no metadata found."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ Exception -> 0x0280 }
            r4.A04(r0, r1)     // Catch:{ Exception -> 0x0280 }
        L_0x00e5:
            java.util.HashSet r13 = X.AnonymousClass7TE.A1F()     // Catch:{ IOException -> 0x0291 }
            r15 = 0
            java.util.Iterator r6 = r12.iterator()     // Catch:{ IOException -> 0x0291 }
        L_0x00ee:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r2 = r6.next()     // Catch:{ IOException -> 0x0291 }
            X.0gC r2 = (X.0gC) r2     // Catch:{ IOException -> 0x0291 }
            java.lang.String r1 = r2.A02     // Catch:{ IOException -> 0x0291 }
            boolean r0 = r5.contains(r1)     // Catch:{ IOException -> 0x0291 }
            if (r0 != 0) goto L_0x010e
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x0291 }
            java.lang.String r1 = "FacebookVoltronDownloader"
            java.lang.String r0 = "DownloadableAppModuleMetadata for unrequested module: %s"
            X.0KC.A0Q(r1, r0, r2)     // Catch:{ IOException -> 0x0291 }
            goto L_0x00ee
        L_0x010e:
            java.lang.String r0 = r2.A00     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x00ee
            r13.add(r1)     // Catch:{ IOException -> 0x0291 }
            goto L_0x00ee
        L_0x0116:
            java.util.Iterator r14 = r5.iterator()     // Catch:{ IOException -> 0x0291 }
        L_0x011a:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r11 = X.AnonymousClass7TE.A18(r14)     // Catch:{ IOException -> 0x0291 }
            boolean r0 = r13.contains(r11)     // Catch:{ IOException -> 0x0291 }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "Failed to download module - no metadata found."
            java.lang.RuntimeException r7 = X.AnonymousClass7TE.A15(r0)     // Catch:{ IOException -> 0x0291 }
            r6 = 0
            X.0g7 r0 = X.0g7.A00()     // Catch:{ IOException -> 0x0291 }
            java.lang.String r0 = r0.A02(r11)     // Catch:{ IOException -> 0x0291 }
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r0}     // Catch:{ IOException -> 0x0291 }
            java.lang.String r1 = "DownloadStateHandler"
            java.lang.String r0 = "Server metadata not found for app module %s, hash %s. (Expected for local builds. See https://fburl.com/ms5kw160.)"
            X.0KC.A0O(r1, r0, r2)     // Catch:{ IOException -> 0x0291 }
            X.QeI[] r5 = r4.A06     // Catch:{ IOException -> 0x0291 }
        L_0x0146:
            r2 = 4
            if (r6 >= r3) goto L_0x0156
            r1 = r5[r6]     // Catch:{ IOException -> 0x0291 }
            int r0 = r4.A04     // Catch:{ IOException -> 0x0291 }
            r1.A00(r0, r11)     // Catch:{ IOException -> 0x0291 }
            r1.A02(r7, r11, r0, r2)     // Catch:{ IOException -> 0x0291 }
            int r6 = r6 + 1
            goto L_0x0146
        L_0x0156:
            X.SP5.A00(r4, r7, r2)     // Catch:{ IOException -> 0x0291 }
            r15 = 1
            goto L_0x011a
        L_0x015b:
            boolean r0 = r12.isEmpty()     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x016d
            r1 = 4
            java.lang.String r0 = "Failed to download module - no metadata found."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ IOException -> 0x0291 }
            r4.A04(r0, r1)     // Catch:{ IOException -> 0x0291 }
            goto L_0x0253
        L_0x016d:
            java.util.Iterator r14 = r12.iterator()     // Catch:{ IOException -> 0x0291 }
        L_0x0171:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x0250
            java.lang.Object r7 = r14.next()     // Catch:{ IOException -> 0x0291 }
            X.0gC r7 = (X.0gC) r7     // Catch:{ IOException -> 0x0291 }
            java.util.Map r1 = r10.A05     // Catch:{ IOException -> 0x0291 }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r11 = r7.A02     // Catch:{ all -> 0x0257 }
            java.lang.Object r6 = r1.get(r11)     // Catch:{ all -> 0x0257 }
            if (r6 != 0) goto L_0x018f
            java.lang.Object r6 = X.Pxe.A0p()     // Catch:{ all -> 0x0257 }
            r1.put(r11, r6)     // Catch:{ all -> 0x0257 }
        L_0x018f:
            monitor-exit(r1)     // Catch:{ all -> 0x0257 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0291 }
            X.0g7 r0 = X.0g7.A00()     // Catch:{ all -> 0x0254 }
            int r2 = X.0gR.A00(r11)     // Catch:{ all -> 0x0254 }
            java.lang.Integer r1 = r0.A01(r2)     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0254 }
            if (r1 == r0) goto L_0x0234
            java.lang.String r13 = r7.A00     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0234
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0254 }
            if (r0 != 0) goto L_0x0234
            X.QeI[] r5 = r4.A06     // Catch:{ IOException -> 0x0232 }
            r2 = 0
        L_0x01ae:
            r1 = r5[r2]     // Catch:{ IOException -> 0x0232 }
            int r0 = r4.A04     // Catch:{ IOException -> 0x0232 }
            r1.A00(r0, r11)     // Catch:{ IOException -> 0x0232 }
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x01ae
            X.0gL r12 = r10.A03     // Catch:{ IOException -> 0x0232 }
            X.16e r0 = X.AnonymousClass2hY.A09     // Catch:{ all -> 0x022c }
            X.2hY r2 = r0.E1h(r13)     // Catch:{ all -> 0x022c }
            X.1QT r0 = X.JTQ.A0E()     // Catch:{ all -> 0x022c }
            X.1QU r1 = r0.A00()     // Catch:{ all -> 0x022c }
            X.14G r0 = X.14G.A03()     // Catch:{ all -> 0x022c }
            X.47Y r0 = r0.A08(r1, r2, r9)     // Catch:{ all -> 0x022c }
            X.1Qb r0 = r0.A02     // Catch:{ all -> 0x022c }
            java.io.InputStream r5 = r0.AjD()     // Catch:{ all -> 0x022c }
            monitor-enter(r12)     // Catch:{ all -> 0x022a }
            X.0g7 r1 = r12.A02     // Catch:{ all -> 0x0227 }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x0227 }
            boolean r0 = r1.A06(r0)     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x020e
            int r13 = X.0fy.A00(r11)     // Catch:{ all -> 0x0227 }
            if (r13 < 0) goto L_0x0215
            java.lang.String r1 = r1.A02(r11)     // Catch:{ all -> 0x0227 }
            r1.getClass()     // Catch:{ all -> 0x0227 }
            X.0g3 r0 = r12.A01     // Catch:{ all -> 0x0227 }
            java.io.File r2 = r0.A03(r11, r1)     // Catch:{ all -> 0x0227 }
            X.0gK r0 = r12.A03     // Catch:{ all -> 0x0227 }
            r0.FNr(r2, r5, r11, r1)     // Catch:{ all -> 0x0227 }
            java.lang.Boolean[] r1 = r12.A04     // Catch:{ all -> 0x0227 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0227 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0227 }
            r1[r13] = r0     // Catch:{ all -> 0x0227 }
            monitor-exit(r12)     // Catch:{ all -> 0x022a }
            r4.A02(r7, r9, r8)     // Catch:{ all -> 0x022a }
            r5.close()     // Catch:{ IOException -> 0x0232 }
            goto L_0x024d
        L_0x020e:
            java.lang.String r0 = "Unable to load module metadata"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0227 }
            goto L_0x0226
        L_0x0215:
            java.lang.Object[] r2 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0227 }
            java.lang.String r1 = "VoltronModuleCache"
            java.lang.String r0 = "Checking cache for %s but module does not exist"
            X.0KC.A0Q(r1, r0, r2)     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = "invalid module found"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x0227 }
        L_0x0226:
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x0227:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x022a }
            throw r0     // Catch:{ all -> 0x022a }
        L_0x022a:
            r0 = move-exception
            goto L_0x022e
        L_0x022c:
            r0 = move-exception
            goto L_0x0231
        L_0x022e:
            r5.close()     // Catch:{ IOException -> 0x0232 }
        L_0x0231:
            throw r0     // Catch:{ IOException -> 0x0232 }
        L_0x0232:
            r5 = move-exception
            goto L_0x023f
        L_0x0234:
            X.0g7 r0 = X.0g7.A00()     // Catch:{ all -> 0x0254 }
            r0.A01(r2)     // Catch:{ all -> 0x0254 }
            r4.A02(r7, r9, r8)     // Catch:{ all -> 0x0254 }
            goto L_0x024d
        L_0x023f:
            java.lang.String r2 = "FacebookVoltronDownloader"
            java.lang.String r1 = "downloading module %s failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0254 }
            X.0KC.A0L(r2, r1, r5, r0)     // Catch:{ all -> 0x0254 }
            r4.A02(r7, r5, r3)     // Catch:{ all -> 0x0254 }
        L_0x024d:
            monitor-exit(r6)     // Catch:{ all -> 0x0254 }
            goto L_0x0171
        L_0x0250:
            if (r15 == 0) goto L_0x0016
            goto L_0x025a
        L_0x0253:
            return
        L_0x0254:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0254 }
            goto L_0x0290
        L_0x0257:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0257 }
            goto L_0x0290
        L_0x025a:
            r4.A04(r9, r3)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r1 = "FacebookVoltronDownloader"
            java.lang.String r0 = "startDownload failed due to invalid modules"
            X.0KC.A0C(r1, r0)     // Catch:{ IOException -> 0x0291 }
            return
        L_0x0266:
            java.lang.String r0 = "Failed to download module metadata files"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ Exception -> 0x0280 }
            goto L_0x027f
        L_0x026d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0280 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0280 }
            java.lang.String r0 = "Failed to download some module metadata files, expected %s, got %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)     // Catch:{ Exception -> 0x0280 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ Exception -> 0x0280 }
        L_0x027f:
            throw r0     // Catch:{ Exception -> 0x0280 }
        L_0x0280:
            r1 = move-exception
            boolean r0 = r1 instanceof java.io.IOException     // Catch:{ IOException -> 0x0291 }
            if (r0 == 0) goto L_0x028c
            java.io.IOException r1 = (java.io.IOException) r1     // Catch:{ IOException -> 0x0291 }
            r0 = 0
            r4.A03(r1, r3, r0)     // Catch:{ IOException -> 0x0291 }
            throw r1     // Catch:{ IOException -> 0x0291 }
        L_0x028c:
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r1)     // Catch:{ IOException -> 0x0291 }
        L_0x0290:
            throw r0     // Catch:{ IOException -> 0x0291 }
        L_0x0291:
            r2 = move-exception
            r4.A04(r2, r3)
            java.lang.String r1 = "FacebookVoltronDownloader"
            java.lang.String r0 = "startDownload failed"
            X.0KC.A0F(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13040TIw.run():void");
    }
}
