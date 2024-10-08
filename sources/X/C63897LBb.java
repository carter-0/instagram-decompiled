package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.LBb  reason: case insensitive filesystem */
public final class C63897LBb {
    public final int A00(Context context, Integer num) {
        Resources resources = context.getResources();
        Integer num2 = AnonymousClass05K.A01;
        int i = R.dimen.account_discovery_bottom_gap;
        if (num == num2) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        return (int) ((((double) 0nA.A09(context)) - (((double) resources.getDimensionPixelOffset(i)) * Math.ceil(4.3d))) / 4.3d);
    }
}
