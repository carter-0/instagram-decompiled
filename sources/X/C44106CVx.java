package X;

import java.io.IOException;

/* renamed from: X.CVx  reason: case insensitive filesystem */
public abstract class C44106CVx {
    public static C61080JwI parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("has_winning_submissions".equals(AnonymousClass7TE.A17(r3))) {
                    bool = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return new C61080JwI((Object) bool, 14);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
