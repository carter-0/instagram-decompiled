package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

public abstract class LIX {
    public static LMH parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            LMH lmh = new LMH();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("camera_tool".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    lmh.A00 = C2807253k.A00(str);
                } else if ("gen_ai_info".equals(A17)) {
                    LN5 parseFromJson = C63193Kt0.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    lmh.A01 = parseFromJson;
                }
                r4.A0z();
            }
            return lmh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, LMH lmh) {
        r3.A0c();
        r3.A0R("camera_tool", lmh.A00.A00);
        r3.A0q("gen_ai_info");
        LN5 ln5 = lmh.A01;
        r3.A0c();
        String str = ln5.A01;
        if (str != null) {
            r3.A0R(AnonymousClass000.A00(617), str);
        }
        String str2 = ln5.A02;
        if (str2 != null) {
            r3.A0R("prompt", str2);
        }
        r3.A0R("recipe_caption", ln5.A03);
        String str3 = ln5.A00;
        if (str3 != null) {
            r3.A0R("background_color", str3);
        }
        String str4 = ln5.A06;
        if (str4 != null) {
            r3.A0R("sticker_style_str", str4);
        }
        r3.A0R(AnonymousClass000.A00(817), ln5.A08);
        String str5 = ln5.A07;
        if (str5 != null) {
            r3.A0R("topic", str5);
        }
        r3.A0R(TraceFieldType.RequestID, ln5.A04);
        r3.A0R("response_id", ln5.A05);
        r3.A0Z();
        r3.A0Z();
    }
}
