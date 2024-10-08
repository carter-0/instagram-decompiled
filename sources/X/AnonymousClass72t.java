package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.72t  reason: invalid class name */
public abstract class AnonymousClass72t {
    public static final int A00(Activity activity) {
        0qQ.A0B(activity, 0);
        View findViewById = activity.findViewById(R.id.ls_nav_bar);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return 0;
        }
        return findViewById.getWidth();
    }
}
