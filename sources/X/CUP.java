package X;

import java.io.IOException;

public abstract class CUP {
    public static BBT parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("category_name".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("like_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("page_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r11);
                } else if ("page_name".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("profile_picture_url".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (l != null || !(r11 instanceof 0c9)) {
                return new BBT(num, str, str2, str3, l.longValue());
            }
            AnonymousClass7TF.A1L("page_id", r11, "AdminedPage");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
