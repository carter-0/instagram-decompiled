package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import java.io.IOException;

public abstract class HTO {
    public static C53435GoS parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            SoundPlatformProduct soundPlatformProduct = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("body_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("sound_platform_product".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    soundPlatformProduct = (SoundPlatformProduct) SoundPlatformProduct.A01.get(str);
                    if (soundPlatformProduct == null) {
                        soundPlatformProduct = SoundPlatformProduct.UNRECOGNIZED;
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("body_text", r8, "AudioGoDarkInfoTextImpl");
            } else if (soundPlatformProduct != null || !(r8 instanceof 0c9)) {
                return new C53435GoS(soundPlatformProduct, str2);
            } else {
                AnonymousClass7TF.A1L("sound_platform_product", r8, "AudioGoDarkInfoTextImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
