package X;

import com.instagram.android.R;

/* renamed from: X.Nrj  reason: case insensitive filesystem */
public abstract class C69760Nrj {
    public static final int A00(C278034w8 r2) {
        Integer BED;
        if (r2 == null || (BED = r2.BED()) == null) {
            return R.drawable.instagram_eye_off_pano_outline_32;
        }
        int intValue = BED.intValue();
        if (intValue == 0) {
            return R.drawable.instagram_info_outline_16;
        }
        if (intValue == 1) {
            return R.drawable.instagram_eye_off_pano_outline_32;
        }
        if (intValue == 3) {
            return R.drawable.instagram_warning_outline_16;
        }
        if (intValue == 2) {
            return R.drawable.instagram_news_off_pano_outline_32;
        }
        if (intValue == 4) {
            return R.drawable.instagram_app_instagram_pano_outline_24;
        }
        if (intValue != 5) {
            return R.drawable.instagram_eye_off_pano_outline_32;
        }
        return R.drawable.instagram_info_pano_filled_12;
    }
}
