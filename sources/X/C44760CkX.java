package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.CkX  reason: case insensitive filesystem */
public abstract class C44760CkX {
    public static C45287Ctq parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45287Ctq ctq = new C45287Ctq();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("error_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    ctq.A01 = str;
                } else if ("input_type".equals(A17)) {
                    ctq.A00 = (C16662Uyy) EnumHelper.A00(r3.A1Q(), C16662Uyy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return ctq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
