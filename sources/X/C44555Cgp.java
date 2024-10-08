package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithTextIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cgp  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44555Cgp {
    public static Map A00(UntaggableReasonIntf untaggableReasonIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (untaggableReasonIntf.AYC() != null) {
            LinkWithTextIntf AYC = untaggableReasonIntf.AYC();
            if (AYC != null) {
                treeUpdaterJNI2 = AYC.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("action", treeUpdaterJNI2);
        }
        if (untaggableReasonIntf.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, untaggableReasonIntf.getDescription());
        }
        if (untaggableReasonIntf.BCz() != null) {
            LinkWithTextIntf BCz = untaggableReasonIntf.BCz();
            if (BCz != null) {
                treeUpdaterJNI = BCz.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("help_link", treeUpdaterJNI);
        }
        if (untaggableReasonIntf.C3w() != null) {
            InstagramProductTaggabilityState C3w = untaggableReasonIntf.C3w();
            if (C3w != null) {
                str = C3w.A00;
            }
            A1H.put("taggability_state", str);
        }
        if (untaggableReasonIntf.getTitle() != null) {
            C41845B3m.A12(untaggableReasonIntf.getTitle(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
