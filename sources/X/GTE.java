package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.instagram.android.R;

public final class GTE {
    public final void A00(Context context, 1Xl r8, GTD gtd, int i) {
        int color;
        0qQ.A0B(r8, 3);
        Integer A03 = 1sx.A03(r8, i);
        if (A03 != null) {
            color = A03.intValue();
        } else {
            color = context.getColor(R.color.default_cta_dominant_color);
        }
        int color2 = context.getColor(2Yu.A0A(context));
        gtd.A02.setBackgroundColor(color);
        gtd.A05.setTextColor(color2);
        gtd.A07.setTextColor(color2);
        gtd.A04.setColorFilter(color2);
        TextView textView = gtd.A06;
        textView.setTextColor(color2);
        gtd.A09.setBackgroundColor(color);
        int A02 = DbS.A02(context, 12);
        int A022 = DbS.A02(context, 7);
        textView.setPadding(A02, A022, A02, A022);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width), color2);
        gradientDrawable.setColor(ColorStateList.valueOf(color));
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
        textView.setBackground(gradientDrawable);
    }
}
