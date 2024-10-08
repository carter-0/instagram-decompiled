package X;

import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.io.IOException;

public abstract class ABL {
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.ui.text.TextColors, java.lang.Object] */
    public static TextColors parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("color".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("shadow".equals(A17)) {
                    obj.A01 = A1W.parseFromJson(r3);
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

    public static void A00(17Z r3, TextColors textColors) {
        r3.A0c();
        r3.A0P("color", textColors.A00);
        if (textColors.A01 != null) {
            r3.A0q("shadow");
            TextShadow textShadow = textColors.A01;
            r3.A0c();
            r3.A0P("color", textShadow.A00);
            r3.A0P("distance_resource_id", textShadow.A01);
            r3.A0P("radius_resource_id", textShadow.A02);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
