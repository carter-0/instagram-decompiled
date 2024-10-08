package X;

import java.io.IOException;

/* renamed from: X.9wV  reason: invalid class name and case insensitive filesystem */
public abstract class C393479wV {
    public static C375619Ej parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("enable_recs_from_friends".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("recs_from_friends_entry_point_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C375619Ej(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
