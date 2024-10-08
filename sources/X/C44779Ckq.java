package X;

import java.io.IOException;

/* renamed from: X.Ckq  reason: case insensitive filesystem */
public abstract class C44779Ckq {
    public static C45429Cw9 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45429Cw9 cw9 = new C45429Cw9();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    cw9.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("body".equals(A17)) {
                    cw9.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("button_text".equals(A17)) {
                    cw9.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("disqualify_subtitle".equals(A17)) {
                    cw9.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("disqualify_title".equals(A17)) {
                    cw9.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("disqualify_website_button_text".equals(A17)) {
                    cw9.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("disqualify_website_url".equals(A17)) {
                    cw9.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("gated_content_link".equals(A17)) {
                    cw9.A06 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A17(A17)) {
                    cw9.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("key".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (C41845B3m.A1E(A17)) {
                    cw9.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("phone_link".equals(A17)) {
                    cw9.A08 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cw9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
