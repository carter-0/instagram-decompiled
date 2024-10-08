package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V8R {
    public static Map A00(C274444oL r3) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.Axy() != null) {
            TextAppSearchDiscussionTopic Axy = r3.Axy();
            if (Axy != null) {
                treeUpdaterJNI = Axy.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("discussion_info", treeUpdaterJNI);
        }
        if (r3.BlF() != null) {
            linkedHashMap.put(C273654mx.A00(933), r3.BlF());
        }
        if (r3.BlG() != null) {
            linkedHashMap.put(C273654mx.A00(934), r3.BlG());
        }
        if (r3.C9s() != null) {
            linkedHashMap.put("trending_keyword", r3.C9s());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
