package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5Em  reason: invalid class name and case insensitive filesystem */
public abstract class C282725Em {
    public static C282715El parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C282715El r0 = new C282715El();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("x".equals(A0q)) {
                    r0.A03 = new Float(r4.A0U());
                } else if ("y".equals(A0q)) {
                    r0.A04 = new Float(r4.A0U());
                } else if ("z".equals(A0q)) {
                    r0.A05 = Integer.valueOf(r4.A1D());
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    r0.A00 = new Float(r4.A0U());
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    r0.A02 = new Float(r4.A0U());
                } else if ("rotation".equals(A0q)) {
                    r0.A01 = new Float(r4.A0U());
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
