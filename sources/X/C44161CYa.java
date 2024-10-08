package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IABPostClickDataDict;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYa  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44161CYa {
    public static Map A00(IABPostClickDataDict iABPostClickDataDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (iABPostClickDataDict.Aj6() != null) {
            IGBWPIABPostClickDataExtensionDict Aj6 = iABPostClickDataDict.Aj6();
            if (Aj6 != null) {
                treeUpdaterJNI = Aj6.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("buyWithPrimeIABPostClickDataExtension", treeUpdaterJNI);
        }
        if (iABPostClickDataDict.B0f() != null) {
            List<IABPostClickEligibleExperienceTypes> B0f = iABPostClickDataDict.B0f();
            if (B0f != null) {
                arrayList = AnonymousClass7TG.A0r(B0f);
                for (IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes : B0f) {
                    0qQ.A0B(iABPostClickEligibleExperienceTypes, 0);
                    arrayList.add(iABPostClickEligibleExperienceTypes.A00);
                }
            }
            A1H.put("eligibleExperienceTypes", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
