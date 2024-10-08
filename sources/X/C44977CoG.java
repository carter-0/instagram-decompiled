package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoG  reason: case insensitive filesystem */
public abstract class C44977CoG {
    public static C42136BIr parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            Boolean bool = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("donations".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C42135BIq parseFromJson = C44975CoE.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (!C41845B3m.A1H(A17)) {
                    bool = C41847B3o.A0z(r6, bool, A17, "more_available");
                } else if (r6.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r6.A1P();
                }
                r6.A0z();
            }
            return new C42136BIr(bool, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
