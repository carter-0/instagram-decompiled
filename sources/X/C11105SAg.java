package X;

import java.io.IOException;

/* renamed from: X.SAg  reason: case insensitive filesystem */
public final class C11105SAg {
    public static C8746R7k parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("can_create_linked_fundraiser".equals(A17)) {
                    r0.A03 = r3.A0d();
                } else if ("charity_picture_url".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("fundraiser_sticker_title".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("fundraiser_sticker_subtitle".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
