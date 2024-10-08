package X;

import com.instagram.direct.model.textformatting.FormattedText;
import java.io.IOException;

/* renamed from: X.Ktq  reason: case insensitive filesystem */
public abstract class C63245Ktq {
    public static FormattedText parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            FormattedText formattedText = new FormattedText();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("offset".equals(A17)) {
                    formattedText.A01 = r3.A1D();
                } else if ("length".equals(A17)) {
                    formattedText.A00 = r3.A1D();
                } else if ("style".equals(A17)) {
                    formattedText.A02 = r3.A1D();
                }
                r3.A0z();
            }
            return formattedText;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
