package X;

import com.instagram.api.schemas.OriginalityFollowButtonInfoImpl;
import java.io.IOException;

public abstract class CbD {
    public static OriginalityFollowButtonInfoImpl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Boolean bool = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("is_original_author_in_author_exp".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else {
                    bool2 = C41847B3o.A0z(r4, bool2, A17, "show_follow_bottom_sheet_button");
                }
                r4.A0z();
            }
            return new OriginalityFollowButtonInfoImpl(bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
