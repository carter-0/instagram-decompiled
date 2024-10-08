package X;

import com.instagram.api.schemas.CallAdsInfoDict;
import java.io.IOException;

public abstract class CVK {
    public static CallAdsInfoDict parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(1813);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (!AnonymousClass000.A00(1670).equals(A17)) {
                    bool = C41847B3o.A0z(r8, bool, A17, A00);
                } else if (r8.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r8.A1P();
                }
                r8.A0z();
            }
            if (bool != null || !(r8 instanceof 0c9)) {
                return new CallAdsInfoDict(str, bool.booleanValue());
            }
            AnonymousClass7TF.A1L(A00, r8, "CallAdsInfoDict");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
