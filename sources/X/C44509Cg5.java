package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.Cg5  reason: case insensitive filesystem */
public abstract class C44509Cg5 {
    public static QP8 parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ImageInfoImpl imageInfoImpl = null;
            String str3 = null;
            String str4 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("audio_title".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (AnonymousClass000.A00(1177).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("image_versions2".equals(A17)) {
                    imageInfoImpl = 1dH.parseFromJson(r8);
                } else if ("template_clips_media_creator".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("template_title".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new QP8(imageInfoImpl, str2, str, str4, str3, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
