package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cfh  reason: case insensitive filesystem */
public abstract class C44485Cfh {
    public static N5K parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Z(r5, A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C47217Dt4 parseFromJson = C44483Cff.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1C(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new N5K(arrayList, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
