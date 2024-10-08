package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import java.io.IOException;

/* renamed from: X.4yg  reason: invalid class name and case insensitive filesystem */
public abstract class C279464yg {
    public static C279474yh parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ImageInfoImpl imageInfoImpl = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("image_versions2".equals(A0q)) {
                    imageInfoImpl = 1dH.parseFromJson(r9);
                } else if ("owner_username".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("template_media_id".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                ((0c9) r9).A03.A00("owner_username", "ClipsTemplateAttributionInfo");
            } else if (str2 != null || !(r9 instanceof 0c9)) {
                return new C279474yh(imageInfoImpl, str, str2);
            } else {
                ((0c9) r9).A03.A00("template_media_id", "ClipsTemplateAttributionInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
