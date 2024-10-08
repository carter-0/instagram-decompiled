package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cxw  reason: case insensitive filesystem */
public final class C45522Cxw {
    public static CE8 parseFromJson(16F r5) {
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
                if ("channel_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C2609147n parseFromJson = C2608747j.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r4.A03 = arrayList;
                } else if (C66579MXk.A00(118).equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if (C66579MXk.A00(119).equals(A17)) {
                    r4.A01 = AnonymousClass7TF.A0Z(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            List list = r4.A03;
            0qQ.A0A(list);
            r4.A00 = new N58(r4.A01, r4.A02, list);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
