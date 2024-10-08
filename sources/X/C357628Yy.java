package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.8Yy  reason: invalid class name and case insensitive filesystem */
public abstract class C357628Yy {
    public static final void A00(Activity activity) {
        0qQ.A0B(activity, 0);
        boolean A07 = C61290mR.A07();
        Window window = activity.getWindow();
        if (window != null) {
            2db.A07(activity.getWindow().getDecorView(), window, A07);
            if (A07) {
                2db.A06(activity, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(Activity activity, int i) {
        boolean A07 = C61290mR.A07();
        Window window = activity.getWindow();
        if (window != null) {
            2db.A07(activity.getWindow().getDecorView(), window, A07);
            if (A07) {
                2db.A02(activity, i);
                2db.A06(activity, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
