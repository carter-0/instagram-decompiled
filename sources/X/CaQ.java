package X;

import java.io.IOException;

public abstract class CaQ {
    public static C61058Jvw parseFromJson(16F r11) {
        String A00;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1595);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("classification_confidence".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r11);
                } else if ("error_message".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (AnonymousClass000.A00(1831).equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (!"translated_text".equals(A17)) {
                    num = C41847B3o.A13(r11, num, A17, "translation_confidence");
                } else if (r11.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r11.A1P();
                }
                r11.A0z();
            }
            if (str2 != null || !(r11 instanceof 0c9)) {
                return new C61058Jvw(f, num, str, str2, str3, str4);
            }
            AnonymousClass7TF.A1L(A00, r11, "MessageTranslationInfoEntry");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
