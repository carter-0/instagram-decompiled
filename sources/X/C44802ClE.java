package X;

import java.io.IOException;

/* renamed from: X.ClE  reason: case insensitive filesystem */
public abstract class C44802ClE {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Csl, java.lang.Object] */
    public static C45230Csl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45401Cvh cvh = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("feedback".equals(AnonymousClass7TE.A17(r3))) {
                    cvh = C44804ClG.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (cvh == null) {
                return obj;
            }
            obj.A00 = cvh;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
