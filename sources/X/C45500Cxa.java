package X;

import com.instagram.api.schemas.Achievement;
import java.io.IOException;

/* renamed from: X.Cxa  reason: case insensitive filesystem */
public final class C45500Cxa {
    public static C43785CDd parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("achievement".equals(A17)) {
                    r3.A00 = CUN.parseFromJson(r4);
                } else if ("guidance_tip".equals(A17)) {
                    r3.A02 = CYJ.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            Achievement achievement = r3.A00;
            0qQ.A0A(achievement);
            r3.A01 = new C53429GoL(achievement, r3.A02);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
