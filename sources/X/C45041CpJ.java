package X;

import java.io.IOException;

/* renamed from: X.CpJ  reason: case insensitive filesystem */
public abstract class C45041CpJ {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Cvk] */
    public static C45404Cvk parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("ar_content".equals(A17)) {
                    obj.A00 = C45024Cp2.parseFromJson(r3);
                } else if ("media_content".equals(A17)) {
                    obj.A01 = C45037CpF.parseFromJson(r3);
                } else if ("product_image_content".equals(A17)) {
                    obj.A02 = C45038CpG.parseFromJson(r3);
                } else if ("product_video_content".equals(A17)) {
                    obj.A03 = C45039CpH.parseFromJson(r3);
                } else if ("reel_content".equals(A17)) {
                    obj.A04 = C45040CpI.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
