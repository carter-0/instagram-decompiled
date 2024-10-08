package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.AAz  reason: case insensitive filesystem */
public final class C39828AAz {
    public static C384549hV parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C384549hV r0 = new C384549hV();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("keywords".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A00 = arrayList;
                } else if ("disabled".equals(A17)) {
                    r5.A1D();
                } else {
                    1XY.A01(r5, r0, A17);
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
