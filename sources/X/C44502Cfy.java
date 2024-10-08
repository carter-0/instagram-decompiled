package X;

import java.io.IOException;

/* renamed from: X.Cfy  reason: case insensitive filesystem */
public abstract class C44502Cfy {
    public static C53381GnB parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            C250533lb r3 = null;
            1Xj r4 = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("allow_feedback".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (C41845B3m.A17(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r3 = C250523la.parseFromJson(r11);
                } else if ("media_or_ad".equals(A17)) {
                    r4 = 1Xj.A00(r11);
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r11, num2, A17, "view_state_item_type");
                } else if (r11.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r11.A1P();
                }
                r11.A0z();
            }
            return new C53381GnB((C67241sS) r3, r4, bool, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
