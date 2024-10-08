package X;

import android.content.res.Resources;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public abstract class GIB {
    public static final void A00(IgImageView igImageView, boolean z) {
        Resources resources = igImageView.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material), resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material));
        layoutParams.gravity = 17;
        int i = R.dimen.abc_dialog_padding_material;
        if (z) {
            i = R.dimen.barcelona_countdown_sticker_digit_background_height;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        igImageView.setLayoutParams(layoutParams);
        igImageView.setBackground(resources.getDrawable(R.drawable.black_50_transparent_oval));
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igImageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
        igImageView.setColorFilter(resources.getColor(R.color.canvas_bottom_sheet_description_text_color));
        igImageView.setVisibility(8);
    }
}
