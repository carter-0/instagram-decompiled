package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.VHr  reason: case insensitive filesystem */
public abstract class C17095VHr {
    public static final int A00(Context context) {
        int A05 = JTR.A05(context);
        int A09 = (int) ((((float) (0nA.A09(context) - AnonymousClass7TG.A02(context))) - (((float) A05) * 2.75f)) / 2.75f);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.birthday_selfie_preview_margin_top);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        if (dimensionPixelSize > A09) {
            dimensionPixelSize = A09;
        }
        if (dimensionPixelSize2 < dimensionPixelSize) {
            return dimensionPixelSize;
        }
        return dimensionPixelSize2;
    }
}
