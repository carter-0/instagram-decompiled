package X;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class WGX implements AnonymousClass1LW {
    public static final long A0B = TimeUnit.HOURS.toMillis(2);
    public static final long A0C = TimeUnit.MINUTES.toMillis(30);
    public long A00;
    public final V5X A01;
    public final X8F A02;
    public final C17812VgP A03;
    public final AnonymousClass0JP A04;
    public final Object A05 = new Object();
    public final Set A06;
    public final CountDownLatch A07;
    public final VJR A08;
    public final VJS A09;
    public final 0JN A0A = 0JN.A01();

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.WGX r17) {
        /*
            r10 = r17
            X.0JP r7 = r10.A04
            long r5 = r7.now()
            X.VgP r9 = r10.A03
            monitor-enter(r9)
            boolean r0 = r9.A02     // Catch:{ all -> 0x0097 }
            monitor-exit(r9)
            if (r0 == 0) goto L_0x001f
            long r3 = r10.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            long r5 = r5 - r3
            long r1 = A0C
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
        L_0x001f:
            long r7 = r7.now()
            long r16 = A0B
            long r16 = r16 + r7
            X.X8F r0 = r10.A02     // Catch:{ IOException -> 0x008f }
            java.util.Collection r0 = r0.B1v()     // Catch:{ IOException -> 0x008f }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x008f }
            r5 = 0
            r3 = 0
        L_0x0034:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x008f }
            r11 = 1
            if (r0 == 0) goto L_0x0072
            java.lang.Object r2 = r15.next()     // Catch:{ IOException -> 0x008f }
            X.Vh0 r2 = (X.C17847Vh0) r2     // Catch:{ IOException -> 0x008f }
            int r3 = r3 + 1
            long r0 = r2.A00     // Catch:{ IOException -> 0x008f }
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            X.Vij r0 = r2.A02     // Catch:{ IOException -> 0x008f }
            java.io.File r0 = r0.A00     // Catch:{ IOException -> 0x008f }
            long r0 = r0.length()     // Catch:{ IOException -> 0x008f }
            r2.A00 = r0     // Catch:{ IOException -> 0x008f }
        L_0x0055:
            long r5 = r5 + r0
            long r11 = r2.A00()     // Catch:{ IOException -> 0x008f }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            long r0 = r2.A00     // Catch:{ IOException -> 0x008f }
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x006e
            X.Vij r0 = r2.A02     // Catch:{ IOException -> 0x008f }
            java.io.File r0 = r0.A00     // Catch:{ IOException -> 0x008f }
            long r0 = r0.length()     // Catch:{ IOException -> 0x008f }
            r2.A00 = r0     // Catch:{ IOException -> 0x008f }
        L_0x006e:
            r2.A00()     // Catch:{ IOException -> 0x008f }
            goto L_0x0034
        L_0x0072:
            monitor-enter(r9)     // Catch:{ IOException -> 0x008f }
            long r1 = r9.A00     // Catch:{ all -> 0x008c }
            monitor-exit(r9)     // Catch:{ IOException -> 0x008f }
            long r3 = (long) r3     // Catch:{ IOException -> 0x008f }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0083
            long r1 = r9.A00()     // Catch:{ IOException -> 0x008f }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0094
        L_0x0083:
            monitor-enter(r9)     // Catch:{ IOException -> 0x008f }
            r9.A00 = r3     // Catch:{ all -> 0x008c }
            r9.A01 = r5     // Catch:{ all -> 0x008c }
            r9.A02 = r11     // Catch:{ all -> 0x008c }
            monitor-exit(r9)     // Catch:{ IOException -> 0x008f }
            goto L_0x0094
        L_0x008c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IOException -> 0x008f }
            throw r0     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            r0 = move-exception
            r0.getMessage()
            return
        L_0x0094:
            r10.A00 = r7
        L_0x0096:
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGX.A00(X.WGX):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.VrX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.VrX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.VrX} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
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
    /* JADX WARNING: Multi-variable type inference failed */
    public final void FI4() {
        /*
            r17 = this;
            r5 = r17
            java.lang.Object r6 = r5.A05
            monitor-enter(r6)
            A00(r5)     // Catch:{ all -> 0x011c }
            X.VgP r7 = r5.A03     // Catch:{ all -> 0x011c }
            long r2 = r7.A00()     // Catch:{ all -> 0x011c }
            r8 = 2097152(0x200000, double:1.0361308E-317)
            r15 = 0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 4701758010974797824(0x4140000000000000, double:2097152.0)
            double r0 = (double) r2     // Catch:{ all -> 0x011c }
            double r10 = r10 / r0
            double r8 = r8 - r10
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            monitor-enter(r7)     // Catch:{ IOException -> 0x0113 }
            r0 = 0
            r7.A02 = r0     // Catch:{ all -> 0x0110 }
            r0 = -1
            r7.A00 = r0     // Catch:{ all -> 0x0110 }
            r7.A01 = r0     // Catch:{ all -> 0x0110 }
            monitor-exit(r7)     // Catch:{ IOException -> 0x0113 }
            A00(r5)     // Catch:{ IOException -> 0x0113 }
            long r0 = r7.A00()     // Catch:{ IOException -> 0x0113 }
            double r2 = (double) r0     // Catch:{ IOException -> 0x0113 }
            double r8 = r8 * r2
            long r2 = (long) r8     // Catch:{ IOException -> 0x0113 }
            long r0 = r0 - r2
            X.X8F r8 = r5.A02     // Catch:{ IOException -> 0x010b }
            java.util.Collection r4 = r8.B1v()     // Catch:{ IOException -> 0x010b }
            X.0JP r2 = r5.A04     // Catch:{ IOException -> 0x010b }
            long r13 = r2.now()     // Catch:{ IOException -> 0x010b }
            long r2 = A0B     // Catch:{ IOException -> 0x010b }
            long r13 = r13 + r2
            int r2 = r4.size()     // Catch:{ IOException -> 0x010b }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x010b }
            r10.<init>(r2)     // Catch:{ IOException -> 0x010b }
            int r2 = r4.size()     // Catch:{ IOException -> 0x010b }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ IOException -> 0x010b }
            r11.<init>(r2)     // Catch:{ IOException -> 0x010b }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ IOException -> 0x010b }
        L_0x0066:
            boolean r2 = r12.hasNext()     // Catch:{ IOException -> 0x010b }
            if (r2 == 0) goto L_0x0082
            java.lang.Object r9 = r12.next()     // Catch:{ IOException -> 0x010b }
            X.Vh0 r9 = (X.C17847Vh0) r9     // Catch:{ IOException -> 0x010b }
            long r3 = r9.A00()     // Catch:{ IOException -> 0x010b }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            r10.add(r9)     // Catch:{ IOException -> 0x010b }
            goto L_0x0066
        L_0x007e:
            r11.add(r9)     // Catch:{ IOException -> 0x010b }
            goto L_0x0066
        L_0x0082:
            X.V5X r4 = r5.A01     // Catch:{ IOException -> 0x010b }
            r3 = 1
            X.WqM r2 = new X.WqM     // Catch:{ IOException -> 0x010b }
            r2.<init>((java.lang.Object) r4, (int) r3)     // Catch:{ IOException -> 0x010b }
            java.util.Collections.sort(r11, r2)     // Catch:{ IOException -> 0x010b }
            r10.addAll(r11)     // Catch:{ IOException -> 0x010b }
            long r13 = r7.A00()     // Catch:{ IOException -> 0x0113 }
            long r13 = r13 - r0
            r9 = 0
            java.util.Iterator r12 = r10.iterator()     // Catch:{ IOException -> 0x0113 }
            r1 = 0
        L_0x009c:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0113 }
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r4 = r12.next()     // Catch:{ IOException -> 0x0113 }
            X.Vh0 r4 = (X.C17847Vh0) r4     // Catch:{ IOException -> 0x0113 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00f4
            long r10 = r8.ECz(r4)     // Catch:{ IOException -> 0x0113 }
            java.util.Set r3 = r5.A06     // Catch:{ IOException -> 0x0113 }
            java.lang.String r0 = r4.A03     // Catch:{ IOException -> 0x0113 }
            r3.remove(r0)     // Catch:{ IOException -> 0x0113 }
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x009c
            int r9 = r9 + 1
            long r1 = r1 + r10
            java.lang.Object r10 = X.C18428VrX.A03     // Catch:{ IOException -> 0x0113 }
            monitor-enter(r10)     // Catch:{ IOException -> 0x0113 }
            X.VrX r4 = X.C18428VrX.A02     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x00d4
            X.VrX r0 = r4.A00     // Catch:{ all -> 0x00f1 }
            X.C18428VrX.A02 = r0     // Catch:{ all -> 0x00f1 }
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00f1 }
            int r0 = X.C18428VrX.A01     // Catch:{ all -> 0x00f1 }
            int r0 = r0 + -1
            X.C18428VrX.A01 = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            goto L_0x00da
        L_0x00d4:
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            X.VrX r4 = new X.VrX     // Catch:{ IOException -> 0x0113 }
            r4.<init>()     // Catch:{ IOException -> 0x0113 }
        L_0x00da:
            monitor-enter(r10)     // Catch:{ IOException -> 0x0113 }
            int r3 = X.C18428VrX.A01     // Catch:{ all -> 0x00ee }
            r0 = 5
            if (r3 >= r0) goto L_0x00ec
            int r0 = r3 + 1
            X.C18428VrX.A01 = r0     // Catch:{ all -> 0x00ee }
            X.VrX r0 = X.C18428VrX.A02     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ea
            r4.A00 = r0     // Catch:{ all -> 0x00ee }
        L_0x00ea:
            X.C18428VrX.A02 = r4     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r10)     // Catch:{ all -> 0x00ee }
            goto L_0x009c
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00ee }
            goto L_0x0112
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            goto L_0x0112
        L_0x00f4:
            long r4 = -r1
            int r0 = -r9
            long r2 = (long) r0     // Catch:{ IOException -> 0x0113 }
            monitor-enter(r7)     // Catch:{ IOException -> 0x0113 }
            boolean r0 = r7.A02     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0106
            long r0 = r7.A01     // Catch:{ all -> 0x0110 }
            long r0 = r0 + r4
            r7.A01 = r0     // Catch:{ all -> 0x0110 }
            long r0 = r7.A00     // Catch:{ all -> 0x0110 }
            long r0 = r0 + r2
            r7.A00 = r0     // Catch:{ all -> 0x0110 }
        L_0x0106:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0113 }
            r8.E5C()     // Catch:{ IOException -> 0x0113 }
            goto L_0x011a
        L_0x010b:
            r0 = move-exception
            r0.getMessage()     // Catch:{ IOException -> 0x0113 }
            goto L_0x0112
        L_0x0110:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0113 }
        L_0x0112:
            throw r0     // Catch:{ IOException -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x0118 }
            goto L_0x011a
        L_0x0118:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r6)     // Catch:{ all -> 0x011c }
            return
        L_0x011c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGX.FI4():void");
    }

    public final void FI5() {
        synchronized (this.A05) {
            try {
                this.A02.AHR();
                this.A06.clear();
            } catch (IOException | NullPointerException e) {
                e.getMessage();
            }
            C17812VgP vgP = this.A03;
            synchronized (vgP) {
                vgP.A02 = false;
                vgP.A00 = -1;
                vgP.A01 = -1;
            }
        }
    }

    public WGX(VJR vjr, VJS vjs, V5X v5x, X8F x8f, C64381Le r7) {
        this.A02 = x8f;
        this.A01 = v5x;
        this.A00 = -1;
        this.A09 = vjs;
        this.A08 = vjr;
        this.A03 = new C17812VgP();
        this.A04 = AnonymousClass0Gt.A00;
        this.A06 = new HashSet();
        if (r7 != null) {
            r7.EBY(this);
        }
        this.A07 = new CountDownLatch(0);
    }
}
