package X;

import java.io.IOException;

/* renamed from: X.9yX  reason: invalid class name and case insensitive filesystem */
public abstract class C394699yX {
    public static C381809cM parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("file_path".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("duration_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("audio_asset_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("audio_cluster_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("file_path", r12, "SFXAudio");
            } else if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("duration_ms", r12, "SFXAudio");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_asset_id", r12, "SFXAudio");
            } else if (str3 != null || !(r12 instanceof 0c9)) {
                return new C381809cM(str, str2, str3, num.intValue());
            } else {
                AnonymousClass7TF.A1L("audio_cluster_id", r12, "SFXAudio");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
