package X;

import java.io.IOException;

public abstract class HTS {
    public static C53437GoU parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("upsell_button_text".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("upsell_position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if ("upsell_subtitle".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("upsell_title".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("upsell_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("upsell_button_text", r15, "ChainingUpsellCardDictImpl");
            } else if (num == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("upsell_position", r15, "ChainingUpsellCardDictImpl");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("upsell_subtitle", r15, "ChainingUpsellCardDictImpl");
            } else if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("upsell_title", r15, "ChainingUpsellCardDictImpl");
            } else if (str4 != null || !(r15 instanceof 0c9)) {
                return new C53437GoU(num.intValue(), str, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L("upsell_type", r15, "ChainingUpsellCardDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
