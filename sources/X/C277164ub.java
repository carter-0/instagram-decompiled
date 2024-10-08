package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4ub  reason: invalid class name and case insensitive filesystem */
public final class C277164ub {
    public static C277154ua parseFromJson(16F r4) {
        String A1P;
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("media_ids".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            if (!(r4.A11() == 16L.A0G || (A1P = r4.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                } else {
                    1XY.A01(r4, r0, A0q);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
