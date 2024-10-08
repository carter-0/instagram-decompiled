package X;

import java.io.IOException;

public abstract class VCS {
    public static C17631VbN parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17631VbN vbN = new C17631VbN();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("max_lines".equals(A17)) {
                    vbN.A00 = r3.A1D();
                } else if ("capitalization_style".equals(A17)) {
                    vbN.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("font_family".equals(A17)) {
                    vbN.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("font_size".equals(A17)) {
                    vbN.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("line_height".equals(A17)) {
                    vbN.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("text_color".equals(A17)) {
                    vbN.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("word_kerning".equals(A17)) {
                    vbN.A06 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return vbN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
