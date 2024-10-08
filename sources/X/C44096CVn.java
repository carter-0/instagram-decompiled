package X;

import java.io.IOException;

/* renamed from: X.CVn  reason: case insensitive filesystem */
public abstract class C44096CVn {
    public static BEH parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Long l = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("effect_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r7);
                } else {
                    num = C41847B3o.A13(r7, num, A17, "segment_index");
                }
                r7.A0z();
            }
            if (l == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("effect_id", r7, "ClipsTemplateSegmentEffectInfo");
            } else if (num != null || !(r7 instanceof 0c9)) {
                return new BEH(l.longValue(), num.intValue());
            } else {
                AnonymousClass7TF.A1L("segment_index", r7, "ClipsTemplateSegmentEffectInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
