package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.W0t  reason: case insensitive filesystem */
public abstract class C18771W0t {
    public static final RectF A00 = new RectF();

    public static final void A01(Activity activity, boolean z) {
        0qQ.A0B(activity, 0);
        int systemUiVisibility = C66581MXm.A0A(activity).getSystemUiVisibility();
        int i = systemUiVisibility & -3;
        if (!z) {
            i = systemUiVisibility | 256 | 512 | 2;
        }
        C66581MXm.A0A(activity).setSystemUiVisibility(i);
    }

    public static final void A02(Activity activity, boolean z) {
        0qQ.A0B(activity, 0);
        View A0A = C66581MXm.A0A(activity);
        0qQ.A07(A0A);
        int systemUiVisibility = A0A.getSystemUiVisibility();
        if (z) {
            A0A.setSystemUiVisibility(systemUiVisibility & -5);
            activity.getWindow().clearFlags(1024);
            return;
        }
        A0A.setSystemUiVisibility(systemUiVisibility | 260);
        activity.getWindow().setFlags(1024, 1024);
    }

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        0qQ.A07(baseContext);
        return A00(baseContext);
    }
}
