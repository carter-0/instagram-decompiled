package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public abstract class CW5 {
    public static CommentGiphyMediaFixedHeightImagesImpl parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            Integer num4 = null;
            Integer num5 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (C41845B3m.A1G(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("mp4".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("mp4_size".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else if ("size".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r11);
                } else if (C41845B3m.A18(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("webp".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("webp_size".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r11);
                } else {
                    num5 = C41847B3o.A13(r11, num5, A17, IgReactMediaPickerNativeModule.WIDTH);
                }
                r11.A0z();
            }
            return new CommentGiphyMediaFixedHeightImagesImpl(num, num2, num3, num4, num5, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
