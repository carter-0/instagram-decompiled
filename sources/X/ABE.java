package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public abstract class ABE {
    public static final Drawable A00(Context context, Integer num) {
        int i;
        0qQ.A0B(num, 2);
        int intValue = num.intValue();
        if (intValue == 0) {
            i = R.drawable.black_sticker_icon_support_small;
        } else if (intValue == 1) {
            i = R.drawable.sticker_icon_support_small;
        } else {
            throw AnonymousClass7TE.A0z(002.A0R("Unexpected SupportBusinessProfileSticker Theme: ", A16.A00(num)));
        }
        return context.getDrawable(i);
    }

    public static final int[] A01(Context context, Integer num) {
        int[] iArr;
        int i;
        int intValue = num.intValue();
        if (intValue == 0) {
            iArr = new int[2];
            iArr[0] = context.getColor(R.color.cardview_dark_background);
            i = R.color.abc_decor_view_status_guard;
        } else if (intValue == 1) {
            iArr = new int[2];
            iArr[0] = context.getColor(R.color.share_professional_profile_sticker_username_color_start);
            i = R.color.share_professional_profile_sticker_username_color_end;
        } else {
            throw AnonymousClass7TE.A0z(002.A0R("Unexpected SupportBusinessProfileSticker Theme: ", A16.A00(num)));
        }
        iArr[1] = context.getColor(i);
        return iArr;
    }
}
