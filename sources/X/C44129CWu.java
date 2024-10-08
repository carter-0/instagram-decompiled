package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44129CWu {
    public static Map A00(CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerSignalPlainDetails.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerSignalPlainDetails.BE9());
        }
        if (creatorViewerSignalPlainDetails.C2X() != null) {
            FormattedString C2X = creatorViewerSignalPlainDetails.C2X();
            if (C2X != null) {
                treeUpdaterJNI = C2X.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("subtitle", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
