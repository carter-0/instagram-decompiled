package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.35c  reason: invalid class name and case insensitive filesystem */
public final class C2367935c {
    public static final void A00(Context context, View view, View view2, View view3, ImageUrl imageUrl) {
        float dimension = context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float dimension3 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float height = ((((float) view.getHeight()) - ((float) view2.getHeight())) - dimension) - dimension3;
        float width = ((float) view.getWidth()) - (2.0f * dimension2);
        float height2 = ((float) imageUrl.getHeight()) / ((float) imageUrl.getWidth());
        float f = width * height2;
        if (f > height) {
            width = height / height2;
        } else {
            height = f;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) width, (int) height);
        int i = (int) dimension2;
        layoutParams.setMargins(i, (int) dimension3, i, (int) dimension);
        view3.setLayoutParams(layoutParams);
    }
}
