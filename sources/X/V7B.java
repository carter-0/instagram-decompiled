package X;

import com.instagram.api.schemas.ElectionAddYoursInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7B {
    public static Map A00(ElectionAddYoursInfoDictIntf electionAddYoursInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (electionAddYoursInfoDictIntf.AxP() != null) {
            linkedHashMap.put(C273654mx.A00(142), electionAddYoursInfoDictIntf.AxP());
        }
        if (electionAddYoursInfoDictIntf.C7v() != null) {
            linkedHashMap.put("title_options", electionAddYoursInfoDictIntf.C7v());
        }
        if (electionAddYoursInfoDictIntf.C9m() != null) {
            linkedHashMap.put("tray_title", electionAddYoursInfoDictIntf.C9m());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
