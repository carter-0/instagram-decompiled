package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Can  reason: case insensitive filesystem */
public abstract class C44226Can {
    public static CDF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Z(r4, A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C42060BFn parseFromJson = CbV.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A01 = arrayList;
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            List list = r3.A01;
            0qQ.A0A(list);
            r3.A00 = new BBR(list);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
