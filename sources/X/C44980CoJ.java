package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoJ  reason: case insensitive filesystem */
public abstract class C44980CoJ {
    public static C45242Csx parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45242Csx csx = new C45242Csx();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("media_dicts".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1D(r4, arrayList);
                        }
                    }
                    csx.A00 = arrayList;
                }
                r4.A0z();
            }
            return csx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
