package X;

import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import java.io.IOException;

/* renamed from: X.CWe  reason: case insensitive filesystem */
public abstract class C44113CWe {
    public static CreatorViewerBottomCTAImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            CreatorViewerBottomCTAType creatorViewerBottomCTAType = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("bottom_cta_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    creatorViewerBottomCTAType = (CreatorViewerBottomCTAType) CreatorViewerBottomCTAType.A01.get(str);
                    if (creatorViewerBottomCTAType == null) {
                        creatorViewerBottomCTAType = CreatorViewerBottomCTAType.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (creatorViewerBottomCTAType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("bottom_cta_type", r8, "CreatorViewerBottomCTAImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new CreatorViewerBottomCTAImpl(creatorViewerBottomCTAType, str2);
            } else {
                AnonymousClass7TF.A1L("text", r8, "CreatorViewerBottomCTAImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
