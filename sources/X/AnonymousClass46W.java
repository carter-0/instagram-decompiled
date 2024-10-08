package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.46W  reason: invalid class name */
public abstract class AnonymousClass46W {
    public static AnonymousClass46X parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass46X r0 = new AnonymousClass46X();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("medias".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r5);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
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
