package X;

import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.io.IOException;

/* renamed from: X.Cxx  reason: case insensitive filesystem */
public abstract class C45523Cxx {
    public static BED parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str2 = null;
            ClipsSpinSwappableElementType clipsSpinSwappableElementType = null;
            BEE bee = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("element_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("element_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    clipsSpinSwappableElementType = (ClipsSpinSwappableElementType) ClipsSpinSwappableElementType.A01.get(str);
                    if (clipsSpinSwappableElementType == null) {
                        clipsSpinSwappableElementType = ClipsSpinSwappableElementType.UNRECOGNIZED;
                    }
                } else if ("swappable_text".equals(A17)) {
                    bee = C45524Cxy.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new BED(clipsSpinSwappableElementType, bee, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BED bed) {
        r2.A0c();
        String str = bed.A02;
        if (str != null) {
            r2.A0R("element_id", str);
        }
        ClipsSpinSwappableElementType clipsSpinSwappableElementType = bed.A00;
        if (clipsSpinSwappableElementType != null) {
            r2.A0R("element_type", clipsSpinSwappableElementType.A00);
        }
        DV5 dv5 = bed.A01;
        if (dv5 != null) {
            r2.A0q("swappable_text");
            C45524Cxy.A00(r2, dv5.F1e());
        }
        r2.A0Z();
    }
}
