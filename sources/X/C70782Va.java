package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.2Va  reason: invalid class name and case insensitive filesystem */
public final class C70782Va {
    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
