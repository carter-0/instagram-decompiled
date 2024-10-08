package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cfu  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44498Cfu {
    public static Map A00(C46317DUu dUu) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUu.B18() != null) {
            A1H.put("enable_indexing", dUu.B18());
        }
        if (dUu.B1B() != null) {
            A1H.put("enable_navigation", dUu.B1B());
        }
        ArrayList arrayList = null;
        if (dUu.B3R() != null) {
            C21041XAu B3R = dUu.B3R();
            if (B3R != null) {
                treeUpdaterJNI = B3R.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("extra_question", treeUpdaterJNI);
        }
        if (dUu.BCD() != null) {
            A1H.put("has_submit", dUu.BCD());
        }
        if (dUu.getId() != null) {
            C41845B3m.A0x(dUu.getId(), A1H);
        }
        if (dUu.BNs() != null) {
            A1H.put("log_on_each_answer", dUu.BNs());
        }
        if (dUu.BU0() != null) {
            A1H.put("module_type", dUu.BU0());
        }
        if (dUu.Bip() != null) {
            List<C21041XAu> Bip = dUu.Bip();
            if (Bip != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C21041XAu xAu : Bip) {
                    if (xAu != null) {
                        arrayList.add(xAu.FHC());
                    }
                }
            }
            A1H.put("questions", arrayList);
        }
        if (dUu.CBe() != null) {
            A1H.put("unlock_question", dUu.CBe());
        }
        if (dUu.CDn() != null) {
            A1H.put("vertical_padding", dUu.CDn());
        }
        return 0Yt.A0B(A1H);
    }
}
