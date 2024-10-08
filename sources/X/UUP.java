package X;

import org.json.JSONArray;
import org.json.JSONObject;

public final class UUP extends LGZ {
    public JSONArray A00;

    public final void A00() {
        this.A00 = new JSONArray();
    }

    public final void A01() {
        this.A00 = new JSONArray();
    }

    public final void A02(long j, long j2) {
        JSONArray jSONArray = this.A00;
        if (jSONArray != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latency_ms", j);
            jSONObject.put("start_time_ms", j2);
            jSONArray.put(jSONObject);
        }
    }

    public final boolean A04() {
        return DbW.A1a(this.A00);
    }

    public final boolean A05() {
        JSONArray jSONArray = this.A00;
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }
}
