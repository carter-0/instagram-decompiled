package X;

import java.io.IOException;

/* renamed from: X.Nx3  reason: case insensitive filesystem */
public abstract class C70087Nx3 {
    public static OHR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            OHR ohr = new OHR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("item_id".equals(A17)) {
                    ohr.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("message_id".equals(A17)) {
                    ohr.A03 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(4114).equals(A17)) {
                    ohr.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("subtitle_text".equals(A17)) {
                    ohr.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("pinned_timestamp_ms".equals(A17)) {
                    ohr.A01 = AnonymousClass7TF.A0Z(r3);
                } else if ("preview_thumbnail_url".equals(A17)) {
                    ohr.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("is_deleted_for_self".equals(A17)) {
                    ohr.A00 = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return ohr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
