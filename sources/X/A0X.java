package X;

import com.instagram.model.shopping.reels.InstagramShopLink;
import java.io.IOException;

public abstract class A0X {
    public static InstagramShopLink parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            InstagramShopLink instagramShopLink = new InstagramShopLink();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("is_enabled".equals(AnonymousClass7TE.A17(r3))) {
                    instagramShopLink.A00 = r3.A0d();
                }
                r3.A0z();
            }
            return instagramShopLink;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
