package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Chu  reason: case insensitive filesystem */
public abstract class C44622Chu {
    public static C45397Cvd parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45397Cvd cvd = new C45397Cvd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("answers".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45374CvG parseFromJson = C44618Chq.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cvd.A04 = arrayList;
                } else if ("qid".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    cvd.A01 = A0l;
                } else if (C41845B3m.A1E(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    cvd.A02 = A0l2;
                } else if ("total_resonders".equals(A17)) {
                    cvd.A00 = AnonymousClass7TF.A0X(r5);
                } else if (C41845B3m.A1C(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l3, 0);
                    cvd.A03 = A0l3;
                }
                r5.A0z();
            }
            return cvd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
