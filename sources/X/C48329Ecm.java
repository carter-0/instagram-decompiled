package X;

import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ecm  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48329Ecm {
    public static Map A00(IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict) {
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGAdsIABScreenshotDataDict.BPL() != null) {
            A1H.put(AnonymousClass000.A00(1570), 012.A0p(String.valueOf(iGAdsIABScreenshotDataDict.BPL())));
        }
        if (iGAdsIABScreenshotDataDict.BTC() != null) {
            A1H.put(AnonymousClass000.A00(1601), 012.A0p(String.valueOf(iGAdsIABScreenshotDataDict.BTC())));
        }
        String str3 = null;
        if (iGAdsIABScreenshotDataDict.Bpw() != null) {
            IABScreenshotEffectOnUserAction Bpw = iGAdsIABScreenshotDataDict.Bpw();
            if (Bpw != null) {
                str2 = Bpw.A00;
            } else {
                str2 = null;
            }
            A1H.put(AnonymousClass000.A00(1783), str2);
        }
        if (iGAdsIABScreenshotDataDict.Bpx() != null) {
            A1H.put(AnonymousClass000.A00(1784), 012.A0p(String.valueOf(iGAdsIABScreenshotDataDict.Bpx())));
        }
        if (iGAdsIABScreenshotDataDict.Bpy() != null) {
            A1H.put(AnonymousClass000.A00(1785), 012.A0p(String.valueOf(iGAdsIABScreenshotDataDict.Bpy())));
        }
        if (iGAdsIABScreenshotDataDict.Bpz() != null) {
            IABScreenshotTransitionTime Bpz = iGAdsIABScreenshotDataDict.Bpz();
            if (Bpz != null) {
                str = Bpz.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(1786), str);
        }
        if (iGAdsIABScreenshotDataDict.Bq0() != null) {
            A1H.put(AnonymousClass000.A00(1787), iGAdsIABScreenshotDataDict.Bq0());
        }
        if (iGAdsIABScreenshotDataDict.Bq1() != null) {
            IGAdsIABScreenshotVariant Bq1 = iGAdsIABScreenshotDataDict.Bq1();
            if (Bq1 != null) {
                str3 = Bq1.A00;
            }
            A1H.put(AnonymousClass000.A00(1788), str3);
        }
        if (iGAdsIABScreenshotDataDict.Bvf() != null) {
            A1H.put(AnonymousClass000.A00(1820), iGAdsIABScreenshotDataDict.Bvf());
        }
        if (iGAdsIABScreenshotDataDict.C5A() != null) {
            A1H.put(AnonymousClass000.A00(1882), iGAdsIABScreenshotDataDict.C5A());
        }
        return 0Yt.A0B(A1H);
    }
}
