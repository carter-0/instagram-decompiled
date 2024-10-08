package X;

import java.io.IOException;

/* renamed from: X.ClF  reason: case insensitive filesystem */
public abstract class C44803ClF {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Csm, java.lang.Object] */
    public static C45231Csm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45230Csl csl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("feedback_like_event".equals(AnonymousClass7TE.A17(r3))) {
                    csl = C44802ClE.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (csl == null) {
                return obj;
            }
            obj.A00 = csl;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
