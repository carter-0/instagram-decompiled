package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VCT {
    public static C17434VVn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17434VVn vVn = new C17434VVn();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("length".equals(A17)) {
                    vVn.A00 = r3.A1D();
                } else if ("offset".equals(A17)) {
                    vVn.A01 = r3.A1D();
                } else if (Pxd.A00(228).equals(A17)) {
                    vVn.A02 = (C16623UyJ) EnumHelper.A00(r3.A1Q(), C16623UyJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return vVn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
