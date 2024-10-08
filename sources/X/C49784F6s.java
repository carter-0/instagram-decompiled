package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F6s  reason: case insensitive filesystem */
public final class C49784F6s {
    public static DvB parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            DvB dvB = new DvB();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ndx_ig_steps".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dvB.A00 = arrayList;
                } else {
                    1XY.A01(r5, dvB, A17);
                }
                r5.A0z();
            }
            return dvB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
