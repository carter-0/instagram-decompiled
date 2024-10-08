package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44157CXw {
    public static Map A00(GIFNoteResponseInfo gIFNoteResponseInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (gIFNoteResponseInfo.B9E() != null) {
            CommentGiphyMediaInfoIntf B9E = gIFNoteResponseInfo.B9E();
            if (B9E != null) {
                treeUpdaterJNI = B9E.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("gif_info", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
