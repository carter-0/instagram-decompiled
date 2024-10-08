package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NqF  reason: case insensitive filesystem */
public abstract class C69693NqF {
    public static final HashMap A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject A17 = C66580MXl.A17(str);
            Iterator<String> keys = A17.keys();
            0qQ.A07(keys);
            C242193Sz A0E = C242173Sx.A0E(new C66310MMt(A17, 49), C242173Sx.A09(new C66310MMt(A17, 48), 2YX.A00(keys)));
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            0Yt.A0G(A1H, A0E);
            return new HashMap(0Yt.A0A(A1H));
        } catch (JSONException e) {
            0KC.A0F("ArmadilloNotificationPayloadHelper", "Failed to parse notification payload into HashMap.", e);
            return null;
        }
    }
}
