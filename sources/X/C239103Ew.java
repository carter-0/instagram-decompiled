package X;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.3Ew  reason: invalid class name and case insensitive filesystem */
public final class C239103Ew extends AnonymousClass3Ey {
    public final 1JT A00;
    public final 1JG A01;

    public final synchronized void A02() {
        synchronized (this) {
            if (!this.A00) {
                A00();
                close();
                this.A00 = true;
                this.A01.A06(this.A00);
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00c9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0065=Splitter:B:24:0x0065, B:59:0x00c9=Splitter:B:59:0x00c9} */
    public final synchronized boolean A03() {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.A00()     // Catch:{ all -> 0x00e2 }
            r10.close()     // Catch:{ all -> 0x00e2 }
            r7 = 1
            r10.A00 = r7     // Catch:{ all -> 0x00e2 }
            boolean r0 = r10.A01     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x001c
            X.1JG r1 = r10.A01     // Catch:{ all -> 0x00e2 }
            X.1JT r0 = r10.A00     // Catch:{ all -> 0x00e2 }
            r1.A06(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x00e2 }
            r1.ED4(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00dc
        L_0x001c:
            X.1JG r6 = r10.A01     // Catch:{ all -> 0x00e2 }
            X.1JT r5 = r10.A00     // Catch:{ all -> 0x00e2 }
            java.io.File r4 = r5.A03()     // Catch:{ all -> 0x00e2 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00e2 }
            r3 = 0
            if (r0 != 0) goto L_0x0037
            r0 = 0
            r5.A06(r0)     // Catch:{ all -> 0x00e2 }
            r5.A07(r0, r3)     // Catch:{ all -> 0x00e2 }
        L_0x0032:
            X.1JG.A02(r5, r6)     // Catch:{ all -> 0x00e2 }
            goto L_0x00dd
        L_0x0037:
            monitor-enter(r5)     // Catch:{ all -> 0x00e2 }
            X.57a r8 = r5.A00     // Catch:{ all -> 0x00df }
            monitor-exit(r5)     // Catch:{ all -> 0x00e2 }
            if (r8 == 0) goto L_0x006d
            java.io.File r0 = r5.A04()     // Catch:{ all -> 0x00e2 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c8 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00c8 }
            java.nio.charset.Charset r1 = X.C2813457a.A01     // Catch:{ all -> 0x00c8 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00c8 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00c8 }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00c8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c8 }
            org.json.JSONObject r0 = r8.A00     // Catch:{ IOException -> 0x0062, all -> 0x00c3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0062, all -> 0x00c3 }
            r1.write(r0)     // Catch:{ IOException -> 0x0062, all -> 0x00c3 }
            r1.flush()     // Catch:{ IOException -> 0x0062, all -> 0x00c3 }
            r1.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x007d
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            monitor-enter(r5)     // Catch:{ all -> 0x00e2 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x00df }
            monitor-exit(r5)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x007d
            r3 = 1
            goto L_0x007d
        L_0x006d:
            java.io.File r1 = r5.A04()     // Catch:{ all -> 0x00e2 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r1.delete()     // Catch:{ all -> 0x00e2 }
            r3 = r0 ^ 1
        L_0x007d:
            java.io.File r2 = r5.A02()     // Catch:{ all -> 0x00e2 }
            boolean r0 = r4.renameTo(r2)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00ca
            if (r3 != 0) goto L_0x00cc
            java.io.File r1 = r5.A04()     // Catch:{ all -> 0x00e2 }
            long r8 = r5.A00()     // Catch:{ all -> 0x00e2 }
            long r3 = r2.length()     // Catch:{ all -> 0x00e2 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00a2
            long r0 = r1.length()     // Catch:{ all -> 0x00e2 }
        L_0x009f:
            long r3 = r3 + r0
            monitor-enter(r5)     // Catch:{ all -> 0x00e2 }
            goto L_0x00a5
        L_0x00a2:
            r0 = 0
            goto L_0x009f
        L_0x00a5:
            boolean r0 = r5.A01     // Catch:{ all -> 0x00df }
            monitor-exit(r5)     // Catch:{ all -> 0x00e2 }
            r5.A05(r3, r0)     // Catch:{ all -> 0x00e2 }
            java.util.concurrent.atomic.AtomicLong r2 = r6.A0A     // Catch:{ all -> 0x00e2 }
            long r0 = r3 - r8
            r2.getAndAdd(r0)     // Catch:{ all -> 0x00e2 }
            X.1MS r2 = r6.A02     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r1 = r5.A06     // Catch:{ all -> 0x00e2 }
            boolean r0 = r2.A02(r5, r1)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0032
            r2.A01(r1, r3)     // Catch:{ all -> 0x00e2 }
            goto L_0x0032
        L_0x00c3:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00c9
        L_0x00c8:
            r0 = move-exception
        L_0x00c9:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00ca:
            if (r3 == 0) goto L_0x00d3
        L_0x00cc:
            java.lang.String r1 = "IgDiskCache"
            java.lang.String r0 = "Failed to commit because of metadata error"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x00e2 }
        L_0x00d3:
            r6.A06(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x00e2 }
            r6.ED4(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00dd
        L_0x00dc:
            r7 = 0
        L_0x00dd:
            monitor-exit(r10)
            return r7
        L_0x00df:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239103Ew.A03():boolean");
    }

    private final void A00() {
        if (!(!this.A00)) {
            throw new IllegalStateException("Try to operate on an EditorOutputStream that is already closed");
        } else if (this.A00.A01() != this) {
            throw new IllegalStateException("Two editors trying to write to the same cached file");
        }
    }

    public final FileChannel A01() {
        OutputStream outputStream = this.A02;
        0qQ.A0C(outputStream, "null cannot be cast to non-null type java.io.FileOutputStream");
        FileChannel channel = ((FileOutputStream) outputStream).getChannel();
        0qQ.A07(channel);
        return channel;
    }

    public C239103Ew(1JT r3, 1JG r4) {
        super(new FileOutputStream(r3.A03()));
        this.A00 = r3;
        this.A01 = r4;
    }
}
