package X;

import com.instagram.api.schemas.IGAdScreenshotURLDataDictImpl;
import com.instagram.api.schemas.IGProjectPortalInfoDictImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.CYj  reason: case insensitive filesystem */
public abstract class C44170CYj {
    public static IGAdScreenshotURLDataDictImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl = null;
            String str2 = null;
            Integer num2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("dominant_color".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("media_background".equals(A17)) {
                    iGProjectPortalInfoDictImpl = CZG.parseFromJson(r8);
                } else if (!C41845B3m.A18(A17)) {
                    num2 = C41847B3o.A13(r8, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                } else if (r8.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r8.A1P();
                }
                r8.A0z();
            }
            return new IGAdScreenshotURLDataDictImpl(iGProjectPortalInfoDictImpl, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
