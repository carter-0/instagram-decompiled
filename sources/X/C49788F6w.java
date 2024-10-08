package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F6w  reason: case insensitive filesystem */
public final class C49788F6w {
    public static C47351Dvl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("account_category_list".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r1.A01 = arrayList;
                } else if (AnonymousClass000.A00(1065).equals(A17)) {
                    r1.A00 = r5.A1D();
                } else {
                    1XY.A01(r5, r1, A17);
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
