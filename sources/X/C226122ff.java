package X;

import android.app.Activity;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.2ff  reason: invalid class name and case insensitive filesystem */
public final class C226122ff {
    public static final void A02(Activity activity, C227182im r2) {
        0qQ.A0B(r2, 1);
        C226112fe r0 = (C226112fe) C226112fe.A0C.get(activity);
        if (r0 != null) {
            r0.A01.remove(r2);
        }
    }

    public final void A04(Activity activity, C227182im r5, boolean z) {
        List list;
        int i;
        0qQ.A0B(activity, 0);
        0qQ.A0B(r5, 2);
        int i2 = C226112fe.A06;
        if (!(i2 == -1 || (i = C226112fe.A05) == -1)) {
            r5.DmH(i2, i);
            if (z) {
                return;
            }
        }
        if (true == C226112fe.A09 || C226112fe.A06 == -1 || C226112fe.A05 == -1) {
            WeakHashMap weakHashMap = C226112fe.A0C;
            C226112fe r2 = (C226112fe) weakHashMap.get(activity);
            if (r2 == null) {
                r2 = new C226112fe(activity);
                weakHashMap.put(activity, r2);
                if (!C226112fe.A08) {
                    C226112fe.A08 = true;
                    activity.getApplication().registerActivityLifecycleCallbacks(C226112fe.A0A);
                }
            }
            if (z) {
                list = r2.A02;
            } else {
                list = r2.A01;
            }
            list.add(r5);
        }
    }

    public final void A05(Activity activity, Runnable runnable) {
        Object r1;
        List list;
        0qQ.A0B(activity, 0);
        if (C226112fe.A06 == -1 || C226112fe.A05 == -1) {
            boolean z = true;
            if (true != C226112fe.A09) {
                z = false;
            }
            WeakHashMap weakHashMap = C226112fe.A0C;
            C226112fe r2 = (C226112fe) weakHashMap.get(activity);
            if (r2 == null) {
                r2 = new C226112fe(activity);
                weakHashMap.put(activity, r2);
                if (!C226112fe.A08) {
                    C226112fe.A08 = true;
                    activity.getApplication().registerActivityLifecycleCallbacks(C226112fe.A0A);
                }
            }
            if (z) {
                r1 = new C19779WfM(runnable);
                list = r2.A02;
            } else {
                r1 = new AnonymousClass37S(runnable);
                list = r2.A01;
            }
            list.add(r1);
            return;
        }
        runnable.run();
    }

    public static final int A00() {
        int i = C226112fe.A05;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        Object[] objArr = new Object[0];
        if (z) {
            return i;
        }
        throw new IllegalArgumentException(String.format("The stable navigation bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr));
    }

    public static final int A01() {
        int i = C226112fe.A06;
        boolean z = false;
        if (i != -1) {
            z = true;
        }
        Object[] objArr = new Object[0];
        if (z) {
            return i;
        }
        throw new IllegalArgumentException(String.format("The stable status bar height has not been initialized, use startListeningForStableStatusAndNavigationBarHeight() to receive a callback once this value is available", objArr));
    }

    public static final boolean A03() {
        if (C226112fe.A06 == -1 || C226112fe.A05 == -1) {
            return false;
        }
        return true;
    }
}
