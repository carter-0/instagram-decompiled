package X;

import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CaL {
    public static Map A00(MediaVCRTappableDataIntf mediaVCRTappableDataIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        mediaVCRTappableDataIntf.getCanViewerLinkBackToOriginalMediaFromVcr();
        A1H.put("can_viewer_link_back_to_original_media_from_vcr", Boolean.valueOf(mediaVCRTappableDataIntf.getCanViewerLinkBackToOriginalMediaFromVcr()));
        if (mediaVCRTappableDataIntf.getEndBackgroundColor() != null) {
            A1H.put("end_background_color", mediaVCRTappableDataIntf.getEndBackgroundColor());
        }
        if (mediaVCRTappableDataIntf.B1i() != null) {
            C41846B3n.A1Q(mediaVCRTappableDataIntf.B1i(), A1H);
        }
        if (mediaVCRTappableDataIntf.BZ1() != null) {
            A1H.put("original_comment_author", mediaVCRTappableDataIntf.BZ1().A08());
        }
        if (mediaVCRTappableDataIntf.getOriginalCommentId() != null) {
            A1H.put("original_comment_id", mediaVCRTappableDataIntf.getOriginalCommentId());
        }
        if (mediaVCRTappableDataIntf.getOriginalCommentText() != null) {
            A1H.put("original_comment_text", mediaVCRTappableDataIntf.getOriginalCommentText());
        }
        if (mediaVCRTappableDataIntf.BZ7() != null) {
            A1H.put("original_media_code", mediaVCRTappableDataIntf.BZ7());
        }
        if (mediaVCRTappableDataIntf.getOriginalMediaId() != null) {
            A1H.put("original_media_id", mediaVCRTappableDataIntf.getOriginalMediaId());
        }
        if (mediaVCRTappableDataIntf.getStartBackgroundColor() != null) {
            A1H.put("start_background_color", mediaVCRTappableDataIntf.getStartBackgroundColor());
        }
        if (mediaVCRTappableDataIntf.Byt() != null) {
            C41846B3n.A1R(mediaVCRTappableDataIntf.Byt(), A1H);
        }
        if (mediaVCRTappableDataIntf.getTextColor() != null) {
            A1H.put("text_color", mediaVCRTappableDataIntf.getTextColor());
        }
        return 0Yt.A0B(A1H);
    }
}
