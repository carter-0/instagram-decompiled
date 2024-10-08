package X;

import java.io.IOException;

public abstract class VB5 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VRp, java.lang.Object] */
    public static C17336VRp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("hash".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("record_id".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
