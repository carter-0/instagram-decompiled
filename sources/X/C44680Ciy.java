package X;

import java.io.IOException;

/* renamed from: X.Ciy  reason: case insensitive filesystem */
public abstract class C44680Ciy {
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.CTy] */
    public static C44055CTy parseFromJson(16F r5) {
        String A00;
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass4jH r2 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (true) {
                16L A1J = r5.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1888);
                if (A1J == r1) {
                    break;
                }
                if (C41846B3n.A1b(r5, A00)) {
                    r2 = C271594jG.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (r2 != null || !(r5 instanceof 0c9)) {
                0qQ.A0B(r2, 1);
                ? obj = new Object();
                obj.A00 = r2;
                return obj;
            }
            AnonymousClass7TF.A1L(A00, r5, "DirectThreadImageInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
