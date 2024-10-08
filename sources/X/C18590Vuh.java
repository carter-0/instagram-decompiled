package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Vuh  reason: case insensitive filesystem */
public final class C18590Vuh {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public long A08 = 0;
    public long A09 = 0;
    public long A0A = 0;
    public long A0B = 0;
    public long A0C = 0;
    public String A0D = "";
    public String A0E = "";
    public String A0F = "";
    public Map A0G = new HashMap();
    public boolean A0H = false;
    public boolean A0I = false;

    public static C18590Vuh A00(JSONObject jSONObject) {
        C18590Vuh vuh = new C18590Vuh();
        vuh.A0E = jSONObject.getString("cache_name");
        vuh.A0F = jSONObject.getString("session_key");
        vuh.A0D = jSONObject.getString("cache_key");
        vuh.A04 = jSONObject.getLong("item_size_b");
        vuh.A00 = jSONObject.getLong("action_count");
        vuh.A01 = jSONObject.getLong("get_count");
        vuh.A03 = jSONObject.getLong("insert_count");
        vuh.A07 = jSONObject.getLong("remove_count");
        vuh.A02 = jSONObject.getLong("hit_count");
        vuh.A05 = jSONObject.getLong("refetch_count");
        vuh.A06 = jSONObject.getLong("refresh_count");
        vuh.A08 = jSONObject.getLong("remove_count_by_eviction");
        vuh.A09 = jSONObject.getLong("remove_count_by_staleness");
        vuh.A0B = jSONObject.getLong("remove_count_by_user");
        vuh.A0A = jSONObject.getLong("remove_count_by_unknown");
        Map map = vuh.A0G;
        map.clear();
        JSONObject jSONObject2 = jSONObject.getJSONObject("additional_metadata");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            map.put(A18, jSONObject2.getString(A18));
        }
        vuh.A0C = jSONObject.getLong("tracking_start_time_ms");
        vuh.A0I = jSONObject.getBoolean("last_known_existence");
        vuh.A0H = jSONObject.getBoolean("had_known_existence");
        return vuh;
    }

    public final HashMap A01() {
        HashMap hashMap = new HashMap();
        hashMap.put("item_size_b", Long.valueOf(this.A04));
        hashMap.put("action_count", Long.valueOf(this.A00));
        hashMap.put("get_count", Long.valueOf(this.A01));
        hashMap.put("insert_count", Long.valueOf(this.A03));
        hashMap.put("remove_count", Long.valueOf(this.A07));
        hashMap.put("hit_count", Long.valueOf(this.A02));
        hashMap.put("refetch_count", Long.valueOf(this.A05));
        hashMap.put("refresh_count", Long.valueOf(this.A06));
        hashMap.put("remove_count_by_eviction", Long.valueOf(this.A08));
        hashMap.put("remove_count_by_staleness", Long.valueOf(this.A09));
        hashMap.put("remove_count_by_user", Long.valueOf(this.A0B));
        hashMap.put("remove_count_by_unknown", Long.valueOf(this.A0A));
        return hashMap;
    }
}
