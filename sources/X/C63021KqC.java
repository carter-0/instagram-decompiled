package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KqC  reason: case insensitive filesystem */
public abstract /* synthetic */ class C63021KqC {
    public static Map A00(C278104wH r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str2 = null;
        if (r4.Af4() != null) {
            IGLiveBadgeSettings Af4 = r4.Af4();
            if (Af4 != null) {
                str = Af4.A00;
            } else {
                str = null;
            }
            A1H.put("badge_setting", str);
        }
        if (r4.Af5() != null) {
            A1H.put("badges_count", r4.Af5());
        }
        if (r4.BP6() != null) {
            A1H.put(C273654mx.A00(3002), r4.BP6());
        }
        if (r4.Bav() != null) {
            C2816758y Bav = r4.Bav();
            if (Bav != null) {
                treeUpdaterJNI = Bav.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("pay_config", treeUpdaterJNI);
        }
        if (r4.CFE() != null) {
            LiveUserPaySupportTier CFE = r4.CFE();
            if (CFE != null) {
                str2 = CFE.A00;
            }
            A1H.put(C273654mx.A00(3485), str2);
        }
        return 0Yt.A0B(A1H);
    }
}
