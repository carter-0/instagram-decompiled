package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CzI  reason: case insensitive filesystem */
public final class C45606CzI {
    public static C43807CDz parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("has_public_channels".equals(A17)) {
                    r3.A01 = AnonymousClass7TF.A0S(r4);
                } else if ("pinned_channels_list".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C2609147n parseFromJson = C2608747j.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            Boolean bool = r3.A01;
            List list = r3.A02;
            0qQ.A0A(list);
            r3.A00 = new C242033Sj(bool, list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
