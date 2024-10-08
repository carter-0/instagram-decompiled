package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.Clp  reason: case insensitive filesystem */
public abstract class C44839Clp {
    public static BIW parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                if (C41846B3n.A1Y(r6, A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (C41845B3m.A19(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("profile_picture".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r6);
                }
                r6.A0z();
            }
            return new BIW(simpleImageUrl, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
