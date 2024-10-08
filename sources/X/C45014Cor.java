package X;

import java.io.IOException;

/* renamed from: X.Cor  reason: case insensitive filesystem */
public abstract class C45014Cor {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ct0, java.lang.Object] */
    public static C45245Ct0 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (Dd6.A00().equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
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
