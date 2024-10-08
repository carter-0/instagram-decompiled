package X;

import java.io.IOException;

/* renamed from: X.Co1  reason: case insensitive filesystem */
public abstract class C44967Co1 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Csu, java.lang.Object] */
    public static C45239Csu parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (C41846B3n.A1Y(r3, r3.A0q())) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A00 = str;
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
