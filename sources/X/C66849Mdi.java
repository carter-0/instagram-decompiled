package X;

import android.content.Context;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.Mdi  reason: case insensitive filesystem */
public abstract class C66849Mdi {
    public static final 11S A00 = new 11S("[A-Z]");
    public static final 11S A01 = new 11S("[,]");
    public static final 11S A02 = new 11S("[.]");
    public static final 11S A03 = new 11S("[0-9]");
    public static final 11S A04 = new 11S("[+]");

    public static final int A00(Context context, String str) {
        return Math.max(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) + A01(context, str) + context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
    }

    public static final int A01(Context context, String str) {
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        int A05 = C242173Sx.A05(A03.A04(str));
        int A052 = C242173Sx.A05(A00.A04(str));
        int A053 = C242173Sx.A05(A02.A04(str));
        int A054 = C242173Sx.A05(A01.A04(str));
        int A055 = C242173Sx.A05(A04.A04(str));
        return (int) TypedValue.applyDimension(2, (((float) A05) * 5.887313f) + (((float) A052) * 6.2798004f) + (((float) A053) * 2.7474127f) + (((float) A054) * 2.3549252f) + (((float) A055) * 5.4948254f) + (((float) Math.max(0, ((((length - A05) - A052) - A053) - A054) - A055)) * 5.887313f), context.getResources().getDisplayMetrics());
    }
}
