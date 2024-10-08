package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5jT  reason: invalid class name and case insensitive filesystem */
public final class C292755jT {
    public static C292745jS parseFromJson(16F r5) {
        String A1P;
        String A1P2;
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if ("valid_media_ids".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P2 = r5.A1P()) == null)) {
                                arrayList.add(A1P2);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else if ("invalid_media_ids".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                } else {
                    1XY.A01(r5, r0, A0q);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
