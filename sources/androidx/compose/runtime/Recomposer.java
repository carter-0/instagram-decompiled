package androidx.compose.runtime;

import X.02z;
import X.05G;
import X.0sn;
import X.0vq;
import X.106;
import X.1IX;
import X.AnonymousClass0eM;
import X.AnonymousClass19G;
import X.AnonymousClass4e5;
import X.AnonymousClass5PD;
import X.AnonymousClass5PL;
import X.AnonymousClass9L6;
import X.AnonymousClass9L8;
import X.C262094Cc;
import X.C262204Co;
import X.C284905Ot;
import X.C284965Pc;
import X.C285015Pi;
import X.C285025Pj;
import X.C285045Pl;
import X.C285055Pm;
import X.C288425bt;
import X.Cs9;
import X.V23;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class Recomposer extends AnonymousClass5PL {
    public static final AtomicReference A0M = new AtomicReference(false);
    public static final 05G A0N = 106.A01(C284965Pc.A03);
    public long A00;
    public 0vq A01 = new 0vq(6);
    public Throwable A02;
    public List A03;
    public Set A04;
    public 1IX A05;
    public C262204Co A06;
    public boolean A07;
    public Cs9 A08;
    public List A09;
    public final C285015Pi A0A;
    public final C285055Pm A0B;
    public final C285045Pl A0C = new C285045Pl(new C285025Pj[16]);
    public final Object A0D = new Object();
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public final Map A0H = new LinkedHashMap();
    public final Map A0I = new LinkedHashMap();
    public final C262094Cc A0J;
    public final 05G A0K = new 02z(AnonymousClass4e5.Inactive);
    public final AnonymousClass19G A0L;

    public static final List A00(Recomposer recomposer) {
        0sn r0 = recomposer.A03;
        if (r0 == null) {
            List list = recomposer.A0E;
            if (list.isEmpty()) {
                r0 = 0sn.A00;
            } else {
                r0 = new ArrayList(list);
            }
            recomposer.A03 = r0;
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1IX A01(androidx.compose.runtime.Recomposer r4) {
        /*
            X.05G r2 = r4.A0K
            java.lang.Object r1 = r2.getValue()
            X.4e5 r1 = (X.AnonymousClass4e5) r1
            X.4e5 r0 = X.AnonymousClass4e5.ShuttingDown
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L_0x003f
            java.util.List r0 = r4.A0E
            r0.clear()
            X.0sn r0 = X.0sn.A00
            r4.A03 = r0
            r2 = 6
            X.0vq r0 = new X.0vq
            r0.<init>(r2)
            r4.A01 = r0
            X.5Pl r0 = r4.A0C
            r0.A01()
            java.util.List r0 = r4.A0G
            r0.clear()
            java.util.List r0 = r4.A0F
            r0.clear()
            r4.A09 = r1
            X.1IX r0 = r4.A05
            if (r0 == 0) goto L_0x003a
            r0.AG9(r1)
        L_0x003a:
            r4.A05 = r1
            r4.A08 = r1
        L_0x003e:
            return r1
        L_0x003f:
            X.Cs9 r0 = r4.A08
            if (r0 != 0) goto L_0x0094
            X.4Co r0 = r4.A06
            if (r0 != 0) goto L_0x0068
            r3 = 6
            X.0vq r0 = new X.0vq
            r0.<init>(r3)
            r4.A01 = r0
            X.5Pl r0 = r4.A0C
            r0.A01()
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0094
            X.4e5 r3 = X.AnonymousClass4e5.InactivePendingWork
        L_0x005c:
            r2.Epw(r3)
            X.4e5 r0 = X.AnonymousClass4e5.PendingWork
            if (r3 != r0) goto L_0x003e
            X.1IX r0 = r4.A05
            r4.A05 = r1
            return r0
        L_0x0068:
            X.5Pl r0 = r4.A0C
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0091
            X.0vq r0 = r4.A01
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0091
            java.util.List r0 = r4.A0G
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0091
            java.util.List r0 = r4.A0F
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0091
            boolean r0 = A05(r4)
            if (r0 != 0) goto L_0x0091
            X.4e5 r3 = X.AnonymousClass4e5.Idle
            goto L_0x005c
        L_0x0091:
            X.4e5 r3 = X.AnonymousClass4e5.PendingWork
            goto L_0x005c
        L_0x0094:
            X.4e5 r3 = X.AnonymousClass4e5.Inactive
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A01(androidx.compose.runtime.Recomposer):X.1IX");
    }

    public static final void A02(C285025Pj r2, Recomposer recomposer) {
        List list = recomposer.A09;
        if (list == null) {
            list = new ArrayList();
            recomposer.A09 = list;
        }
        if (!list.contains(r2)) {
            list.add(r2);
        }
        recomposer.A0E.remove(r2);
        recomposer.A03 = null;
    }

    public static final void A03(C285025Pj r3, Recomposer recomposer, Exception exc) {
        if (!((Boolean) A0M.get()).booleanValue() || (exc instanceof V23)) {
            synchronized (recomposer.A0D) {
                Cs9 cs9 = recomposer.A08;
                if (cs9 == null) {
                    recomposer.A08 = new Cs9(exc);
                } else {
                    throw cs9.A00;
                }
            }
            throw exc;
        }
        synchronized (recomposer.A0D) {
            AnonymousClass0eM r0 = C284905Ot.A01;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            recomposer.A0G.clear();
            recomposer.A0C.A01();
            recomposer.A01 = new 0vq(6);
            recomposer.A0F.clear();
            recomposer.A0I.clear();
            recomposer.A0H.clear();
            recomposer.A08 = new Cs9(exc);
            if (r3 != null) {
                A02(r3, recomposer);
            }
            A01(recomposer);
        }
    }

    public static final boolean A05(Recomposer recomposer) {
        if (recomposer.A07 || recomposer.A0A.A03.get() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (A05(r3) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(androidx.compose.runtime.Recomposer r3) {
        /*
            java.lang.Object r2 = r3.A0D
            monitor-enter(r2)
            X.0vq r0 = r3.A01     // Catch:{ all -> 0x0019 }
            int r0 = r0.A01     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            X.5Pl r0 = r3.A0C     // Catch:{ all -> 0x0019 }
            int r0 = r0.A00     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0016
            boolean r1 = A05(r3)     // Catch:{ all -> 0x0019 }
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            monitor-exit(r2)
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A06(androidx.compose.runtime.Recomposer):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.5Pw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.5Pw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.util.Set[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.5Pw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.5Pw} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final boolean A07(androidx.compose.runtime.Recomposer r12) {
        /*
            java.lang.Object r2 = r12.A0D
            monitor-enter(r2)
            X.0vq r1 = r12.A01     // Catch:{ all -> 0x00df }
            int r0 = r1.A01     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x0017
            X.5Pl r0 = r12.A0C     // Catch:{ all -> 0x00df }
            int r0 = r0.A00     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = A05(r12)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x0017:
            X.5Pw r3 = new X.5Pw     // Catch:{ all -> 0x00df }
            r3.<init>(r1)     // Catch:{ all -> 0x00df }
            r6 = 6
            X.0vq r0 = new X.0vq     // Catch:{ all -> 0x00df }
            r0.<init>(r6)     // Catch:{ all -> 0x00df }
            r12.A01 = r0     // Catch:{ all -> 0x00df }
            monitor-exit(r2)
            monitor-enter(r2)
            java.util.List r7 = A00(r12)     // Catch:{ all -> 0x00df }
            monitor-exit(r2)
            int r5 = r7.size()     // Catch:{ all -> 0x00d6 }
            r4 = 0
        L_0x0030:
            if (r4 >= r5) goto L_0x0092
            java.lang.Object r10 = r7.get(r4)     // Catch:{ all -> 0x00d6 }
            X.5Pj r10 = (X.C285025Pj) r10     // Catch:{ all -> 0x00d6 }
            X.5Wn r10 = (X.AnonymousClass5Wn) r10     // Catch:{ all -> 0x00d6 }
        L_0x003a:
            java.util.concurrent.atomic.AtomicReference r9 = r10.A0F     // Catch:{ all -> 0x00d6 }
            java.lang.Object r11 = r9.get()     // Catch:{ all -> 0x00d6 }
            if (r11 == 0) goto L_0x0071
            java.lang.Object r0 = X.AnonymousClass5XM.A00     // Catch:{ all -> 0x00d6 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r11 instanceof java.util.Set     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x005c
            r0 = r11
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x00d6 }
            java.util.Set[] r0 = new java.util.Set[]{r0, r3}     // Catch:{ all -> 0x00d6 }
        L_0x0055:
            boolean r0 = X.1FH.A00(r11, r0, r9)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0073
        L_0x005c:
            boolean r0 = r11 instanceof java.lang.Object[]     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00bf
            r8 = r11
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch:{ all -> 0x00d6 }
            r0 = 0
            X.0qQ.A0B(r8, r0)     // Catch:{ all -> 0x00d6 }
            int r1 = r8.length     // Catch:{ all -> 0x00d6 }
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r8, r0)     // Catch:{ all -> 0x00d6 }
            r0[r1] = r3     // Catch:{ all -> 0x00d6 }
            goto L_0x0055
        L_0x0071:
            r0 = r3
            goto L_0x0055
        L_0x0073:
            if (r11 != 0) goto L_0x007c
            java.lang.Object r0 = r10.A0D     // Catch:{ all -> 0x00d6 }
            monitor-enter(r0)     // Catch:{ all -> 0x00d6 }
            X.AnonymousClass5Wn.A02(r10)     // Catch:{ all -> 0x008f }
            monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
        L_0x007c:
            X.05G r0 = r12.A0K     // Catch:{ all -> 0x00d6 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00d6 }
            X.4e5 r1 = (X.AnonymousClass4e5) r1     // Catch:{ all -> 0x00d6 }
            X.4e5 r0 = X.AnonymousClass4e5.ShuttingDown     // Catch:{ all -> 0x00d6 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 <= 0) goto L_0x0092
            int r4 = r4 + 1
            goto L_0x0030
        L_0x008f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00d5
        L_0x0092:
            monitor-enter(r2)     // Catch:{ all -> 0x00d6 }
            X.0vq r0 = new X.0vq     // Catch:{ all -> 0x00bc }
            r0.<init>(r6)     // Catch:{ all -> 0x00bc }
            r12.A01 = r0     // Catch:{ all -> 0x00bc }
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            monitor-enter(r2)
            X.1IX r0 = A01(r12)     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00b4
            X.5Pl r0 = r12.A0C     // Catch:{ all -> 0x00df }
            int r0 = r0.A00     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = A05(r12)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r0 = 0
            goto L_0x00b2
        L_0x00b1:
            r0 = 1
        L_0x00b2:
            monitor-exit(r2)
            return r0
        L_0x00b4:
            java.lang.String r1 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
            r0.<init>(r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00bc:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            goto L_0x00d5
        L_0x00bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r1.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "corrupt pendingModifications: "
            r1.append(r0)     // Catch:{ all -> 0x00d6 }
            r1.append(r9)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d6 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d6 }
        L_0x00d5:
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            monitor-enter(r2)
            X.0vq r0 = r12.A01     // Catch:{ all -> 0x00df }
            r0.A08(r3)     // Catch:{ all -> 0x00df }
            monitor-exit(r2)
            throw r1
        L_0x00df:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A07(androidx.compose.runtime.Recomposer):boolean");
    }

    public final void A0E() {
        synchronized (this.A0D) {
            05G r2 = this.A0K;
            if (((AnonymousClass4e5) r2.getValue()).compareTo(AnonymousClass4e5.Idle) >= 0) {
                r2.Epw(AnonymousClass4e5.ShuttingDown);
            }
        }
        this.A0L.AG7((CancellationException) null);
    }

    public Recomposer(C262094Cc r5) {
        C285015Pi r3 = new C285015Pi(new AnonymousClass9L8(this, 18));
        this.A0A = r3;
        AnonymousClass19G r2 = new AnonymousClass19G((C262204Co) r5.get(C262204Co.A00));
        r2.CO3(new AnonymousClass9L6(this, 34));
        this.A0L = r2;
        this.A0J = r5.plus(r3).plus(r2);
        this.A0B = new C285055Pm(this);
    }

    public static final void A04(AnonymousClass5PD r2) {
        try {
            if (r2.A0K() instanceof C288425bt) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            r2.A0H();
        }
    }
}
