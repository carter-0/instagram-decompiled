package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0k  reason: case insensitive filesystem */
public final class C45660D0k {
    public static CFC parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CFC cfc = new CFC();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("member_count".equals(A17)) {
                    r5.A1D();
                } else if ("friend_lists".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61113JxP parseFromJson = C44252Cbn.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cfc.A00 = arrayList;
                } else {
                    1XY.A01(r5, cfc, A17);
                }
                r5.A0z();
            }
            return cfc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
