package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VoL  reason: case insensitive filesystem */
public final class C18254VoL {
    public static UXZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            UXZ uxz = new UXZ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("catalog_source_sections".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            WWJ parseFromJson = VHU.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    uxz.A01 = arrayList;
                } else if ("selected_catalog_id".equals(A17)) {
                    uxz.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, uxz, A17);
                }
                r4.A0z();
            }
            return uxz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
