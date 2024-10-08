package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcW  reason: case insensitive filesystem */
public abstract class C44288CcW {
    public static AnonymousClass60F parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("facepile_users".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1E(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("num_items".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("prompt_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (!"prompt_text".equals(A17)) {
                    bool = C41847B3o.A0z(r11, bool, A17, "should_show_unseen_response_indicator");
                } else if (r11.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r11.A1P();
                }
                r11.A0z();
            }
            if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("prompt_id", r11, "PromptPogResponseInfo");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new AnonymousClass60F(bool, num, str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("prompt_text", r11, "PromptPogResponseInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
