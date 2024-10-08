package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyY  reason: case insensitive filesystem */
public abstract class C70180NyY {
    public static C66231l1 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C66231l1 r0 = new C66231l1();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("recommended_user_ids".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                } else {
                    C66893Meb.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
