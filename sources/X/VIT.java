package X;

import java.io.IOException;

public abstract class VIT {
    public static C19334WUq parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            C19334WUq wUq = new C19334WUq();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("primary_color".equals(A17)) {
                    wUq.A03 = r5.A1D();
                } else if ("secondary_color".equals(A17)) {
                    wUq.A04 = r5.A1D();
                } else if ("text_emphasis_mode".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    wUq.A05 = A1S.A00(str);
                } else if ("top_padding_ratio".equals(A17)) {
                    wUq.A02 = (float) r5.A0U();
                } else if ("bottom_padding_ratio".equals(A17)) {
                    wUq.A00 = (float) r5.A0U();
                } else if ("horizontal_padding_ratio".equals(A17)) {
                    wUq.A01 = (float) r5.A0U();
                } else if ("emphasis_rect".equals(A17)) {
                    C17512VYq parseFromJson = C18276Vor.parseFromJson(r5);
                    0qQ.A0B(parseFromJson, 0);
                    wUq.A06 = parseFromJson;
                }
                r5.A0z();
            }
            return wUq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
