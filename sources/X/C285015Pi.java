package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Pi  reason: invalid class name and case insensitive filesystem */
public final class C285015Pi implements AnonymousClass5PR {
    public Throwable A00;
    public List A01;
    public List A02;
    public final C268494dV A03;
    public final Object A04;
    public final C62320sa A05;

    public final Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final java.lang.Object FNV(X.AnonymousClass4D7 r10, X.0sP r11) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r0 = X.1Ey.A02(r10)
            r2 = 1
            X.1IW r8 = new X.1IW
            r8.<init>(r2, r0)
            r8.A0I()
            X.64u r3 = new X.64u
            r3.<init>(r8, r11)
            java.lang.Object r7 = r9.A04
            monitor-enter(r7)
            java.lang.Throwable r1 = r9.A00     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0024
            X.0eQ r0 = new X.0eQ     // Catch:{ all -> 0x0085 }
            r0.<init>(r1)     // Catch:{ all -> 0x0085 }
            r8.resumeWith(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x007f
        L_0x0024:
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0085 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0085 }
            r1 = 0
            if (r0 != 0) goto L_0x002e
            r1 = 1
        L_0x002e:
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0085 }
            r0.add(r3)     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x003a
            X.4dV r0 = r9.A03     // Catch:{ all -> 0x0085 }
            r0.set(r2)     // Catch:{ all -> 0x0085 }
        L_0x003a:
            r2 = r1 ^ 1
            monitor-exit(r7)
            r1 = 5
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r3)
            r8.CO0(r0)
            if (r2 == 0) goto L_0x0080
            X.0sa r0 = r9.A05
            if (r0 == 0) goto L_0x0080
            r0.invoke()     // Catch:{ all -> 0x0050 }
            goto L_0x0080
        L_0x0050:
            r6 = move-exception
            monitor-enter(r7)
            java.lang.Throwable r0 = r9.A00     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x007f
            r9.A00 = r6     // Catch:{ all -> 0x0085 }
            java.util.List r5 = r9.A01     // Catch:{ all -> 0x0085 }
            int r4 = r5.size()     // Catch:{ all -> 0x0085 }
            r3 = 0
            r2 = 0
        L_0x0060:
            if (r2 >= r4) goto L_0x0075
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x0085 }
            X.64u r0 = (X.C3026664u) r0     // Catch:{ all -> 0x0085 }
            X.4D7 r1 = r0.A00     // Catch:{ all -> 0x0085 }
            X.0eQ r0 = new X.0eQ     // Catch:{ all -> 0x0085 }
            r0.<init>(r6)     // Catch:{ all -> 0x0085 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0085 }
            int r2 = r2 + 1
            goto L_0x0060
        L_0x0075:
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0085 }
            r0.clear()     // Catch:{ all -> 0x0085 }
            X.4dV r0 = r9.A03     // Catch:{ all -> 0x0085 }
            r0.set(r3)     // Catch:{ all -> 0x0085 }
        L_0x007f:
            monitor-exit(r7)
        L_0x0080:
            java.lang.Object r0 = r8.A0E()
            return r0
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285015Pi.FNV(X.4D7, X.0sP):java.lang.Object");
    }

    public final /* synthetic */ C634312c getKey() {
        return AnonymousClass5PR.A00;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicInteger, X.4dV] */
    public C285015Pi(C62320sa r3) {
        this.A05 = r3;
        this.A04 = new Object();
        this.A01 = new ArrayList();
        this.A02 = new ArrayList();
        this.A03 = new AtomicInteger(0);
    }

    public final C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public final C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public final C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }

    public C285015Pi() {
        this((C62320sa) null);
    }
}
