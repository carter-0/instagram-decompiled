package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class CX2 {
    public static UMv parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (!"url".equals(A17)) {
                    num2 = C41847B3o.A13(r10, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                } else if (r10.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r10.A1P();
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.HEIGHT, r10, "CustomProfilePicUrlImpl");
            } else if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("url", r10, "CustomProfilePicUrlImpl");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new UMv(num.intValue(), str, num2.intValue());
            } else {
                AnonymousClass7TF.A1L(IgReactMediaPickerNativeModule.WIDTH, r10, "CustomProfilePicUrlImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
