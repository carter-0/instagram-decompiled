package X;

import com.instagram.model.direct.DirectThreadKey;

public abstract class OQV {
    public static void A00(17Z r2, C66181kP r3) {
        r3.A07();
        r2.A0q("thread_key");
        C254733sx.A00(r2, r3.A07());
        if (r3.A01 != null) {
            r2.A0q("direct_pending_media");
            LJH.A00(r2, r3.A01);
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R("prompt_id", str);
        }
        r2.A0P("prompt_type", r3.A00);
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0R("question_response_text", str2);
        }
        C66893Meb.A00(r2, r3);
    }

    public static void A01(16F r1, C66181kP r2, String str) {
        if (C66580MXl.A1Z(str)) {
            DirectThreadKey parseFromJson = C254733sx.parseFromJson(r1);
            0qQ.A0B(parseFromJson, 0);
            r2.A02 = parseFromJson;
        } else if ("direct_pending_media".equals(str)) {
            r2.A01 = LJH.parseFromJson(r1);
        } else if ("prompt_id".equals(str)) {
            r2.A03 = AnonymousClass7TG.A0l(r1);
        } else if ("prompt_type".equals(str)) {
            r2.A00 = r1.A1D();
        } else if ("question_response_text".equals(str)) {
            r2.A04 = AnonymousClass7TG.A0l(r1);
        } else {
            C66893Meb.A01(r1, r2, str);
        }
    }
}
