package X;

import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import java.io.IOException;

/* renamed from: X.Cn9  reason: case insensitive filesystem */
public abstract class C44918Cn9 {
    public static DropsLaunchAnimation parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Boolean bool = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("show_animation".equals(AnonymousClass7TE.A17(r3))) {
                    bool = AnonymousClass7TF.A0S(r3);
                }
                r3.A0z();
            }
            return new DropsLaunchAnimation(bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
