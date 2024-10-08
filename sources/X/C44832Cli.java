package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Cli  reason: case insensitive filesystem */
public abstract class C44832Cli {
    public static C53401GnY parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            SimpleImageUrl simpleImageUrl = null;
            Integer num2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A17(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("preview_payload".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("uri".equals(A17)) {
                    simpleImageUrl = 16h.A00(r8);
                } else {
                    num2 = C41847B3o.A13(r8, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                }
                r8.A0z();
            }
            return new C53401GnY(num, num2, simpleImageUrl, str, str2, 7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
