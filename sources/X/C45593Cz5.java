package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cz5  reason: case insensitive filesystem */
public abstract class C45593Cz5 {
    public static BFT parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("facepile_top_participants".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1E(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("participant_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("prompt_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("text".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("participant_count", r11, "MediaPromptData");
            } else if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("prompt_id", r11, "MediaPromptData");
            } else if (str2 != null || !(r11 instanceof 0c9)) {
                return new BFT(num.intValue(), str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("text", r11, "MediaPromptData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BFT bft) {
        r2.A0c();
        List list = bft.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "facepile_top_participants", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r2, A0s);
            }
            r2.A0Y();
        }
        r2.A0P("participant_count", bft.A00);
        String str = bft.A01;
        if (str != null) {
            r2.A0R("prompt_id", str);
        }
        C41846B3n.A0z(r2, bft.A02);
        r2.A0Z();
    }
}
