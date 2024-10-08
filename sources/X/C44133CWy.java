package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CWy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44133CWy {
    public static Map A00(CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (creatorViewerSignalWithInsightsInfo.BE9() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerSignalWithInsightsInfo.BE9());
        }
        if (creatorViewerSignalWithInsightsInfo.BFx() != null) {
            A1H.put("image", creatorViewerSignalWithInsightsInfo.BFx());
        }
        if (creatorViewerSignalWithInsightsInfo.BHj() != null) {
            List<CreatorViewerInsightInfo> BHj = creatorViewerSignalWithInsightsInfo.BHj();
            ArrayList arrayList = null;
            if (BHj != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (CreatorViewerInsightInfo creatorViewerInsightInfo : BHj) {
                    if (creatorViewerInsightInfo != null) {
                        arrayList.add(creatorViewerInsightInfo.FHC());
                    }
                }
            }
            A1H.put("insights", arrayList);
        }
        if (creatorViewerSignalWithInsightsInfo.BwI() != null) {
            A1H.put("signal", creatorViewerSignalWithInsightsInfo.BwI().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
