package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public abstract class O3Q {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.OFj, java.lang.Object] */
    public static C70662OFj parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1E(A17)) {
                    obj.A01 = O3N.parseFromJson(r4);
                } else if ("first_paragraph".equals(A17)) {
                    obj.A00 = O3N.parseFromJson(r4);
                } else if ("policies".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C69651NpZ parseFromJson = O3R.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                r4.A0z();
            }
            if (obj.A02 != null) {
                return obj;
            }
            obj.A02 = Collections.emptyList();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
