package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class OR6 {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.Gyv, X.Nfb] */
    public static C69152Nfb parseFromJson(16F r4) {
        List list;
        0qQ.A0B(r4, 0);
        try {
            ? gyv = new C54072Gyv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("list".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C67365Mmh parseFromJson = C67364Mmg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    gyv.A00 = arrayList;
                } else {
                    C55140Hco.A00(r4, gyv, A17);
                }
                r4.A0z();
            }
            List list2 = gyv.A00;
            if (list2 == null || (list = C67393MnA.A00(C67394MnB.A00, list2)) == null) {
                list = 0sn.A00;
            }
            gyv.A09 = list;
            return gyv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
