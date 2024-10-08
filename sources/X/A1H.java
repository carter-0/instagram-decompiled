package X;

import java.io.IOException;

public abstract class A1H {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.A4T, java.lang.Object] */
    public static A4T parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("signal_to_decision_maker".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = r3.A1D();
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
