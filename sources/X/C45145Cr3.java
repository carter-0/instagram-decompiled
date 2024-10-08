package X;

import java.io.IOException;

/* renamed from: X.Cr3  reason: case insensitive filesystem */
public abstract class C45145Cr3 {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.CtK] */
    public static C45256CtK parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if (Dbe.A01().equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    obj.A00 = str;
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
