package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWo  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44123CWo {
    public static Map A00(CreatorViewerSignalDetails creatorViewerSignalDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (creatorViewerSignalDetails.Ada() != null) {
            CreatorViewerSignalAudioDetails Ada = creatorViewerSignalDetails.Ada();
            if (Ada != null) {
                treeUpdaterJNI2 = Ada.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("audio_details", treeUpdaterJNI2);
        }
        if (creatorViewerSignalDetails.Bcu() != null) {
            CreatorViewerSignalPlainDetails Bcu = creatorViewerSignalDetails.Bcu();
            if (Bcu != null) {
                treeUpdaterJNI = Bcu.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("plain_details", treeUpdaterJNI);
        }
        if (creatorViewerSignalDetails.BlA() != null) {
            CreatorViewerSignalReelsTextDetails BlA = creatorViewerSignalDetails.BlA();
            if (BlA != null) {
                treeUpdaterJNI3 = BlA.FHC();
            }
            A1H.put("reels_text_details", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
