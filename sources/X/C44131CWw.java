package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44131CWw {
    public static Map A00(CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (creatorViewerSignalReelsTextDetails.C2X() != null) {
            FormattedString C2X = creatorViewerSignalReelsTextDetails.C2X();
            if (C2X != null) {
                treeUpdaterJNI = C2X.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("subtitle", treeUpdaterJNI);
        }
        if (creatorViewerSignalReelsTextDetails.C5D() != null) {
            ClipsTextFormatType C5D = creatorViewerSignalReelsTextDetails.C5D();
            if (C5D != null) {
                str = C5D.A00;
            }
            A1H.put("text_format_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
