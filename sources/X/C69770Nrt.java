package X;

import android.net.Uri;
import com.instagram.android.R;

/* renamed from: X.Nrt  reason: case insensitive filesystem */
public abstract class C69770Nrt {
    public static final String A00(AnonymousClass6Tm r3) {
        int i;
        String A0h = DbY.A0h(r3, 0);
        0qQ.A0B(A0h, 0);
        String A00 = new 11S("[-/]").A00(new 11S("_(light|dark)").A00(AnonymousClass7TF.A0j(A0h), ""), "_");
        switch (A00.hashCode()) {
            case -1549306977:
                if (A00.equals("meta_brand_design_system_icons_raster_caret_left_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_caret_left_outline_24;
                    break;
                } else {
                    return null;
                }
            case -1362722511:
                if (A00.equals("caa_central_images_instagram")) {
                    i = R.drawable.caa_central_images_instagram;
                    break;
                } else {
                    return null;
                }
            case -1178054961:
                if (A00.equals("meta_brand_design_system_icons_raster_checkmark_shield_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_checkmark_shield_outline_24;
                    break;
                } else {
                    return null;
                }
            case -717200796:
                if (A00.equals("company_brand_meta_lockup_monochromatic_12")) {
                    i = R.drawable.company_brand_meta_lockup_monochromatic_12;
                    break;
                } else {
                    return null;
                }
            case -629525319:
                if (A00.equals("meta_brand_design_system_icons_raster_eye_off_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_eye_off_outline_24;
                    break;
                } else {
                    return null;
                }
            case -180826903:
                if (A00.equals("meta_brand_design_system_icons_raster_eye_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_eye_outline_24;
                    break;
                } else {
                    return null;
                }
            case -94519085:
                if (A00.equals("meta_brand_design_system_icons_raster_gear_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_gear_outline_24;
                    break;
                } else {
                    return null;
                }
            case 1915714204:
                if (A00.equals("meta_brand_design_system_icons_raster_i_circle_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_i_circle_outline_24;
                    break;
                } else {
                    return null;
                }
            case 1989145410:
                if (A00.equals("meta_brand_design_system_icons_raster_x_outline_24")) {
                    i = R.drawable.meta_brand_design_system_icons_raster_x_filled_24;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        Uri uri = C70361O3n.A00;
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build().toString();
    }
}
