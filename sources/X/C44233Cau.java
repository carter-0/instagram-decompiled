package X;

import com.instagram.api.schemas.NonDiscInfo;
import java.io.IOException;

/* renamed from: X.Cau  reason: case insensitive filesystem */
public abstract class C44233Cau {
    public static NonDiscInfo parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("is_accepted".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else {
                    bool2 = C41847B3o.A0z(r7, bool2, A17, "is_blocking_create");
                }
                r7.A0z();
            }
            if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_accepted", r7, "NonDiscInfo");
            } else if (bool2 != null || !(r7 instanceof 0c9)) {
                return new NonDiscInfo(bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_blocking_create", r7, "NonDiscInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
