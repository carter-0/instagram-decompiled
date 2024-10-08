package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D2d  reason: case insensitive filesystem */
public final class C45704D2d {
    public static CGL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGL cgl = new CGL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("tabs".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45087Cq5 parseFromJson = VHY.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cgl.A02 = arrayList;
                } else if ("sectional_items".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C61079JwH parseFromJson2 = Kx1.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    cgl.A01 = arrayList;
                } else if (C41845B3m.A1V(A17)) {
                    cgl.A03 = r4.A0d();
                } else if ("pagination_token".equals(A17)) {
                    cgl.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, cgl, A17);
                }
                r4.A0z();
            }
            return cgl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
