package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.ChH  reason: case insensitive filesystem */
public abstract class C44583ChH {
    public static BIG parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            16L A11 = r11.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r11.A0z();
                return null;
            }
            String str = null;
            HashMap hashMap = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    return new BIG(bool, num, str, str2, str3, hashMap);
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("bloks_app".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("bloks_parameters".equals(A17)) {
                    if (r11.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r11.A1J() != r3) {
                            C41847B3o.A1M(r11, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("nux_tooltip_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("should_preload".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else {
                    num = C41847B3o.A13(r11, num, A17, "show_tooltip_count");
                }
                r11.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
