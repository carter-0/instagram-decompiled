package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cl2  reason: case insensitive filesystem */
public abstract class C44791Cl2 {
    public static C45296Ctz parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45296Ctz ctz = new C45296Ctz();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1A(A17)) {
                    ctz.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("ranges".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45348Cuq parseFromJson = C44790Cl1.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ctz.A01 = arrayList;
                }
                r4.A0z();
            }
            return ctz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
