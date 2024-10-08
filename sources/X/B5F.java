package X;

import java.io.IOException;
import java.util.ArrayList;

public final class B5F {
    public static B5G parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            B5G b5g = new B5G();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                ArrayList arrayList = null;
                if ("mid_cards".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C55892HpD parseFromJson = C45163CrQ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    b5g.A00 = arrayList;
                } else if ("mid_cards_v2".equals(A0q)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C53452Gok parseFromJson2 = C54808HTp.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    b5g.A01 = arrayList;
                } else {
                    1XY.A01(r4, b5g, A0q);
                }
                r4.A0z();
            }
            return b5g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
