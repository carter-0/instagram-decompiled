package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class VCL {
    public static C17432VVl parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C17432VVl vVl = new C17432VVl();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    vVl.A00 = r3.A1D();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    vVl.A01 = r3.A1D();
                } else if ("url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    vVl.A02 = str;
                }
                r3.A0z();
            }
            return vVl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
