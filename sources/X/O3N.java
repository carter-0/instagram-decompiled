package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class O3N {
    public static C70754OKa parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C70754OKa oKa = new C70754OKa();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1A(A17)) {
                    oKa.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("markup".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C70632OEd parseFromJson = O3M.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    oKa.A01 = arrayList;
                }
                r4.A0z();
            }
            return oKa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
