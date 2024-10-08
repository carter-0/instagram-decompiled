package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O2g  reason: case insensitive filesystem */
public abstract class C70328O2g {
    public static OEW parseFromJson(16F r4) {
        List A1C;
        0qQ.A0B(r4, 0);
        try {
            OEW oew = new OEW();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("preview_number".equals(A17)) {
                    oew.A00 = r4.A1D();
                } else if ("list".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C67365Mmh parseFromJson = C67364Mmg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    oew.A01 = arrayList;
                }
                r4.A0z();
            }
            List list = oew.A01;
            if (list != null) {
                A1C = C67393MnA.A00(C67394MnB.A00, list);
            } else {
                A1C = AnonymousClass7TE.A1C();
            }
            oew.A02 = A1C;
            return oew;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
