package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class A0U {
    public static A4G parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r4.A1J() != 16L.A09) {
                if ("transform_matrices".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            arrayList.add(AnonymousClass7TF.A0U(r4));
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r4.A0z();
            }
            A4G a4g = new A4G();
            if (arrayList != null) {
                a4g.A00 = arrayList;
            }
            return a4g;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
