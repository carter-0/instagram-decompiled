package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class VCO {
    public static VY5 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            VY5 vy5 = new VY5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    vy5.A00 = r3.A1D();
                } else if (C41845B3m.A1C(A17)) {
                    vy5.A01 = r3.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    vy5.A02 = r3.A1D();
                } else if ("url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vy5.A03 = str;
                }
                r3.A0z();
            }
            return vy5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
