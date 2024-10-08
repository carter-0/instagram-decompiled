package X;

import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CUZ {
    public static Map A00(AppstoreMetadataDict appstoreMetadataDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (appstoreMetadataDict.Aeb() != null) {
            A1H.put("average_rating", AnonymousClass7TH.A0D(appstoreMetadataDict.Aeb()));
        }
        if (appstoreMetadataDict.BHr() != null) {
            A1H.put(AnonymousClass000.A00(4899), appstoreMetadataDict.BHr());
        }
        if (appstoreMetadataDict.BXE() != null) {
            A1H.put("num_reviews", appstoreMetadataDict.BXE());
        }
        if (appstoreMetadataDict.BXF() != null) {
            A1H.put(AnonymousClass000.A00(5089), appstoreMetadataDict.BXF());
        }
        if (appstoreMetadataDict.Bq2() != null) {
            List<IGAdScreenshotURLDataDict> Bq2 = appstoreMetadataDict.Bq2();
            ArrayList arrayList = null;
            if (Bq2 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict : Bq2) {
                    if (iGAdScreenshotURLDataDict != null) {
                        arrayList.add(iGAdScreenshotURLDataDict.FHC());
                    }
                }
            }
            A1H.put("screenshots", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
