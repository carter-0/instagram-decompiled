package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

public abstract class VE9 {
    public static final String A00(Context context, C48107EVz eVz, int i) {
        Resources resources;
        int i2;
        if (eVz != null) {
            int ordinal = eVz.ordinal();
            if (ordinal == 1) {
                resources = context.getResources();
                i2 = R.plurals.guide_detail_text_accounts;
            } else if (ordinal == 2) {
                resources = context.getResources();
                i2 = R.plurals.guide_detail_text_locations;
            } else if (ordinal == 3) {
                resources = context.getResources();
                i2 = R.plurals.guide_detail_text_products;
            }
            String A0d = DbY.A0d(resources, i, i2);
            0qQ.A07(A0d);
            return A0d;
        }
        resources = context.getResources();
        i2 = R.plurals.guide_detail_text_media;
        String A0d2 = DbY.A0d(resources, i, i2);
        0qQ.A07(A0d2);
        return A0d2;
    }
}
