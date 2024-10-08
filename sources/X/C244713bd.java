package X;

import android.content.Context;

/* renamed from: X.3bd  reason: invalid class name and case insensitive filesystem */
public final class C244713bd {
    public final int A00(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return 0;
        }
        return 1;
    }
}
