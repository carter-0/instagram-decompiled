package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CfJ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44461CfJ {
    public static Map A00(DUU duu) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duu.BOE() != null) {
            C46264DSt BOE = duu.BOE();
            if (BOE != null) {
                treeUpdaterJNI = BOE.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("logging_info", treeUpdaterJNI);
        }
        if (duu.BQO() != null) {
            List BQO = duu.BQO();
            ArrayList A0r = AnonymousClass7TG.A0r(BQO);
            Iterator it = BQO.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("media_infos", A0r);
        }
        if (duu.Bhq() != null) {
            A1H.put("prompt_sticker", duu.Bhq().FHC());
        }
        if (duu.Bkq() != null) {
            A1H.put("reel_pks", duu.Bkq());
        }
        return 0Yt.A0B(A1H);
    }
}
