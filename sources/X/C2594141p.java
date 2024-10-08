package X;

import android.app.Activity;

/* renamed from: X.41p  reason: invalid class name and case insensitive filesystem */
public abstract class C2594141p {
    public static void A00(Activity activity, int i) {
        if (activity != null) {
            try {
                activity.setRequestedOrientation(i);
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    0KC.A0N("FixedOrientationCompat", "%s hit fixed orientation exception", e, new Object[]{0Jf.A00(activity.getClass())});
                    return;
                }
                throw e;
            }
        }
    }
}
