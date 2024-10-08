package X;

import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44164CYd {
    public static Map A00(IGAdCreativeOptimizationConfigByTypeDict iGAdCreativeOptimizationConfigByTypeDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGAdCreativeOptimizationConfigByTypeDict.BYY() != null) {
            A1H.put("optimizationType", iGAdCreativeOptimizationConfigByTypeDict.BYY());
        }
        if (iGAdCreativeOptimizationConfigByTypeDict.BYb() != null) {
            A1H.put("optionValue", iGAdCreativeOptimizationConfigByTypeDict.BYb());
        }
        return 0Yt.A0B(A1H);
    }
}
