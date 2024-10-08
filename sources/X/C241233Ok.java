package X;

import java.io.IOException;

/* renamed from: X.3Ok  reason: invalid class name and case insensitive filesystem */
public abstract class C241233Ok {
    public static C241303Or parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            C250533lb r8 = null;
            C266544Zk r3 = null;
            C266544Zk r4 = null;
            C266544Zk r5 = null;
            C266544Zk r6 = null;
            C266544Zk r7 = null;
            C241283Op r9 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r8 = C250523la.parseFromJson(r11);
                } else if ("upsell_ci_card".equals(A0q)) {
                    r3 = C266534Zj.parseFromJson(r11);
                } else if ("upsell_complete_profile_card".equals(A0q)) {
                    r4 = C266534Zj.parseFromJson(r11);
                } else if ("upsell_fbc_card".equals(A0q)) {
                    r5 = C266534Zj.parseFromJson(r11);
                } else if ("upsell_invite_card".equals(A0q)) {
                    r6 = C266534Zj.parseFromJson(r11);
                } else if ("upsell_see_all_su_card".equals(A0q)) {
                    r7 = C266534Zj.parseFromJson(r11);
                } else if ("user_card".equals(A0q)) {
                    r9 = C241243Ol.parseFromJson(r11);
                }
                r11.A0z();
            }
            return new C241303Or(r3, r4, r5, r6, r7, r8, r9, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
