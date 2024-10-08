package X;

import java.io.IOException;

/* renamed from: X.Cpz  reason: case insensitive filesystem */
public abstract class C45082Cpz {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VWk] */
    public static C17457VWk parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("section_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A01 = A0l;
                } else if ("default_text".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A02 = A0l2;
                } else if ("destination".equals(A17)) {
                    obj.A00 = C45081Cpy.A00(AnonymousClass7TG.A0l(r4));
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
