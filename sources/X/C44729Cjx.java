package X;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.Cjx  reason: case insensitive filesystem */
public abstract class C44729Cjx {
    public static CFJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("android_remote_cleanup_paths".equals(A17)) {
                    HashSet hashSet = null;
                    if (r4.A11() == 16L.A0C) {
                        hashSet = AnonymousClass7TE.A1F();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, hashSet);
                        }
                    }
                    r0.A00 = hashSet;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
