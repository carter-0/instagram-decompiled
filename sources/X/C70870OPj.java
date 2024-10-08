package X;

import java.io.IOException;

/* renamed from: X.OPj  reason: case insensitive filesystem */
public abstract class C70870OPj {
    public static ULw parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ULw uLw = new ULw();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("duration_s".equals(A17)) {
                    uLw.A00 = r3.A1D();
                } else if ("prize_option".equals(A17)) {
                    uLw.A01 = r3.A1D();
                } else if ("customized_prize_description".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    uLw.A03 = str;
                }
                r3.A0z();
            }
            return uLw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(ULw uLw, 17Z r3) {
        r3.A0c();
        r3.A0P("duration_s", uLw.A00);
        r3.A0P("prize_option", uLw.A01);
        String str = uLw.A03;
        if (str != null) {
            r3.A0R("customized_prize_description", str);
        }
        r3.A0Z();
    }
}
