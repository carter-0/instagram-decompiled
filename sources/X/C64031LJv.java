package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LJv  reason: case insensitive filesystem */
public final class C64031LJv {
    public static K1Y parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("component_feed".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C68169N3k parseFromJson = C70339O2r.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A02 = arrayList;
                } else if ("meta".equals(A17)) {
                    C61069Jw7 parseFromJson2 = C63445KxA.parseFromJson(r5);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A00 = parseFromJson2;
                } else if ("more_available".equals(A17)) {
                    r0.A03 = r5.A0d();
                } else if ("max_id".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
