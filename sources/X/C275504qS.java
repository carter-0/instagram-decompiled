package X;

import java.io.IOException;

/* renamed from: X.4qS  reason: invalid class name and case insensitive filesystem */
public abstract class C275504qS {
    public static C275514qT parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("clickable_icon_resource_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("clickable_id".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("end_message".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("end_message_icon_resource_name".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str2 == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("clickable_id", "AdsFeedbackInterfaceClickableImpl");
            } else if (str5 != null || !(r11 instanceof 0c9)) {
                return new C275514qT(str, str2, str3, str4, str5);
            } else {
                ((0c9) r11).A03.A00("text", "AdsFeedbackInterfaceClickableImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C275514qT r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("clickable_icon_resource_name", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R("clickable_id", str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r2.A0R("end_message", str3);
        }
        String str4 = r3.A03;
        if (str4 != null) {
            r2.A0R("end_message_icon_resource_name", str4);
        }
        String str5 = r3.A04;
        if (str5 != null) {
            r2.A0R("text", str5);
        }
        r2.A0Z();
    }
}
