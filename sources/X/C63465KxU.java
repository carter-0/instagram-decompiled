package X;

import com.instagram.android.R;

/* renamed from: X.KxU  reason: case insensitive filesystem */
public abstract class C63465KxU {
    public static final Integer A00(C59898JbN jbN) {
        int i;
        int ordinal = jbN.ordinal();
        if (ordinal == 0) {
            i = R.drawable.instagram_app_icloud_pano_outline_24;
        } else if (ordinal == 1) {
            i = R.drawable.instagram_app_icloud_warning_pano_outline_24;
        } else if (ordinal == 2) {
            i = R.drawable.instagram_cube_pano_outline_24;
        } else if (ordinal != 3) {
            return null;
        } else {
            i = R.drawable.instagram_glasses_pano_outline_24;
        }
        return Integer.valueOf(i);
    }
}
