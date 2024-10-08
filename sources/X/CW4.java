package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CW4 {
    public static Map A00(CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (commentGiphyMediaFixedHeightImages.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, commentGiphyMediaFixedHeightImages.BCu());
        }
        if (commentGiphyMediaFixedHeightImages.BUJ() != null) {
            A1H.put("mp4", commentGiphyMediaFixedHeightImages.BUJ());
        }
        if (commentGiphyMediaFixedHeightImages.BUK() != null) {
            A1H.put("mp4_size", commentGiphyMediaFixedHeightImages.BUK());
        }
        if (commentGiphyMediaFixedHeightImages.Bwe() != null) {
            A1H.put("size", commentGiphyMediaFixedHeightImages.Bwe());
        }
        if (commentGiphyMediaFixedHeightImages.getUrl() != null) {
            C41845B3m.A0y(commentGiphyMediaFixedHeightImages.getUrl(), A1H);
        }
        if (commentGiphyMediaFixedHeightImages.CGK() != null) {
            A1H.put("webp", commentGiphyMediaFixedHeightImages.CGK());
        }
        if (commentGiphyMediaFixedHeightImages.CGL() != null) {
            A1H.put("webp_size", commentGiphyMediaFixedHeightImages.CGL());
        }
        if (commentGiphyMediaFixedHeightImages.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, commentGiphyMediaFixedHeightImages.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
