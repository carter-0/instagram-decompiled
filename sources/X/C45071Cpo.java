package X;

import java.io.IOException;

/* renamed from: X.Cpo  reason: case insensitive filesystem */
public abstract class C45071Cpo {
    public static BBT parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            BBT bbt = new BBT();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1J(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    bbt.A02 = A0l;
                } else if (AnonymousClass000.A00(2675).equals(A17)) {
                    bbt.A00 = r5.A0y();
                } else if ("pinned_content_token".equals(A17)) {
                    bbt.A04 = AnonymousClass7TG.A0l(r5);
                } else if ("next_max_id".equals(A17)) {
                    bbt.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("pinned_content".equals(A17)) {
                    bbt.A01 = C45079Cpw.parseFromJson(r5);
                }
                r5.A0z();
            }
            return bbt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
