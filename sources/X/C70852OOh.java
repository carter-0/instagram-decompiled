package X;

import java.io.IOException;

/* renamed from: X.OOh  reason: case insensitive filesystem */
public final class C70852OOh {
    public static NHY parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            NHY nhy = new NHY();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("main_text".equals(A17)) {
                    nhy.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("animation_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r3);
                    C69321NjM njM = (C69321NjM) C69321NjM.A01.get(A0l);
                    if (njM != null) {
                        nhy.A02 = njM;
                    } else {
                        throw AnonymousClass7TF.A0W(AnonymousClass000.A00(128), A0l);
                    }
                } else if ("dismiss_text".equals(A17)) {
                    nhy.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("share_button_text".equals(A17)) {
                    nhy.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("story_text".equals(A17)) {
                    nhy.A08 = AnonymousClass7TG.A0l(r3);
                } else if ("promotion_id".equals(A17)) {
                    nhy.A06 = AnonymousClass7TG.A0l(r3);
                } else {
                    1XY.A01(r3, nhy, A17);
                }
                r3.A0z();
            }
            return nhy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
