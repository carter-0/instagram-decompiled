package com.instagram.debug.devoptions.debughead.data.provider;

import X.02m;
import X.14s;
import X.14w;
import X.AnonymousClass7TE;
import com.instagram.debug.devoptions.debughead.data.delegates.MobileBoostDelegate;
import java.util.Map;

public class MobileBoostOptimizationHelper implements 14w {
    public MobileBoostDelegate mDelegate;
    public final 02m mLogger = 02m.A0p;
    public Map mOptBoosters = AnonymousClass7TE.A1E();

    public void onPostReleaseBoost(14s r1, int i, boolean z) {
    }

    public void onPreRequestBoost(14s r1, int i) {
    }

    public void onRequestRejected(14s r1, int i) {
    }

    public void onPostRequestBoost(14s r3, boolean z, int i) {
        if (z) {
            this.mDelegate.onBoostRequested(r3.Ah6());
        }
    }

    public void onPreReleaseBoost(14s r3, int i, boolean z) {
        this.mDelegate.onBoostReleased(r3.Ah6());
    }

    public void startTestBoosts() {
        this.mLogger.markerStart(27328514);
    }

    public void stopTestBoosts() {
        this.mLogger.markerEnd(27328514, 2);
    }

    public MobileBoostOptimizationHelper(MobileBoostDelegate mobileBoostDelegate) {
        this.mDelegate = mobileBoostDelegate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r2 == X.14q.A00) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMobileBoostInit(X.1Hm r9) {
        /*
            r8 = this;
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            int[] r5 = r9.A04
            r3 = 0
        L_0x0007:
            int r0 = r5.length
            if (r3 >= r0) goto L_0x0084
            r0 = r5[r3]
            X.1Hv r6 = r9.A07(r0)
            java.util.List r2 = r6.A07
            java.util.Iterator r1 = r2.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.9Bz r0 = (X.C375039Bz) r0
            X.14s r0 = X.AnonymousClass1Hv.A00(r6, r0)
            r0.EBj(r8)
            goto L_0x0016
        L_0x002a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            java.util.Iterator r7 = r0.iterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r6 = r7.next()
            X.9Bz r6 = (X.C375039Bz) r6
            X.14s r2 = r6.A00
            if (r2 == 0) goto L_0x004c
            X.14q r0 = X.14q.A00
            r1 = 1
            if (r2 != r0) goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            int r0 = r6.A04
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.put(r2, r0)
            java.util.Map r0 = r8.mOptBoosters
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x006b
            java.util.Map r1 = r8.mOptBoosters
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r1.put(r2, r0)
        L_0x006b:
            java.util.Map r0 = r8.mOptBoosters
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r8.mOptBoosters
            java.lang.Object r1 = r0.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            X.14s r0 = r6.A00
            r1.add(r0)
            goto L_0x0037
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0084:
            com.instagram.debug.devoptions.debughead.data.delegates.MobileBoostDelegate r0 = r8.mDelegate
            r0.onMobileBoostInit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.debughead.data.provider.MobileBoostOptimizationHelper.onMobileBoostInit(X.1Hm):void");
    }
}
