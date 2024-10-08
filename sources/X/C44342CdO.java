package X;

import java.io.IOException;

/* renamed from: X.CdO  reason: case insensitive filesystem */
public abstract class C44342CdO {
    public static AnonymousClass3IH parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            BEO beo = null;
            String str = null;
            Long l = null;
            1Xj r4 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (AnonymousClass000.A00(1208).equals(A17)) {
                    beo = CWB.parseFromJson(r11);
                } else if ("cta_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    l = AnonymousClass7TF.A0Z(r11);
                } else if (C41845B3m.A1D(A17)) {
                    r4 = 1Xj.A00(r11);
                } else if ("netego_title".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (C41845B3m.A1L(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new AnonymousClass3IH(beo, r4, l, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
