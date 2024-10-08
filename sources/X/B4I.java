package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4I {
    public static Map A00(AdditionalCandidates additionalCandidates) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (additionalCandidates.B63() != null) {
            ExtendedImageUrl B63 = additionalCandidates.B63();
            if (B63 != null) {
                treeUpdaterJNI2 = B63.A00();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("first_frame", treeUpdaterJNI2);
        }
        if (additionalCandidates.BFm() != null) {
            ExtendedImageUrl BFm = additionalCandidates.BFm();
            if (BFm != null) {
                treeUpdaterJNI = BFm.A00();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("igtv_first_frame", treeUpdaterJNI);
        }
        if (additionalCandidates.Bwv() != null) {
            ExtendedImageUrl Bwv = additionalCandidates.Bwv();
            if (Bwv != null) {
                treeUpdaterJNI3 = Bwv.A00();
            }
            A1H.put("smart_frame", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
