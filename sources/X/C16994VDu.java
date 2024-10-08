package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VDu  reason: case insensitive filesystem */
public abstract class C16994VDu {
    public static VY8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VY8 vy8 = new VY8();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("bitmap_name".equals(A17)) {
                    vy8.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A17)) {
                    vy8.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("tag".equals(A17)) {
                    vy8.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1C(A17)) {
                    vy8.A00 = (C16632UyS) EnumHelper.A00(r3.A1Q(), C16632UyS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return vy8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
