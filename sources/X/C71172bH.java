package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: X.2bH  reason: invalid class name and case insensitive filesystem */
public abstract class C71172bH {
    public static WeakReference A00;

    public static AnonymousClass2ZQ A00() {
        AnonymousClass2ZQ r2;
        WeakReference weakReference = A00;
        if (weakReference != null) {
            r2 = (AnonymousClass2ZQ) weakReference.get();
        } else {
            r2 = null;
        }
        if (r2 instanceof Activity) {
            Activity activity = (Activity) r2;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return null;
            }
        }
        return r2;
    }
}
