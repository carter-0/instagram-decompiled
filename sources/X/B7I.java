package X;

import java.io.IOException;

public abstract class B7I {
    public static C61078JwG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("is_restricted".equals(A0q)) {
                    bool = Boolean.valueOf(r3.A0d());
                }
                r3.A0z();
            }
            return new C61078JwG((Object) bool, 33);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
