package X;

import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.O2v  reason: case insensitive filesystem */
public abstract class C70343O2v {
    public static final int A00(ViewGroup viewGroup) {
        int measuredWidth = viewGroup.getMeasuredWidth();
        float dimension = viewGroup.getResources().getDimension(R.dimen.abc_select_dialog_padding_start_material);
        return (int) ((((float) measuredWidth) - ((2.0f * dimension) + (1.0f * dimension))) / 2.0f);
    }
}
