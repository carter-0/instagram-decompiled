package X;

import android.net.LocalSocket;

/* renamed from: X.Pyo  reason: case insensitive filesystem */
public final class C7198Pyo implements Runnable {
    public final /* synthetic */ LocalSocket A00;
    public final /* synthetic */ C266874aU A01;

    public C7198Pyo(LocalSocket localSocket, C266874aU r2) {
        this.A01 = r2;
        this.A00 = localSocket;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:240:0x04fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0106 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0215 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0237 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0256 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0274 A[Catch:{ IOException -> 0x0521 }, LOOP:1: B:114:0x026e->B:116:0x0274, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02a6 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0390 A[Catch:{ IOException -> 0x04c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03bf A[Catch:{ IOException -> 0x04c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03fe A[Catch:{ IOException -> 0x04c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x045f A[Catch:{ IOException -> 0x04c9 }, LOOP:4: B:192:0x0459->B:194:0x045f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x049e A[Catch:{ IOException -> 0x04c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04e0 A[SYNTHETIC, Splitter:B:221:0x04e0] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04e5 A[SYNTHETIC, Splitter:B:225:0x04e5] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x050c A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04c5 A[EDGE_INSN: B:281:0x04c5->B:207:0x04c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016b A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b7 A[Catch:{ IOException -> 0x0521 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2 A[Catch:{ IOException -> 0x0521 }] */
    public final void run() {
        /*
            r30 = this;
            r27 = 0
            r11 = 0
            r26 = 0
            r2 = r30
            X.4aU r1 = r2.A01
            X.1yV r0 = r1.A00
            r29 = r0
            java.lang.Object r0 = r0.A02
            r23 = r0
            monitor-enter(r23)
            r0 = r29
            java.util.List r0 = r0.A04     // Catch:{ all -> 0x0534 }
            r28 = r0
            android.net.LocalSocket r10 = r2.A00     // Catch:{ all -> 0x0534 }
            r0.add(r10)     // Catch:{ all -> 0x0534 }
            monitor-exit(r23)     // Catch:{ all -> 0x0534 }
            X.4aR r9 = r1.A02
            r8 = 0
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r24 = "LocalSocketVideoProxy"
            java.lang.String r1 = "Handling local socket request"
            r0 = r24
            X.27B.A01(r0, r1, r2)
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ IOException -> 0x0052 }
            java.lang.String r0 = "US-ASCII"
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0052 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0052 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0052 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0052 }
            X.1yV.A02(r0, r14)     // Catch:{ IOException -> 0x0052 }
            X.1yV.A02(r0, r12)     // Catch:{ IOException -> 0x0052 }
            X.1yV.A02(r0, r4)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0064
        L_0x0052:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = "Error parsing request"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            r0 = r24
            android.util.Log.e(r0, r1, r2)
            X.1yV.A01(r10, r11)
            goto L_0x007f
        L_0x0064:
            java.lang.String r25 = "Range"
            r0 = r25
            java.lang.String r1 = X.Pxf.A0i(r0, r14)
            java.lang.String r0 = "Uri"
            java.lang.String r7 = X.Pxf.A0i(r0, r14)
            if (r7 != 0) goto L_0x0082
            java.lang.String r1 = "videoproxy_no_url"
            java.lang.String r0 = ""
            X.0wb.A03(r1, r0)
            X.1yV.A01(r10, r7)
        L_0x007f:
            monitor-enter(r23)
            goto L_0x052a
        L_0x0082:
            android.net.Uri r0 = android.net.Uri.parse(r7)
            java.lang.String r0 = r0.getAuthority()
            if (r0 == 0) goto L_0x007f
            java.lang.String r3 = "Priority"
            boolean r0 = r14.containsKey(r3)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = X.DbS.A0r(r3, r14)     // Catch:{ NumberFormatException -> 0x009d }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x009d }
            goto L_0x00b3
        L_0x009d:
            java.lang.String r2 = "Failed to parse priority "
            java.lang.String r0 = X.DbS.A0r(r3, r14)
            java.lang.String r2 = X.002.A0R(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = java.lang.String.format(r2, r0)
            r0 = r24
            android.util.Log.e(r0, r2)
        L_0x00b2:
            r2 = -1
        L_0x00b3:
            r3 = 6
            r12.putAll(r4)     // Catch:{ IOException -> 0x0521 }
            r4 = -1
            r6 = 1
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = "unspecified"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0521 }
            if (r0 != 0) goto L_0x0123
            java.lang.String r3 = X.C66580MXl.A0z(r1, r3)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "-"
            java.util.List r5 = X.DbW.A0o(r3, r0)     // Catch:{ IOException -> 0x0521 }
            boolean r0 = r5.isEmpty()     // Catch:{ IOException -> 0x0521 }
            if (r0 != 0) goto L_0x00f3
            java.util.ListIterator r3 = X.C51968G9o.A18(r5)     // Catch:{ IOException -> 0x0521 }
        L_0x00d8:
            boolean r0 = r3.hasPrevious()     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r3.previous()     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0521 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x00d8
            java.util.List r0 = X.DbX.A0y(r5, r3)     // Catch:{ IOException -> 0x0521 }
        L_0x00ee:
            java.lang.String[] r3 = X.DbU.A1b(r0, r8)     // Catch:{ IOException -> 0x0521 }
            goto L_0x00f6
        L_0x00f3:
            X.0sn r0 = X.0sn.A00     // Catch:{ IOException -> 0x0521 }
            goto L_0x00ee
        L_0x00f6:
            r0 = r3[r8]     // Catch:{ NumberFormatException -> 0x0106 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0106 }
            int r0 = r3.length     // Catch:{ NumberFormatException -> 0x0106 }
            if (r0 <= r6) goto L_0x0124
            r0 = r3[r6]     // Catch:{ NumberFormatException -> 0x0106 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0106 }
            goto L_0x0124
        L_0x0106:
            java.lang.String r3 = X.C266844aR.A06     // Catch:{ IOException -> 0x0521 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r7}     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "Failed to parse request range %s for url: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException -> 0x0521 }
            android.util.Log.e(r3, r0)     // Catch:{ IOException -> 0x0521 }
            goto L_0x0123
        L_0x0116:
            java.lang.String r3 = X.C266844aR.A06     // Catch:{ IOException -> 0x0521 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "Range request shouldn't be empty!"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ IOException -> 0x0521 }
            android.util.Log.e(r3, r0)     // Catch:{ IOException -> 0x0521 }
        L_0x0123:
            r5 = -1
        L_0x0124:
            X.0bY r0 = X.C266844aR.A05     // Catch:{ IOException -> 0x0521 }
            android.net.Uri r0 = X.0cp.A01(r0, r7)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r0.getAuthority()     // Catch:{ IOException -> 0x0521 }
            if (r0 != 0) goto L_0x0138
        L_0x0132:
            java.lang.String r0 = "video_proxy_invalid_url"
            X.0wb.A03(r0, r7)     // Catch:{ IOException -> 0x0521 }
        L_0x0138:
            if (r2 == 0) goto L_0x0148
            if (r2 == r6) goto L_0x0148
            java.lang.String r0 = "Invalid priority "
            java.lang.String r1 = X.002.A0O(r0, r2)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "video_proxy_priority"
            X.0wb.A03(r0, r1)     // Catch:{ IOException -> 0x0521 }
        L_0x0148:
            X.16e r0 = r9.A01     // Catch:{ IOException -> 0x0521 }
            X.2hY r21 = r0.E1h(r7)     // Catch:{ IOException -> 0x0521 }
            if (r2 != 0) goto L_0x016b
            X.1Fe r1 = X.1Fe.A03     // Catch:{ IOException -> 0x0521 }
        L_0x0152:
            X.1QT r13 = new X.1QT     // Catch:{ IOException -> 0x0521 }
            r13.<init>()     // Catch:{ IOException -> 0x0521 }
            X.1CE r0 = X.1CE.A0A     // Catch:{ IOException -> 0x0521 }
            r13.A04 = r0     // Catch:{ IOException -> 0x0521 }
            r13.A03 = r1     // Catch:{ IOException -> 0x0521 }
            java.lang.String r1 = "play_origin"
            boolean r0 = r14.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = X.DbS.A0r(r1, r14)     // Catch:{ IOException -> 0x0521 }
            goto L_0x016e
        L_0x016b:
            X.1Fe r1 = X.1Fe.A02     // Catch:{ IOException -> 0x0521 }
            goto L_0x0152
        L_0x016e:
            if (r0 == 0) goto L_0x0172
            r13.A0C = r0     // Catch:{ IOException -> 0x0521 }
        L_0x0172:
            java.lang.String r3 = "video_id"
            boolean r0 = r12.containsKey(r3)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x020b
            java.lang.String r15 = X.DbS.A0r(r3, r12)     // Catch:{ IOException -> 0x0521 }
            if (r15 == 0) goto L_0x020b
            long r0 = (long) r5     // Catch:{ IOException -> 0x0521 }
            X.3xX r2 = new X.3xX     // Catch:{ IOException -> 0x0521 }
            r2.<init>(r0, r15, r8)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r1 = "video_stream_type"
            boolean r0 = r12.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r12.get(r1)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0521 }
            X.0qQ.A0B(r0, r8)     // Catch:{ IOException -> 0x0521 }
            r2.A04 = r0     // Catch:{ IOException -> 0x0521 }
        L_0x019d:
            java.lang.String r1 = "etd_ms"
            boolean r0 = r14.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = X.DbS.A0r(r1, r14)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ae
            X.00y.A0l(r0)     // Catch:{ IOException -> 0x0521 }
        L_0x01ae:
            java.lang.String r1 = "video_request_type"
            boolean r0 = r12.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ba
            r12.get(r1)     // Catch:{ IOException -> 0x0521 }
        L_0x01ba:
            java.lang.String r1 = "isFirstMedia"
            boolean r0 = r14.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = X.DbS.A0r(r1, r14)     // Catch:{ IOException -> 0x0521 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0521 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x0521 }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x0521 }
            r2.A05 = r0     // Catch:{ IOException -> 0x0521 }
        L_0x01d3:
            java.lang.String r1 = "video_pos"
            boolean r0 = r12.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = X.DbS.A0r(r1, r12)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ee
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x01ee
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0521 }
            r2.A01 = r0     // Catch:{ IOException -> 0x0521 }
        L_0x01ee:
            java.lang.String r1 = "video_start_ms"
            boolean r0 = r12.containsKey(r1)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = X.DbS.A0r(r1, r12)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0209
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0209
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0521 }
            r2.A00 = r0     // Catch:{ IOException -> 0x0521 }
        L_0x0209:
            r13.A05 = r2     // Catch:{ IOException -> 0x0521 }
        L_0x020b:
            X.1QU r20 = r13.A00()     // Catch:{ IOException -> 0x0521 }
            boolean r0 = r12.containsKey(r3)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0256
            java.lang.String r11 = X.DbS.A0r(r3, r12)     // Catch:{ IOException -> 0x0521 }
            r26 = r9
            r27 = r20
            r19 = 1
        L_0x021f:
            X.14G r18 = X.14G.A03()     // Catch:{ IOException -> 0x0521 }
            long r2 = (long) r5     // Catch:{ IOException -> 0x0521 }
            long r0 = (long) r4     // Catch:{ IOException -> 0x0521 }
            com.instagram.common.session.UserSession r13 = r9.A02     // Catch:{ IOException -> 0x0521 }
            X.1HV r14 = X.14G.A01(r13)     // Catch:{ IOException -> 0x0521 }
            r13 = r21
            X.1QS r13 = X.14G.A00(r14, r13)     // Catch:{ IOException -> 0x0521 }
            r16 = 0
            int r14 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x026a
            java.lang.Long r15 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x0521 }
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x0253
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0521 }
        L_0x0243:
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r14}     // Catch:{ IOException -> 0x0521 }
            java.lang.String r14 = "bytes=%s-%s"
            java.lang.String r15 = X.0mp.A06(r14, r15)     // Catch:{ IOException -> 0x0521 }
            r14 = r25
            r13.A01(r14, r15)     // Catch:{ IOException -> 0x0521 }
            goto L_0x0259
        L_0x0253:
            java.lang.String r14 = ""
            goto L_0x0243
        L_0x0256:
            r19 = 0
            goto L_0x021f
        L_0x0259:
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 < 0) goto L_0x026a
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "Size-Bytes"
            r13.A01(r0, r1)     // Catch:{ IOException -> 0x0521 }
        L_0x026a:
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r12)     // Catch:{ IOException -> 0x0521 }
        L_0x026e:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x0521 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x0521 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x0521 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0521 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0521 }
            r13.A01(r1, r0)     // Catch:{ IOException -> 0x0521 }
            goto L_0x026e
        L_0x028a:
            r0 = r21
            java.lang.String r1 = r0.A07     // Catch:{ IOException -> 0x0521 }
            r0 = r18
            X.14G.A04(r13, r0, r1)     // Catch:{ IOException -> 0x0521 }
            X.1QX r1 = new X.1QX     // Catch:{ IOException -> 0x0521 }
            r0 = r20
            r1.<init>(r13, r0)     // Catch:{ IOException -> 0x0521 }
            X.1C7 r14 = X.AnonymousClass1C7.A00()     // Catch:{ IOException -> 0x0521 }
            X.1QS r12 = r1.A02     // Catch:{ IOException -> 0x0521 }
            java.lang.Integer r2 = r12.A07     // Catch:{ IOException -> 0x0521 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x0521 }
            if (r2 == r0) goto L_0x050c
            boolean r13 = X.AnonymousClass1C7.A00     // Catch:{ IOException -> 0x0521 }
            java.net.URI r0 = r12.A09     // Catch:{ IOException -> 0x0521 }
            X.1Qc r3 = new X.1Qc     // Catch:{ IOException -> 0x0521 }
            r3.<init>(r0, r13)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "SyncHttpService.sendRequest"
            X.0lp r15 = X.0lq.A00(r0)     // Catch:{ IOException -> 0x0521 }
            X.1CO r2 = X.AnonymousClass1CO.A00()     // Catch:{ all -> 0x0502 }
            X.1QU r0 = r1.A03     // Catch:{ all -> 0x0502 }
            X.1T9 r2 = r2.A02(r3, r12, r0)     // Catch:{ all -> 0x0502 }
            X.1TC r0 = new X.1TC     // Catch:{ all -> 0x0502 }
            r0.<init>(r14, r2)     // Catch:{ all -> 0x0502 }
            r1.A01(r0)     // Catch:{ all -> 0x0502 }
            X.47W r12 = new X.47W     // Catch:{ all -> 0x0502 }
            r12.<init>(r3, r14, r2, r13)     // Catch:{ all -> 0x0502 }
            if (r19 == 0) goto L_0x02d9
            if (r11 == 0) goto L_0x02d9
            r0 = r26
            X.3Rz r2 = r0.A00     // Catch:{ all -> 0x0502 }
            r0 = r27
            r2.AA2(r12, r0, r11)     // Catch:{ all -> 0x0502 }
        L_0x02d9:
            r15.close()     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "SyncHttpService.waitForResponse"
            X.0lp r13 = X.0lq.A00(r0)     // Catch:{ IOException -> 0x0521 }
            X.1Qc.A00(r3)     // Catch:{ all -> 0x04fd }
            java.io.IOException r0 = r3.A09     // Catch:{ all -> 0x04fd }
            if (r0 != 0) goto L_0x04fc
            if (r19 == 0) goto L_0x02f6
            if (r11 == 0) goto L_0x02f6
            r0 = r26
            X.3Rz r2 = r0.A00     // Catch:{ all -> 0x04fd }
            r0 = r27
            r2.EEV(r12, r0, r11)     // Catch:{ all -> 0x04fd }
        L_0x02f6:
            X.2ZL r0 = r3.A00     // Catch:{ all -> 0x04fd }
            r0.getClass()     // Catch:{ all -> 0x04fd }
            X.2ZL r11 = r3.A00     // Catch:{ all -> 0x04fd }
            r13.close()     // Catch:{ IOException -> 0x0521 }
            X.1Qb r16 = r11.A00()     // Catch:{ IOException -> 0x0521 }
            if (r16 == 0) goto L_0x0513
            r19 = -1
            java.lang.String r3 = "Content-Range"
            X.1Fn r0 = r11.A01(r3)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0330
            X.1Fn r0 = r11.A01(r3)     // Catch:{ IOException -> 0x0521 }
            if (r0 == 0) goto L_0x0330
            java.lang.String r2 = r0.A01     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ IOException -> 0x0521 }
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x0325 }
            long r19 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0325 }
            goto L_0x0330
        L_0x0325:
            java.lang.String r0 = "failed to parse content-range "
            java.lang.String r2 = X.002.A0R(r0, r2)     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "IgDownloader"
            X.0wb.A03(r0, r2)     // Catch:{ IOException -> 0x0521 }
        L_0x0330:
            X.47Y r2 = new X.47Y     // Catch:{ IOException -> 0x0521 }
            r14 = r2
            r15 = r11
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ IOException -> 0x0521 }
            boolean r0 = r9.A04     // Catch:{ IOException -> 0x0521 }
            r21 = r0
            boolean r0 = r9.A03     // Catch:{ IOException -> 0x0521 }
            r20 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r14 = new byte[r0]     // Catch:{ IOException -> 0x0521 }
            r9 = 0
            java.io.OutputStream r0 = r10.getOutputStream()     // Catch:{ IOException -> 0x04ce, all -> 0x04cb }
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x04ce, all -> 0x04cb }
            r13.<init>(r0)     // Catch:{ IOException -> 0x04ce, all -> 0x04cb }
            r12 = -1
            if (r5 != r12) goto L_0x0353
            r5 = 0
        L_0x0353:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r12) goto L_0x035b
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x035b:
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r19 = "Content-Length"
            if (r5 != 0) goto L_0x036a
            if (r4 != r0) goto L_0x037e
            java.lang.String r3 = "Accept-Ranges"
            java.lang.String r0 = "bytes"
            goto L_0x03a9
        L_0x036a:
            if (r4 != r0) goto L_0x037e
            long r0 = r2.A00     // Catch:{ IOException -> 0x04c9 }
            r15 = -1
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x037a
            X.1Qb r0 = r2.A02     // Catch:{ IOException -> 0x04c9 }
            long r0 = r0.AJg()     // Catch:{ IOException -> 0x04c9 }
        L_0x037a:
            r15 = 1
            long r0 = r0 - r15
            goto L_0x037f
        L_0x037e:
            long r0 = (long) r4     // Catch:{ IOException -> 0x04c9 }
        L_0x037f:
            r15 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x04c9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x04c9 }
            long r0 = r2.A00     // Catch:{ IOException -> 0x04c9 }
            r17 = -1
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 != 0) goto L_0x0396
            X.1Qb r0 = r2.A02     // Catch:{ IOException -> 0x04c9 }
            long r0 = r0.AJg()     // Catch:{ IOException -> 0x04c9 }
        L_0x0396:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r0}     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r5 = "bytes %d-%d/%d"
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r15)     // Catch:{ IOException -> 0x04c9 }
            int r1 = r4.length     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = X.Pxg.A0v(r5, r9, r4, r1)     // Catch:{ IOException -> 0x04c9 }
        L_0x03a9:
            r11.put(r3, r0)     // Catch:{ IOException -> 0x04c9 }
            X.1Qb r0 = r2.A02     // Catch:{ IOException -> 0x04c9 }
            r16 = r0
            long r0 = r16.AJg()     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x04c9 }
            r0 = r19
            r11.put(r0, r1)     // Catch:{ IOException -> 0x04c9 }
            if (r21 == 0) goto L_0x03fc
            X.2ZL r0 = r2.A01     // Catch:{ IOException -> 0x04c9 }
            java.util.List r1 = r0.A04     // Catch:{ IOException -> 0x04c9 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x04c9 }
            X.1Fn[] r0 = new X.1Fn[r0]     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ IOException -> 0x04c9 }
            X.1Fn[] r5 = (X.1Fn[]) r5     // Catch:{ IOException -> 0x04c9 }
            int r4 = r5.length     // Catch:{ IOException -> 0x04c9 }
            r3 = 0
        L_0x03d1:
            if (r3 >= r4) goto L_0x03fc
            r15 = r5[r3]     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = r15.A00     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A06(r1)     // Catch:{ IOException -> 0x04c9 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = "x-fb-video-livetrace-"
            X.0qQ.A0B(r0, r6)     // Catch:{ IOException -> 0x04c9 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x04c9 }
            if (r0 == 0) goto L_0x03f9
            java.lang.String r0 = r15.A01     // Catch:{ IOException -> 0x04c9 }
            r11.put(r1, r0)     // Catch:{ IOException -> 0x04c9 }
        L_0x03f9:
            int r3 = r3 + 1
            goto L_0x03d1
        L_0x03fc:
            if (r20 == 0) goto L_0x043b
            X.2ZL r0 = r2.A01     // Catch:{ IOException -> 0x04c9 }
            java.util.List r1 = r0.A04     // Catch:{ IOException -> 0x04c9 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x04c9 }
            X.1Fn[] r0 = new X.1Fn[r0]     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ IOException -> 0x04c9 }
            X.1Fn[] r5 = (X.1Fn[]) r5     // Catch:{ IOException -> 0x04c9 }
            int r4 = r5.length     // Catch:{ IOException -> 0x04c9 }
            r3 = 0
        L_0x0410:
            if (r3 >= r4) goto L_0x043b
            r15 = r5[r3]     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = r15.A00     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A06(r1)     // Catch:{ IOException -> 0x04c9 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x04c9 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = "x-fb-response-time-ms"
            X.0qQ.A0B(r0, r6)     // Catch:{ IOException -> 0x04c9 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ IOException -> 0x04c9 }
            if (r0 == 0) goto L_0x0438
            java.lang.String r0 = r15.A01     // Catch:{ IOException -> 0x04c9 }
            r11.put(r1, r0)     // Catch:{ IOException -> 0x04c9 }
        L_0x0438:
            int r3 = r3 + 1
            goto L_0x0410
        L_0x043b:
            X.2ZL r0 = r2.A01     // Catch:{ IOException -> 0x04c9 }
            int r1 = r0.A02     // Catch:{ IOException -> 0x04c9 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L_0x0447
            r0 = 299(0x12b, float:4.19E-43)
            if (r1 <= r0) goto L_0x0451
        L_0x0447:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = "status-code"
            r11.put(r0, r1)     // Catch:{ IOException -> 0x04c9 }
        L_0x0451:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x04c9 }
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r11)     // Catch:{ IOException -> 0x04c9 }
        L_0x0459:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x04c9 }
            if (r0 == 0) goto L_0x0482
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x04c9 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x04c9 }
            r3.append(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = ": "
            r3.append(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x04c9 }
            r3.append(r0)     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r0 = "\r\n"
            r3.append(r0)     // Catch:{ IOException -> 0x04c9 }
            goto L_0x0459
        L_0x0482:
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x04c9 }
            byte[] r1 = r0.getBytes()     // Catch:{ IOException -> 0x04c9 }
            int r0 = r1.length     // Catch:{ IOException -> 0x04c9 }
            r13.writeInt(r0)     // Catch:{ IOException -> 0x04c9 }
            r13.write(r1)     // Catch:{ IOException -> 0x04c9 }
            r13.flush()     // Catch:{ IOException -> 0x04c9 }
            java.io.InputStream r9 = r16.AjD()     // Catch:{ IOException -> 0x04c9 }
        L_0x0498:
            int r0 = r9.read(r14)     // Catch:{ IOException -> 0x04c9 }
            if (r0 == r12) goto L_0x04c5
            r13.write(r14, r8, r0)     // Catch:{ IOException -> 0x04c9 }
            r0 = r29
            int r1 = r0.A00     // Catch:{ IOException -> 0x04c9 }
            if (r1 == r12) goto L_0x0498
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 / r1
            long r0 = (long) r0     // Catch:{ IOException -> 0x04c9 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x04b0 }
            goto L_0x0498
        L_0x04b0:
            r3 = move-exception
            java.lang.String r1 = "%s"
            java.lang.String r0 = r3.getMessage()     // Catch:{ IOException -> 0x04c9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x04c9 }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ IOException -> 0x04c9 }
            r0 = r24
            android.util.Log.e(r0, r1, r3)     // Catch:{ IOException -> 0x04c9 }
            goto L_0x0498
        L_0x04c5:
            r13.flush()     // Catch:{ IOException -> 0x04c9 }
            goto L_0x04d8
        L_0x04c9:
            r0 = move-exception
            goto L_0x04d0
        L_0x04cb:
            r0 = move-exception
            r13 = r9
            goto L_0x04eb
        L_0x04ce:
            r0 = move-exception
            r13 = r9
        L_0x04d0:
            X.1yV.A03(r0)     // Catch:{ all -> 0x04ea }
            X.1QX r0 = r2.A03     // Catch:{ all -> 0x04ea }
            r0.A00()     // Catch:{ all -> 0x04ea }
        L_0x04d8:
            X.1yV.A01(r10, r7)     // Catch:{ IOException -> 0x0521 }
            r2.close()     // Catch:{ IOException -> 0x04de }
        L_0x04de:
            if (r9 == 0) goto L_0x04e3
            r9.close()     // Catch:{ IOException -> 0x04e3 }
        L_0x04e3:
            if (r13 == 0) goto L_0x007f
            r13.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x007f
        L_0x04ea:
            r0 = move-exception
        L_0x04eb:
            X.1yV.A01(r10, r7)     // Catch:{ IOException -> 0x0521 }
            r2.close()     // Catch:{ IOException -> 0x04f1 }
        L_0x04f1:
            if (r9 == 0) goto L_0x04f6
            r9.close()     // Catch:{ IOException -> 0x04f6 }
        L_0x04f6:
            if (r13 == 0) goto L_0x04fb
            r13.close()     // Catch:{ IOException -> 0x04fb }
        L_0x04fb:
            throw r0     // Catch:{ IOException -> 0x0521 }
        L_0x04fc:
            throw r0     // Catch:{ all -> 0x04fd }
        L_0x04fd:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0507 }
            goto L_0x0520
        L_0x0502:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0507 }
            goto L_0x0520
        L_0x0507:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0521 }
            goto L_0x0520
        L_0x050c:
            java.lang.String r0 = "SyncHttpService doesn't support HEAD request.  It will create a deadlock with no response data callback"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException -> 0x0521 }
            goto L_0x0520
        L_0x0513:
            int r1 = r11.A02     // Catch:{ IOException -> 0x0521 }
            java.lang.String r0 = "response doesn't have body, status code : "
            java.lang.String r0 = X.002.A0O(r0, r1)     // Catch:{ IOException -> 0x0521 }
            java.io.IOException r1 = X.JTO.A0u(r0)     // Catch:{ IOException -> 0x0521 }
        L_0x0520:
            throw r1     // Catch:{ IOException -> 0x0521 }
        L_0x0521:
            r0 = move-exception
            X.1yV.A03(r0)
            X.1yV.A01(r10, r7)
            goto L_0x007f
        L_0x052a:
            r0 = r28
            r0.remove(r10)     // Catch:{ all -> 0x0531 }
            monitor-exit(r23)     // Catch:{ all -> 0x0531 }
            return
        L_0x0531:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0531 }
            throw r0
        L_0x0534:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x0534 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7198Pyo.run():void");
    }
}
