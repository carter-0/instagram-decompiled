package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.F7t  reason: case insensitive filesystem */
public final class C49806F7t {
    public static DwT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            DwT dwT = new DwT();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    dwT.A07 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    dwT.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("media_igid".equals(A17)) {
                    dwT.A03 = AnonymousClass7TG.A0l(r3);
                } else if (Dbe.A00().equals(A17)) {
                    dwT.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("blocks_logging_data".equals(A17)) {
                    dwT.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("media_id".equals(A17)) {
                    dwT.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("reel_id".equals(A17)) {
                    dwT.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("author_id".equals(A17)) {
                    dwT.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("can_view".equals(A17)) {
                    dwT.A08 = r3.A0d();
                } else {
                    1XY.A01(r3, dwT, A17);
                }
                r3.A0z();
            }
            return dwT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
