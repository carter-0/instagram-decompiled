package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45105CqN {
    public static Map A00(AdsTextTrustInfoIntf adsTextTrustInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (adsTextTrustInfoIntf.BGy() != null) {
            AdsBizBadgeInfo BGy = adsTextTrustInfoIntf.BGy();
            if (BGy != null) {
                treeUpdaterJNI = BGy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("info_data", treeUpdaterJNI);
        }
        if (adsTextTrustInfoIntf.BH1() != null) {
            List<IGAdsTrustInfoTypeEnum> BH1 = adsTextTrustInfoIntf.BH1();
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
