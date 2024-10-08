package X;

/* renamed from: X.Y4l  reason: case insensitive filesystem */
public final class C22454Y4l implements C22552Y9f {
    public final Y1U A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r6 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(java.io.IOException r4, X.C21988Xp1 r5, boolean r6) {
        /*
            r3 = this;
            X.Y1U r0 = r3.A00
            boolean r0 = r0.A0P
            r2 = 0
            if (r0 == 0) goto L_0x000d
            if (r6 == 0) goto L_0x000e
            boolean r0 = r4 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            return r2
        L_0x000e:
            boolean r0 = r4 instanceof java.net.ProtocolException
            if (r0 != 0) goto L_0x000d
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L_0x0022
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L_0x000d
            if (r6 != 0) goto L_0x000d
        L_0x001c:
            X.Xcj r0 = r5.A03
            X.Xnx r1 = r0.A07
            monitor-enter(r1)
            goto L_0x0034
        L_0x0022:
            boolean r0 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L_0x002f
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L_0x002f
            return r2
        L_0x002f:
            boolean r0 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L_0x001c
            return r2
        L_0x0034:
            boolean r0 = r0.A03     // Catch:{ all -> 0x0043 }
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x000d
            X.Xcj r0 = r5.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x000d
            r2 = 1
            return r2
        L_0x0043:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22454Y4l.A00(java.io.IOException, X.Xp1, boolean):boolean");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x012a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012b  */
    public final X.Y1H CNe(X.C21469Xc1 r32) {
        /*
            r31 = this;
            r14 = r32
            X.Xbw r9 = r14.A04
            X.Xp1 r13 = r14.A06
            r16 = 0
            r12 = 0
            r11 = r12
            r10 = 0
        L_0x000b:
            X.Xbw r0 = r13.A01
            if (r0 == 0) goto L_0x0224
            X.STm r1 = r0.A03
            X.STm r0 = r9.A03
            boolean r0 = X.SUS.A0D(r1, r0)
            if (r0 == 0) goto L_0x0216
            X.Xcj r0 = r13.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0216
        L_0x0021:
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x02a7
            r4 = r31
            X.Y1H r7 = r14.A00(r9, r12, r13)     // Catch:{ Y5B -> 0x0203, IOException -> 0x01f5 }
            if (r11 == 0) goto L_0x0049
            X.Xny r2 = new X.Xny
            r2.<init>(r7)
            X.Xny r0 = new X.Xny
            r0.<init>(r11)
            r0.A0B = r12
            X.Y1H r1 = r0.A00()
            X.Y1D r0 = r1.A0B
            if (r0 != 0) goto L_0x029b
            r2.A0A = r1
            X.Y1H r7 = r2.A00()
        L_0x0049:
            r11 = r7
            X.Xcc r3 = r7.A0C
            if (r3 == 0) goto L_0x0115
            X.YAz r0 = r3.A04
            X.Y7U r0 = r0.AJK()
            X.Xd1 r15 = r0.A0E
        L_0x0056:
            int r8 = r7.A00
            X.Xbw r9 = r7.A07
            java.lang.String r6 = r9.A00
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r1 = "GET"
            r2 = 0
            if (r8 == r0) goto L_0x00e7
            r0 = 308(0x134, float:4.32E-43)
            if (r8 == r0) goto L_0x00e7
            r0 = 401(0x191, float:5.62E-43)
            if (r8 == r0) goto L_0x007a
            r5 = 503(0x1f7, float:7.05E-43)
            if (r8 == r5) goto L_0x00c0
            r0 = 407(0x197, float:5.7E-43)
            if (r8 == r0) goto L_0x00a7
            r5 = 408(0x198, float:5.72E-43)
            if (r8 == r5) goto L_0x007b
            switch(r8) {
                case 300: goto L_0x00f6;
                case 301: goto L_0x00f6;
                case 302: goto L_0x00f6;
                case 303: goto L_0x00f6;
                default: goto L_0x007a;
            }
        L_0x007a:
            return r7
        L_0x007b:
            X.Y1U r0 = r4.A00
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x007a
            X.Y1H r0 = r7.A0A
            if (r0 == 0) goto L_0x008a
            int r0 = r0.A00
            if (r0 != r5) goto L_0x008a
            return r7
        L_0x008a:
            java.lang.String r1 = "Retry-After"
            X.Xt4 r0 = r7.A05
            java.lang.String r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x0180
            java.lang.String r0 = "\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0180
            return r7
        L_0x00a7:
            if (r15 == 0) goto L_0x00bb
            java.net.Proxy r0 = r15.A01
        L_0x00ab:
            java.net.Proxy$Type r1 = r0.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r1 == r0) goto L_0x007a
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            java.net.ProtocolException r1 = new java.net.ProtocolException
            r1.<init>(r0)
            throw r1
        L_0x00bb:
            X.Y1U r0 = r4.A00
            java.net.Proxy r0 = r0.A05
            goto L_0x00ab
        L_0x00c0:
            X.Y1H r0 = r7.A0A
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.A00
            if (r0 != r5) goto L_0x00c9
            return r7
        L_0x00c9:
            java.lang.String r1 = "Retry-After"
            X.Xt4 r0 = r7.A05
            java.lang.String r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x007a
            goto L_0x0180
        L_0x00e7:
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "HEAD"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00f6
            return r7
        L_0x00f6:
            X.Y1U r4 = r4.A00
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x007a
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r5 = X.Pxd.A00(r0)
            X.Xt4 r0 = r7.A05
            java.lang.String r5 = r0.A03(r5)
            if (r5 == 0) goto L_0x007a
            X.STm r8 = r9.A03
            X.S73 r0 = new X.S73     // Catch:{ IllegalArgumentException -> 0x007a }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x007a }
            r0.A02(r5, r8)     // Catch:{ IllegalArgumentException -> 0x007a }
            goto L_0x0118
        L_0x0115:
            r15 = r12
            goto L_0x0056
        L_0x0118:
            X.STm r5 = r0.A00()
            java.lang.String r15 = r5.A03
            java.lang.String r0 = r8.A03
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x012b
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x012b
            return r7
        L_0x012b:
            X.Xog r4 = new X.Xog
            r4.<init>(r9)
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "HEAD"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "PROPFIND"
            boolean r15 = r6.equals(r0)
            r0 = r15 ^ 1
            if (r0 == 0) goto L_0x0189
            int r0 = r1.length()
            if (r0 == 0) goto L_0x028d
            r4.A00 = r1
            r4.A04 = r12
        L_0x0152:
            if (r15 != 0) goto L_0x0169
            java.lang.String r0 = "Transfer-Encoding"
            X.XoG r1 = r4.A02
            r1.A01(r0)
            java.lang.String r0 = "Content-Length"
            r1.A01(r0)
            r0 = 2180(0x884, float:3.055E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A01(r0)
        L_0x0169:
            boolean r0 = X.SUS.A0D(r8, r5)
            if (r0 != 0) goto L_0x017a
            r0 = 2105(0x839, float:2.95E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.XoG r0 = r4.A02
            r0.A01(r1)
        L_0x017a:
            r4.A03 = r5
            X.Xbw r9 = r4.A00()
        L_0x0180:
            X.Y1D r0 = r7.A0B
            X.SUS.A09(r0)
            X.Xnx r2 = r13.A0D
            monitor-enter(r2)
            goto L_0x01cf
        L_0x0189:
            if (r15 == 0) goto L_0x018d
            X.Xml r2 = r9.A04
        L_0x018d:
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0294
            java.lang.String r1 = "method "
            if (r2 != 0) goto L_0x01ca
            java.lang.String r0 = "POST"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "PUT"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "PATCH"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "REPORT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01ca
        L_0x01bf:
            java.lang.String r0 = " must have a request body."
            java.lang.String r0 = X.002.A0g(r1, r6, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01ca:
            r4.A00 = r6
            r4.A04 = r2
            goto L_0x0152
        L_0x01cf:
            X.Xcc r0 = r13.A02     // Catch:{ all -> 0x028a }
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            monitor-exit(r2)     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x01e3
            X.YAz r0 = r3.A04
            r0.cancel()
            X.Xp1 r1 = r3.A03
            r0 = 1
            r1.A02(r12, r3, r0, r0)
        L_0x01e3:
            int r10 = r10 + 1
            r0 = 20
            if (r10 <= r0) goto L_0x000b
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.String r0 = X.002.A0O(r0, r10)
            java.net.ProtocolException r1 = new java.net.ProtocolException
            r1.<init>(r0)
            throw r1
        L_0x01f5:
            r1 = move-exception
            boolean r0 = r1 instanceof X.XQW     // Catch:{ all -> 0x02a2 }
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            boolean r0 = r4.A00(r1, r13, r0)     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0210
            goto L_0x0211
        L_0x0203:
            r2 = move-exception
            java.io.IOException r1 = r2.A01     // Catch:{ all -> 0x02a2 }
            r0 = r16
            boolean r0 = r4.A00(r1, r13, r0)     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x0211
            java.io.IOException r1 = r2.A00     // Catch:{ all -> 0x02a2 }
        L_0x0210:
            throw r1     // Catch:{ all -> 0x02a2 }
        L_0x0211:
            r13.A05()
            goto L_0x000b
        L_0x0216:
            X.Xcc r0 = r13.A02
            if (r0 != 0) goto L_0x02ae
            X.Xcj r0 = r13.A03
            if (r0 == 0) goto L_0x0224
            r0 = 1
            X.C21988Xp1.A00(r12, r13, r0)
            r13.A03 = r12
        L_0x0224:
            r13.A01 = r9
            X.Xnx r0 = r13.A0D
            r30 = r0
            X.STm r2 = r9.A03
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0284
            X.Y1U r1 = r13.A0B
            javax.net.ssl.SSLSocketFactory r0 = r1.A0D
            r25 = r0
            javax.net.ssl.HostnameVerifier r0 = r1.A0C
            r24 = r0
            X.SOu r15 = r1.A0G
        L_0x0242:
            java.lang.String r8 = r2.A02
            int r7 = r2.A00
            X.Y1U r0 = r13.A0B
            X.YBR r6 = r0.A0K
            javax.net.SocketFactory r5 = r0.A0B
            X.YBP r4 = r0.A0F
            java.net.Proxy r3 = r0.A05
            java.util.List r2 = r0.A0A
            java.util.List r1 = r0.A07
            java.net.ProxySelector r0 = r0.A06
            X.XdI r17 = new X.XdI
            r18 = r8
            r19 = r3
            r20 = r0
            r21 = r2
            r22 = r1
            r23 = r5
            r26 = r4
            r27 = r15
            r28 = r6
            r29 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.Y1T r2 = r13.A0C
            X.Xmb r1 = r13.A0A
            X.Xcj r0 = new X.Xcj
            r3 = r0
            r4 = r17
            r5 = r1
            r6 = r2
            r7 = r30
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A03 = r0
            goto L_0x0021
        L_0x0284:
            r25 = r12
            r24 = r12
            r15 = r12
            goto L_0x0242
        L_0x028a:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x028a }
            throw r1
        L_0x028d:
            java.lang.String r0 = "method.length() == 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0294:
            java.lang.String r0 = "method.length() == 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x029b:
            java.lang.String r0 = "priorResponse.body != null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x02a2:
            r0 = move-exception
            r13.A05()
            throw r0
        L_0x02a7:
            java.lang.String r0 = "Canceled"
            java.io.IOException r1 = X.JTO.A0u(r0)
            throw r1
        L_0x02ae:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22454Y4l.CNe(X.Xc1):X.Y1H");
    }

    public C22454Y4l(Y1U y1u) {
        this.A00 = y1u;
    }
}
