package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2v  reason: case insensitive filesystem */
public final class C45722D2v {
    public static CG0 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG0 cg0 = new CG0();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("broadcasts".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C270194gL parseFromJson = C45893D9w.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg0.A00 = arrayList;
                } else if ("post_lives".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            CGB parseFromJson2 = C44826Clc.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg0.A01 = arrayList;
                } else {
                    1XY.A01(r5, cg0, A17);
                }
                r5.A0z();
            }
            return cg0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
