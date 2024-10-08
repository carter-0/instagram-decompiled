package X;

import java.io.IOException;

/* renamed from: X.Cps  reason: case insensitive filesystem */
public abstract class C45075Cps {
    public static BBU parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            BBU bbu = new BBU();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("collection_id".equals(A17)) {
                    bbu.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("collection_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    bbu.A03 = A0l;
                } else if (C41845B3m.A1Q(A17)) {
                    bbu.A04 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    bbu.A07 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1L(A17)) {
                    bbu.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("merchant_dict".equals(A17)) {
                    bbu.A01 = C41845B3m.A0a(r4, false);
                } else if ("cover".equals(A17)) {
                    bbu.A00 = C45057Cpa.parseFromJson(r4);
                } else if ("discount_id".equals(A17)) {
                    bbu.A05 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return bbu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
