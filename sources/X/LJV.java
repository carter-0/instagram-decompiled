package X;

import java.io.IOException;

public abstract class LJV {
    public static K1X A00(16F r1) {
        0qQ.A0B(r1, 0);
        K1X parseFromJson = parseFromJson(r1);
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public static K1X parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("media".equals(A17)) {
                    r0.A00 = 1Xj.A00(r3);
                } else if ("cooldown_time_in_seconds".equals(A17)) {
                    r0.A03 = AnonymousClass7TF.A0X(r3);
                } else if ("retry_entire_upload_flow".equals(A17)) {
                    r0.A01 = AnonymousClass7TF.A0S(r3);
                } else if ("max_cutout_sticker_limit".equals(A17)) {
                    r0.A02 = AnonymousClass7TF.A0X(r3);
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
