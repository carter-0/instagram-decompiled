package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LJD {
    public static C61281K0s parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("next_max_id".equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("sections".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61220JzD parseFromJson = C63320Kv3.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r4.A03 = arrayList;
                } else if ("summary".equals(A17)) {
                    r4.A01 = C63321Kv4.parseFromJson(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            String str = r4.A02;
            List list = r4.A03;
            0qQ.A0A(list);
            C61221JzE jzE = r4.A01;
            0qQ.A0A(jzE);
            r4.A00 = new C61216Jz9(jzE, str, list);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
