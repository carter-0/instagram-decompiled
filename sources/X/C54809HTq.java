package X;

import java.io.IOException;

/* renamed from: X.HTq  reason: case insensitive filesystem */
public abstract class C54809HTq {
    public static C53453Gol parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C53440GoY goY = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("draft_midcard_fallback_metadata".equals(AnonymousClass7TE.A17(r3))) {
                    goY = C54794HTb.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C53453Gol(goY);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
