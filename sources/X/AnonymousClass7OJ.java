package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7OJ  reason: invalid class name */
public abstract class AnonymousClass7OJ {
    public static final AnonymousClass7OK A00(Context context, DirectThreadThemeInfo directThreadThemeInfo, boolean z, boolean z2) {
        0qQ.A0B(context, 0);
        int color = context.getColor(R.color.gradient_light);
        Drawable drawable = context.getDrawable(R.drawable.direct_large_avatar_button_background);
        int color2 = context.getColor(R.color.design_dark_default_color_on_background);
        Drawable drawable2 = context.getDrawable(R.drawable.red_circle_bg);
        Drawable drawable3 = context.getDrawable(R.drawable.filled_circle_grey_1);
        Resources resources = context.getResources();
        int i = R.dimen.direct_in_thread_composer_side_margin;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i);
        return new AnonymousClass7OK(drawable, drawable2, drawable3, context.getDrawable(R.drawable.instagram_delete_pano_outline_24), context.getDrawable(R.drawable.vertical_send_arrow), AnonymousClass0eN.A01(new AnonymousClass9MA(3, directThreadThemeInfo, context, z2)), color, color2, dimensionPixelOffset, context.getResources().getDimensionPixelOffset(R.dimen.direct_voice_messaging_lock_button_offset));
    }
}
