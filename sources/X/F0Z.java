package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

public final class F0Z {
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final TextView A03;
    public final IgProgressImageView A04;
    public final MediaFrameLayout A05;
    public final List A06;

    /* JADX WARNING: type inference failed for: r1v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    public F0Z(Context context, View view, int i) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources;
        int i2;
        int i3;
        View view2 = view;
        this.A00 = view2;
        this.A05 = (MediaFrameLayout) view2.requireViewById(R.id.content_media_layout);
        this.A04 = (IgProgressImageView) view2.requireViewById(R.id.content_media);
        FrameLayout frameLayout = (FrameLayout) view2.requireViewById(R.id.facepiles_layout);
        this.A01 = frameLayout;
        int i4 = i;
        ArrayList A0v = DbS.A0v(i4);
        if (i == 0) {
            i3 = 8;
        } else {
            frameLayout.removeAllViews();
            Context context2 = context;
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            Resources resources2 = context2.getResources();
            if (i4 == 1) {
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
                dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size);
                resources = context2.getResources();
                i2 = R.dimen.abc_button_inset_vertical_material;
            } else {
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
                resources = context2.getResources();
                i2 = R.dimen.accent_edge_thickness;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
            int i5 = dimensionPixelSize2 + (dimensionPixelOffset3 * 2) + (dimensionPixelOffset2 * 2);
            View view3 = null;
            i3 = 0;
            for (int i6 = 0; i6 < Math.min(i4, 3); i6++) {
                View A08 = DbU.A08(LayoutInflater.from(context2), R.layout.family_bridges_basic_netego_facepile_item);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                A08.setPadding(dimensionPixelOffset3, dimensionPixelOffset3, dimensionPixelOffset3, dimensionPixelOffset3);
                layoutParams.setMargins((i5 - dimensionPixelOffset) * i6, 0, 0, 0);
                A08.setLayoutParams(layoutParams);
                ? A0X = DbU.A0X(A08, R.id.family_bridges_facepile_image);
                A0X.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
                A0X.A0H(dimensionPixelOffset2, context2.getColor(R.color.black_20_transparent));
                A0v.add(A0X);
                frameLayout.addView(A08);
                if (i6 == 1) {
                    view3 = A08;
                }
            }
            if (view3 != null && i4 >= 3) {
                view3.bringToFront();
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, dimensionPixelSize, 0, 0);
            layoutParams2.gravity = 1;
            frameLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setVisibility(i3);
        this.A06 = A0v;
        this.A02 = DbU.A0F(view2, R.id.content_message_background);
        this.A03 = DbU.A0G(view2, R.id.content_message);
    }
}
