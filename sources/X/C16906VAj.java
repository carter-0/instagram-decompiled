package X;

import java.io.IOException;

/* renamed from: X.VAj  reason: case insensitive filesystem */
public abstract class C16906VAj {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VMa] */
    public static C17196VMa parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("instagram".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = C16949VCb.parseFromJson(r3);
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
