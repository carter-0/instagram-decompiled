package X;

import java.io.IOException;

/* renamed from: X.Hcz  reason: case insensitive filesystem */
public abstract class C55151Hcz {
    public static C53369Gmt parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C53369Gmt gmt = new C53369Gmt();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("media_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    gmt.A01 = str;
                } else if ("author_id".equals(A17)) {
                    gmt.A00 = r4.A0y();
                }
                r4.A0z();
            }
            return gmt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
