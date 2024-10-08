package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImagesImpl;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.Cy0  reason: case insensitive filesystem */
public abstract class C45526Cy0 {
    public static CommentGiphyMediaImages parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            CommentGiphyMediaFixedHeightImagesImpl commentGiphyMediaFixedHeightImagesImpl = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("fixed_height".equals(AnonymousClass7TE.A17(r3))) {
                    commentGiphyMediaFixedHeightImagesImpl = CW5.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new CommentGiphyMediaImages(commentGiphyMediaFixedHeightImagesImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, CommentGiphyMediaImages commentGiphyMediaImages) {
        r3.A0c();
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages = commentGiphyMediaImages.A00;
        if (commentGiphyMediaFixedHeightImages != null) {
            r3.A0q("fixed_height");
            CommentGiphyMediaFixedHeightImagesImpl F1v = commentGiphyMediaFixedHeightImages.F1v();
            r3.A0c();
            Integer num = F1v.A00;
            if (num != null) {
                r3.A0P(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
            }
            String str = F1v.A05;
            if (str != null) {
                r3.A0R("mp4", str);
            }
            Integer num2 = F1v.A01;
            if (num2 != null) {
                r3.A0P("mp4_size", num2.intValue());
            }
            Integer num3 = F1v.A02;
            if (num3 != null) {
                r3.A0P("size", num3.intValue());
            }
            String str2 = F1v.A06;
            if (str2 != null) {
                r3.A0R("url", str2);
            }
            String str3 = F1v.A07;
            if (str3 != null) {
                r3.A0R("webp", str3);
            }
            Integer num4 = F1v.A03;
            if (num4 != null) {
                r3.A0P("webp_size", num4.intValue());
            }
            Integer num5 = F1v.A04;
            if (num5 != null) {
                r3.A0P(IgReactMediaPickerNativeModule.WIDTH, num5.intValue());
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}
