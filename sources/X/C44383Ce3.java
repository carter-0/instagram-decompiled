package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Ce3  reason: case insensitive filesystem */
public abstract class C44383Ce3 {
    public static C42078BGg parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            16L A11 = r13.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                16L A1J = r13.A1J();
                16L r3 = 16L.A09;
                if (A1J == r3) {
                    return new C42078BGg(bool, num, str, str2, str3, str4, str5, hashMap);
                }
                String A17 = AnonymousClass7TE.A17(r13);
                if ("accessibility_hint".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("action_tooltip_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("bloks_app".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("bloks_parameters".equals(A17)) {
                    if (r13.A11() == r2) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r13.A1J() != r3) {
                            C41847B3o.A1M(r13, hashMap);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("nux_tooltip_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("should_preload".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else {
                    num = C41847B3o.A13(r13, num, A17, "show_tooltip_count");
                }
                r13.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
