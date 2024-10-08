package X;

import com.instagram.shopping.model.taggingfeed.SourceType;
import java.io.IOException;

public abstract class Kx5 {
    public static C61076JwE parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            SourceType sourceType = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("keyword".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("source_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    sourceType = (SourceType) SourceType.A01.get(str);
                    if (sourceType == null) {
                        sourceType = SourceType.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("keyword", r8, "KeywordMetadataImpl");
            } else if (sourceType != null || !(r8 instanceof 0c9)) {
                return new C61076JwE(sourceType, str2);
            } else {
                AnonymousClass7TF.A1L("source_type", r8, "KeywordMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
