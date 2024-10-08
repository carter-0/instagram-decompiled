package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Kug  reason: case insensitive filesystem */
public abstract class C63297Kug {
    public static C323716xz A00(Context context, boolean z) {
        int[] iArr;
        int i;
        if (z) {
            iArr = new int[]{R.color.grey_5, R.color.grey_5};
            i = R.color.fds_transparent;
        } else {
            iArr = new int[]{R.color.design_dark_default_color_on_background, R.color.grey_1, R.color.grey_2};
            i = R.color.grey_4;
        }
        return C323716xz.A00(context, iArr, 1.5f, i, R.color.fds_transparent, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
    }
}
