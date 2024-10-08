package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ci8  reason: case insensitive filesystem */
public abstract class C44630Ci8 {
    public static C61080JwI parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C61080JwI jwI = new C61080JwI(32);
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if (AnonymousClass000.A00(2702).equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C53368Gms parseFromJson = C44629Ci7.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    jwI.A00 = arrayList;
                }
                r5.A0z();
            }
            return jwI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
