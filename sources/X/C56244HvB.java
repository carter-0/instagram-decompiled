package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HvB  reason: case insensitive filesystem */
public final class C56244HvB {
    public static C54054Gyd parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C54054Gyd gyd = new C54054Gyd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("sections".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C55982Hqn parseFromJson = HWD.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    gyd.A00 = arrayList;
                } else {
                    1XY.A01(r5, gyd, A17);
                }
                r5.A0z();
            }
            return gyd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
