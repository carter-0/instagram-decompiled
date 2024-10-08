package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cki  reason: case insensitive filesystem */
public abstract class C44771Cki {
    public static C45380CvM parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45380CvM cvM = new C45380CvM();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("body".equals(A17)) {
                    cvM.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("header".equals(A17)) {
                    cvM.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("photo".equals(A17)) {
                    cvM.A00 = C44770Ckh.parseFromJson(r4);
                } else if ("descriptions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    cvM.A03 = arrayList;
                }
                r4.A0z();
            }
            return cvM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
