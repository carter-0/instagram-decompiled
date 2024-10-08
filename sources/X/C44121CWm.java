package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44121CWm {
    public static Map A00(CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (creatorViewerSignalAudioDetails.Adg() != null) {
            TrackOrOriginalSoundSchemaIntf Adg = creatorViewerSignalAudioDetails.Adg();
            if (Adg != null) {
                treeUpdaterJNI = Adg.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("audio_info", treeUpdaterJNI);
        }
        if (creatorViewerSignalAudioDetails.C2X() != null) {
            FormattedString C2X = creatorViewerSignalAudioDetails.C2X();
            if (C2X != null) {
                treeUpdaterJNI2 = C2X.FHC();
            }
            A1H.put("subtitle", treeUpdaterJNI2);
        }
        return 0Yt.A0B(A1H);
    }
}
