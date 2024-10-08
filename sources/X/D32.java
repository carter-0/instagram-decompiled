package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D32 {
    public static C43843CFj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C43843CFj cFj = new C43843CFj();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("high_profile_search_results".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            CU1 parseFromJson = C45157CrK.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cFj.A00 = arrayList;
                } else {
                    1XY.A01(r4, cFj, A17);
                }
                r4.A0z();
            }
            return cFj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
