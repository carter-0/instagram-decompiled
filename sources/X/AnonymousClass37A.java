package X;

import androidx.fragment.app.Fragment;
import java.util.Set;

/* renamed from: X.37A  reason: invalid class name */
public final class AnonymousClass37A {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Fragment A04;
    public final AnonymousClass379 A05;

    public static final void A00(AnonymousClass37A r5) {
        AnonymousClass379 r0 = r5.A05;
        Fragment fragment = r5.A04;
        boolean z = r5.A03;
        Set<2cd> set = r0.A00;
        synchronized (set) {
            for (2cd DGk : set) {
                DGk.DGk(fragment, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r6.A00 > 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass37A r6) {
        /*
            boolean r2 = r6.A03
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x000f
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x000f
            int r1 = r6.A00
            r0 = 1
            if (r1 <= 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r6.A03 = r0
            if (r0 == r2) goto L_0x0046
            androidx.fragment.app.Fragment r0 = r6.A04
            java.util.List r5 = X.C240403Kt.A00(r0)
            int r4 = r5.size()
            r3 = 0
        L_0x001f:
            if (r3 >= r4) goto L_0x0043
            java.lang.Object r1 = r5.get(r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.AnonymousClass4DK
            if (r0 == 0) goto L_0x0040
            X.4DK r1 = (X.AnonymousClass4DK) r1
            X.378 r0 = r1.getFragmentVisibilityDetector()
            if (r0 == 0) goto L_0x0040
            boolean r2 = r6.A03
            X.37A r1 = r0.A01
            boolean r0 = r1.A01
            if (r0 == r2) goto L_0x0040
            r1.A01 = r2
            A01(r1)
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0043:
            A00(r6)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37A.A01(X.37A):void");
    }

    public AnonymousClass37A(Fragment fragment, AnonymousClass379 r5) {
        AnonymousClass378 fragmentVisibilityDetector;
        this.A04 = fragment;
        AnonymousClass4DK r2 = fragment.mParentFragment;
        boolean z = true;
        if ((r2 instanceof AnonymousClass4DK) && ((fragmentVisibilityDetector = r2.getFragmentVisibilityDetector()) == null || !fragmentVisibilityDetector.A01.A03)) {
            z = false;
        }
        this.A01 = z;
        this.A05 = r5;
    }
}
