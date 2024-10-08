package X;

import java.io.IOException;

public abstract class A0G {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.A6o, java.lang.Object] */
    public static C39723A6o parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            A6L a6l = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            A6L a6l2 = null;
            A6L a6l3 = null;
            A6L a6l4 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("360p".equals(A17)) {
                    a6l = AB0.parseFromJson(r6);
                } else if ("480p".equals(A17)) {
                    a6l2 = AB0.parseFromJson(r6);
                } else if ("720p".equals(A17)) {
                    a6l3 = AB0.parseFromJson(r6);
                } else if ("1080p".equals(A17)) {
                    a6l4 = AB0.parseFromJson(r6);
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (a6l != null) {
                obj.A01 = a6l;
            }
            if (a6l2 != null) {
                obj.A02 = a6l2;
            }
            if (a6l3 != null) {
                obj.A03 = a6l3;
            }
            if (a6l4 == null) {
                return obj;
            }
            obj.A00 = a6l4;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
