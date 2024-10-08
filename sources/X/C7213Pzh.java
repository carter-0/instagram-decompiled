package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;

/* renamed from: X.Pzh  reason: case insensitive filesystem */
public abstract class C7213Pzh {
    public static final void A00(C307786Rm r3, C276544tV r4, List list) {
        String obj;
        View A05;
        0qQ.A0B(list, 2);
        if (!list.isEmpty()) {
            for (Object next : list) {
                if (next == null) {
                    obj = null;
                } else if (next instanceof String) {
                    obj = (String) next;
                } else {
                    obj = next.toString();
                }
                C276544tV A00 = C7299Q2y.A00(r4, new C7296Q2v(obj));
                if (A00 != null && (A05 = A00.A05(r3)) != null) {
                    A05.setAccessibilityTraversalAfter(-1);
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(C307786Rm r2, C276544tV r3, List list) {
        0qQ.A0B(list, 2);
        if (!list.isEmpty()) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).post(new Q3N(r2, r3, list));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
