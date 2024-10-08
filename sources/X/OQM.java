package X;

import java.io.IOException;
import java.util.ArrayList;

public final class OQM {
    public static NGz parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NGz nGz = new NGz();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("badge_counts".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r5);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nGz.A00 = arrayList;
                } else {
                    1XY.A01(r5, nGz, A17);
                }
                r5.A0z();
            }
            return nGz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
