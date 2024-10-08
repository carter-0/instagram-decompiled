package X;

import java.io.IOException;

/* renamed from: X.MeQ  reason: case insensitive filesystem */
public abstract class C66887MeQ {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.O7n] */
    public static C70462O7n parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("biz_thread_throttling_state".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    C254403sQ r1 = (C254403sQ) C254403sQ.A01.get(str);
                    if (r1 == null) {
                        r1 = C254403sQ.UNKNOWN;
                    }
                    obj.A00 = r1;
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
