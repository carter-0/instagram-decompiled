package X;

/* renamed from: X.TKf  reason: case insensitive filesystem */
public final class C13075TKf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SRA A02;
    public final /* synthetic */ C11253SHn A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C13075TKf(SRA sra, C11253SHn sHn, String str, int i, int i2, boolean z, boolean z2) {
        this.A02 = sra;
        this.A04 = str;
        this.A01 = i;
        this.A05 = z;
        this.A03 = sHn;
        this.A00 = i2;
        this.A06 = z2;
    }

    /* JADX WARNING: type inference failed for: r8v22, types: [X.Rd5, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0472 A[Catch:{ all -> 0x04e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05e9 A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05f2 A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x060b A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x060c A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0626 A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x064a A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x064d A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x066d A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0676 A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0679 A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x067f A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x069d A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06db A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06fb A[Catch:{ IOException -> 0x054d, all -> 0x0596, all -> 0x0904 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:238:0x04e7=Splitter:B:238:0x04e7, B:281:0x0589=Splitter:B:281:0x0589, B:233:0x04de=Splitter:B:233:0x04de} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:257:0x0504=Splitter:B:257:0x0504, B:112:0x028c=Splitter:B:112:0x028c} */
    public final void run() {
        /*
            r46 = this;
            r45 = r46
            r0 = r45
            X.SRA r2 = r0.A02     // Catch:{ all -> 0x0904 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = r0.A04     // Catch:{ all -> 0x0904 }
            r44 = r0
            r0 = r45
            int r0 = r0.A01     // Catch:{ all -> 0x0904 }
            r43 = r0
            r0 = r45
            boolean r0 = r0.A05     // Catch:{ all -> 0x0904 }
            r27 = r0
            r0 = r45
            X.SHn r0 = r0.A03     // Catch:{ all -> 0x0904 }
            r42 = r0
            r0 = r45
            int r0 = r0.A00     // Catch:{ all -> 0x0904 }
            r41 = r0
            r0 = r45
            boolean r9 = r0.A06     // Catch:{ all -> 0x0904 }
            r6 = 0
            r17 = 1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RCY -> 0x05ce }
            X.S1q r4 = r2.A0B     // Catch:{ RCY -> 0x05ce }
            X.RzK r5 = r2.A0C     // Catch:{ RCY -> 0x05ce }
            int r0 = r5.A04     // Catch:{ RCY -> 0x05ce }
            long r0 = X.Pxf.A0E(r0)
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            java.util.concurrent.ExecutorService r10 = r4.A01     // Catch:{ all -> 0x05a5 }
            r26 = 5
            X.TNT r8 = new X.TNT     // Catch:{ all -> 0x05a5 }
            r7 = r26
            r3 = r44
            r8.<init>(r3, r4, r7)     // Catch:{ all -> 0x05a5 }
            java.util.concurrent.Future r8 = r10.submit(r8)     // Catch:{ all -> 0x05a5 }
            X.S7F r3 = r4.A00     // Catch:{ all -> 0x05a5 }
            r40 = r3
            java.util.TreeSet r7 = r40.A01()     // Catch:{ all -> 0x05a5 }
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x05a5 }
            if (r3 != 0) goto L_0x0074
            java.lang.Object r10 = r7.first()     // Catch:{ all -> 0x05a5 }
            X.SJY r10 = (X.SJY) r10     // Catch:{ all -> 0x05a5 }
            java.lang.String r7 = r10.A02     // Catch:{ all -> 0x05a5 }
            r3 = r44
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x05a5 }
            if (r3 == 0) goto L_0x0074
            int r7 = r10.A00     // Catch:{ all -> 0x05a5 }
            r3 = 3
            if (r7 > r3) goto L_0x0074
            X.TOA r8 = new X.TOA     // Catch:{ all -> 0x05a5 }
            r8.<init>(r10)     // Catch:{ all -> 0x05a5 }
        L_0x0074:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            java.util.concurrent.TimeUnit r25 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            r3 = r25
            java.lang.Object r3 = r8.get(r0, r3)     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            X.SJY r3 = (X.SJY) r3     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            X.SRZ r0 = r2.A09     // Catch:{ RCY -> 0x05ce }
            r39 = r0
            long r13 = X.Pxe.A0C(r11)     // Catch:{ RCY -> 0x05ce }
            X.S5H r0 = r2.A0I     // Catch:{ RCY -> 0x05ce }
            X.ST3 r1 = r0.A00     // Catch:{ RCY -> 0x05ce }
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ RCY -> 0x05ce }
            long r7 = r1.A0V     // Catch:{ RCY -> 0x05ce }
            X.S5H r0 = r2.A0I     // Catch:{ RCY -> 0x05ce }
            X.ST3 r0 = r0.A00     // Catch:{ RCY -> 0x05ce }
            X.SJJ r0 = r0.A0C     // Catch:{ RCY -> 0x05ce }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06     // Catch:{ RCY -> 0x05ce }
            long r0 = r0.get()     // Catch:{ RCY -> 0x05ce }
            X.S5H r10 = r2.A0I     // Catch:{ RCY -> 0x05ce }
            X.ST3 r10 = r10.A00     // Catch:{ RCY -> 0x05ce }
            android.net.NetworkInfo r12 = r10.A0W     // Catch:{ RCY -> 0x05ce }
            java.lang.String r11 = "mqtt_dns_lookup_duration"
            java.lang.String r24 = "timespan_ms"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RCY -> 0x05ce }
            r10 = r24
            java.lang.String[] r10 = new java.lang.String[]{r10, r13}     // Catch:{ RCY -> 0x05ce }
            java.util.HashMap r10 = X.S9J.A01(r10)     // Catch:{ RCY -> 0x05ce }
            java.lang.String r8 = java.lang.Long.toString(r7)     // Catch:{ RCY -> 0x05ce }
            java.lang.String r23 = "mqtt_session_id"
            r7 = r23
            r10.put(r7, r8)     // Catch:{ RCY -> 0x05ce }
            X.SRZ.A00(r0, r10)     // Catch:{ RCY -> 0x05ce }
            r0 = r39
            X.SRZ.A01(r12, r0, r10)     // Catch:{ RCY -> 0x05ce }
            r0.A06(r11, r10)     // Catch:{ RCY -> 0x05ce }
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x054d }
            java.lang.Integer r22 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x054d }
            r16 = 0
            java.util.List r0 = r3.A00()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Object r10 = r0.get(r6)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.InetAddress r10 = (java.net.InetAddress) r10     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.util.List r0 = r3.A00()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Class r7 = r0.getClass()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r1 = 1
        L_0x00eb:
            java.util.List r0 = r3.A00()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r1 >= r0) goto L_0x0115
            java.util.List r0 = r3.A00()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r0 != 0) goto L_0x0112
            java.util.List r0 = r3.A00()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.lang.Object r11 = r0.get(r1)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.InetAddress r11 = (java.net.InetAddress) r11     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x0116
        L_0x0112:
            int r1 = r1 + 1
            goto L_0x00eb
        L_0x0115:
            r11 = 0
        L_0x0116:
            if (r9 == 0) goto L_0x026d
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r11 == 0) goto L_0x01b4
            int r0 = r5.A08     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            int r9 = r0 * 1000
            X.RwF r0 = r2.A0A     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r36 = r0
            java.util.concurrent.ScheduledExecutorService r1 = r2.A0F     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            int r0 = r5.A05     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            X.SFg r12 = new X.SFg     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r28 = r12
            r29 = r36
            r30 = r10
            r31 = r11
            r32 = r1
            r33 = r43
            r34 = r9
            r35 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.InetAddress r0 = r12.A04     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r30 = r0
            X.RwF r1 = r12.A02     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.Proxy r0 = r1.A00     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r0 == 0) goto L_0x0170
            java.net.Socket r13 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
        L_0x014e:
            java.net.Proxy r0 = r1.A00     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r0 == 0) goto L_0x016a
            java.net.Socket r8 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
        L_0x0157:
            java.util.concurrent.ScheduledExecutorService r0 = r12.A05     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r14 = r0
            X.TNe r7 = new X.TNe     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r7.<init>(r6, r8, r13, r12)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            int r0 = r12.A01     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r15 = r14
            r14 = r25
            java.util.concurrent.ScheduledFuture r1 = r15.schedule(r7, r0, r14)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x0176
        L_0x016a:
            java.net.Socket r8 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.<init>()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x0157
        L_0x0170:
            java.net.Socket r13 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r13.<init>()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x014e
        L_0x0176:
            r0 = r30
            X.C11206SFg.A00(r12, r0, r13, r8)     // Catch:{ IOException -> 0x017f }
            r1.cancel(r6)     // Catch:{ IOException -> 0x017f }
            goto L_0x0186
        L_0x017f:
            r7 = move-exception
            r13.close()     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            r1.get()     // Catch:{ Exception -> 0x01a5 }
        L_0x0186:
            monitor-enter(r12)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.Socket r0 = r12.A00     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x019a
            boolean r0 = r0.isConnected()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x019a
            java.net.Socket r0 = r12.A00     // Catch:{ all -> 0x01a2 }
            r0.getInetAddress()     // Catch:{ all -> 0x01a2 }
            java.net.Socket r8 = r12.A00     // Catch:{ all -> 0x01a2 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a2 }
            goto L_0x01ea
        L_0x019a:
            java.lang.String r0 = "socket connect call succeeded but socket is not connected."
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01a2 }
            goto L_0x01b3
        L_0x01a5:
            r1 = move-exception
            r8.close()     // Catch:{ IOException -> 0x01a9 }
        L_0x01a9:
            java.lang.String r0 = "Failed to connect to both sockets: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r7)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.io.IOException r0 = X.Pxe.A0c(r0, r1)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
        L_0x01b3:
            throw r0     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
        L_0x01b4:
            int r0 = r5.A08     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            int r9 = r0 * 1000
            X.RwF r0 = r2.A0A     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r36 = r0
            java.net.Proxy r0 = r0.A00     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            if (r0 == 0) goto L_0x01db
            java.net.Socket r8 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
        L_0x01c5:
            r0 = r17
            r8.setTcpNoDelay(r0)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.setSoTimeout(r6)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.setKeepAlive(r6)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r0 = r43
            r1.<init>(r10, r0)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.connect(r1, r9)     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x01e1
        L_0x01db:
            java.net.Socket r8 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.<init>()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            goto L_0x01c5
        L_0x01e1:
            boolean r0 = r8.isConnected()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            if (r0 == 0) goto L_0x01fc
            java.lang.Integer r22 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x01fc
        L_0x01ea:
            boolean r0 = r8.isConnected()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            if (r0 == 0) goto L_0x01fc
            java.net.InetAddress r0 = r8.getInetAddress()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            if (r0 == 0) goto L_0x022b
            java.lang.Integer r22 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
        L_0x01fc:
            long r0 = (long) r9     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            long r9 = X.Pxe.A0C(r18)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            long r0 = r0 - r9
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x025d
            java.lang.String r9 = "handshakeAndVerifySocket failed because of "
            boolean r7 = r8.isConnected()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            X.S9L.A00(r7)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r7 = r36
            java.util.concurrent.ExecutorService r10 = r7.A02     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            X.TNi r7 = new X.TNi     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r28 = r7
            r29 = r8
            r30 = r36
            r31 = r44
            r32 = r43
            r33 = r17
            r28.<init>(r29, r30, r31, r32, r33)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.util.concurrent.Future r10 = r10.submit(r7)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x0238
        L_0x022b:
            java.net.InetAddress r0 = r8.getInetAddress()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            boolean r0 = r11.equals(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            if (r0 == 0) goto L_0x01fc
            java.lang.Integer r22 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x01fc
        L_0x0238:
            r7 = r25
            java.lang.Object r7 = r10.get(r0, r7)     // Catch:{ InterruptedException -> 0x024f, ExecutionException -> 0x0241, TimeoutException -> 0x0265 }
            java.net.Socket r7 = (java.net.Socket) r7     // Catch:{ InterruptedException -> 0x024f, ExecutionException -> 0x0241, TimeoutException -> 0x0265 }
            goto L_0x028c
        L_0x0241:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r9, r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x026c
        L_0x024f:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r1, r9, r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x026c
        L_0x025d:
            java.lang.String r0 = "connectSocket already timeout"
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            goto L_0x026c
        L_0x0265:
            java.lang.String r0 = "handshakeAndVerifySocket timeout"
            java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
        L_0x026c:
            throw r1     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
        L_0x026d:
            java.net.Socket r8 = new java.net.Socket     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r8.<init>()     // Catch:{ IOException -> 0x04fd, all -> 0x04f9 }
            r0 = r17
            r8.setTcpNoDelay(r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r8.setSoTimeout(r6)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r8.setKeepAlive(r6)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r0 = r43
            r1.<init>(r10, r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            int r0 = r5.A08     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            int r0 = r0 * 1000
            r8.connect(r1, r0)     // Catch:{ IOException -> 0x04f0, all -> 0x04f7 }
            r7 = r8
        L_0x028c:
            long r33 = X.Pxe.A0C(r20)     // Catch:{ IOException -> 0x054d }
            java.lang.String r31 = X.C9563Rd0.A00(r22)     // Catch:{ IOException -> 0x054d }
            X.Qbk r30 = X.C7860Qbk.A00     // Catch:{ IOException -> 0x054d }
            X.S5H r0 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r0 = r0.A00     // Catch:{ IOException -> 0x054d }
            long r0 = r0.A0V     // Catch:{ IOException -> 0x054d }
            X.S5H r8 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r8 = r8.A00     // Catch:{ IOException -> 0x054d }
            X.SJJ r8 = r8.A0C     // Catch:{ IOException -> 0x054d }
            java.util.concurrent.atomic.AtomicLong r8 = r8.A06     // Catch:{ IOException -> 0x054d }
            long r37 = r8.get()     // Catch:{ IOException -> 0x054d }
            X.S5H r8 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r8 = r8.A00     // Catch:{ IOException -> 0x054d }
            android.net.NetworkInfo r8 = r8.A0W     // Catch:{ IOException -> 0x054d }
            r28 = r39
            r29 = r8
            r32 = r43
            r35 = r0
            r28.A03(r29, r30, r31, r32, r33, r35, r37)     // Catch:{ IOException -> 0x054d }
            if (r7 == 0) goto L_0x02c8
            java.net.InetAddress r0 = r7.getLocalAddress()     // Catch:{ IOException -> 0x054d }
            r2.A03 = r0     // Catch:{ IOException -> 0x054d }
            java.net.InetAddress r0 = r7.getInetAddress()     // Catch:{ IOException -> 0x054d }
            r2.A04 = r0     // Catch:{ IOException -> 0x054d }
            goto L_0x02cb
        L_0x02c8:
            r4.A00(r3)     // Catch:{ all -> 0x0904 }
        L_0x02cb:
            X.S5H r8 = r2.A0I     // Catch:{ all -> 0x0904 }
            if (r7 == 0) goto L_0x02dd
            java.lang.String r1 = "SSL"
        L_0x02d1:
            java.lang.String r18 = ""
            r0 = r18
            r8.A01(r1, r0)     // Catch:{ all -> 0x0904 }
            r7.getClass()     // Catch:{ all -> 0x0904 }
            monitor-enter(r2)     // Catch:{ all -> 0x0904 }
            goto L_0x02e0
        L_0x02dd:
            java.lang.String r1 = "SSL-failed"
            goto L_0x02d1
        L_0x02e0:
            boolean r0 = r2.A0J     // Catch:{ all -> 0x04ec }
            if (r0 == 0) goto L_0x02f8
            java.lang.String r1 = "DefaultMqttClientCore"
            java.lang.String r0 = "connection/connecting/aborted before sending connect"
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x04ec }
            r7.close()     // Catch:{ IOException -> 0x02ee }
        L_0x02ee:
            X.REt r0 = X.C8901REt.FAILED_STOPPED_BEFORE_SSL     // Catch:{ all -> 0x04ec }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x04ec }
            r5.<init>(r0)     // Catch:{ all -> 0x04ec }
            monitor-exit(r2)     // Catch:{ all -> 0x04ec }
            goto L_0x05e5
        L_0x02f8:
            r0 = r17
            r2.A0J = r0     // Catch:{ all -> 0x04ec }
            monitor-exit(r2)     // Catch:{ all -> 0x04ec }
            X.Rd5 r8 = new X.Rd5     // Catch:{ all -> 0x04e3 }
            r8.<init>()     // Catch:{ all -> 0x04e3 }
            int r10 = r5.A07     // Catch:{ all -> 0x04e3 }
            X.Rot r1 = r2.A0H     // Catch:{ all -> 0x04e3 }
            X.S2j r9 = new X.S2j     // Catch:{ all -> 0x04e3 }
            r0 = r39
            r9.<init>(r0, r1, r8, r10)     // Catch:{ all -> 0x04e3 }
            X.44q r1 = r2.A0D     // Catch:{ all -> 0x04e3 }
            X.Rot r0 = r2.A0H     // Catch:{ all -> 0x04e3 }
            X.RwG r8 = new X.RwG     // Catch:{ all -> 0x04e3 }
            r8.<init>(r0, r1, r10)     // Catch:{ all -> 0x04e3 }
            java.io.InputStream r1 = r7.getInputStream()     // Catch:{ IOException -> 0x04d0 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x04d0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x04d0 }
            r9.A00 = r0     // Catch:{ IOException -> 0x04d0 }
            java.io.OutputStream r0 = r7.getOutputStream()     // Catch:{ IOException -> 0x04d0 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x04d0 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x04d0 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x04d0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x04d0 }
            r8.A00 = r0     // Catch:{ IOException -> 0x04d0 }
            int r0 = r5.A03     // Catch:{ IOException -> 0x04d0 }
            int r0 = r0 * 1000
            r7.setSoTimeout(r0)     // Catch:{ IOException -> 0x04d0 }
            android.content.Context r0 = r2.A07     // Catch:{ IOException -> 0x04d0 }
            boolean r0 = X.C9555Rcs.A00(r0)     // Catch:{ IOException -> 0x04d0 }
            if (r0 != 0) goto L_0x04ca
            boolean r0 = r2.A06     // Catch:{ IOException -> 0x04d0 }
            if (r0 != 0) goto L_0x04ca
            java.lang.String r10 = "DefaultMqttClientCore"
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x04d0 }
            X.RFZ r5 = X.RFZ.CONNECT     // Catch:{ IOException -> 0x045a }
            X.SNX r12 = new X.SNX     // Catch:{ IOException -> 0x045a }
            r12.<init>(r5)     // Catch:{ IOException -> 0x045a }
            r1 = r27 ^ 1
            X.SFh r11 = new X.SFh     // Catch:{ IOException -> 0x045a }
            r0 = r41
            r11.<init>(r0, r1)     // Catch:{ IOException -> 0x045a }
            X.Qc3 r1 = new X.Qc3     // Catch:{ IOException -> 0x045a }
            r0 = r42
            r1.<init>(r12, r11, r0)     // Catch:{ IOException -> 0x045a }
            X.SRA.A02(r2, r1, r8)     // Catch:{ IOException -> 0x045a }
            X.S1r r11 = r9.A00()     // Catch:{ InterruptedIOException -> 0x0456, IOException | JSONException -> 0x0454, DataFormatException -> 0x045e }
            X.SNX r0 = r11.A00     // Catch:{ IOException -> 0x04d0 }
            X.RFZ r1 = r0.A03     // Catch:{ IOException -> 0x04d0 }
            X.RFZ r0 = X.RFZ.CONNACK     // Catch:{ IOException -> 0x04d0 }
            if (r1 == r0) goto L_0x0383
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r0 = "receive/unexpected; type=%s"
            X.0KC.A0P(r10, r0, r1)     // Catch:{ IOException -> 0x04d0 }
            X.REt r0 = X.C8901REt.FAILED_INVALID_CONACK     // Catch:{ IOException -> 0x04d0 }
            X.SQm r5 = new X.SQm     // Catch:{ IOException -> 0x04d0 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x04d0 }
            goto L_0x046b
        L_0x0383:
            java.lang.String r16 = r5.toString()     // Catch:{ IOException -> 0x04d0 }
            long r13 = X.Pxe.A0C(r13)     // Catch:{ IOException -> 0x04d0 }
            X.S5H r0 = r2.A0I     // Catch:{ IOException -> 0x04d0 }
            X.ST3 r0 = r0.A00     // Catch:{ IOException -> 0x04d0 }
            long r0 = r0.A0V     // Catch:{ IOException -> 0x04d0 }
            r20 = r0
            X.S5H r0 = r2.A0I     // Catch:{ IOException -> 0x04d0 }
            X.ST3 r0 = r0.A00     // Catch:{ IOException -> 0x04d0 }
            X.SJJ r0 = r0.A0C     // Catch:{ IOException -> 0x04d0 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06     // Catch:{ IOException -> 0x04d0 }
            long r0 = r0.get()     // Catch:{ IOException -> 0x04d0 }
            X.S5H r5 = r2.A0I     // Catch:{ IOException -> 0x04d0 }
            X.ST3 r5 = r5.A00     // Catch:{ IOException -> 0x04d0 }
            android.net.NetworkInfo r5 = r5.A0W     // Catch:{ IOException -> 0x04d0 }
            r19 = r5
            r12 = 4
            java.lang.String r15 = "operation"
            java.lang.String r14 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x04d0 }
            r13 = r24
            r5 = r16
            java.lang.String[] r5 = new java.lang.String[]{r15, r5, r13, r14}     // Catch:{ IOException -> 0x04d0 }
            java.util.HashMap r5 = X.S9J.A01(r5)     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r14 = java.lang.Long.toString(r20)     // Catch:{ IOException -> 0x04d0 }
            r13 = r23
            r5.put(r13, r14)     // Catch:{ IOException -> 0x04d0 }
            X.SRZ.A00(r0, r5)     // Catch:{ IOException -> 0x04d0 }
            r1 = r39
            r0 = r19
            X.SRZ.A01(r0, r1, r5)     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r1 = "mqtt_response_time"
            r0 = r39
            r0.A06(r1, r5)     // Catch:{ IOException -> 0x04d0 }
            X.Qc2 r11 = (X.C7878Qc2) r11     // Catch:{ IOException -> 0x04d0 }
            java.lang.Object r0 = r11.A02     // Catch:{ IOException -> 0x04d0 }
            X.Rou r0 = (X.C10234Rou) r0     // Catch:{ IOException -> 0x04d0 }
            byte r1 = r0.A00     // Catch:{ IOException -> 0x04d0 }
            if (r1 == 0) goto L_0x0417
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)     // Catch:{ IOException -> 0x04d0 }
            java.lang.Object[] r5 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r0 = "connection/refused; rc=%s"
            X.0KC.A0P(r10, r0, r5)     // Catch:{ IOException -> 0x04d0 }
            r0 = 17
            if (r1 != r0) goto L_0x03f2
            goto L_0x040f
        L_0x03f2:
            r0 = r26
            if (r1 != r0) goto L_0x03f9
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0411
        L_0x03f9:
            if (r1 != r12) goto L_0x03fe
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0411
        L_0x03fe:
            r0 = 19
            if (r1 != r0) goto L_0x0405
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_UNKNOWN_CONNECT_HASH     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0411
        L_0x0405:
            r0 = 25
            if (r1 != r0) goto L_0x040c
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_REFUSED_REVOKED_PUBLIC_KEY     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0411
        L_0x040c:
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_REFUSED     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0411
        L_0x040f:
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD     // Catch:{ IOException -> 0x04d0 }
        L_0x0411:
            X.SQm r5 = new X.SQm     // Catch:{ IOException -> 0x04d0 }
            r5.<init>((X.C8901REt) r0, (byte) r1)     // Catch:{ IOException -> 0x04d0 }
            goto L_0x046b
        L_0x0417:
            java.lang.Object r13 = r11.A01     // Catch:{ IOException -> 0x04d0 }
            X.S2z r13 = (X.C10967S2z) r13     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r0 = r13.A03     // Catch:{ IOException -> 0x04d0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x04d0 }
            if (r0 != 0) goto L_0x043f
            java.lang.String r0 = r13.A04     // Catch:{ IOException -> 0x04d0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x04d0 }
            if (r0 != 0) goto L_0x043f
            X.Q8K r0 = X.Q8K.A01     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r12 = r13.A03     // Catch:{ IOException -> 0x04d0 }
            java.lang.String r5 = r13.A04     // Catch:{ IOException -> 0x04d0 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04d0 }
            X.Q8K r11 = new X.Q8K     // Catch:{ IOException -> 0x04d0 }
            r11.<init>(r12, r5, r0)     // Catch:{ IOException -> 0x04d0 }
        L_0x043a:
            java.lang.String r1 = r13.A01     // Catch:{ IOException -> 0x04d0 }
            if (r1 != 0) goto L_0x0444
            goto L_0x0442
        L_0x043f:
            X.Q8K r11 = X.Q8K.A01     // Catch:{ IOException -> 0x04d0 }
            goto L_0x043a
        L_0x0442:
            r1 = r18
        L_0x0444:
            java.lang.String r0 = r13.A02     // Catch:{ IOException -> 0x04d0 }
            if (r0 != 0) goto L_0x044a
            r0 = r18
        L_0x044a:
            X.42j r0 = X.C2596142j.A00(r1, r0)     // Catch:{ IOException -> 0x04d0 }
            X.SQm r5 = new X.SQm     // Catch:{ IOException -> 0x04d0 }
            r5.<init>((X.C2596142j) r0, (X.Q8K) r11)     // Catch:{ IOException -> 0x04d0 }
            goto L_0x046b
        L_0x0454:
            r1 = move-exception
            goto L_0x0464
        L_0x0456:
            r1 = move-exception
            X.REt r0 = X.C8901REt.FAILED_MQTT_CONACK_TIMEOUT     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0466
        L_0x045a:
            r1 = move-exception
            X.REt r0 = X.C8901REt.FAILED_CONNECT_MESSAGE     // Catch:{ IOException -> 0x04d0 }
            goto L_0x0466
        L_0x045e:
            r1 = move-exception
            java.lang.String r0 = "exception/compression_error"
            X.0KC.A0K(r10, r0, r1)     // Catch:{ IOException -> 0x04d0 }
        L_0x0464:
            X.REt r0 = X.C8901REt.FAILED_CONNACK_READ     // Catch:{ IOException -> 0x04d0 }
        L_0x0466:
            X.SQm r5 = new X.SQm     // Catch:{ IOException -> 0x04d0 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r1)     // Catch:{ IOException -> 0x04d0 }
        L_0x046b:
            r7.setSoTimeout(r6)     // Catch:{ IOException -> 0x04d0 }
            boolean r0 = r5.A05     // Catch:{ all -> 0x04e3 }
            if (r0 == 0) goto L_0x04db
            monitor-enter(r2)     // Catch:{ all -> 0x04e3 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x04c7 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x04c7 }
            X.ST3 r0 = r0.A00     // Catch:{ all -> 0x04c7 }
            java.lang.Integer r0 = r0.A0Y     // Catch:{ all -> 0x04c7 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x048f
            java.lang.String r0 = "connection/connecting/unexpected_disconnect"
            X.0KC.A0D(r10, r0)     // Catch:{ all -> 0x04c7 }
            X.REt r0 = X.C8901REt.FAILED_UNEXPECTED_DISCONNECT     // Catch:{ all -> 0x04c7 }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x04c7 }
            r5.<init>(r0)     // Catch:{ all -> 0x04c7 }
            monitor-exit(r2)     // Catch:{ all -> 0x04c7 }
            goto L_0x04db
        L_0x048f:
            r0 = r44
            r2.A02 = r0     // Catch:{ all -> 0x04c7 }
            r2.A05 = r7     // Catch:{ all -> 0x04c7 }
            r2.A01 = r8     // Catch:{ all -> 0x04c7 }
            r2.A00 = r9     // Catch:{ all -> 0x04c7 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x04c7 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x04c7 }
            X.ST3 r0 = r0.A00     // Catch:{ all -> 0x04c7 }
            r0.A0Y = r1     // Catch:{ all -> 0x04c7 }
            monitor-exit(r2)     // Catch:{ all -> 0x04c7 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x04e3 }
            r0.A00()     // Catch:{ all -> 0x04e3 }
            monitor-enter(r4)     // Catch:{ all -> 0x0904 }
            r0 = r40
            X.SJY r8 = r0.A00(r3)     // Catch:{ all -> 0x0901 }
            if (r8 == 0) goto L_0x05e4
            java.lang.String r7 = r8.A02     // Catch:{ all -> 0x0901 }
            java.util.List r3 = r8.A00()     // Catch:{ all -> 0x0901 }
            int r0 = r8.A01     // Catch:{ all -> 0x0901 }
            X.SJY r1 = new X.SJY     // Catch:{ all -> 0x0901 }
            r1.<init>(r7, r3, r0, r6)     // Catch:{ all -> 0x0901 }
            r0 = r40
            r0.A04(r8, r1)     // Catch:{ all -> 0x0901 }
            r40.A02()     // Catch:{ all -> 0x0901 }
            goto L_0x05e4
        L_0x04c7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04c7 }
            throw r0     // Catch:{ all -> 0x04e3 }
        L_0x04ca:
            X.TiJ r0 = r5.A0E     // Catch:{ IOException -> 0x04d0 }
            r0.E2d(r7)     // Catch:{ IOException -> 0x04d0 }
            throw r16     // Catch:{ IOException -> 0x04d0 }
        L_0x04d0:
            r1 = move-exception
            r7.close()     // Catch:{ IOException -> 0x04d4 }
        L_0x04d4:
            X.REt r0 = X.C8901REt.FAILED_CREATE_IOSTREAM     // Catch:{ all -> 0x04e3 }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x04e3 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r1)     // Catch:{ all -> 0x04e3 }
        L_0x04db:
            r7.close()     // Catch:{ IOException -> 0x04de }
        L_0x04de:
            r4.A00(r3)     // Catch:{ all -> 0x0904 }
            goto L_0x05e5
        L_0x04e3:
            r5 = move-exception
            r7.close()     // Catch:{ IOException -> 0x04e7 }
        L_0x04e7:
            r4.A00(r3)     // Catch:{ all -> 0x0904 }
            goto L_0x0903
        L_0x04ec:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04ec }
            goto L_0x0903
        L_0x04f0:
            r0 = move-exception
            if (r8 == 0) goto L_0x0500
            r8.close()     // Catch:{ IOException -> 0x0500, all -> 0x04f7 }
            goto L_0x0500
        L_0x04f7:
            r7 = move-exception
            goto L_0x0504
        L_0x04f9:
            r7 = move-exception
            r8 = r16
            goto L_0x0504
        L_0x04fd:
            r0 = move-exception
            r8 = r16
        L_0x0500:
            throw r0     // Catch:{ all -> 0x0501 }
        L_0x0501:
            r7 = move-exception
            r16 = r0
        L_0x0504:
            long r23 = X.Pxe.A0C(r20)     // Catch:{ IOException -> 0x054d }
            java.lang.String r21 = X.C9563Rd0.A00(r22)     // Catch:{ IOException -> 0x054d }
            if (r16 != 0) goto L_0x0536
            X.Qbk r6 = X.C7860Qbk.A00     // Catch:{ IOException -> 0x054d }
        L_0x0510:
            X.S5H r0 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r0 = r0.A00     // Catch:{ IOException -> 0x054d }
            long r0 = r0.A0V     // Catch:{ IOException -> 0x054d }
            X.S5H r5 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r5 = r5.A00     // Catch:{ IOException -> 0x054d }
            X.SJJ r5 = r5.A0C     // Catch:{ IOException -> 0x054d }
            java.util.concurrent.atomic.AtomicLong r5 = r5.A06     // Catch:{ IOException -> 0x054d }
            long r27 = r5.get()     // Catch:{ IOException -> 0x054d }
            X.S5H r5 = r2.A0I     // Catch:{ IOException -> 0x054d }
            X.ST3 r5 = r5.A00     // Catch:{ IOException -> 0x054d }
            android.net.NetworkInfo r5 = r5.A0W     // Catch:{ IOException -> 0x054d }
            r18 = r39
            r19 = r5
            r20 = r6
            r22 = r43
            r25 = r0
            r18.A03(r19, r20, r21, r22, r23, r25, r27)     // Catch:{ IOException -> 0x054d }
            goto L_0x053e
        L_0x0536:
            X.Qbl r6 = new X.Qbl     // Catch:{ IOException -> 0x054d }
            r0 = r16
            r6.<init>(r0)     // Catch:{ IOException -> 0x054d }
            goto L_0x0510
        L_0x053e:
            if (r8 == 0) goto L_0x054c
            java.net.InetAddress r0 = r8.getLocalAddress()     // Catch:{ IOException -> 0x054d }
            r2.A03 = r0     // Catch:{ IOException -> 0x054d }
            java.net.InetAddress r0 = r8.getInetAddress()     // Catch:{ IOException -> 0x054d }
            r2.A04 = r0     // Catch:{ IOException -> 0x054d }
        L_0x054c:
            throw r7     // Catch:{ IOException -> 0x054d }
        L_0x054d:
            r6 = move-exception
            boolean r0 = r6 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x055a
            X.REt r0 = X.C8901REt.FAILED_SOCKET_CONNECT_TIMEOUT     // Catch:{ all -> 0x0596 }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x0596 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r6)     // Catch:{ all -> 0x0596 }
            goto L_0x0589
        L_0x055a:
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0596 }
            if (r1 == 0) goto L_0x0582
            java.lang.String r0 = "Could not validate certificate: current time"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x0582
            java.lang.String r0 = "validation time: Thu Aug 28"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0596 }
            if (r0 != 0) goto L_0x057a
            java.lang.String r0 = "validation time: Wed Aug 27"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0596 }
            if (r0 == 0) goto L_0x0582
        L_0x057a:
            X.REt r0 = X.C8901REt.FAILED_SOCKET_CONNECT_ERROR_SSL_CLOCK_SKEW     // Catch:{ all -> 0x0596 }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x0596 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r6)     // Catch:{ all -> 0x0596 }
            goto L_0x0589
        L_0x0582:
            X.REt r0 = X.C8901REt.FAILED_SOCKET_CONNECT_ERROR     // Catch:{ all -> 0x0596 }
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x0596 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r6)     // Catch:{ all -> 0x0596 }
        L_0x0589:
            r4.A00(r3)     // Catch:{ all -> 0x0904 }
            X.S5H r3 = r2.A0I     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = "SSL-failed"
            java.lang.String r0 = ""
            r3.A01(r1, r0)     // Catch:{ all -> 0x0904 }
            goto L_0x05e5
        L_0x0596:
            r5 = move-exception
            r4.A00(r3)     // Catch:{ all -> 0x0904 }
            X.S5H r2 = r2.A0I     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = "SSL-failed"
            java.lang.String r0 = ""
            r2.A01(r1, r0)     // Catch:{ all -> 0x0904 }
            goto L_0x0903
        L_0x05a5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
            throw r0     // Catch:{ InterruptedException -> 0x05b0, ExecutionException -> 0x05b8, TimeoutException -> 0x05a8 }
        L_0x05a8:
            X.REM r0 = X.REM.TimedOut     // Catch:{ RCY -> 0x05ce }
            X.RCY r1 = new X.RCY     // Catch:{ RCY -> 0x05ce }
            r1.<init>(r0)     // Catch:{ RCY -> 0x05ce }
            goto L_0x05c5
        L_0x05b0:
            X.REM r0 = X.REM.ExecutionException     // Catch:{ RCY -> 0x05ce }
            X.RCY r1 = new X.RCY     // Catch:{ RCY -> 0x05ce }
            r1.<init>(r0)     // Catch:{ RCY -> 0x05ce }
            goto L_0x05c5
        L_0x05b8:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ RCY -> 0x05ce }
            boolean r0 = r0 instanceof X.RCY     // Catch:{ RCY -> 0x05ce }
            if (r0 == 0) goto L_0x05c6
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ RCY -> 0x05ce }
        L_0x05c5:
            throw r1     // Catch:{ RCY -> 0x05ce }
        L_0x05c6:
            X.REM r0 = X.REM.ExecutionException     // Catch:{ RCY -> 0x05ce }
            X.RCY r1 = new X.RCY     // Catch:{ RCY -> 0x05ce }
            r1.<init>(r0)     // Catch:{ RCY -> 0x05ce }
            goto L_0x05c5
        L_0x05ce:
            r3 = move-exception
            X.REM r1 = r3.A00     // Catch:{ all -> 0x0904 }
            X.REM r0 = X.REM.TimedOut     // Catch:{ all -> 0x0904 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x05e1
            X.REt r0 = X.C8901REt.FAILED_DNS_RESOLVE_TIMEOUT     // Catch:{ all -> 0x0904 }
        L_0x05db:
            X.SQm r5 = new X.SQm     // Catch:{ all -> 0x0904 }
            r5.<init>((X.C8901REt) r0, (java.lang.Exception) r3)     // Catch:{ all -> 0x0904 }
            goto L_0x05e5
        L_0x05e1:
            X.REt r0 = X.C8901REt.FAILED_DNS_UNRESOLVED     // Catch:{ all -> 0x0904 }
            goto L_0x05db
        L_0x05e4:
            monitor-exit(r4)     // Catch:{ all -> 0x0904 }
        L_0x05e5:
            boolean r12 = r5.A05     // Catch:{ all -> 0x0904 }
            if (r12 != 0) goto L_0x05ec
            r2.A03()     // Catch:{ all -> 0x0904 }
        L_0x05ec:
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x0904 }
            X.ST3 r11 = r0.A00     // Catch:{ all -> 0x0904 }
            if (r12 == 0) goto L_0x060c
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ all -> 0x0904 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0904 }
            r11.A0Q = r0     // Catch:{ all -> 0x0904 }
        L_0x05fa:
            java.lang.String r21 = "DefaultClientCore"
            X.SRZ r10 = r11.A09     // Catch:{ all -> 0x0904 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0904 }
            long r0 = r11.A0P     // Catch:{ all -> 0x0904 }
            long r3 = r3 - r0
            X.T9D r1 = r5.A04     // Catch:{ all -> 0x0904 }
            boolean r0 = r1 instanceof X.C7860Qbk     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x0626
            goto L_0x0624
        L_0x060c:
            java.util.EnumSet r0 = X.ST3.A0c     // Catch:{ all -> 0x0904 }
            boolean r0 = r11.A0L     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x05fa
            X.T9D r3 = r5.A04     // Catch:{ all -> 0x0904 }
            boolean r0 = r3 instanceof X.C7860Qbk     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x05fa
            java.lang.Object r1 = r3.A01()     // Catch:{ all -> 0x0904 }
            X.REt r0 = X.C8901REt.FAILED_CONNECTION_UNKNOWN_CONNECT_HASH     // Catch:{ all -> 0x0904 }
            if (r1 == r0) goto L_0x05fa
            r3.A01()     // Catch:{ all -> 0x0904 }
            goto L_0x05fa
        L_0x0624:
            r9 = 0
            goto L_0x0630
        L_0x0626:
            java.lang.Object r0 = r1.A01()     // Catch:{ all -> 0x0904 }
            X.REt r0 = (X.C8901REt) r0     // Catch:{ all -> 0x0904 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0904 }
        L_0x0630:
            X.T9D r0 = r5.A01     // Catch:{ all -> 0x0904 }
            r25 = r0
            X.T9D r15 = r5.A00     // Catch:{ all -> 0x0904 }
            long r0 = r11.A0V     // Catch:{ all -> 0x0904 }
            r23 = r0
            X.SJJ r0 = r11.A0C     // Catch:{ all -> 0x0904 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06     // Catch:{ all -> 0x0904 }
            long r19 = r0.get()     // Catch:{ all -> 0x0904 }
            android.net.NetworkInfo r0 = r11.A0W     // Catch:{ all -> 0x0904 }
            r22 = r0
            X.Td0 r0 = r11.A05     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x064d
            r18 = 0
            goto L_0x0655
        L_0x064d:
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0904 }
            boolean r18 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ all -> 0x0904 }
        L_0x0655:
            java.lang.String r14 = "connect_result"
            java.lang.String r13 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0904 }
            java.lang.String r8 = "connect_duration_ms"
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0904 }
            java.lang.String[] r0 = new java.lang.String[]{r14, r13, r8, r7}     // Catch:{ all -> 0x0904 }
            java.util.HashMap r6 = X.S9J.A01(r0)     // Catch:{ all -> 0x0904 }
            java.lang.String r4 = "failure_reason"
            if (r9 == 0) goto L_0x0670
            r6.put(r4, r9)     // Catch:{ all -> 0x0904 }
        L_0x0670:
            r0 = r25
            boolean r0 = r0 instanceof X.C7860Qbk     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x0679
            r16 = 0
            goto L_0x067b
        L_0x0679:
            r16 = 1
        L_0x067b:
            java.lang.String r3 = "exception"
            if (r16 == 0) goto L_0x0699
            java.lang.Object r0 = r25.A01()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = X.Pxf.A0g(r0)     // Catch:{ all -> 0x0904 }
            r6.put(r3, r0)     // Catch:{ all -> 0x0904 }
            java.lang.Object r0 = r25.A01()     // Catch:{ all -> 0x0904 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "error_message"
            r6.put(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x0699:
            boolean r0 = r15 instanceof X.C7860Qbk     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x06ac
            java.lang.Object r0 = r15.A01()     // Catch:{ all -> 0x0904 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "conack_rc"
            r6.put(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x06ac:
            java.lang.String r1 = "mqtt_connect_type"
            r0 = r21
            r6.put(r1, r0)     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "fs"
            r6.put(r0, r1)     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = java.lang.Long.toString(r23)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "mqtt_session_id"
            r6.put(r0, r1)     // Catch:{ all -> 0x0904 }
            r0 = r19
            X.SRZ.A00(r0, r6)     // Catch:{ all -> 0x0904 }
            r0 = r22
            X.SRZ.A01(r0, r10, r6)     // Catch:{ all -> 0x0904 }
            java.lang.String r1 = "mqtt_connect_attempt"
            r10.A06(r1, r6)     // Catch:{ all -> 0x0904 }
            X.TjG r10 = r10.A01     // Catch:{ all -> 0x0904 }
            if (r10 == 0) goto L_0x06f7
            java.util.HashMap r6 = X.Dba.A0f(r14, r13)     // Catch:{ all -> 0x0904 }
            r6.put(r8, r7)     // Catch:{ all -> 0x0904 }
            if (r9 == 0) goto L_0x06e7
            r6.put(r4, r9)     // Catch:{ all -> 0x0904 }
        L_0x06e7:
            if (r16 == 0) goto L_0x06f4
            java.lang.Object r0 = r25.A01()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = X.Pxf.A0g(r0)     // Catch:{ all -> 0x0904 }
            r6.put(r3, r0)     // Catch:{ all -> 0x0904 }
        L_0x06f4:
            r10.Cgl(r1, r6)     // Catch:{ all -> 0x0904 }
        L_0x06f7:
            X.Rrs r3 = r11.A0X     // Catch:{ all -> 0x0904 }
            if (r3 == 0) goto L_0x0713
            if (r12 == 0) goto L_0x0707
            X.ST9 r0 = r3.A01     // Catch:{ all -> 0x0904 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0904 }
            X.TGH r0 = new X.TGH     // Catch:{ all -> 0x0904 }
            r0.<init>(r3, r5)     // Catch:{ all -> 0x0904 }
            goto L_0x0710
        L_0x0707:
            X.ST9 r0 = r3.A01     // Catch:{ all -> 0x0904 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0904 }
            X.TGI r0 = new X.TGI     // Catch:{ all -> 0x0904 }
            r0.<init>(r3, r5)     // Catch:{ all -> 0x0904 }
        L_0x0710:
            r1.post(r0)     // Catch:{ all -> 0x0904 }
        L_0x0713:
            monitor-enter(r2)     // Catch:{ all -> 0x0904 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x08fe }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x08fe }
            X.ST3 r0 = r0.A00     // Catch:{ all -> 0x08fe }
            java.lang.Integer r0 = r0.A0Y     // Catch:{ all -> 0x08fe }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x08fe }
            if (r0 != 0) goto L_0x0725
            monitor-exit(r2)     // Catch:{ all -> 0x08fe }
            goto L_0x08cd
        L_0x0725:
            X.S2j r0 = r2.A00     // Catch:{ all -> 0x08fe }
            monitor-exit(r2)     // Catch:{ all -> 0x08fe }
            X.S1r r13 = r0.A00()     // Catch:{ IOException | DataFormatException | JSONException -> 0x08af }
            X.SNX r0 = r13.A00     // Catch:{ all -> 0x0904 }
            X.RFZ r14 = r0.A03     // Catch:{ all -> 0x0904 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x0904 }
            X.ST3 r12 = r0.A00     // Catch:{ all -> 0x0904 }
            X.SBU r19 = X.SBU.A00     // Catch:{ all -> 0x0904 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0904 }
            X.Rrs r11 = r12.A0X     // Catch:{ all -> 0x0904 }
            int r0 = r14.ordinal()     // Catch:{ all -> 0x0904 }
            switch(r0) {
                case 2: goto L_0x0745;
                case 3: goto L_0x0839;
                case 11: goto L_0x0852;
                default: goto L_0x0743;
            }     // Catch:{ all -> 0x0904 }
        L_0x0743:
            goto L_0x085c
        L_0x0745:
            r6 = r13
            X.Qc5 r6 = (X.C7881Qc5) r6     // Catch:{ all -> 0x0904 }
            X.SRA r1 = r12.A0E     // Catch:{ all -> 0x0904 }
            java.lang.Object r8 = r6.A02     // Catch:{ all -> 0x0904 }
            X.S1G r8 = (X.S1G) r8     // Catch:{ all -> 0x0904 }
            java.lang.String r10 = r8.A01     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = X.C11147SCc.A00(r10)     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x082a
            X.S5H r7 = r1.A0I     // Catch:{ all -> 0x0904 }
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r10}     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "Failed to decode topic %s"
            java.lang.String.format(r5, r0, r1)     // Catch:{ all -> 0x0904 }
            r7.A02(r5)     // Catch:{ all -> 0x0904 }
        L_0x0765:
            int r9 = r8.A00     // Catch:{ all -> 0x0904 }
            X.SNX r0 = r6.A00     // Catch:{ all -> 0x0904 }
            int r8 = r0.A02     // Catch:{ all -> 0x0904 }
            java.lang.Object r7 = r6.A01     // Catch:{ all -> 0x0904 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0904 }
            r20 = 0
            if (r11 == 0) goto L_0x082d
            r0 = 462(0x1ce, float:6.47E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0904 }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x0787
            java.lang.String r0 = "/t_sm_rp"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x0798
        L_0x0787:
            X.ST9 r0 = r11.A01     // Catch:{ all -> 0x0904 }
            X.ST2 r1 = r0.A0D     // Catch:{ all -> 0x0904 }
            java.lang.Class<X.Qbp> r0 = X.C7865Qbp.class
            X.TaT r1 = r1.A05(r0)     // Catch:{ all -> 0x0904 }
            X.Sq3 r1 = (X.C12249Sq3) r1     // Catch:{ all -> 0x0904 }
            X.RJ2 r0 = X.RJ2.MessageSendSuccess     // Catch:{ all -> 0x0904 }
            X.C12249Sq3.A00(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x0798:
            r0 = 461(0x1cd, float:6.46E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x0904 }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x07ac
            java.lang.String r0 = "/t_push"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x07bd
        L_0x07ac:
            X.ST9 r0 = r11.A01     // Catch:{ all -> 0x0904 }
            X.ST2 r1 = r0.A0D     // Catch:{ all -> 0x0904 }
            java.lang.Class<X.Qbp> r0 = X.C7865Qbp.class
            X.TaT r1 = r1.A05(r0)     // Catch:{ all -> 0x0904 }
            X.Sq3 r1 = (X.C12249Sq3) r1     // Catch:{ all -> 0x0904 }
            X.RJ2 r0 = X.RJ2.FbnsNotificationReceived     // Catch:{ all -> 0x0904 }
            X.C12249Sq3.A00(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x07bd:
            java.lang.String r0 = "/fbns_msg"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x07d6
            X.ST9 r0 = r11.A01     // Catch:{ all -> 0x0904 }
            X.ST2 r1 = r0.A0D     // Catch:{ all -> 0x0904 }
            java.lang.Class<X.Qbp> r0 = X.C7865Qbp.class
            X.TaT r1 = r1.A05(r0)     // Catch:{ all -> 0x0904 }
            X.Sq3 r1 = (X.C12249Sq3) r1     // Catch:{ all -> 0x0904 }
            X.RJ2 r0 = X.RJ2.FbnsLiteNotificationReceived     // Catch:{ all -> 0x0904 }
            X.C12249Sq3.A00(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x07d6:
            X.ST9 r6 = r11.A01     // Catch:{ all -> 0x0904 }
            X.ST2 r1 = r6.A0D     // Catch:{ all -> 0x0904 }
            java.lang.Class<X.Qbp> r0 = X.C7865Qbp.class
            X.TaT r1 = r1.A05(r0)     // Catch:{ all -> 0x0904 }
            X.Sq3 r1 = (X.C12249Sq3) r1     // Catch:{ all -> 0x0904 }
            X.RJ2 r0 = X.RJ2.PublishReceived     // Catch:{ all -> 0x0904 }
            X.C12249Sq3.A00(r0, r1)     // Catch:{ all -> 0x0904 }
            X.TjG r0 = r6.A08     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x081a
            java.util.Set r0 = X.C13893TjG.A00     // Catch:{ all -> 0x0904 }
            boolean r0 = r0.contains(r10)     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x081a
            X.TjG r5 = r6.A08     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "PUBLISH(topic="
            java.lang.StringBuilder r1 = X.Pxe.A16(r0)     // Catch:{ all -> 0x0904 }
            r1.append(r10)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = ", msgId="
            r1.append(r0)     // Catch:{ all -> 0x0904 }
            r1.append(r9)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = ", time="
            r1.append(r0)     // Catch:{ all -> 0x0904 }
            r1.append(r3)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = ")"
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "received"
            r5.Cgj(r0, r1)     // Catch:{ all -> 0x0904 }
        L_0x081a:
            X.TiD r0 = r6.A0M     // Catch:{ all -> 0x0904 }
            r23 = r9
            r24 = r3
            r21 = r10
            r22 = r7
            r18 = r0
            r18.Dav(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0904 }
            goto L_0x082d
        L_0x082a:
            r10 = r0
            goto L_0x0765
        L_0x082d:
            r0 = r17
            if (r8 != r0) goto L_0x085c
            java.util.concurrent.ExecutorService r1 = r12.A0J     // Catch:{ all -> 0x0904 }
            X.TGN r0 = new X.TGN     // Catch:{ all -> 0x0904 }
            r0.<init>(r12, r9)     // Catch:{ all -> 0x0904 }
            goto L_0x0859
        L_0x0839:
            r0 = r13
            X.Qc4 r0 = (X.C7880Qc4) r0     // Catch:{ all -> 0x0904 }
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0904 }
            X.S0O r0 = (X.S0O) r0     // Catch:{ all -> 0x0904 }
            int r0 = r0.A00     // Catch:{ all -> 0x0904 }
            java.util.Map r1 = r12.A0b     // Catch:{ all -> 0x0904 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0904 }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0904 }
            android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0904 }
            goto L_0x085c
        L_0x0852:
            java.util.concurrent.ExecutorService r1 = r12.A0J     // Catch:{ all -> 0x0904 }
            X.TCb r0 = new X.TCb     // Catch:{ all -> 0x0904 }
            r0.<init>(r12)     // Catch:{ all -> 0x0904 }
        L_0x0859:
            r1.execute(r0)     // Catch:{ all -> 0x0904 }
        L_0x085c:
            if (r11 == 0) goto L_0x086a
            X.ST9 r0 = r11.A01     // Catch:{ all -> 0x0904 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0904 }
            X.TGJ r0 = new X.TGJ     // Catch:{ all -> 0x0904 }
            r0.<init>(r11, r13)     // Catch:{ all -> 0x0904 }
            r1.post(r0)     // Catch:{ all -> 0x0904 }
        L_0x086a:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0904 }
            r12.A0S = r0     // Catch:{ all -> 0x0904 }
            boolean r0 = r13 instanceof X.C7881Qc5     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08ac
            X.Qc5 r13 = (X.C7881Qc5) r13     // Catch:{ all -> 0x0904 }
            java.lang.Object r0 = r13.A02     // Catch:{ all -> 0x0904 }
            X.S1G r0 = (X.S1G) r0     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0904 }
            X.Qbl r5 = X.C7861Qbl.A00(r0)     // Catch:{ all -> 0x0904 }
        L_0x0880:
            X.SIe r4 = r12.A0A     // Catch:{ all -> 0x0904 }
            java.lang.String r3 = r14.name()     // Catch:{ all -> 0x0904 }
            boolean r0 = r5 instanceof X.C7860Qbk     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x089f
            java.lang.String r0 = ""
        L_0x088c:
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0}     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = "I %s%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0904 }
            r4.A02(r0)     // Catch:{ all -> 0x0904 }
            long r0 = r12.A0S     // Catch:{ all -> 0x0904 }
            r12.A0R = r0     // Catch:{ all -> 0x0904 }
            goto L_0x0713
        L_0x089f:
            java.lang.String r1 = " "
            java.lang.Object r0 = r5.A01()     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0904 }
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0904 }
            goto L_0x088c
        L_0x08ac:
            X.Qbk r5 = X.C7860Qbk.A00     // Catch:{ all -> 0x0904 }
            goto L_0x0880
        L_0x08af:
            r6 = move-exception
            X.S5H r1 = r2.A0I     // Catch:{ all -> 0x0904 }
            boolean r0 = r6 instanceof java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x08fa
            boolean r0 = r6 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x0904 }
            if (r0 != 0) goto L_0x08fa
            boolean r0 = r6 instanceof java.io.EOFException     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08db
            X.RGw r5 = X.C8947RGw.READ_EOF     // Catch:{ all -> 0x0904 }
        L_0x08c0:
            X.REg r4 = X.C8889REg.NETWORK_THREAD_LOOP     // Catch:{ all -> 0x0904 }
            X.ST3 r3 = r1.A00     // Catch:{ all -> 0x0904 }
            java.lang.Integer r1 = r3.A0Y     // Catch:{ all -> 0x0904 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0904 }
            if (r1 == r0) goto L_0x08cd
            X.ST3.A03(r3, r4, r5, r6)     // Catch:{ all -> 0x0904 }
        L_0x08cd:
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x0904 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0904 }
            X.ST3 r0 = r0.A00     // Catch:{ all -> 0x0904 }
            r0.A0Y = r1     // Catch:{ all -> 0x0904 }
            X.S5H r0 = r2.A0I     // Catch:{ all -> 0x0904 }
            r0.A00()     // Catch:{ all -> 0x0904 }
            goto L_0x08fd
        L_0x08db:
            boolean r0 = r6 instanceof java.net.SocketException     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08e2
            X.RGw r5 = X.C8947RGw.READ_SOCKET     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08e2:
            boolean r0 = r6 instanceof javax.net.ssl.SSLException     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08e9
            X.RGw r5 = X.C8947RGw.READ_SSL     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08e9:
            boolean r0 = r6 instanceof java.io.IOException     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08f0
            X.RGw r5 = X.C8947RGw.READ_IO     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08f0:
            boolean r0 = r6 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0904 }
            if (r0 == 0) goto L_0x08f7
            X.RGw r5 = X.C8947RGw.READ_FORMAT     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08f7:
            X.RGw r5 = X.C8947RGw.READ_FAILURE_UNCLASSIFIED     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08fa:
            X.RGw r5 = X.C8947RGw.READ_TIMEOUT     // Catch:{ all -> 0x0904 }
            goto L_0x08c0
        L_0x08fd:
            return
        L_0x08fe:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08fe }
            goto L_0x0903
        L_0x0901:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0904 }
        L_0x0903:
            throw r5     // Catch:{ all -> 0x0904 }
        L_0x0904:
            r6 = move-exception
            java.lang.String r1 = "DefaultMqttClientCore"
            java.lang.String r0 = "exception/networkThreadLoop"
            X.0KC.A0G(r1, r0, r6)
            r0 = r45
            X.SRA r5 = r0.A02
            java.util.EnumSet r0 = X.ST3.A0c
            X.S5H r0 = r5.A0I
            X.RGw r4 = X.C8947RGw.UNKNOWN_RUNTIME
            X.REg r3 = X.C8889REg.NETWORK_THREAD_LOOP
            X.ST3 r2 = r0.A00
            java.lang.Integer r1 = r2.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0923
            X.ST3.A03(r2, r3, r4, r6)
        L_0x0923:
            X.S5H r0 = r5.A0I
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13075TKf.run():void");
    }
}
