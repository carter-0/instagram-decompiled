package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CzQ  reason: case insensitive filesystem */
public final class C45614CzQ {
    public static CEJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("has_more".equals(A17)) {
                    r4.A01 = AnonymousClass7TF.A0S(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        r4.A02 = AnonymousClass7TG.A0l(r5);
                    } else if ("users".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                BGA parseFromJson = C44305Ccn.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r4.A03 = arrayList;
                    } else {
                        1XY.A01(r5, r4, A17);
                    }
                }
                r5.A0z();
            }
            r4.A00 = new C60918Jtc(r4.A02, r4.A03, C41845B3m.A14(r4.A01));
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
