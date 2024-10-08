package X;

import java.io.IOException;

/* renamed from: X.Kue  reason: case insensitive filesystem */
public abstract class C63295Kue {
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Koc, java.lang.Object] */
    public static C62924Koc parseFromJson(16F r5) {
        String A00;
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (true) {
                16L A1J = r5.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1929);
                if (A1J == r1) {
                    break;
                }
                if (C41846B3n.A1b(r5, A00)) {
                    num = AnonymousClass7TF.A0X(r5);
                }
                r5.A0z();
            }
            if (num != null || !(r5 instanceof 0c9)) {
                int intValue = num.intValue();
                ? obj = new Object();
                obj.A00 = intValue;
                return obj;
            }
            AnonymousClass7TF.A1L(A00, r5, "IGTVSeenStateInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
