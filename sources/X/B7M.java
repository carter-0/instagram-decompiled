package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class B7M {
    public static B7P parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if ("explore_diagonal_customizations".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C14413Tvi parseFromJson = B7O.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r4.A02 = arrayList;
                } else if ("explore_low_diagonal_customizations".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C14413Tvi parseFromJson2 = B7O.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r4.A03 = arrayList;
                } else if ("global_config".equals(A0q)) {
                    r4.A00 = B7N.parseFromJson(r5);
                } else {
                    1XY.A01(r5, r4, A0q);
                }
                r5.A0z();
            }
            List list = r4.A02;
            0qQ.A0A(list);
            List list2 = r4.A03;
            0qQ.A0A(list2);
            C14412Tvh tvh = r4.A00;
            0qQ.A0A(tvh);
            r4.A01 = new C14414Tvj(tvh, list, list2);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
