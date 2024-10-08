package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0l  reason: case insensitive filesystem */
public final class C45661D0l {
    public static CG1 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG1 cg1 = new CG1();
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
                    0qQ.A0B(arrayList, 0);
                    cg1.A01 = arrayList;
                } else if ("comment_count".equals(A17)) {
                    r5.A1D();
                } else if (AnonymousClass000.A00(624).equals(A17)) {
                    cg1.A02 = r5.A0d();
                } else if ("next_min_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    cg1.A00 = A0l;
                } else {
                    1XY.A01(r5, cg1, A17);
                }
                r5.A0z();
            }
            return cg1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
