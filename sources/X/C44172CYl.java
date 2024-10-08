package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44172CYl {
    public static Map A00(C250723lx r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (r4.Auw() != null) {
            C250703lv Auw = r4.Auw();
            if (Auw != null) {
                treeUpdaterJNI = Auw.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("customPositionInfo", treeUpdaterJNI);
        }
        if (r4.BZi() != null) {
            A1H.put("overlapsBottom10Percent", r4.BZi());
        }
        if (r4.BZj() != null) {
            A1H.put("overlapsBottom20Percent", r4.BZj());
        }
        if (r4.CAO() != null) {
            IGCTAStickerPositioningStrategyEnum CAO = r4.CAO();
            if (CAO != null) {
                str = CAO.A00;
            }
            C41845B3m.A11(str, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
