package X;

import java.io.IOException;

/* renamed from: X.LGx  reason: case insensitive filesystem */
public abstract class C63980LGx {
    public static C61100JxB parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("scheduled_publish_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("uuc_id".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C61100JxB(num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C61100JxB jxB) {
        r2.A0c();
        Integer num = jxB.A00;
        if (num != null) {
            r2.A0P("scheduled_publish_time", num.intValue());
        }
        String str = jxB.A01;
        if (str != null) {
            r2.A0R("uuc_id", str);
        }
        r2.A0Z();
    }
}
