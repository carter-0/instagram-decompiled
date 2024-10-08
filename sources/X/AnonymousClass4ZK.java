package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4ZK  reason: invalid class name */
public final class AnonymousClass4ZK {
    public SNQ A00;
    public Set A01 = new HashSet();
    public Set A02 = new HashSet();
    public final 1sY A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.4ZL] */
    public AnonymousClass4ZK(1sY r11, UserSession userSession, String str) {
        AnonymousClass4ZL r4;
        this.A04 = userSession;
        this.A03 = r11;
        synchronized (AnonymousClass4ZL.A03) {
            AnonymousClass4ZL r42 = AnonymousClass4ZL.A02;
            r4 = r42;
            if (r42 == null) {
                ? obj = new Object();
                obj.A00 = new HashSet();
                obj.A01 = new HashSet();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                try {
                    if (str.length() != 0) {
                        JSONObject jSONObject = new JSONObject(1r8.A00(str));
                        if (jSONObject.has("fully_federated_events")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("fully_federated_events");
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                String string = jSONArray.getString(i);
                                0qQ.A07(string);
                                hashSet.add(string);
                            }
                        }
                        if (jSONObject.has("partially_federated_events")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("partially_federated_events");
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String string2 = jSONArray2.getString(i2);
                                0qQ.A07(string2);
                                hashSet2.add(string2);
                            }
                        }
                        obj.A00 = hashSet;
                        obj.A01 = hashSet2;
                    }
                } catch (JSONException e) {
                    0KC.A0M("IgFederatedAnalyticsEventManager", "Exception when de-serializing federated analytics config: %s", e, new Object[]{str});
                }
                AnonymousClass4ZL.A02 = obj;
                r4 = obj;
            }
            0qQ.A0C(r4, "null cannot be cast to non-null type com.instagram.analytics.analytics2.federatedanalytics.IgFederatedAnalyticsEventManager");
        }
        this.A01 = r4.A00;
        this.A02 = r4.A01;
    }
}
