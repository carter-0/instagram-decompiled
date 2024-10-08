package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class CWH {
    public static C53387GnJ parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (!"url".equals(A17)) {
                    num2 = C41847B3o.A13(r11, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                } else if (r11.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r11.A1P();
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.HEIGHT, r11, "ContentAppreciationGiftMediaInfo");
            } else if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("url", r11, "ContentAppreciationGiftMediaInfo");
            } else if (num2 != null || !(r11 instanceof 0c9)) {
                return new C53387GnJ(num.intValue(), str, num2.intValue(), 0);
            } else {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.WIDTH, r11, "ContentAppreciationGiftMediaInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
