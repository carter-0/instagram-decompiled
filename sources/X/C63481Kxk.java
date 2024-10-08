package X;

import java.io.IOException;

/* renamed from: X.Kxk  reason: case insensitive filesystem */
public abstract class C63481Kxk {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.L8W] */
    public static L8W parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(546).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("comment_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("like_count".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("has_liked_comment".equals(A17)) {
                    obj.A03 = r3.A0d();
                } else if ("has_liked_user_id".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
