package X;

import java.io.IOException;

/* renamed from: X.VFp  reason: case insensitive filesystem */
public abstract class C17041VFp {
    public static C40606Aeu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C40606Aeu aeu = new C40606Aeu();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("first_option_string".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    aeu.A05 = A0l;
                } else if ("second_option_string".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    aeu.A07 = A0l2;
                } else if ("first_option_text_size".equals(A17)) {
                    aeu.A00 = (float) r5.A0U();
                } else if ("second_option_text_size".equals(A17)) {
                    aeu.A02 = (float) r5.A0U();
                } else if ("question".equals(A17)) {
                    aeu.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("question_text_size".equals(A17)) {
                    aeu.A01 = (float) r5.A0U();
                } else if ("question_max_width".equals(A17)) {
                    aeu.A03 = r5.A1D();
                } else if ("question_padding_bottom".equals(A17)) {
                    aeu.A04 = r5.A1D();
                }
                r5.A0z();
            }
            return aeu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
