package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CWf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44114CWf {
    public static Map A00(CreatorViewerContextCTA creatorViewerContextCTA) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerContextCTA.Aqw() != null) {
            CreatorViewerContextCTAType Aqw = creatorViewerContextCTA.Aqw();
            0qQ.A0B(Aqw, 0);
            A1H.put("context_cta_type", Aqw.A00);
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (creatorViewerContextCTA.AtQ() != null) {
            CreatorViewerContextCTATarget AtQ = creatorViewerContextCTA.AtQ();
            if (AtQ != null) {
                str = AtQ.A00;
            } else {
                str = null;
            }
            A1H.put("cta_target", str);
        }
        if (creatorViewerContextCTA.B31() != null) {
            FormattedString B31 = creatorViewerContextCTA.B31();
            if (B31 != null) {
                treeUpdaterJNI = B31.FHC();
            }
            A1H.put("extended_text", treeUpdaterJNI);
        }
        if (creatorViewerContextCTA.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerContextCTA.BE9());
        }
        if (creatorViewerContextCTA.getText() != null) {
            C41845B3m.A10(creatorViewerContextCTA.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
