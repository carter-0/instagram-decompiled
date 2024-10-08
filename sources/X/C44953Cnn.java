package X;

import java.io.IOException;

/* renamed from: X.Cnn  reason: case insensitive filesystem */
public abstract class C44953Cnn {
    public static C45304Cu8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45304Cu8 cu8 = new C45304Cu8();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("artist".equals(A17)) {
                    cu8.A00 = C44955Cnp.parseFromJson(r3);
                } else if ("track".equals(A17)) {
                    cu8.A01 = C44955Cnp.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cu8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
