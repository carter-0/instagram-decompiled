package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public abstract class FCA {
    public static final C244303ay A00(Context context, Bitmap bitmap, String str, int i, int i2, int i3) {
        C244303ay r0 = new C244303ay((ImageUrl) null, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, false);
        r0.A01(bitmap);
        return r0;
    }

    public static final C244303ay A01(Context context, ImageUrl imageUrl, String str, int i, int i2, int i3) {
        return new C244303ay(imageUrl, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, true);
    }

    public static final C244323b0 A02(Context context, String str, List list, int i, int i2, int i3) {
        int i4 = i;
        List list2 = list;
        0qQ.A0B(list, 1);
        Context context2 = context;
        Resources resources = context.getResources();
        int i5 = i2;
        int dimensionPixelSize = resources.getDimensionPixelSize(i5);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list.size();
        if (i4 > size) {
            i4 = size;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            A1C.add(A01(context2, (ImageUrl) 00k.A0O(list2, i6), str, resources.getDimensionPixelSize(i5), resources.getDimensionPixelSize(i3), context2.getColor(R.color.barcelona_story_share_light_mode)));
        }
        return new C244323b0(context2, AnonymousClass05K.A00, A1C, 0.42f, dimensionPixelSize, true);
    }
}
