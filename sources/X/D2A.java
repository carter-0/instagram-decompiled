package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D2A {
    public static C43823CEp parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("comments".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            1bK parseFromJson = AnonymousClass1Zw.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r4.A03 = arrayList;
                } else if ("has_more_comments".equals(A17)) {
                    r4.A01 = AnonymousClass7TF.A0S(r5);
                } else if ("next_min_id".equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            List list = r4.A03;
            0qQ.A0A(list);
            r4.A00 = new C60920Jte(r4.A02, list, C41845B3m.A14(r4.A01));
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
