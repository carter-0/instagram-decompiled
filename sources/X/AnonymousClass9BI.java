package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9BI  reason: invalid class name */
public final class AnonymousClass9BI implements AnonymousClass11X {
    public final /* synthetic */ AnonymousClass9BF A00;

    public final int getRunnableId() {
        return 244;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public AnonymousClass9BI(AnonymousClass9BF r1) {
        this.A00 = r1;
    }

    public final String getName() {
        return "Account Linking Data Parsing Fetch";
    }

    public final void run() {
        AnonymousClass9BF r5 = this.A00;
        String string = AnonymousClass0xl.A00(C61170le.A00).A00.getString("account_linking_family_map_data", "");
        0qQ.A0A(string);
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (r5.A04.BNz().contains(next)) {
                    Object obj = jSONObject.get(next);
                    0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                    r5.A05.put(next, AnonymousClass9BM.parseFromJson(16P.A00((String) obj)));
                }
            }
        } catch (IOException | JSONException unused) {
            0wb.A03("AccountLinkingDataFetcher", "Error parsing saved family map from the preference");
        }
        AnonymousClass9BG r0 = r5.A01;
        ConcurrentHashMap concurrentHashMap = r5.A05;
        Map map = r0.A02;
        map.clear();
        map.putAll(concurrentHashMap);
    }
}
