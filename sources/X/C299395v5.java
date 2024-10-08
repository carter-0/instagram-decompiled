package X;

import java.io.IOException;

/* renamed from: X.5v5  reason: invalid class name and case insensitive filesystem */
public abstract class C299395v5 {
    public static C53433GoQ parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (r13.A1J() != 16L.A09) {
                String A0q = r13.A0q();
                r13.A1J();
                if ("see_less_button_confirmation_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("see_less_button_confirmation_text_icon".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("see_less_button_icon".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("see_less_button_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if ("see_more_button_confirmation_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if ("see_more_button_confirmation_text_icon".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r13.A1P();
                    }
                } else if ("see_more_button_icon".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r13.A1P();
                    }
                } else if ("see_more_button_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r13.A1P();
                    }
                } else if ("undo_button_confirmation_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r13.A1P();
                    }
                } else if ("undo_button_text".equals(A0q)) {
                    if (r13.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new C53433GoQ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
