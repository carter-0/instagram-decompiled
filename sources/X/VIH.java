package X;

import java.io.IOException;

public abstract class VIH {
    public static C19323WUf parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C19323WUf wUf = new C19323WUf();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("bounds_padding_for_underline".equals(A17)) {
                    wUf.A00 = r3.A1D();
                } else if ("hashtag".equals(A17)) {
                    wUf.A01 = C279594yt.parseFromJson(r3);
                }
                r3.A0z();
            }
            return wUf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
