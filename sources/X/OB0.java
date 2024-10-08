package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class OB0 {
    public Map A00;
    public final 1AA A01;

    public OB0(1AA r7, String str) {
        this.A01 = r7;
        try {
            HashMap A1E = AnonymousClass7TE.A1E();
            if (!str.isEmpty()) {
                JSONObject A17 = C66580MXl.A17(str);
                Iterator<String> keys = A17.keys();
                while (keys.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(keys);
                    A1E.put(A18, Long.valueOf(A17.getLong(A18)));
                }
            }
            this.A00 = A1E;
        } catch (JSONException e) {
            0KC.A0F("MobileConfigFBTFactory", e.toString(), e);
            this.A00 = AnonymousClass7TE.A1E();
        }
    }
}
