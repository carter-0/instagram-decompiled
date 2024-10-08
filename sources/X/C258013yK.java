package X;

import java.io.IOException;

/* renamed from: X.3yK  reason: invalid class name and case insensitive filesystem */
public abstract class C258013yK {
    public static C258023yL parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            Long l = null;
            String str = null;
            String str2 = null;
            Integer num2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("end_scene_length".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                } else if ("follower_count".equals(A0q)) {
                    l = Long.valueOf(r14.A0y());
                } else if ("icon_style".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("icon_url".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("image_ad_length".equals(A0q)) {
                    num2 = Integer.valueOf(r14.A1D());
                } else if ("is_profile_pic_end_scene".equals(A0q)) {
                    bool = Boolean.valueOf(r14.A0d());
                } else if ("join_date_str".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("primary_color".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if ("swipe_area_height".equals(A0q)) {
                    num3 = Integer.valueOf(r14.A1D());
                } else if ("swipe_area_width".equals(A0q)) {
                    num4 = Integer.valueOf(r14.A1D());
                }
                r14.A0z();
            }
            return new C258023yL(bool, num, num2, num3, num4, l, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
