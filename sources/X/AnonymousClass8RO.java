package X;

import android.app.Activity;
import com.instagram.android.R;

/* renamed from: X.8RO  reason: invalid class name */
public abstract class AnonymousClass8RO {
    public static final float A00(Activity activity, float f) {
        if (f == 1.0f) {
            return 0.0f;
        }
        int A01 = 2db.A01(activity);
        int i = activity.getResources().getDisplayMetrics().heightPixels;
        return ((((float) (A01 + i)) * (1.0f - f)) + ((float) activity.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height))) / ((float) i);
    }

    public static final float A01(Activity activity, float f) {
        float f2 = AnonymousClass8RM.A0B.A00;
        float f3 = AnonymousClass8RM.A09.A00;
        float dimensionPixelSize = (float) activity.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        if (f >= f2 && f < f3) {
            return ((f3 - f) / (f3 - f2)) * dimensionPixelSize;
        }
        if (f < f2) {
            return (float) AnonymousClass37Q.A04((double) f, 0.0d, (double) f2, 0.0d, (double) dimensionPixelSize);
        }
        return (float) activity.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
    }
}
