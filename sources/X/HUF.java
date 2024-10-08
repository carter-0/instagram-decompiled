package X;

import java.io.IOException;

public abstract class HUF {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Hhn, java.lang.Object] */
    public static C55443Hhn parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (AnonymousClass000.A00(2944).equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = HUE.parseFromJson(r3);
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
