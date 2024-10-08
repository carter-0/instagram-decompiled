package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cyc  reason: case insensitive filesystem */
public final class C45564Cyc {
    public static C43799CDr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
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
                            C61092Jx3 parseFromJson = CUO.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                } else if ("paging_info".equals(A0q)) {
                    r3.A01 = C276094sY.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            List list = r3.A02;
            0qQ.A0A(list);
            C276104sZ r1 = r3.A01;
            0qQ.A0A(r1);
            r3.A00 = new C60907JtR(r1, list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
