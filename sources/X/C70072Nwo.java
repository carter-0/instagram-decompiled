package X;

import java.io.IOException;

/* renamed from: X.Nwo  reason: case insensitive filesystem */
public abstract class C70072Nwo {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.OBp, java.lang.Object] */
    public static C70567OBp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("object_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("mime_type".equals(A17)) {
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
