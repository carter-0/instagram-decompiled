package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class SSQ {
    public static Executor A04 = Executors.newCachedThreadPool(new TOU());
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final Set A01 = new LinkedHashSet(1);
    public final Set A02 = new LinkedHashSet(1);
    public volatile SIM A03 = null;

    public final synchronized void A02(C13516Tbl tbl) {
        Throwable th;
        SIM sim = this.A03;
        if (!(sim == null || (th = sim.A01) == null)) {
            tbl.onResult(th);
        }
        this.A01.add(tbl);
    }

    public final synchronized void A03(C13516Tbl tbl) {
        Object obj;
        SIM sim = this.A03;
        if (!(sim == null || (obj = sim.A00) == null)) {
            tbl.onResult(obj);
        }
        this.A02.add(tbl);
    }

    public static void A00(SIM sim, SSQ ssq) {
        if (ssq.A03 == null) {
            ssq.A03 = sim;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                A01(ssq);
            } else {
                ssq.A00.post(new C12858TAy(ssq));
            }
        } else {
            throw AnonymousClass7TE.A0z("A task may only be set once.");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void A01(X.SSQ r3) {
        /*
            X.SIM r0 = r3.A03
            if (r0 == 0) goto L_0x004d
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x001f
            monitor-enter(r3)
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = X.Pxg.A16(r0)     // Catch:{ all -> 0x004a }
        L_0x000f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x004a }
            X.Tbl r0 = (X.C13516Tbl) r0     // Catch:{ all -> 0x004a }
            r0.onResult(r2)     // Catch:{ all -> 0x004a }
            goto L_0x000f
        L_0x001f:
            java.lang.Throwable r2 = r0.A01
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x004a }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ all -> 0x004a }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            X.S85.A01(r0, r2)     // Catch:{ all -> 0x004a }
            goto L_0x0048
        L_0x0034:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0038:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x004a }
            X.Tbl r0 = (X.C13516Tbl) r0     // Catch:{ all -> 0x004a }
            r0.onResult(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0038
        L_0x0048:
            monitor-exit(r3)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSQ.A01(X.SSQ):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.concurrent.FutureTask, X.TSi, java.lang.Runnable] */
    public SSQ(Callable callable, boolean z) {
        if (z) {
            try {
                A00((SIM) callable.call(), this);
            } catch (Throwable th) {
                A00(new SIM(th), this);
            }
        } else {
            Executor executor = A04;
            ? futureTask = new FutureTask(callable);
            futureTask.A00 = this;
            executor.execute(futureTask);
        }
    }

    public SSQ(Object obj) {
        A00(new SIM(obj), this);
    }
}
