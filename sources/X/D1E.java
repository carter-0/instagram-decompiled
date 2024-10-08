package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D1E {
    public static CGN parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGN cgn = new CGN();
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
                            arrayList.add(1Xg.A00(r4));
                        }
                    }
                    cgn.A05 = arrayList;
                } else if (C41845B3m.A1V(A0q)) {
                    cgn.A07 = r4.A0d();
                } else if (AnonymousClass000.A00(44).equals(A0q)) {
                    cgn.A06 = r4.A0d();
                } else if ("next_max_id".equals(A0q)) {
                    cgn.A03 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(2777).equals(A0q)) {
                    cgn.A02 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(2776).equals(A0q)) {
                    cgn.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("client_gap_enforcer_matrix".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45215CsT parseFromJson = C44724Cjs.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cgn.A04 = arrayList;
                } else {
                    1XY.A01(r4, cgn, A0q);
                }
                r4.A0z();
            }
            return cgn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
