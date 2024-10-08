package X;

import java.io.IOException;

/* renamed from: X.Epg  reason: case insensitive filesystem */
public abstract class C49117Epg {
    public static F16 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            F16 f16 = new F16();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("source".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    f16.A0C = A0l;
                } else if ("category_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    f16.A02 = A0l2;
                } else if ("category_name".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    f16.A03 = A0l3;
                } else if ("public_email".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    f16.A09 = A0l4;
                } else if (AnonymousClass000.A00(3817).equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    f16.A0A = A0l5;
                } else if ("public_phone_national_number".equals(A17)) {
                    String A0l6 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l6, 0);
                    f16.A0B = A0l6;
                } else if ("public_address_street".equals(A17)) {
                    String A0l7 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l7, 0);
                    f16.A08 = A0l7;
                } else if ("public_address_postal_code".equals(A17)) {
                    String A0l8 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l8, 0);
                    f16.A07 = A0l8;
                } else if ("public_address_city_id".equals(A17)) {
                    String A0l9 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l9, 0);
                    f16.A05 = A0l9;
                } else if ("public_address_city_name".equals(A17)) {
                    String A0l10 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l10, 0);
                    f16.A06 = A0l10;
                } else if ("page_id".equals(A17)) {
                    String A0l11 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l11, 0);
                    f16.A04 = A0l11;
                } else if ("page_name".equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if ("is_page_convertable".equals(A17)) {
                    f16.A0D = r4.A0d();
                } else if ("category_account_type".equals(A17)) {
                    f16.A00 = 16U.A00(r4.A1D());
                } else if ("previous_account_type".equals(A17)) {
                    f16.A01 = 16U.A00(r4.A1D());
                }
                r4.A0z();
            }
            return f16;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
