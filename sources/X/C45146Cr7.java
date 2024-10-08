package X;

import java.io.IOException;

/* renamed from: X.Cr7  reason: case insensitive filesystem */
public abstract class C45146Cr7 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CuP, java.lang.Object] */
    public static C45321CuP parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("payload".equals(A17)) {
                    C45458Cwp parseFromJson = Cr6.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                } else if ("binaryPayload".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    obj.A01 = str;
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
