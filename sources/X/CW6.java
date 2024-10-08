package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentGiphyMediaImagesIntf;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CW6 {
    public static Map A00(CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (commentGiphyMediaInfoIntf.B66() != null) {
            CommentGiphyMediaImagesIntf B66 = commentGiphyMediaInfoIntf.B66();
            if (B66 != null) {
                treeUpdaterJNI = B66.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("first_party_cdn_proxied_images", treeUpdaterJNI);
        }
        if (commentGiphyMediaInfoIntf.B9F() != null) {
            A1H.put("gif_media_id", commentGiphyMediaInfoIntf.B9F());
        }
        if (commentGiphyMediaInfoIntf.BGR() != null) {
            CommentGiphyMediaImagesIntf BGR = commentGiphyMediaInfoIntf.BGR();
            if (BGR != null) {
                treeUpdaterJNI2 = BGR.FHC();
            }
            A1H.put("images", treeUpdaterJNI2);
        }
        if (commentGiphyMediaInfoIntf.CcU() != null) {
            A1H.put("is_sticker", commentGiphyMediaInfoIntf.CcU());
        }
        if (commentGiphyMediaInfoIntf.getTitle() != null) {
            C41845B3m.A12(commentGiphyMediaInfoIntf.getTitle(), A1H);
        }
        if (commentGiphyMediaInfoIntf.getUsername() != null) {
            A1H.put(Dbk.A00(), commentGiphyMediaInfoIntf.getUsername());
        }
        return 0Yt.A0B(A1H);
    }
}
