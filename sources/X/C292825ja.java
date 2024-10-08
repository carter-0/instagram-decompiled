package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5ja  reason: invalid class name and case insensitive filesystem */
public abstract class C292825ja {
    public static C294065ln parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            Integer num2 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                } else if ("scans_profile".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("url".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r12.A1D());
                }
                r12.A0z();
            }
            if (num == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00(IgReactMediaPickerNativeModule.HEIGHT, "ReelCoverImageInfo");
            } else if (str == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00("scans_profile", "ReelCoverImageInfo");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00("url", "ReelCoverImageInfo");
            } else if (num2 != null || !(r12 instanceof 0c9)) {
                return new C294065ln(num.intValue(), str, str2, num2.intValue());
            } else {
                ((0c9) r12).A03.A00(IgReactMediaPickerNativeModule.WIDTH, "ReelCoverImageInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C294065ln r3) {
        r2.A0c();
        r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, r3.A00);
        String str = r3.A02;
        if (str != null) {
            r2.A0R("scans_profile", str);
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("url", str2);
        }
        r2.A0P(IgReactMediaPickerNativeModule.WIDTH, r3.A01);
        r2.A0Z();
    }
}
