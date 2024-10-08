package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class O10 {
    public static OHW parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            OHW ohw = new OHW();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    ohw.A05 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A19(A0q)) {
                    ohw.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("device_position".equals(A0q)) {
                    ohw.A04 = (C62622Kit) EnumHelper.A00(r3.A1Q(), C62622Kit.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("attribution_user".equals(A0q)) {
                    ohw.A00 = C70292O0w.parseFromJson(r3);
                } else if ("effect_action_sheet".equals(A0q)) {
                    ohw.A01 = C70293O0x.parseFromJson(r3);
                } else if ("fan_club".equals(A0q)) {
                    ohw.A02 = C70294O0y.parseFromJson(r3);
                } else if (AnonymousClass000.A00(381).equals(A0q)) {
                    ohw.A03 = C70295O0z.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ohw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
