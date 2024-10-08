package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class PzL {
    public static Map A00(C250363lK r6) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI6 = null;
        if (r6.Aj2() != null) {
            C269924fu Aj2 = r6.Aj2();
            if (Aj2 != null) {
                treeUpdaterJNI5 = Aj2.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("buyWithIntegrationIABPostClickDataExtension", treeUpdaterJNI5);
        }
        if (r6.Aj7() != null) {
            C269934fv Aj7 = r6.Aj7();
            if (Aj7 != null) {
                treeUpdaterJNI4 = Aj7.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put(AnonymousClass000.A00(4545), treeUpdaterJNI4);
        }
        if (r6.B0f() != null) {
            List<IGPostClickEligibleExperienceTypes> B0f = r6.B0f();
            if (B0f != null) {
                arrayList2 = AnonymousClass7TG.A0r(B0f);
                for (IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes : B0f) {
                    0qQ.A0B(iGPostClickEligibleExperienceTypes, 0);
                    arrayList2.add(iGPostClickEligibleExperienceTypes.A00);
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("eligibleExperienceTypes", arrayList2);
        }
        if (r6.BDy() != null) {
            C269944fw BDy = r6.BDy();
            if (BDy != null) {
                treeUpdaterJNI3 = BDy.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("iabAutofillAdsPersonalizationPostClickDataExtension", treeUpdaterJNI3);
        }
        if (r6.BE2() != null) {
            List<DTE> BE2 = r6.BE2();
            if (BE2 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DTE dte : BE2) {
                    if (dte != null) {
                        arrayList.add(dte.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("iabPostClickDisclaimers", arrayList);
        }
        if (r6.BGd() != null) {
            A1H.put("impressionTime", r6.BGd());
        }
        if (r6.BSX() != null) {
            C269954fx BSX = r6.BSX();
            if (BSX != null) {
                treeUpdaterJNI2 = BSX.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("metaCheckoutIABPostClickDataExtension", treeUpdaterJNI2);
        }
        if (r6.BSb() != null) {
            C269964fy BSb = r6.BSb();
            if (BSb != null) {
                treeUpdaterJNI = BSb.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("metaPaymentsSDKIABPostClickDataExtension", treeUpdaterJNI);
        }
        if (r6.Bhe() != null) {
            C269984g0 Bhe = r6.Bhe();
            if (Bhe != null) {
                treeUpdaterJNI6 = Bhe.FHC();
            }
            A1H.put("promoAdsAutofillPostClickDataExtension", treeUpdaterJNI6);
        }
        return 0Yt.A0B(A1H);
    }
}
