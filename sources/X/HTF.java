package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class HTF {
    public static Map A00(C269884fq r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r5.Bip() != null) {
            List<C275544qW> Bip = r5.Bip();
            if (Bip != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C275544qW r0 : Bip) {
                    if (r0 != null) {
                        arrayList.add(r0.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("questions", arrayList);
        }
        if (r5.C9w() != null) {
            A1H.put("trigger_condition", r5.C9w());
        }
        if (r5.CBM() != null) {
            C275524qU CBM = r5.CBM();
            if (CBM != null) {
                treeUpdaterJNI = CBM.FHC();
            }
            A1H.put("undo_button", treeUpdaterJNI);
        }
        return 0Yt.A0B(A1H);
    }
}
