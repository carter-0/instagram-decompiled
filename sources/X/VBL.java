package X;

import java.io.IOException;

public abstract class VBL {
    public static C65601ee parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1OS r1 = new 1OS();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("info_center_type".equals(A17)) {
                    r1.A03 = VEC.A00(r3.A1Q());
                } else if ("fact_name".equals(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("fact_title".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("content_source".equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("header_title".equals(A17)) {
                    r1.A0B = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1408).equals(A17)) {
                    r1.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("header_icon_url".equals(A17)) {
                    r1.A00 = 16h.A00(r3);
                } else if (AnonymousClass000.A00(5126).equals(A17)) {
                    r1.A01 = 16h.A00(r3);
                } else if ("deep_link_url".equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("all_facts_deep_link_url".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1251).equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66893Meb.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
