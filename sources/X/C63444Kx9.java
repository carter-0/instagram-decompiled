package X;

import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.io.IOException;

/* renamed from: X.Kx9  reason: case insensitive filesystem */
public abstract class C63444Kx9 {
    public static ShoppingTaggingFeedHeader parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = new ShoppingTaggingFeedHeader();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(3778).equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    shoppingTaggingFeedHeader.A01 = A0l;
                } else if (AnonymousClass000.A00(3933).equals(A17)) {
                    shoppingTaggingFeedHeader.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("exit_enabled".equals(A17)) {
                    shoppingTaggingFeedHeader.A03 = r4.A0d();
                } else if ("search_enabled".equals(A17)) {
                    shoppingTaggingFeedHeader.A04 = r4.A0d();
                } else if ("default_search_text".equals(A17)) {
                    shoppingTaggingFeedHeader.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("selection_count_enabled".equals(A17)) {
                    shoppingTaggingFeedHeader.A05 = r4.A0d();
                }
                r4.A0z();
            }
            return shoppingTaggingFeedHeader;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
