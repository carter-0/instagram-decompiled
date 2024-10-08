package X;

import java.io.IOException;

/* renamed from: X.ClD  reason: case insensitive filesystem */
public abstract class C44801ClD {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Csk] */
    public static C45229Csk parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("count".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = AnonymousClass7TF.A0X(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
