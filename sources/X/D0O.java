package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D0O {
    public static C43824CEq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r4, A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C60991Jun parseFromJson = C63053Kqi.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A06 = arrayList;
                } else if (C41845B3m.A1H(A0q)) {
                    r0.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("memories".equals(A0q)) {
                    r0.A00 = C44590ChO.parseFromJson(r4);
                } else if (C41845B3m.A1V(A0q)) {
                    r0.A01 = AnonymousClass7TF.A0S(r4);
                } else if ("num_results".equals(A0q)) {
                    r0.A02 = AnonymousClass7TF.A0Z(r4);
                } else if ("oldest_media_ts".equals(A0q)) {
                    r0.A03 = AnonymousClass7TF.A0Z(r4);
                } else if ("total_num_archive_media".equals(A0q)) {
                    r0.A04 = AnonymousClass7TF.A0Z(r4);
                } else {
                    1XY.A01(r4, r0, A0q);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
