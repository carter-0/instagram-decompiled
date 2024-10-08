package X;

import com.instagram.model.showreelnative.IgShowreelNativeAssetImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.5HB  reason: invalid class name */
public abstract class AnonymousClass5HB {
    public static IgShowreelNativeAssetImpl parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0q)) {
                    num = Integer.valueOf(r6.A1D());
                } else if ("url".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0q)) {
                    num2 = Integer.valueOf(r6.A1D());
                }
                r6.A0z();
            }
            return new IgShowreelNativeAssetImpl(num, num2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
