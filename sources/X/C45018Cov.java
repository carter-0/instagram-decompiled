package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cov  reason: case insensitive filesystem */
public abstract class C45018Cov {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CuG, java.lang.Object] */
    public static C45312CuG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r5, A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            arrayList.add(1Xg.A00(r5));
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    obj.A00 = arrayList;
                } else if ("next_max_id".equals(A0q)) {
                    C41846B3n.A1A(r5);
                } else if (C41845B3m.A1V(A0q)) {
                    obj.A01 = r5.A0d();
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
