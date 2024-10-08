package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CmM  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44870CmM {
    public static Map A00(AnonymousClass3IC r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AZ4() != null) {
            A1H.put("ad_id", r4.AZ4());
        }
        if (r4.CRL() != null) {
            A1H.put("is_demo", r4.CRL());
        }
        ArrayList arrayList = null;
        if (r4.BMG() != null) {
            DTZ BMG = r4.BMG();
            if (BMG != null) {
                treeUpdaterJNI = BMG.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("learn_more", treeUpdaterJNI);
        }
        if (r4.Bfc() != null) {
            A1H.put("primer_message", r4.Bfc());
        }
        if (r4.Bip() != null) {
            List<DUH> Bip = r4.Bip();
            if (Bip != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DUH duh : Bip) {
                    if (duh != null) {
                        arrayList.add(duh.FHC());
                    }
                }
            }
            A1H.put("questions", arrayList);
        }
        if (r4.Bvm() != null) {
            A1H.put("show_primer", r4.Bvm());
        }
        if (r4.Bvs() != null) {
            A1H.put("show_results", r4.Bvs());
        }
        if (r4.C3P() != null) {
            A1H.put("survey_id", r4.C3P());
        }
        if (r4.C3Q() != null) {
            A1H.put("survey_type", r4.C3Q());
        }
        if (r4.C9L() != null) {
            A1H.put("tracking_token", r4.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
