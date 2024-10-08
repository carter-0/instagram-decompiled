package X;

import java.io.IOException;

/* renamed from: X.9wE  reason: invalid class name and case insensitive filesystem */
public abstract class C393309wE {
    public static C53291Gld parseFromJson(16F r24) {
        16F r2 = r24;
        0qQ.A0B(r2, 0);
        try {
            Float f = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Float f2 = null;
            Integer num = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("downbeat_score".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r2);
                } else if ("is_downbeat".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("is_phrase".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r2);
                } else if ("is_strong".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r2);
                } else if ("is_twobar".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r2);
                } else if ("score".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r2);
                } else if ("time_in_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                }
                r2.A0z();
            }
            if (f == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("downbeat_score", r2, "BeatData");
            } else if (bool == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_downbeat", r2, "BeatData");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_phrase", r2, "BeatData");
            } else if (bool3 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_strong", r2, "BeatData");
            } else if (bool4 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_twobar", r2, "BeatData");
            } else if (f2 == null && (r2 instanceof 0c9)) {
                AnonymousClass7TF.A1L("score", r2, "BeatData");
            } else if (num != null || !(r2 instanceof 0c9)) {
                return new C53291Gld(f.floatValue(), f2.floatValue(), num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                AnonymousClass7TF.A1L("time_in_ms", r2, "BeatData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
