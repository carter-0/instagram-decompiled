package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.3Om  reason: invalid class name and case insensitive filesystem */
public abstract class C241253Om {
    public static C241263On parseFromJson(16F r10) {
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
                ((0c9) r10).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "SUCustomProfilePicDictImpl");
            } else if (str == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("url", "SUCustomProfilePicDictImpl");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new C241263On(num.intValue(), str, num2.intValue());
            } else {
                ((0c9) r10).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "SUCustomProfilePicDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C241263On r3) {
        r2.A0c();
        r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, r3.A00);
        String str = r3.A02;
        if (str != null) {
            r2.A0R("url", str);
        }
        r2.A0P(IgReactMediaPickerNativeModule.WIDTH, r3.A01);
        r2.A0Z();
    }
}
