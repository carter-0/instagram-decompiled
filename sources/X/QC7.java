package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.instagram.android.R;

public abstract class QC7 extends 0SM {
    public static final Object A00 = "CANCEL_BUTTON_TAG";
    public static final Object A01 = "CONFIRM_BUTTON_TAG";
    public static final Object A02 = "TOGGLE_BUTTON_TAG";

    public static boolean A01(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C298035sl.A00(context, QCH.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
