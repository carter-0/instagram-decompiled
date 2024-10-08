package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;

/* renamed from: X.Kx8  reason: case insensitive filesystem */
public abstract class C63443Kx8 {
    public static JV7 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            JV7 jv7 = new JV7(32);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("header".equals(A17)) {
                    ShoppingTaggingFeedHeader parseFromJson = C63444Kx9.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    jv7.A00 = parseFromJson;
                } else if ("source_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    jv7.A02 = A0l;
                } else if ("source_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    jv7.A01 = A0l2;
                }
                r4.A0z();
            }
            return jv7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
