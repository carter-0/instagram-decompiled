package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Mnq  reason: case insensitive filesystem */
public abstract class C67435Mnq {
    public static C67436Mnr parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C67436Mnr mnr = new C67436Mnr();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("keywords".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C67387Mn4 parseFromJson = C67386Mn3.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    mnr.A00 = arrayList;
                }
                r5.A0z();
            }
            return mnr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
