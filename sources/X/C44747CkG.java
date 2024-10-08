package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CkG  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44747CkG {
    public static Map A00(C46314DUr dUr) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dUr.AdF();
        A1H.put("audience", Integer.valueOf(dUr.AdF()));
        if (dUr.AqJ() != null) {
            A1H.put(AnonymousClass000.A00(272), dUr.AqJ());
        }
        if (dUr.B2n() != null) {
            A1H.put("expiring_at", dUr.B2n());
        }
        dUr.BPs();
        A1H.put("media_count", Integer.valueOf(dUr.BPs()));
        if (dUr.Bf5() != null) {
            List Bf5 = dUr.Bf5();
            ArrayList A0r = AnonymousClass7TG.A0r(Bf5);
            Iterator it = Bf5.iterator();
            while (it.hasNext()) {
                C41846B3n.A1U(A0r, it);
            }
            A1H.put("preview_medias", A0r);
        }
        if (dUr.Bhn() != null) {
            DUO Bhn = dUr.Bhn();
            if (Bhn != null) {
                treeUpdaterJNI = Bhn.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("prompt_data", treeUpdaterJNI);
        }
        dUr.C1Y();
        return C41845B3m.A0u("streak_count", Integer.valueOf(dUr.C1Y()), A1H);
    }
}
