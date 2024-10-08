package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class S9T {
    public static final void A00(SJL sjl, Map map) {
        map.put("resize_status", sjl.toString());
        C12298Sqz sqz = sjl.A0F;
        if (sqz != null) {
            Map map2 = sqz.A00;
            if (!map2.isEmpty()) {
                JSONArray A1E = Pxe.A1E();
                Iterator A0v = AnonymousClass7TF.A0v(map2);
                while (A0v.hasNext()) {
                    C9128RQb rQb = (C9128RQb) A0v.next();
                    JSONObject A11 = DbS.A11();
                    try {
                        A11.put("error_tag", rQb.A01);
                        A11.put("renderer", rQb.A02);
                        A11.put("error_count", rQb.A00);
                        A1E.put(A11);
                    } catch (JSONException unused) {
                    }
                }
                String obj = A1E.toString();
                if (obj != null) {
                    map.put("glrenderer_statistics", obj);
                }
            }
        }
    }
}
