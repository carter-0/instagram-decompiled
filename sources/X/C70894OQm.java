package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.IOException;

/* renamed from: X.OQm  reason: case insensitive filesystem */
public abstract class C70894OQm {
    public static C68137N2b parseFromJson(16F r9) {
        String A00;
        0qQ.A0B(r9, 0);
        try {
            DirectAnimatedMedia directAnimatedMedia = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            DirectAnimatedMedia directAnimatedMedia2 = null;
            Boolean bool = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1888);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if ("tray_preview_image".equals(A17)) {
                    directAnimatedMedia = C70893OQl.parseFromJson(r9);
                } else if (A00.equals(A17)) {
                    directAnimatedMedia2 = C70893OQl.parseFromJson(r9);
                } else {
                    bool = C41847B3o.A0z(r9, bool, A17, "is_trending");
                }
                r9.A0z();
            }
            if (directAnimatedMedia == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("tray_preview_image", r9, "GifSearchItem");
            } else if (directAnimatedMedia2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r9, "GifSearchItem");
            } else if (bool != null || !(r9 instanceof 0c9)) {
                return new C68137N2b(directAnimatedMedia, directAnimatedMedia2, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_trending", r9, "GifSearchItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C68137N2b n2b) {
        r2.A0c();
        DirectAnimatedMedia directAnimatedMedia = n2b.A01;
        if (directAnimatedMedia != null) {
            r2.A0q("tray_preview_image");
            C70893OQl.A00(r2, directAnimatedMedia);
        }
        DirectAnimatedMedia directAnimatedMedia2 = n2b.A00;
        if (directAnimatedMedia2 != null) {
            r2.A0q(AnonymousClass000.A00(1888));
            C70893OQl.A00(r2, directAnimatedMedia2);
        }
        r2.A0S("is_trending", n2b.A02);
        r2.A0Z();
    }
}
