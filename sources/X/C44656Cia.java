package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cia  reason: case insensitive filesystem */
public abstract class C44656Cia {
    public static C45210CsN parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45210CsN csN = new C45210CsN();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                if ("reactions".equals(AnonymousClass7TE.A17(r5))) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45277Ctg parseFromJson = C44655CiZ.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    csN.A00 = arrayList;
                }
                r5.A0z();
            }
            return csN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
