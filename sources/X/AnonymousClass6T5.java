package X;

import android.content.Context;

/* renamed from: X.6T5  reason: invalid class name */
public abstract class AnonymousClass6T5 {
    public static final boolean A00(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
