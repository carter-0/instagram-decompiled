package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0p  reason: case insensitive filesystem */
public final class C45665D0p {
    public static CDZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Z(r4, A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1F(r4, arrayList);
                        }
                    }
                    r0.A01 = arrayList;
                } else if ("paging_info".equals(A0q)) {
                    r0.A00 = C276094sY.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r0, A0q);
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
}
