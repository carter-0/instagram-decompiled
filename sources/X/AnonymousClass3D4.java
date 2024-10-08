package X;

import android.content.Context;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.3D4  reason: invalid class name */
public abstract class AnonymousClass3D4 {
    public static final int A00(Context context) {
        0qQ.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarHeight, typedValue, true);
        if (typedValue.type == 5) {
            return (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        0wb.A03("ActionBarDimensions", "Could't find action bar height attr.");
        return context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
    }
}
