package X;

import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import java.io.IOException;

/* renamed from: X.Ecn  reason: case insensitive filesystem */
public abstract class C48330Ecn {
    public static IGAdsIABScreenshotDataDictImpl parseFromJson(16F r13) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction = null;
            Float f3 = null;
            Float f4 = null;
            IABScreenshotTransitionTime iABScreenshotTransitionTime = null;
            String str4 = null;
            IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant = null;
            Boolean bool = null;
            String str5 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (AnonymousClass000.A00(1570).equals(A17)) {
                    f = AnonymousClass7TF.A0U(r13);
                } else if (AnonymousClass000.A00(1601).equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r13);
                } else if (AnonymousClass000.A00(1783).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                    iABScreenshotEffectOnUserAction = (IABScreenshotEffectOnUserAction) IABScreenshotEffectOnUserAction.A01.get(str3);
                    if (iABScreenshotEffectOnUserAction == null) {
                        iABScreenshotEffectOnUserAction = IABScreenshotEffectOnUserAction.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(1784).equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r13);
                } else if (AnonymousClass000.A00(1785).equals(A17)) {
                    f4 = AnonymousClass7TF.A0U(r13);
                } else if (AnonymousClass000.A00(1786).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    iABScreenshotTransitionTime = (IABScreenshotTransitionTime) IABScreenshotTransitionTime.A01.get(str2);
                    if (iABScreenshotTransitionTime == null) {
                        iABScreenshotTransitionTime = IABScreenshotTransitionTime.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(1787).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if (AnonymousClass000.A00(1788).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    iGAdsIABScreenshotVariant = (IGAdsIABScreenshotVariant) IGAdsIABScreenshotVariant.A01.get(str);
                    if (iGAdsIABScreenshotVariant == null) {
                        iGAdsIABScreenshotVariant = IGAdsIABScreenshotVariant.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(1820).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if (AnonymousClass000.A00(1882).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            return new IGAdsIABScreenshotDataDictImpl(iABScreenshotEffectOnUserAction, iABScreenshotTransitionTime, iGAdsIABScreenshotVariant, bool, f, f2, f3, f4, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
