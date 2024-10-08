package X;

import java.io.IOException;

/* renamed from: X.Kvs  reason: case insensitive filesystem */
public abstract class C63371Kvs {
    public static RBC parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Long l = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Long l2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("target_segment_length_sec".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else if ("min_segment_length_sec".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r7);
                }
                r7.A0z();
            }
            if (l == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("target_segment_length_sec", r7, "SegmentedStrategyConfiguration");
            } else if (l2 != null || !(r7 instanceof 0c9)) {
                return new RBC(l.longValue(), l2.longValue());
            } else {
                AnonymousClass7TF.A1L("min_segment_length_sec", r7, "SegmentedStrategyConfiguration");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
