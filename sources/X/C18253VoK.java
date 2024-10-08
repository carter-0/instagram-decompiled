package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VoK  reason: case insensitive filesystem */
public final class C18253VoK {
    public static UY4 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            UY4 uy4 = new UY4();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("catalog_source".equals(A17)) {
                    VHV.A00(AnonymousClass7TG.A0l(r4));
                } else if ("catalogs".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17462VWp parseFromJson = VHX.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    uy4.A01 = arrayList;
                } else if ("more_available".equals(A17)) {
                    uy4.A02 = r4.A0d();
                } else if ("next_max_id".equals(A17)) {
                    uy4.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, uy4, A17);
                }
                r4.A0z();
            }
            return uy4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
