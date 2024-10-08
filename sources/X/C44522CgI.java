package X;

import com.instagram.api.schemas.TextEntityType;
import java.io.IOException;

/* renamed from: X.CgI  reason: case insensitive filesystem */
public abstract class C44522CgI {
    public static C42113BHr parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str2 = null;
            TextEntityType textEntityType = null;
            String str3 = null;
            String str4 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("display_text".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("entity_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    textEntityType = (TextEntityType) TextEntityType.A01.get(str);
                    if (textEntityType == null) {
                        textEntityType = TextEntityType.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_text", r10, "TextEntity");
            } else if (textEntityType != null || !(r10 instanceof 0c9)) {
                return new C42113BHr(textEntityType, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("entity_type", r10, "TextEntity");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
