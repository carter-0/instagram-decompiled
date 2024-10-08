package X;

import android.content.Context;

public final class T06 implements C635813i {
    public final Context A00;
    public final C9137RQm A01;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r19 = this;
            r18 = r19
            r0 = r18
            X.RQm r8 = r0.A01
            java.lang.String r1 = "getOtaBundleActivateIfNeeded"
            r0 = -475303096(0xffffffffe3ab7348, float:-6.3254E21)
            X.0fh.A01(r1, r0)
            java.lang.Class<X.RQm> r17 = X.C9137RQm.class
            monitor-enter(r17)     // Catch:{ all -> 0x02e0 }
            X.SEu r7 = r8.A00     // Catch:{ all -> 0x02dd }
            X.1Uk r0 = r7.A02     // Catch:{ all -> 0x02dd }
            java.lang.String r6 = "activated"
            r5 = 0
            r0.getInt(r6, r5)     // Catch:{ all -> 0x02dd }
            java.lang.Integer r1 = r8.A03     // Catch:{ all -> 0x02dd }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02dd }
            if (r1 != r0) goto L_0x02c4
            java.lang.String r1 = "activateNewBundle"
            r0 = -205771873(0xfffffffff3bc2b9f, float:-2.981679E31)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x02dd }
            r16 = 0
            X.SEu r2 = r8.A00     // Catch:{ all -> 0x02b8 }
            X.1Uk r0 = r2.A02     // Catch:{ all -> 0x02b8 }
            java.lang.String r4 = "next"
            int r1 = r0.getInt(r4, r5)     // Catch:{ all -> 0x02b8 }
            r0 = -1
            if (r1 != r0) goto L_0x004e
            X.1Uk r0 = r2.A02     // Catch:{ all -> 0x02b8 }
            X.1W3 r1 = r0.AR0()     // Catch:{ all -> 0x02b8 }
            r1.A06(r6)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "activated_js_file_size"
            r1.A06(r0)     // Catch:{ all -> 0x02b8 }
        L_0x0047:
            r1.A03()     // Catch:{ all -> 0x02b8 }
        L_0x004a:
            X.C9137RQm.A06 = r16     // Catch:{ all -> 0x02b8 }
            goto L_0x01d3
        L_0x004e:
            if (r1 == 0) goto L_0x004a
            X.Rw2 r0 = r8.A01     // Catch:{ all -> 0x02b8 }
            X.S15 r9 = new X.S15     // Catch:{ all -> 0x02b8 }
            r9.<init>(r0, r1)     // Catch:{ all -> 0x02b8 }
            java.util.Set r0 = r8.A04     // Catch:{ all -> 0x02b8 }
            boolean r0 = r9.A00(r0)     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x00ac
            X.SEu r1 = r8.A00     // Catch:{ all -> 0x02b8 }
            X.1Uk r0 = r1.A02     // Catch:{ all -> 0x02b8 }
            int r12 = r0.getInt(r4, r5)     // Catch:{ all -> 0x02b8 }
            X.1Uk r0 = r1.A02     // Catch:{ all -> 0x02b8 }
            java.lang.String r13 = "next_js_file_size"
            r2 = -1
            long r14 = r0.getLong(r13, r2)     // Catch:{ all -> 0x02b8 }
            r10 = -1
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = "main.jsbundle"
            java.io.File r0 = r9.A01     // Catch:{ all -> 0x02b8 }
            java.io.File r1 = X.JTO.A0s(r0, r1)     // Catch:{ all -> 0x02b8 }
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x0095
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x0095
            long r10 = r1.length()     // Catch:{ all -> 0x02b8 }
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00f0
        L_0x0095:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02b8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x02b8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x02b8 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1, r0}     // Catch:{ all -> 0x02b8 }
            java.lang.String r1 = "AutoUpdaterImpl"
            java.lang.String r0 = "Next build %d JS bundle file failed file check: expected file of size %d but was %d"
            X.0KC.A0P(r1, r0, r2)     // Catch:{ all -> 0x02b8 }
        L_0x00ac:
            X.Rw2 r2 = r8.A01     // Catch:{ all -> 0x02b8 }
            X.SEu r3 = r8.A00     // Catch:{ all -> 0x02b8 }
            X.0qQ.A0B(r3, r5)     // Catch:{ all -> 0x02b8 }
            java.io.File r1 = r2.A01     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "updates"
            java.io.File r1 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x02b8 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x00df
            int r2 = r2.A00     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02b8 }
            java.io.File r1 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x02b8 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x00df
            X.1Uk r0 = r3.A02     // Catch:{ all -> 0x02b8 }
            int r0 = r0.getInt(r6, r5)     // Catch:{ all -> 0x02b8 }
            int[] r0 = new int[]{r2, r0}     // Catch:{ all -> 0x02b8 }
            X.SKL.A01(r1, r0)     // Catch:{ all -> 0x02b8 }
        L_0x00df:
            X.1Uk r0 = r3.A02     // Catch:{ all -> 0x02b8 }
            X.1W3 r1 = r0.AR0()     // Catch:{ all -> 0x02b8 }
            r1.A06(r4)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "next_js_file_size"
            r1.A06(r0)     // Catch:{ all -> 0x02b8 }
            goto L_0x0047
        L_0x00f0:
            int r10 = r9.A00     // Catch:{ all -> 0x02b8 }
            X.SEu r14 = r8.A00     // Catch:{ IOException -> 0x004a }
            android.content.Context r0 = r14.A00     // Catch:{ IOException -> 0x004a }
            X.11e r11 = X.11e.A00(r0)     // Catch:{ IOException -> 0x004a }
            java.lang.String r15 = java.lang.Integer.toString(r10)     // Catch:{ IOException -> 0x004a }
            monitor-enter(r11)     // Catch:{ IOException -> 0x004a }
            if (r15 == 0) goto L_0x0133
            java.lang.String r0 = "0"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x01d0 }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x013c
            r11.A00 = r15     // Catch:{ all -> 0x01d0 }
            java.io.File r0 = r11.A02     // Catch:{ all -> 0x01d0 }
            java.io.FileWriter r12 = new java.io.FileWriter     // Catch:{ all -> 0x01d0 }
            r12.<init>(r0)     // Catch:{ all -> 0x01d0 }
            int r1 = r11.A01     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = "-"
            java.lang.String r0 = X.002.A04(r1, r0, r15)     // Catch:{ all -> 0x0129 }
            r12.write(r0)     // Catch:{ all -> 0x0129 }
            r12.close()     // Catch:{ all -> 0x01d0 }
            goto L_0x013c
        L_0x0129:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x01d0 }
        L_0x0132:
            throw r1     // Catch:{ all -> 0x01d0 }
        L_0x0133:
            java.io.File r0 = r11.A02     // Catch:{ all -> 0x01d0 }
            X.JTR.A1O(r0)     // Catch:{ all -> 0x01d0 }
            java.lang.String r0 = "0"
            r11.A00 = r0     // Catch:{ all -> 0x01d0 }
        L_0x013c:
            monitor-exit(r11)     // Catch:{ IOException -> 0x004a }
            X.1Uk r14 = r14.A02     // Catch:{ all -> 0x02b8 }
            X.1W3 r0 = r14.AR0()     // Catch:{ all -> 0x02b8 }
            r0.A07(r6, r10)     // Catch:{ all -> 0x02b8 }
            r0.A03()     // Catch:{ all -> 0x02b8 }
            java.lang.String r12 = "activated_js_file_size"
            java.lang.String r1 = "main.jsbundle"
            java.io.File r0 = r9.A01     // Catch:{ all -> 0x02b8 }
            java.io.File r1 = X.JTO.A0s(r0, r1)     // Catch:{ all -> 0x02b8 }
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x01c4
            long r0 = r1.length()     // Catch:{ all -> 0x02b8 }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x01c4
            X.1W3 r2 = r14.AR0()     // Catch:{ all -> 0x02b8 }
            r2.A08(r12, r0)     // Catch:{ all -> 0x02b8 }
        L_0x016f:
            r2.A03()     // Catch:{ all -> 0x02b8 }
            X.1W3 r0 = r14.AR0()     // Catch:{ all -> 0x02b8 }
            r0.A06(r4)     // Catch:{ all -> 0x02b8 }
            r0.A06(r13)     // Catch:{ all -> 0x02b8 }
            r0.A03()     // Catch:{ all -> 0x02b8 }
            X.SEu r0 = r8.A00     // Catch:{ all -> 0x02b8 }
            X.1Uk r3 = r0.A02     // Catch:{ all -> 0x02b8 }
            java.lang.String r2 = "download_end_time"
            r0 = 0
            long r11 = r3.getLong(r2, r0)     // Catch:{ all -> 0x02b8 }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01c2
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b8 }
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c2
            long r0 = r0 - r11
            int r2 = (int) r0     // Catch:{ all -> 0x02b8 }
            int r0 = r2 / 1000
        L_0x019b:
            X.T5y r11 = r8.A02     // Catch:{ all -> 0x02b8 }
            long r0 = (long) r0     // Catch:{ all -> 0x02b8 }
            java.lang.String r2 = "react_ota_bundle_activated"
            X.0xI r3 = X.0xI.A00(r11, r2)     // Catch:{ all -> 0x02b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02b8 }
            java.lang.String r2 = "update_bundle_version"
            r3.A08(r10, r2)     // Catch:{ all -> 0x02b8 }
            long r0 = X.AnonymousClass7TE.A0P(r0)     // Catch:{ all -> 0x02b8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "duration"
            r3.A0B(r0, r1)     // Catch:{ all -> 0x02b8 }
            X.0iu r0 = r11.A00     // Catch:{ all -> 0x02b8 }
            r0.EFq(r3)     // Catch:{ all -> 0x02b8 }
            goto L_0x01cc
        L_0x01c2:
            r0 = 0
            goto L_0x019b
        L_0x01c4:
            X.1W3 r2 = r14.AR0()     // Catch:{ all -> 0x02b8 }
            r2.A06(r12)     // Catch:{ all -> 0x02b8 }
            goto L_0x016f
        L_0x01cc:
            r16 = r9
            goto L_0x004a
        L_0x01d0:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IOException -> 0x004a }
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x01d3:
            r0 = 327611797(0x1386f595, float:3.406852E-27)
            X.0fh.A00(r0)     // Catch:{ all -> 0x02dd }
            X.S15 r0 = X.C9137RQm.A06     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x01ec
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x02dd }
            r8.A03 = r0     // Catch:{ all -> 0x02dd }
            X.1Uk r0 = r7.A02     // Catch:{ all -> 0x02dd }
            r0.getInt(r6, r5)     // Catch:{ all -> 0x02dd }
            monitor-exit(r17)     // Catch:{ all -> 0x02dd }
            r0 = 2003690065(0x776de251, float:4.8248617E33)
            goto L_0x02d1
        L_0x01ec:
            java.lang.String r1 = "getExistingBundle"
            r0 = 407158461(0x1844bebd, float:2.5428704E-24)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x02dd }
            X.SEu r3 = r8.A00     // Catch:{ all -> 0x02b3 }
            X.1Uk r0 = r3.A02     // Catch:{ all -> 0x02b3 }
            int r0 = r0.getInt(r6, r5)     // Catch:{ all -> 0x02b3 }
            r16 = 0
            if (r0 == 0) goto L_0x0298
            X.Rw2 r2 = r8.A01     // Catch:{ all -> 0x02b3 }
            X.S15 r9 = new X.S15     // Catch:{ all -> 0x02b3 }
            r9.<init>(r2, r0)     // Catch:{ all -> 0x02b3 }
            java.util.Set r0 = r8.A04     // Catch:{ all -> 0x02b3 }
            boolean r0 = r9.A00(r0)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x025b
            X.SEu r1 = r8.A00     // Catch:{ all -> 0x02b3 }
            X.1Uk r0 = r1.A02     // Catch:{ all -> 0x02b3 }
            int r15 = r0.getInt(r6, r5)     // Catch:{ all -> 0x02b3 }
            X.1Uk r11 = r1.A02     // Catch:{ all -> 0x02b3 }
            java.lang.String r10 = "activated_js_file_size"
            r0 = -1
            long r13 = r11.getLong(r10, r0)     // Catch:{ all -> 0x02b3 }
            r11 = -1
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x029b
            java.lang.String r1 = "main.jsbundle"
            java.io.File r0 = r9.A01     // Catch:{ all -> 0x02b3 }
            java.io.File r1 = X.JTO.A0s(r0, r1)     // Catch:{ all -> 0x02b3 }
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0244
            boolean r0 = r1.isFile()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0244
            long r11 = r1.length()     // Catch:{ all -> 0x02b3 }
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x029b
        L_0x0244:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x02b3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02b3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02b3 }
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r1, r0}     // Catch:{ all -> 0x02b3 }
            java.lang.String r1 = "AutoUpdaterImpl"
            java.lang.String r0 = "Activated build %d JS bundle file failed file check: expected file of size %d but was %d"
            X.0KC.A0P(r1, r0, r9)     // Catch:{ all -> 0x02b3 }
        L_0x025b:
            java.io.File r1 = r2.A01     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "updates"
            java.io.File r1 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x02b3 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0287
            int r2 = r2.A00     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x02b3 }
            java.io.File r1 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x02b3 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0287
            X.1Uk r0 = r3.A02     // Catch:{ all -> 0x02b3 }
            int r0 = r0.getInt(r4, r5)     // Catch:{ all -> 0x02b3 }
            int[] r0 = new int[]{r2, r0}     // Catch:{ all -> 0x02b3 }
            X.SKL.A01(r1, r0)     // Catch:{ all -> 0x02b3 }
        L_0x0287:
            X.1Uk r0 = r3.A02     // Catch:{ all -> 0x02b3 }
            X.1W3 r1 = r0.AR0()     // Catch:{ all -> 0x02b3 }
            r1.A06(r6)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "activated_js_file_size"
            r1.A06(r0)     // Catch:{ all -> 0x02b3 }
            r1.A03()     // Catch:{ all -> 0x02b3 }
        L_0x0298:
            X.C9137RQm.A06 = r16     // Catch:{ all -> 0x02b3 }
            goto L_0x029e
        L_0x029b:
            r16 = r9
            goto L_0x0298
        L_0x029e:
            r0 = 1042918515(0x3e29ac73, float:0.1656969)
            X.0fh.A00(r0)     // Catch:{ all -> 0x02dd }
            X.S15 r0 = X.C9137RQm.A06     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02c0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x02dd }
            r8.A03 = r0     // Catch:{ all -> 0x02dd }
            X.1Uk r0 = r7.A02     // Catch:{ all -> 0x02dd }
            r0.getInt(r6, r5)     // Catch:{ all -> 0x02dd }
            monitor-exit(r17)     // Catch:{ all -> 0x02dd }
            goto L_0x02ce
        L_0x02b3:
            r1 = move-exception
            r0 = -853287478(0xffffffffcd23ddca, float:-1.71826336E8)
            goto L_0x02bc
        L_0x02b8:
            r1 = move-exception
            r0 = -431886904(0xffffffffe641edc8, float:-2.2895076E23)
        L_0x02bc:
            X.0fh.A00(r0)     // Catch:{ all -> 0x02dd }
            throw r1     // Catch:{ all -> 0x02dd }
        L_0x02c0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x02dd }
            r8.A03 = r0     // Catch:{ all -> 0x02dd }
        L_0x02c4:
            X.1Uk r0 = r7.A02     // Catch:{ all -> 0x02dd }
            r0.getInt(r6, r5)     // Catch:{ all -> 0x02dd }
            monitor-exit(r17)     // Catch:{ all -> 0x02dd }
            r0 = 1108532937(0x4212dec9, float:36.717564)
            goto L_0x02d1
        L_0x02ce:
            r0 = 2098784090(0x7d18e75a, float:1.2702744E37)
        L_0x02d1:
            X.0fh.A00(r0)
            r0 = r18
            android.content.Context r0 = r0.A00
            X.SEu r0 = X.C11194SEu.A00(r0)
            return r0
        L_0x02dd:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x02dd }
            throw r0     // Catch:{ all -> 0x02e0 }
        L_0x02e0:
            r1 = move-exception
            r0 = 1376182868(0x5206e254, float:1.44830693E11)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T06.get():java.lang.Object");
    }

    public T06(Context context, C9137RQm rQm) {
        this.A00 = context;
        this.A01 = rQm;
    }
}
