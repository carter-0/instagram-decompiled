package X;

import java.io.IOException;

/* renamed from: X.Cap  reason: case insensitive filesystem */
public abstract class C44228Cap {
    public static BB1 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("more_available".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("next_max_id".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (bool != null || !(r7 instanceof 0c9)) {
                return new BB1(bool.booleanValue(), str);
            }
            AnonymousClass7TF.A1L("more_available", r7, "MusicPageInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
