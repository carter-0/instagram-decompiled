package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VCW {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.VCV] */
    public static VCV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("client_mutation_id".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("rejection_reason".equals(A17)) {
                    EnumHelper.A00(r3.A1Q(), C16629UyP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
