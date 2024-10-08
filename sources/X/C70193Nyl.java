package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nyl  reason: case insensitive filesystem */
public abstract class C70193Nyl {
    public static C66301lq parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C66301lq r1 = new C66301lq();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C66580MXl.A1Z(A17)) {
                    r1.A00 = C66580MXl.A0h(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("item_ids".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r1.A02 = arrayList;
                    } else if (AnonymousClass000.A00(1661).equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r1.A01 = arrayList;
                    } else {
                        C66670Mad.A01(r5, r1, A17);
                    }
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
