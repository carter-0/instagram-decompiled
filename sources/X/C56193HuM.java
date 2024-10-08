package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HuM  reason: case insensitive filesystem */
public final class C56193HuM {
    public static C54076Gz0 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("more_available".equals(A17)) {
                    r1.A03 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(685).equals(A17)) {
                        r1.A00 = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(1351).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                arrayList.add(1Xg.A00(r4));
                            }
                        }
                        r1.A02 = arrayList;
                    } else if ("next_max_id".equals(A17)) {
                        r1.A01 = AnonymousClass7TG.A0l(r4);
                    } else {
                        1XY.A01(r4, r1, A17);
                    }
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
