package X;

import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import java.io.IOException;

/* renamed from: X.Cf9  reason: case insensitive filesystem */
public abstract class C44451Cf9 {
    public static StoryTemplateFillableMusicStickerDictImpl parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            Float f5 = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (C41845B3m.A1S(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (C41845B3m.A1G(A17)) {
                    f = AnonymousClass7TF.A0U(r10);
                } else if (C41845B3m.A1K(A17)) {
                    f2 = AnonymousClass7TF.A0U(r10);
                } else if (C41845B3m.A1F(A17)) {
                    f3 = AnonymousClass7TF.A0U(r10);
                } else if (C41845B3m.A15(A17)) {
                    f4 = AnonymousClass7TF.A0U(r10);
                } else if (C41845B3m.A16(A17)) {
                    f5 = AnonymousClass7TF.A0U(r10);
                } else {
                    num = C41847B3o.A13(r10, num, A17, "z_index");
                }
                r10.A0z();
            }
            return new StoryTemplateFillableMusicStickerDictImpl(f, f2, f3, f4, f5, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
