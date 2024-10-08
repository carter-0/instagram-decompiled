package X;

import com.instagram.ui.text.TextColors;
import java.io.IOException;

public abstract class A1R {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Abt, java.lang.Object] */
    public static C40422Abt parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("text_colors".equals(A17)) {
                    TextColors parseFromJson = ABL.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("primary_color".equals(A17)) {
                    obj.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
