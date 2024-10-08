package X;

import com.instagram.api.schemas.LoyaltyToplineInfoDictImpl;
import java.io.IOException;

public abstract class Ca3 {
    public static LoyaltyToplineInfoDictImpl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("is_viewer_connected".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("loyalty_info_text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new LoyaltyToplineInfoDictImpl(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
