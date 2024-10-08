package X;

import java.io.IOException;

/* renamed from: X.Nwf  reason: case insensitive filesystem */
public abstract class C70063Nwf {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.ODt, java.lang.Object] */
    public static C70622ODt parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(1655).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
                } else if ("option_percentage".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("option_vote_count".equals(A17)) {
                    obj.A01 = r3.A1D();
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
