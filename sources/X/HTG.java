package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class HTG {
    public static Map A00(C269894fr r5) {
        String str;
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.Ay0() != null) {
            A1H.put(AnonymousClass000.A00(4721), r5.Ay0());
        }
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
        if (r5.Blk() != null) {
            REPETITION_UI_TYPE Blk = r5.Blk();
            if (Blk != null) {
                str = Blk.A00;
            } else {
                str = null;
            }
            A1H.put("render_mode", str);
        }
        if (r5.Bm4() != null) {
            A1H.put(AnonymousClass000.A00(5181), r5.Bm4());
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
