package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.4vA  reason: invalid class name and case insensitive filesystem */
public abstract class C277434vA {
    public static C277444vB parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Integer num = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
            if (num == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "IgLiveDimensionsImpl");
            } else if (num2 != null || !(r7 instanceof 0c9)) {
                return new C277444vB(num.intValue(), num2.intValue());
            } else {
                ((0c9) r7).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "IgLiveDimensionsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
