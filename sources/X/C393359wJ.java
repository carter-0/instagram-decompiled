package X;

import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* renamed from: X.9wJ  reason: invalid class name and case insensitive filesystem */
public abstract class C393359wJ {
    public static AnonymousClass7g4 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Long l = null;
            ImageUrl imageUrl = null;
            Integer num = null;
            Boolean bool = null;
            ImageUrl imageUrl2 = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("profile_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r9);
                } else if ("profile_image".equals(A17)) {
                    imageUrl = 16h.A00(r9);
                } else if ("request_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("request_count_overflow".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if (C273654mx.A00(3287).equals(A17)) {
                    imageUrl2 = 16h.A00(r9);
                } else if (C273654mx.A00(979).equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new AnonymousClass7g4(imageUrl, imageUrl2, bool, num, l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
