package X;

import java.io.IOException;

/* renamed from: X.9xh  reason: invalid class name and case insensitive filesystem */
public abstract class C394199xh {
    public static C40607Aev parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C40607Aev aev = new C40607Aev();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("medium".equals(A17)) {
                    aev.A06 = C353258Gx.parseFromJson(r4);
                } else if ("product_type".equals(A17)) {
                    C391149sQ r1 = (C391149sQ) C391149sQ.A01.get(r4.A1Q());
                    if (r1 == null) {
                        r1 = C391149sQ.UNKNOWN;
                    }
                    aev.A07 = r1;
                } else if ("max_width".equals(A17)) {
                    aev.A02 = r4.A1D();
                } else if ("max_height".equals(A17)) {
                    aev.A01 = r4.A1D();
                } else if ("volume".equals(A17)) {
                    aev.A00 = (float) r4.A0U();
                } else if ("clips_remix_layout_type".equals(A17)) {
                    C391099sL r12 = (C391099sL) C391099sL.A01.get(r4.A1Q());
                    if (r12 == null) {
                        r12 = C391099sL.NOT_CLIPS;
                    }
                    aev.A08 = r12;
                } else if ("is_mirrored".equals(A17)) {
                    aev.A09 = r4.A0d();
                } else if ("should_use_new_transcoding_flow".equals(A17)) {
                    aev.A0A = r4.A0d();
                } else if ("corner_radii".equals(A17)) {
                    aev.A05 = C394139xb.parseFromJson(r4);
                } else if ("time_interval_start_time_ms".equals(A17)) {
                    aev.A04 = r4.A1D();
                } else if ("time_interval_end_time_ms".equals(A17)) {
                    aev.A03 = r4.A1D();
                }
                r4.A0z();
            }
            return aev;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
