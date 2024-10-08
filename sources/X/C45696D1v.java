package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D1v  reason: case insensitive filesystem */
public final class C45696D1v {
    public static CFS parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CFS cfs = new CFS();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("amplitudes".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            arrayList.add(AnonymousClass7TF.A0U(r5));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cfs.A00 = arrayList;
                } else {
                    1XY.A01(r5, cfs, A17);
                }
                r5.A0z();
            }
            return cfs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
