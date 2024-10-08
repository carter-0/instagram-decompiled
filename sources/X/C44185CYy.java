package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44185CYy {
    public static Map A00(C257813y0 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (r4.B68() != null) {
            C279794zK B68 = r4.B68();
            if (B68 != null) {
                treeUpdaterJNI2 = B68.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("first_question_data", treeUpdaterJNI2);
        }
        if (r4.BMA() != null) {
            C279774zI BMA = r4.BMA();
            if (BMA != null) {
                treeUpdaterJNI = BMA.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("lead_gen_incentive_data", treeUpdaterJNI);
        }
        if (r4.CA2() != null) {
            IGLeadGenSubheaderTrustSignalDataDict CA2 = r4.CA2();
            if (CA2 != null) {
                treeUpdaterJNI3 = CA2.FHC();
            }
            A1H.put("trust_signal_data", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
