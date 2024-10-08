package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HwM  reason: case insensitive filesystem */
public final class C56309HwM {
    public static C54067Gyq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C54067Gyq gyq = new C54067Gyq();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("translation".equals(A17)) {
                    gyq.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("comment_translations".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C55635Hku parseFromJson = C55007Hae.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    gyq.A01 = arrayList;
                } else {
                    1XY.A01(r4, gyq, A17);
                }
                r4.A0z();
            }
            return gyq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
