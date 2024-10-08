package X;

import java.io.IOException;

/* renamed from: X.EcV  reason: case insensitive filesystem */
public abstract class C48312EcV {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.ExJ] */
    public static C49537ExJ parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1567).equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("one_tap_nonce".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(4172).equals(A17)) {
                    obj.A00 = AnonymousClass9GR.parseFromJson(r3);
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
