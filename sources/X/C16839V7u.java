package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.V7u  reason: case insensitive filesystem */
public abstract class C16839V7u {
    public static UNJ parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("border_color".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("border_width_float".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r9);
                } else if ("corner_radius".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r9);
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if (!"url".equals(A17)) {
                    num2 = C41847B3o.A13(r9, num2, A17, IgReactMediaPickerNativeModule.WIDTH);
                } else if (r9.A11() == 16L.A0G) {
                    str2 = null;
                } else {
                    str2 = r9.A1P();
                }
                r9.A0z();
            }
            return new UNJ(f, f2, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
