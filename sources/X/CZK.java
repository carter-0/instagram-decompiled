package X;

import com.instagram.api.schemas.IGRFSurveyContextDict;
import com.instagram.api.schemas.IGRFSurveyContextMappingDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CZK {
    public static Map A00(IGRFSurveyContextDict iGRFSurveyContextDict) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGRFSurveyContextDict.Aqx() != null) {
            List<IGRFSurveyContextMappingDict> Aqx = iGRFSurveyContextDict.Aqx();
            ArrayList arrayList = null;
            if (Aqx != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IGRFSurveyContextMappingDict iGRFSurveyContextMappingDict : Aqx) {
                    if (iGRFSurveyContextMappingDict != null) {
                        arrayList.add(iGRFSurveyContextMappingDict.FHC());
                    }
                }
            }
            A1H.put(AnonymousClass000.A00(1227), arrayList);
        }
        if (iGRFSurveyContextDict.BI8() != null) {
            A1H.put("integration_point_id", iGRFSurveyContextDict.BI8());
        }
        return 0Yt.A0B(A1H);
    }
}
