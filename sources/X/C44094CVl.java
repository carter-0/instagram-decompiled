package X;

import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.io.IOException;

/* renamed from: X.CVl  reason: case insensitive filesystem */
public abstract class C44094CVl {
    public static BEF parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            ClipsSpinSwappableElementType clipsSpinSwappableElementType = null;
            BEG beg = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("element_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("element_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    clipsSpinSwappableElementType = (ClipsSpinSwappableElementType) ClipsSpinSwappableElementType.A01.get(str);
                    if (clipsSpinSwappableElementType == null) {
                        clipsSpinSwappableElementType = ClipsSpinSwappableElementType.UNRECOGNIZED;
                    }
                } else if ("swapped_text".equals(A17)) {
                    beg = C44095CVm.parseFromJson(r8);
                }
                r8.A0z();
            }
            if (str2 != null || !(r8 instanceof 0c9)) {
                return new BEF(clipsSpinSwappableElementType, beg, str2);
            }
            AnonymousClass7TF.A1L("element_id", r8, "ClipsSpinSwappedElementImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
