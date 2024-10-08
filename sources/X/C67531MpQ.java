package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.MpQ  reason: case insensitive filesystem */
public final class C67531MpQ {
    public static C67532MpR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C67532MpR mpR = new C67532MpR();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("quick_replies".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C67569Mq3 parseFromJson = C67568Mq2.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    mpR.A01 = arrayList;
                } else if ("count".equals(A0q)) {
                    mpR.A00 = r4.A1D();
                } else {
                    OX9.A00(r4, mpR, A0q);
                }
                r4.A0z();
            }
            return mpR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
