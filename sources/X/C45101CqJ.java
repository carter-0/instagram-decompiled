package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqJ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45101CqJ {
    public static Map A00(AdsCTATrustInfoIntf adsCTATrustInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (adsCTATrustInfoIntf.BGy() != null) {
            AdsBizBadgeInfo BGy = adsCTATrustInfoIntf.BGy();
            if (BGy != null) {
                treeUpdaterJNI = BGy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("info_data", treeUpdaterJNI);
        }
        if (adsCTATrustInfoIntf.BH1() != null) {
            List<IGAdsTrustInfoTypeEnum> BH1 = adsCTATrustInfoIntf.BH1();
            if (BH1 != null) {
                arrayList = AnonymousClass7TG.A0r(BH1);
                for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum : BH1) {
                    0qQ.A0B(iGAdsTrustInfoTypeEnum, 0);
                    arrayList.add(iGAdsTrustInfoTypeEnum.A00);
                }
            }
            A1H.put("info_type_list", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
