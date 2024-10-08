package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.O1h  reason: case insensitive filesystem */
public abstract class C70303O1h {
    public static final String A00(Context context, C247743gq r2, int i) {
        Resources resources;
        int i2;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_second;
        } else if (ordinal == 1) {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_minute;
        } else if (ordinal != 2) {
            resources = context.getResources();
            if (ordinal != 3) {
                i2 = R.plurals.countdown_sticker_month;
            } else {
                i2 = R.plurals.countdown_sticker_day;
            }
        } else {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_hour;
        }
        String quantityString = resources.getQuantityString(i2, i);
        0qQ.A07(quantityString);
        return quantityString;
    }
}
