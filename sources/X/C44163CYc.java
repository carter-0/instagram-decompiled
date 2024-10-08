package X;

import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44163CYc {
    public static Map A00(IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGAdCreationOptimizationPayloadDict.AYy() != null) {
            List<IGAdCreativeOptimizationConfigByTypeDict> AYy = iGAdCreationOptimizationPayloadDict.AYy();
            ArrayList arrayList = null;
            if (AYy != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IGAdCreativeOptimizationConfigByTypeDict iGAdCreativeOptimizationConfigByTypeDict : AYy) {
                    if (iGAdCreativeOptimizationConfigByTypeDict != null) {
                        arrayList.add(iGAdCreativeOptimizationConfigByTypeDict.FHC());
                    }
                }
            }
            A1H.put("adCreativeOptimizationConfigByType", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
