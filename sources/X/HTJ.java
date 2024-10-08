package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class HTJ {
    public static Map A00(C269904fs r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.B2Z() != null) {
            A1H.put(AnonymousClass000.A00(4750), r5.B2Z());
        }
        if (r5.B2c() != null) {
            A1H.put(AnonymousClass000.A00(4752), r5.B2c());
        }
        String str = null;
        if (r5.BIP() != null) {
            List<JSM> BIP = r5.BIP();
            if (BIP != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (JSM jsm : BIP) {
                    if (jsm != null) {
                        arrayList.add(jsm.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("interests", arrayList);
        }
        if (r5.BXG() != null) {
            A1H.put("num_rows", r5.BXG());
        }
        if (r5.C21() != null) {
            AfiInterestsRecoStyle C21 = r5.C21();
            if (C21 != null) {
                str = C21.A00;
            }
            A1H.put("style", str);
        }
        if (r5.getSubtitle() != null) {
            A1H.put("subtitle", r5.getSubtitle());
        }
        if (r5.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r5.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
