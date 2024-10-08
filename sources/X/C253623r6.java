package X;

import com.instagram.api.schemas.ProfilePicUrlInfoImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.3r6  reason: invalid class name and case insensitive filesystem */
public abstract class C253623r6 {
    public static ProfilePicUrlInfoImpl parseFromJson(16F r10) {
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
                String A0q = r10.A0q();
                r10.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("url".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "ProfilePicUrlInfoImpl");
            } else if (str == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("url", "ProfilePicUrlInfoImpl");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new ProfilePicUrlInfoImpl(num.intValue(), str, num2.intValue());
            } else {
                ((0c9) r10).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "ProfilePicUrlInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
