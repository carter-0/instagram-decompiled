package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D30 {
    public static CG5 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("comments".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            1bK parseFromJson = AnonymousClass1Zw.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A02 = arrayList;
                } else if ("comment_count".equals(A17)) {
                    r4.A1D();
                } else if (AnonymousClass000.A00(624).equals(A17)) {
                    r1.A00 = AnonymousClass7TF.A0S(r4);
                } else if ("next_min_id".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
