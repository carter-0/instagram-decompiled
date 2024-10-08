package X;

import java.io.IOException;

/* renamed from: X.D0m  reason: case insensitive filesystem */
public abstract class C45662D0m {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.3xe, java.lang.Object] */
    public static C257593xe parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C270864hR r3 = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("layout".equals(A17)) {
                    r3 = C276404tH.A00(r5);
                } else if ("payload".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            obj.A00 = r3;
            obj.A01 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C257593xe r3) {
        r2.A0c();
        C270864hR r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("layout");
            C276404tH.A02(r2, r1);
        }
        String str = r3.A01;
        if (str != null) {
            r2.A0R("payload", str);
        }
        r2.A0Z();
    }
}
