package X;

import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5Db  reason: invalid class name and case insensitive filesystem */
public abstract class C282435Db {
    public static final LinkedHashMap A00(String str) {
        0qQ.A0B(str, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String A0R : 00l.A0R(str, new String[]{"&"}, 0)) {
            List A0R2 = 00l.A0R(A0R, new String[]{"="}, 0);
            linkedHashMap.put(URLDecoder.decode((String) A0R2.get(0), ReactWebViewManager.HTML_ENCODING), URLDecoder.decode((String) A0R2.get(1), ReactWebViewManager.HTML_ENCODING));
        }
        return linkedHashMap;
    }

    public static final boolean A01(PushInfraMetaData pushInfraMetaData) {
        String str = pushInfraMetaData.A05;
        if (str == null) {
            str = "0";
        }
        if (str.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION) || str.equals("2")) {
            return true;
        }
        return false;
    }

    public static final boolean A02(String str) {
        AnonymousClass0eM r0;
        if (str == null || (r0 = AnonymousClass09Z.A00) == null || !r0.CVQ() || 08y.A00().A05(str)) {
            return false;
        }
        return true;
    }
}
