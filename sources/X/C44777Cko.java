package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cko  reason: case insensitive filesystem */
public abstract class C44777Cko {
    public static C45410Cvq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45410Cvq cvq = new C45410Cvq();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("primary_color".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("header".equals(A17)) {
                    cvq.A00 = C44763Cka.parseFromJson(r4);
                } else if ("how_it_works".equals(A17)) {
                    cvq.A01 = C44765Ckc.parseFromJson(r4);
                } else if ("overview".equals(A17)) {
                    cvq.A02 = C44768Ckf.parseFromJson(r4);
                } else if ("services".equals(A17)) {
                    cvq.A03 = C44772Ckj.parseFromJson(r4);
                } else if ("social_proof".equals(A17)) {
                    cvq.A04 = C44776Ckn.parseFromJson(r4);
                } else if ("incentives".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45345Cun parseFromJson = C44766Ckd.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cvq.A05 = arrayList;
                }
                r4.A0z();
            }
            return cvq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
