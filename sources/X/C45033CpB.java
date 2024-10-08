package X;

import java.io.IOException;

/* renamed from: X.CpB  reason: case insensitive filesystem */
public abstract class C45033CpB {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CvW, java.lang.Object] */
    public static C45390CvW parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("pending_content".equals(A17)) {
                    obj.A02 = C45083Cq0.parseFromJson(r3);
                } else if ("approved_content".equals(A17)) {
                    obj.A00 = C45083Cq0.parseFromJson(r3);
                } else if ("declined_content".equals(A17)) {
                    obj.A01 = C45083Cq0.parseFromJson(r3);
                } else if (AnonymousClass000.A00(4999).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A03 = str;
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
