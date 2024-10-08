package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDs  reason: case insensitive filesystem */
public abstract class C16992VDs {
    public static C17347VSa parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17347VSa vSa = new C17347VSa();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("event".equals(A17)) {
                    vSa.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VSZ parseFromJson = C16991VDr.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vSa.A01 = arrayList;
                }
                r4.A0z();
            }
            return vSa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
