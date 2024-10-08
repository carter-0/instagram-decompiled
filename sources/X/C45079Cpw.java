package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cpw  reason: case insensitive filesystem */
public abstract class C45079Cpw {
    public static BBA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            BBA bba = new BBA();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("sectional_items".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61079JwH parseFromJson = Kx1.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    bba.A01 = arrayList;
                } else if ("pagination_token".equals(A17)) {
                    bba.A00 = AnonymousClass7TG.A0l(r5);
                } else if (C41845B3m.A1V(A17)) {
                    bba.A02 = r5.A0d();
                }
                r5.A0z();
            }
            return bba;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
