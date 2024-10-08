package X;

import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.FormattedStringImpl;
import java.io.IOException;

/* renamed from: X.CWi  reason: case insensitive filesystem */
public abstract class C44117CWi {
    public static CreatorViewerInsightInfoImpl parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 = null;
            String str2 = null;
            FormattedStringImpl formattedStringImpl = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("formatted_text".equals(A17)) {
                    formattedStringImpl = C44152CXr.parseFromJson(r9);
                } else if ("insight_type_v2".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    creatorViewerInsightTypeV2 = (CreatorViewerInsightTypeV2) CreatorViewerInsightTypeV2.A01.get(str);
                    if (creatorViewerInsightTypeV2 == null) {
                        creatorViewerInsightTypeV2 = CreatorViewerInsightTypeV2.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (creatorViewerInsightTypeV2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("insight_type_v2", r9, "CreatorViewerInsightInfoImpl");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new CreatorViewerInsightInfoImpl(creatorViewerInsightTypeV2, formattedStringImpl, str2);
            } else {
                AnonymousClass7TF.A1L("text", r9, "CreatorViewerInsightInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
