package X;

import java.io.IOException;

/* renamed from: X.Cno  reason: case insensitive filesystem */
public abstract class C44954Cno {
    public static C45237Css parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45237Css css = new C45237Css();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("track_item".equals(AnonymousClass7TE.A17(r3))) {
                    css.A00 = AnonymousClass3UP.parseFromJson(r3);
                }
                r3.A0z();
            }
            return css;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
