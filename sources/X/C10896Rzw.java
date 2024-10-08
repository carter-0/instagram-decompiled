package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Rzw  reason: case insensitive filesystem */
public final class C10896Rzw {
    public final int A00(Context context, int i) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = R.attr.igds_color_success;
        } else if (i != 1) {
            if (i != 3) {
                if (i == 5) {
                    i3 = R.color.activator_card_progress_bad;
                    return context.getColor(i3);
                } else if (i == 14) {
                    i2 = R.attr.igds_color_separator;
                } else if (i == 19) {
                    i2 = R.attr.igds_color_primary_background;
                } else if (i == 20) {
                    i2 = R.attr.igds_color_controls;
                } else if (i != 22) {
                    if (i == 23) {
                        i2 = R.attr.igds_color_photo_border;
                    } else {
                        throw DbW.A0a("Invalid color type: ", i);
                    }
                }
            }
            i2 = R.attr.igds_color_secondary_icon;
        } else {
            i2 = R.attr.igds_color_error_or_destructive;
        }
        i3 = 2Yu.A0H(context, i2);
        return context.getColor(i3);
    }
}
