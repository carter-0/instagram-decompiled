package X;

import java.io.IOException;
import java.util.ArrayList;

public final class OPB {
    public static NHK parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            NHK nhk = new NHK();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("icebreakers".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C70814OMj parseFromJson = C69917NuJ.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    nhk.A01 = arrayList;
                } else if ("enabled".equals(A17)) {
                    nhk.A02 = r4.A0d();
                } else if ("persistent_menu_enabled".equals(A17)) {
                    nhk.A03 = r4.A0d();
                } else if ("has_msgr_icebreakers".equals(A17)) {
                    nhk.A00 = AnonymousClass7TF.A0S(r4);
                } else if ("vertical_category_id".equals(A17)) {
                    r4.A0y();
                } else {
                    1XY.A01(r4, nhk, A17);
                }
                r4.A0z();
            }
            return nhk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
