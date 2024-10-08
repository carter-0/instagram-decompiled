package X;

import java.io.IOException;

/* renamed from: X.CjE  reason: case insensitive filesystem */
public abstract class C44687CjE {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Cum] */
    public static C45344Cum parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("vc_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3056).equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(5332).equals(A17)) {
                    obj.A02 = r3.A0d();
                } else if ("thread_has_drop_in".equals(A17)) {
                    r3.A0d();
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
