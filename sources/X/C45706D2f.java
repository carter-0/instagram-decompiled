package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2f  reason: case insensitive filesystem */
public final class C45706D2f {
    public static CGH parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGH cgh = new CGH();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("data".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C39746A7m parseFromJson = A0I.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgh.A01 = arrayList;
                } else if ("meta".equals(A17)) {
                    cgh.A00 = C45110CqS.parseFromJson(r5);
                } else {
                    1XY.A01(r5, cgh, A17);
                }
                r5.A0z();
            }
            return cgh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
