package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class LJ2 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.LAi, java.lang.Object] */
    public static C63879LAi parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (IgReactMediaPickerNativeModule.HEIGHT.equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("url".equals(A17)) {
                    obj.A05 = 16h.A00(r4);
                } else if ("webp".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("mp4".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("size".equals(A17)) {
                    obj.A02 = r4.A0y();
                } else if ("webp_size".equals(A17)) {
                    obj.A04 = r4.A0y();
                } else if ("mp4_size".equals(A17)) {
                    obj.A03 = r4.A0y();
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

    public static void A00(17Z r3, C63879LAi lAi) {
        r3.A0c();
        r3.A0O(IgReactMediaPickerNativeModule.HEIGHT, lAi.A00);
        r3.A0O(IgReactMediaPickerNativeModule.WIDTH, lAi.A01);
        if (lAi.A05 != null) {
            r3.A0q("url");
            16h.A01(r3, lAi.A05);
        }
        String str = lAi.A07;
        if (str != null) {
            r3.A0R("webp", str);
        }
        String str2 = lAi.A06;
        if (str2 != null) {
            r3.A0R("mp4", str2);
        }
        r3.A0Q("size", lAi.A02);
        r3.A0Q("webp_size", lAi.A04);
        r3.A0Q("mp4_size", lAi.A03);
        r3.A0Z();
    }
}
