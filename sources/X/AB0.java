package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class AB0 {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.A6L] */
    public static A6L parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("url".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r6);
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A02 = str;
            }
            if (num != null) {
                obj.A01 = num.intValue();
            }
            if (num2 != null) {
                obj.A00 = num2.intValue();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, A6L a6l) {
        r2.A0c();
        String str = a6l.A02;
        if (str != null) {
            r2.A0R("url", str);
        }
        r2.A0P(IgReactMediaPickerNativeModule.WIDTH, a6l.A01);
        r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, a6l.A00);
        r2.A0Z();
    }
}
