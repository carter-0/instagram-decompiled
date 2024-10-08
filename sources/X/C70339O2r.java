package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import java.io.IOException;

/* renamed from: X.O2r  reason: case insensitive filesystem */
public abstract class C70339O2r {
    public static C68169N3k parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C68169N3k n3k = new C68169N3k();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("component_type".equals(A17)) {
                    ProductTaggingFeedComponentType productTaggingFeedComponentType = (ProductTaggingFeedComponentType) ProductTaggingFeedComponentType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (productTaggingFeedComponentType == null) {
                        productTaggingFeedComponentType = ProductTaggingFeedComponentType.UNRECOGNIZED;
                    }
                    n3k.A02 = productTaggingFeedComponentType;
                } else if ("component_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    n3k.A03 = A0l;
                } else if ("section_num".equals(A17)) {
                    n3k.A00 = r4.A1D();
                } else if ("meta".equals(A17)) {
                    C15055ULy parseFromJson = C17083VHf.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    n3k.A01 = parseFromJson;
                }
                r4.A0z();
            }
            return n3k;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
