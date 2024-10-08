package X;

import com.instagram.api.schemas.InlineStyleAtRangeDict;
import java.io.IOException;

/* renamed from: X.CZg  reason: case insensitive filesystem */
public abstract class C44193CZg {
    public static InlineStyleAtRangeDict parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("inline_style".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("length".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else {
                    num3 = C41847B3o.A13(r5, num3, A17, "offset");
                }
                r5.A0z();
            }
            return new InlineStyleAtRangeDict(num, num2, num3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
