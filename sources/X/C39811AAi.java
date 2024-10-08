package X;

import java.io.IOException;

/* renamed from: X.AAi  reason: case insensitive filesystem */
public abstract class C39811AAi {
    public static C381669c8 parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Long l = null;
            Float f = null;
            String str = null;
            C381809cM r10 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("sfx_name".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("sfx_audio".equals(A17)) {
                    r10 = C394699yX.parseFromJson(r14);
                } else if ("start_time_ms".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r14);
                } else if ("volume".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r14);
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sfx_name", r14, "ClipsSoundEffect");
            } else if (r10 == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sfx_audio", r14, "ClipsSoundEffect");
            } else if (l == null && (r14 instanceof 0c9)) {
                AnonymousClass7TF.A1L("start_time_ms", r14, "ClipsSoundEffect");
            } else if (f != null || !(r14 instanceof 0c9)) {
                return new C381669c8(r10, str, f.floatValue(), l.longValue());
            } else {
                AnonymousClass7TF.A1L("volume", r14, "ClipsSoundEffect");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C381669c8 r4) {
        r3.A0c();
        String str = r4.A03;
        if (str != null) {
            r3.A0R("sfx_name", str);
        }
        C381809cM r2 = r4.A02;
        if (r2 != null) {
            r3.A0q("sfx_audio");
            r3.A0c();
            String str2 = r2.A04;
            if (str2 != null) {
                r3.A0R("file_path", str2);
            }
            r3.A0P("duration_ms", r2.A01);
            String str3 = r2.A02;
            if (str3 != null) {
                r3.A0R("audio_asset_id", str3);
            }
            String str4 = r2.A03;
            if (str4 != null) {
                r3.A0R("audio_cluster_id", str4);
            }
            r3.A0Z();
        }
        r3.A0Q("start_time_ms", r4.A01);
        r3.A0O("volume", r4.A00);
        r3.A0Z();
    }
}
