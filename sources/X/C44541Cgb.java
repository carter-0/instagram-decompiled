package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cgb  reason: case insensitive filesystem */
public abstract class C44541Cgb {
    public static AnonymousClass3IR parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("cta_dest".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("media_dicts".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1D(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("netego_title".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("quick_promotion_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                } else if ("toast_text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r11.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            return new AnonymousClass3IR(str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
