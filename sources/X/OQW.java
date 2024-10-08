package X;

import com.instagram.model.direct.DirectThreadKey;
import java.io.IOException;

public abstract class OQW {
    public static C66161kJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66161kJ r0 = new C66161kJ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66580MXl.A1Z(A17)) {
                    r0.A05 = C66580MXl.A0h(r4);
                } else if ("prompt_type".equals(A17)) {
                    r0.A00 = r4.A1D();
                } else if ("prompt_text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A09 = A0l;
                } else if ("button_text".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A07 = A0l2;
                } else if ("recurring_cadence".equals(A17)) {
                    r0.A01 = r4.A1D();
                } else if ("optimistic_countdown_timestamp_ms".equals(A17)) {
                    r0.A06 = AnonymousClass7TF.A0Z(r4);
                } else if ("optimistic_admin_text".equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("timezone".equals(A17)) {
                    r0.A0A = AnonymousClass7TG.A0l(r4);
                } else if ("thread_subtype".equals(A17)) {
                    r0.A03 = r4.A1D();
                } else if ("thread_audience".equals(A17)) {
                    r0.A02 = r4.A1D();
                } else if ("trending_prompt_id".equals(A17)) {
                    r0.A0B = AnonymousClass7TG.A0l(r4);
                } else if ("challenge_prompt_data".equals(A17)) {
                    r0.A04 = C70870OPj.parseFromJson(r4);
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C66161kJ r4) {
        String str;
        r3.A0c();
        if (r4.A05 != null) {
            r3.A0q("thread_key");
            DirectThreadKey directThreadKey = r4.A05;
            if (directThreadKey != null) {
                C254733sx.A00(r3, directThreadKey);
                r3.A0P("prompt_type", r4.A00);
                r4.A07();
                r3.A0R("prompt_text", r4.A07());
                String str2 = r4.A07;
                if (str2 != null) {
                    r3.A0R("button_text", str2);
                    r3.A0P("recurring_cadence", r4.A01);
                    Long l = r4.A06;
                    if (l != null) {
                        r3.A0Q("optimistic_countdown_timestamp_ms", l.longValue());
                    }
                    String str3 = r4.A08;
                    if (str3 != null) {
                        r3.A0R("optimistic_admin_text", str3);
                    }
                    String str4 = r4.A0A;
                    if (str4 != null) {
                        r3.A0R("timezone", str4);
                    }
                    r3.A0P("thread_subtype", r4.A03);
                    r3.A0P("thread_audience", r4.A02);
                    String str5 = r4.A0B;
                    if (str5 != null) {
                        r3.A0R("trending_prompt_id", str5);
                    }
                    if (r4.A04 != null) {
                        r3.A0q("challenge_prompt_data");
                        C70870OPj.A00(r4.A04, r3);
                    }
                    C66893Meb.A00(r3, r4);
                    r3.A0Z();
                    return;
                }
                str = "buttonText";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "key";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
