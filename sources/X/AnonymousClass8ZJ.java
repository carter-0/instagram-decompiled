package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.8ZJ  reason: invalid class name */
public final class AnonymousClass8ZJ {
    public final AnonymousClass8ZG A02(Context context) {
        AnonymousClass8ZG r2 = new AnonymousClass8ZG(context);
        r2.A04 = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        r2.A0B = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
        r2.A0A = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        r2.A03 = Integer.valueOf(context.getColor(R.color.black_60_transparent));
        r2.A06 = 0;
        r2.A0C = Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_progress_bar_on_media)));
        r2.A08 = Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media)));
        r2.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_12);
        r2.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
        r2.A07 = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
        r2.A0D = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top));
        r2.A01(context.getColor(2Yu.A0H(context, R.attr.igds_color_separator_or_stroke_on_media)));
        return r2;
    }

    public final AnonymousClass8ZG A01(Context context) {
        AnonymousClass8ZG r2 = new AnonymousClass8ZG(context);
        r2.A0B = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
        r2.A0A = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        r2.A01(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon)));
        r2.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_12);
        r2.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
        return r2;
    }

    public static final void A00(Rect rect, Drawable drawable, int i) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = ((float) i) / ((float) Math.max(intrinsicHeight, intrinsicWidth));
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i2 = (int) ((((float) intrinsicWidth) * max) / 2.0f);
        int i3 = (int) ((((float) intrinsicHeight) * max) / 2.0f);
        drawable.setBounds(centerX - i2, centerY - i3, centerX + i2, centerY + i3);
    }
}
