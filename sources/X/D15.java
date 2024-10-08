package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D15 {
    public static CGT parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGT cgt = new CGT();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("categories".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C68272N8j parseFromJson = C44685CjB.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgt.A01 = arrayList;
                } else if ("suggested_users".equals(A17)) {
                    cgt.A00 = D13.parseFromJson(r5);
                } else {
                    1XY.A01(r5, cgt, A17);
                }
                r5.A0z();
            }
            return cgt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
