package X;

import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;

/* renamed from: X.5Po  reason: invalid class name and case insensitive filesystem */
public final class C285075Po implements AnonymousClass0hF {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PausableMonotonicFrameClock A01;
    public final /* synthetic */ Recomposer A02;
    public final /* synthetic */ 0rm A03;
    public final /* synthetic */ C262224Cq A04;

    public C285075Po(View view, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, 0rm r4, C262224Cq r5) {
        this.A04 = r5;
        this.A01 = pausableMonotonicFrameClock;
        this.A02 = recomposer;
        this.A03 = r4;
        this.A00 = view;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void Dms(X.07T r12, X.AnonymousClass07Z r13) {
        /*
            r11 = this;
            int r1 = r12.ordinal()
            r6 = 0
            r7 = r11
            if (r1 == r6) goto L_0x0075
            r2 = 1
            if (r1 == r2) goto L_0x0017
            r0 = 4
            if (r1 == r0) goto L_0x0063
            r0 = 5
            if (r1 != r0) goto L_0x0016
            androidx.compose.runtime.Recomposer r0 = r11.A02
            r0.A0E()
        L_0x0016:
            return
        L_0x0017:
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = r11.A01
            if (r0 == 0) goto L_0x0049
            X.5PU r1 = r0.A00
            java.lang.Object r5 = r1.A03
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x0072 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x006f }
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0048
            java.util.List r4 = r1.A00     // Catch:{ all -> 0x0072 }
            java.util.List r0 = r1.A01     // Catch:{ all -> 0x0072 }
            r1.A00 = r0     // Catch:{ all -> 0x0072 }
            r1.A01 = r4     // Catch:{ all -> 0x0072 }
            r1.A02 = r2     // Catch:{ all -> 0x0072 }
            r3 = 0
            int r2 = r4.size()     // Catch:{ all -> 0x0072 }
        L_0x0035:
            if (r3 >= r2) goto L_0x0045
            java.lang.Object r1 = r4.get(r3)     // Catch:{ all -> 0x0072 }
            X.4D7 r1 = (X.AnonymousClass4D7) r1     // Catch:{ all -> 0x0072 }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x0072 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0072 }
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0045:
            r4.clear()     // Catch:{ all -> 0x0072 }
        L_0x0048:
            monitor-exit(r5)
        L_0x0049:
            androidx.compose.runtime.Recomposer r1 = r11.A02
            java.lang.Object r5 = r1.A0D
            monitor-enter(r5)
            boolean r0 = r1.A07     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0059
            r1.A07 = r6     // Catch:{ all -> 0x0072 }
            X.1IX r1 = androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0072 }
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x0016
            X.0gF r0 = X.C60340gF.A00
            r1.resumeWith(r0)
            return
        L_0x0063:
            androidx.compose.runtime.Recomposer r0 = r11.A02
            java.lang.Object r1 = r0.A0D
            monitor-enter(r1)
            r0.A07 = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r1)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x006f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0075:
            X.4Cq r2 = r11.A04
            r9 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.0rm r10 = r11.A03
            androidx.compose.runtime.Recomposer r6 = r11.A02
            android.view.View r5 = r11.A00
            X.9KS r4 = new X.9KS
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r1, r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C285075Po.Dms(X.07T, X.07Z):void");
    }
}
