package X;

import java.io.IOException;

/* renamed from: X.CmF  reason: case insensitive filesystem */
public abstract class C44864CmF {
    /* JADX WARNING: type inference failed for: r0v5, types: [X.Csq, java.lang.Object] */
    public static C45235Csq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            while (r4.A1J() != 16L.A09) {
                if ("bloks_app_id".equals(AnonymousClass7TE.A17(r4))) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
