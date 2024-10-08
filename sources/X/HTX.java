package X;

import java.io.IOException;

public abstract class HTX {
    public static N4G parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(4036);
                if (A1J == r3) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (!"music_canonical_segment_id".equals(A17)) {
                    num = C41847B3o.A13(r8, num, A17, A00);
                } else if (r8.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r8.A1P();
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("music_canonical_segment_id", r8, "ClipsMusicCanonicalSegmentInfoImpl");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new N4G(str, num.intValue(), 4);
            } else {
                AnonymousClass7TF.A1L(A00, r8, "ClipsMusicCanonicalSegmentInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
