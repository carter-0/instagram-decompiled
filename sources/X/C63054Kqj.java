package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Kqj  reason: case insensitive filesystem */
public abstract class C63054Kqj {
    public static C61065Jw3 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61065Jw3 jw3 = new C61065Jw3();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    jw3.A01 = r3.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    jw3.A00 = r3.A1D();
                } else if ("url".equals(A17)) {
                    jw3.A02 = 16h.A00(r3);
                }
                r3.A0z();
            }
            return jw3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
