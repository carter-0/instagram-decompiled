package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.7c9  reason: invalid class name and case insensitive filesystem */
public abstract class C334957c9 {
    public static Context A00(Context context, Class cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return context;
    }
}
