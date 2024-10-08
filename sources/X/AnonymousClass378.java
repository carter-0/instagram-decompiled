package X;

import androidx.fragment.app.Fragment;
import java.util.Set;

/* renamed from: X.378  reason: invalid class name */
public final class AnonymousClass378 {
    public AnonymousClass379 A00;
    public final AnonymousClass37A A01;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        if (r2.A00 > 0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r5.isHidden() != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r9 = this;
            java.lang.String r1 = "FragmentVisibilityDetector.updateSelfVisibility"
            r0 = -352243033(0xffffffffeb0132a7, float:-1.5619063E26)
            X.0fh.A01(r1, r0)
            X.37A r7 = r9.A01     // Catch:{ all -> 0x00bd }
            boolean r6 = r7.A02     // Catch:{ all -> 0x00bd }
            androidx.fragment.app.Fragment r5 = r7.A04     // Catch:{ all -> 0x00bd }
            boolean r0 = r5.isResumed()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x001f
            boolean r0 = r5.mUserVisibleHint     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x001f
            boolean r1 = r5.isHidden()     // Catch:{ all -> 0x00bd }
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r7.A02 = r0     // Catch:{ all -> 0x00bd }
            if (r0 == r6) goto L_0x00b6
            X.AnonymousClass37A.A01(r7)     // Catch:{ all -> 0x00bd }
            boolean r0 = r5 instanceof X.C240373Kq     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x007b
            androidx.fragment.app.Fragment r0 = r5.mParentFragment     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0039
            java.util.List r3 = X.C240403Kt.A00(r0)     // Catch:{ all -> 0x00bd }
        L_0x0033:
            int r8 = r3.size()     // Catch:{ all -> 0x00bd }
            r4 = 0
            goto L_0x0052
        L_0x0039:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x004d
            X.0hq r0 = r0.getSupportFragmentManager()     // Catch:{ all -> 0x00bd }
            X.06j r0 = r0.A0U     // Catch:{ all -> 0x00bd }
            java.util.List r3 = r0.A04()     // Catch:{ all -> 0x00bd }
        L_0x0049:
            X.0qQ.A07(r3)     // Catch:{ all -> 0x00bd }
            goto L_0x0033
        L_0x004d:
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00bd }
            goto L_0x0049
        L_0x0052:
            if (r4 >= r8) goto L_0x007b
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x00bd }
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ all -> 0x00bd }
            if (r1 == r5) goto L_0x0078
            boolean r0 = r1 instanceof X.AnonymousClass4DK     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0078
            X.4DK r1 = (X.AnonymousClass4DK) r1     // Catch:{ all -> 0x00bd }
            X.378 r1 = r1.getFragmentVisibilityDetector()     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x0078
            boolean r0 = r7.A02     // Catch:{ all -> 0x00bd }
            r2 = -1
            if (r0 == 0) goto L_0x006e
            r2 = 1
        L_0x006e:
            X.37A r1 = r1.A01     // Catch:{ all -> 0x00bd }
            int r0 = r1.A00     // Catch:{ all -> 0x00bd }
            int r0 = r0 + r2
            r1.A00 = r0     // Catch:{ all -> 0x00bd }
            X.AnonymousClass37A.A01(r1)     // Catch:{ all -> 0x00bd }
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x0052
        L_0x007b:
            if (r6 == 0) goto L_0x00b6
            boolean r0 = r7.A02     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b6
            androidx.fragment.app.Fragment r1 = r5.mParentFragment     // Catch:{ all -> 0x00bd }
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r1.isResumed()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            java.util.List r0 = X.C240403Kt.A00(r1)     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r1 instanceof X.AnonymousClass4DK     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            X.4DK r1 = (X.AnonymousClass4DK) r1     // Catch:{ all -> 0x00bd }
            X.378 r0 = r1.getFragmentVisibilityDetector()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            X.37A r2 = r0.A01     // Catch:{ all -> 0x00bd }
            boolean r0 = r2.A02     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r2.A01     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b0
            int r1 = r2.A00     // Catch:{ all -> 0x00bd }
            r0 = 1
            if (r1 <= 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r2.A03 = r0     // Catch:{ all -> 0x00bd }
            X.AnonymousClass37A.A00(r2)     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            r0 = -1635909390(0xffffffff9e7e00f2, float:-1.34468435E-20)
            X.0fh.A00(r0)
            return
        L_0x00bd:
            r1 = move-exception
            r0 = 1961872970(0x74efce4a, float:1.5199499E32)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass378.A00():void");
    }

    public final void A01(2cd r3) {
        Set set = this.A00.A00;
        synchronized (set) {
            set.add(r3);
        }
    }

    public AnonymousClass378(Fragment fragment) {
        AnonymousClass379 r1 = new AnonymousClass379();
        this.A00 = r1;
        this.A01 = new AnonymousClass37A(fragment, r1);
    }
}
