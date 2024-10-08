package X;

import java.io.IOException;

/* renamed from: X.EqB  reason: case insensitive filesystem */
public abstract class C49144EqB {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.EyK] */
    public static EyK parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("button_text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A01 = A0l;
                } else if ("destination".equals(A17)) {
                    C48102EVu eVu = (C48102EVu) C48102EVu.A01.get(AnonymousClass7TG.A0l(r4));
                    if (eVu == null) {
                        eVu = C48102EVu.DISMISS;
                    }
                    obj.A00 = eVu;
                } else if ("url".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
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
