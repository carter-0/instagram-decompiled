package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.CiF  reason: case insensitive filesystem */
public abstract class C44636CiF {
    public static GSY parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            N49 n49 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (C41845B3m.A1Q(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("render_position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if ("themed_image_url".equals(A17)) {
                    n49 = C44643CiN.parseFromJson(r10);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (n49 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("themed_image_url", r10, "ImageInfo");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new GSY(n49, num, str2, str);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "ImageInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
