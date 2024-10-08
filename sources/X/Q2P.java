package X;

import java.io.IOException;

public abstract class Q2P {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Rox] */
    public static C10237Rox parseFromJson(16F r3) {
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
                if ("showreel_native_interactive_animation".equals(A0q)) {
                    obj.A00 = C14514Txa.parseFromJson(r3);
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
