package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Mnu  reason: case insensitive filesystem */
public final class C67439Mnu {
    public static C67440Mnv parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C67440Mnv mnv = new C67440Mnv();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("list".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C67387Mn4 parseFromJson = C67386Mn3.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    mnv.A01 = arrayList;
                } else if ("cache_timeout_sec".equals(A0q)) {
                    mnv.A00 = r5.A1D();
                } else {
                    1XY.A01(r5, mnv, A0q);
                }
                r5.A0z();
            }
            return mnv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
