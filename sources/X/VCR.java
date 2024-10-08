package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VCR {
    public static C17630VbM parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17630VbM vbM = new C17630VbM();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("background_color".equals(A17)) {
                    vbM.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("bottom_margin".equals(A17)) {
                    vbM.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("left_margin".equals(A17)) {
                    vbM.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("right_margin".equals(A17)) {
                    vbM.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("top_margin".equals(A17)) {
                    vbM.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("vertical_constraint".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("alignment".equals(A17)) {
                    vbM.A01 = (C16626UyM) EnumHelper.A00(r3.A1Q(), C16626UyM.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("text_metrics".equals(A17)) {
                    vbM.A00 = VCS.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vbM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
