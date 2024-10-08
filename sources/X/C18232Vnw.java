package X;

import java.io.IOException;

/* renamed from: X.Vnw  reason: case insensitive filesystem */
public final class C18232Vnw {
    public static C15245UXf parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("pageInfo".equals(A17)) {
                    C17698VcT parseFromJson = VFD.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    r0.A02 = parseFromJson;
                } else if ("learnMoreInfo".equals(A17)) {
                    VYF parseFromJson2 = VFB.parseFromJson(r4);
                    0qQ.A0B(parseFromJson2, 0);
                    r0.A01 = parseFromJson2;
                } else if ("media_or_ad".equals(A17)) {
                    r0.A00 = 1Xj.A00(r4);
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
