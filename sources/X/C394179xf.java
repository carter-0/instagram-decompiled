package X;

import com.instagram.common.gallery.Medium;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.9xf  reason: invalid class name and case insensitive filesystem */
public abstract class C394179xf {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Ael] */
    public static C40597Ael parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("medium".equals(A17)) {
                    Medium parseFromJson = C353258Gx.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A02 = parseFromJson;
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    obj.A01 = r4.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    obj.A00 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
