package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mn9  reason: case insensitive filesystem */
public final class C67392Mn9 {
    public static NH9 parseFromJson(16F r4) {
        List list;
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("recent".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C67365Mmh parseFromJson = C67364Mmg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A00 = arrayList;
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            List list2 = r3.A00;
            if (list2 == null || (list = C67393MnA.A00(C67394MnB.A00, list2)) == null) {
                list = 0sn.A00;
            }
            r3.A01 = list;
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
