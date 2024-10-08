package X;

import java.io.IOException;

/* renamed from: X.Czq  reason: case insensitive filesystem */
public final class C45640Czq {
    public static CET parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("amount_raised".equals(A17)) {
                    r5.A03 = AnonymousClass7TG.A0l(r6);
                } else if ("charity".equals(A17)) {
                    r5.A02 = C41845B3m.A0a(r6, false);
                } else if ("donations".equals(A17)) {
                    r5.A01 = C44977CoG.parseFromJson(r6);
                } else if ("fundraiser_id".equals(A17)) {
                    r5.A04 = AnonymousClass7TG.A0l(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            String str = r5.A03;
            r5.A00 = new C42091BGu(r5.A01, r5.A02, str, r5.A04);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
