package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C227912kJ {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r3.equals(r1) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.fragment.app.Fragment A00(androidx.fragment.app.Fragment r8, X.0lg r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r6 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329732492509480(0x8111b300004128, double:3.038407344129288E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00ba
            r0 = 36892682446111677(0x8311b3000303bd, double:3.3944191616048325E-306)
            java.lang.String r3 = X.182.A04(r2, r9, r0)
            java.lang.Class r7 = r8.getClass()
            java.lang.String r5 = r7.getSimpleName()
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto L_0x003d
            boolean r0 = r8 instanceof X.AnonymousClass0iw     // Catch:{ Exception -> 0x00ba }
            r1 = 0
            if (r0 == 0) goto L_0x0037
            r0 = r8
            X.0iw r0 = (X.AnonymousClass0iw) r0     // Catch:{ Exception -> 0x00ba }
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r0.getModuleName()     // Catch:{ Exception -> 0x00ba }
        L_0x0037:
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00ba
        L_0x003d:
            r0 = 36611207469340887(0x8211b3000218d7, double:3.2164132528862274E-306)
            long r0 = X.182.A01(r2, r9, r0)
            int r4 = (int) r0
            X.2SQ r3 = X.2SP.A00
            r1 = 100
            X.2HY r0 = new X.2HY
            r0.<init>(r6, r1)
            int r0 = X.C346807vm.A00(r3, r0)
            if (r0 > r4) goto L_0x00ba
            X.2jk r4 = new X.2jk
            r4.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "ClipsViewerFragment"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00b4
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00b4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0079:
            int r5 = (int) r0
            java.lang.String r0 = "background_color"
            r3.putInt(r0, r5)
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "wrapped_fragment_class"
            r3.putString(r0, r1)
            android.os.Bundle r1 = r8.mArguments
            java.lang.String r0 = "wrapped_fragment_args"
            r3.putBundle(r0, r1)
            boolean r0 = r8.isStateSaved()
            if (r0 == 0) goto L_0x00a2
            X.0hq r0 = r8.getParentFragmentManager()
            androidx.fragment.app.Fragment$SavedState r1 = r0.A0O(r8)
            java.lang.String r0 = "wrapped_fragment_state"
            r3.putParcelable(r0, r1)
        L_0x00a2:
            r0 = 36611207469275350(0x8211b3000118d6, double:3.2164132528447815E-306)
            long r1 = X.182.A01(r2, r9, r0)
            java.lang.String r0 = "delay_ms"
            r3.putLong(r0, r1)
            r4.setArguments(r3)
            return r4
        L_0x00b4:
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            goto L_0x0079
        L_0x00ba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227912kJ.A00(androidx.fragment.app.Fragment, X.0lg):androidx.fragment.app.Fragment");
    }

    public static final void A01(0lg r9, Long l, C62320sa r11, 0sP r12, boolean z) {
        Long l2;
        long j;
        0qQ.A0B(r9, 0);
        if (z) {
            0Tu r8 = 0Tu.A05;
            if (C346807vm.A00(2SP.A00, new 2HY(1, 100)) <= ((int) 182.A01(r8, r9, 36611207469340887L))) {
                long currentTimeMillis = System.currentTimeMillis();
                if (l != null) {
                    j = currentTimeMillis - l.longValue();
                } else {
                    j = 0;
                }
                long A01 = 182.A01(r8, r9, 36611207469275350L) - Math.max(j, 0);
                if (A01 > 0) {
                    if (r11 != null) {
                        r11.invoke();
                    }
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        new Handler(myLooper).postDelayed(new C41093AoF(r12, currentTimeMillis), A01);
                        return;
                    }
                    throw new IllegalStateException("Trying to delay an action from a thread without a looper");
                }
                l2 = Long.valueOf(currentTimeMillis);
                r12.invoke(l2);
            }
        }
        l2 = null;
        r12.invoke(l2);
    }
}
