package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CWk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44119CWk {
    public static Map A00(C46307DUk dUk) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (dUk.AhI() != null) {
            CreatorViewerBottomCTA AhI = dUk.AhI();
            if (AhI != null) {
                treeUpdaterJNI = AhI.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("bottom_cta", treeUpdaterJNI);
        }
        if (dUk.AhK() != null) {
            List<CreatorViewerBottomCTA> AhK = dUk.AhK();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (CreatorViewerBottomCTA creatorViewerBottomCTA : AhK) {
                if (creatorViewerBottomCTA != null) {
                    A1C.add(creatorViewerBottomCTA.FHC());
                }
            }
            A1H.put("bottom_cta_list", A1C);
        }
        if (dUk.Aqv() != null) {
            CreatorViewerContextCTA Aqv = dUk.Aqv();
            if (Aqv != null) {
                treeUpdaterJNI2 = Aqv.FHC();
            }
            A1H.put("context_cta", treeUpdaterJNI2);
        }
        if (dUk.BwP() != null) {
            List<CreatorViewerSignalWithInsightsInfo> BwP = dUk.BwP();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo : BwP) {
                if (creatorViewerSignalWithInsightsInfo != null) {
                    A1C2.add(creatorViewerSignalWithInsightsInfo.FHC());
                }
            }
            A1H.put("signal_with_insights_list", A1C2);
        }
        if (dUk.BwR() != null) {
            List<CreatorViewerSignalModel> BwR = dUk.BwR();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            for (CreatorViewerSignalModel creatorViewerSignalModel : BwR) {
                if (creatorViewerSignalModel != null) {
                    A1C3.add(creatorViewerSignalModel.FHC());
                }
            }
            A1H.put("signals", A1C3);
        }
        if (dUk.getTitle() != null) {
            C41845B3m.A12(dUk.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
