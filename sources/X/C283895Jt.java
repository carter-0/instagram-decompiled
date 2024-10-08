package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Jt  reason: invalid class name and case insensitive filesystem */
public abstract class C283895Jt {
    public static C283905Ju parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C283905Ju r2 = new C283905Ju();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                String str = null;
                if ("uri".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r2.A03 = str;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    r2.A02 = Integer.valueOf(r4.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    r2.A01 = Integer.valueOf(r4.A1D());
                } else if ("scale".equals(A0q)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    r2.A04 = str;
                }
                r4.A0z();
            }
            r2.A00();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C283905Ju r3) {
        r2.A0c();
        String str = r3.A03;
        if (str != null) {
            r2.A0R("uri", str);
        }
        Integer num = r3.A02;
        if (num != null) {
            r2.A0P(IgReactMediaPickerNativeModule.WIDTH, num.intValue());
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            r2.A0P(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
        }
        String str2 = r3.A04;
        if (str2 != null) {
            r2.A0R("scale", str2);
        }
        r2.A0Z();
    }
}
