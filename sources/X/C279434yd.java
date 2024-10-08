package X;

import java.io.IOException;

/* renamed from: X.4yd  reason: invalid class name and case insensitive filesystem */
public abstract class C279434yd {
    public static C279444ye parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Long l = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("duration_in_ms".equals(A0q)) {
                    l = Long.valueOf(r7.A0y());
                } else if ("reusable_template_media_asset_end_time_ms".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("reusable_template_media_asset_start_time_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
            if (l != null || !(r7 instanceof 0c9)) {
                return new C279444ye(num, num2, l.longValue());
            }
            ((0c9) r7).A03.A00("duration_in_ms", "ClipsTemplateSegmentInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
