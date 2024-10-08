package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VDW {
    public static VSN parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VSN vsn = new VSN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("signal_rank".equals(A17)) {
                    vsn.A00 = r3.A1D();
                } else if ("signal_value".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vsn.A01 = str;
                } else if ("source".equals(A17)) {
                    EnumHelper.A00(r3.A1Q(), C16628UyO.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                r3.A0z();
            }
            return vsn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
