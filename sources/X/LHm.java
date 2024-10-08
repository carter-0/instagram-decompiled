package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LHm {
    public static C61277K0o parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("stickers_metadata".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C63806L7m parseFromJson = C394189xg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A01 = arrayList;
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            List list = r3.A01;
            0qQ.A0A(list);
            r3.A00 = new C63606Kzu(list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
