package X;

import org.json.JSONObject;

public final class BAS extends AnonymousClass3FZ implements DZQ {
    public final int BGX() {
        return this.A00.optInt("impression_cooldown_secs");
    }

    public final int BPZ() {
        return this.A00.optInt("maximum_global_impressions");
    }

    public final int BPa() {
        return this.A00.optInt("maximum_impressions_per_user");
    }

    public BAS(JSONObject jSONObject) {
        super(jSONObject);
    }
}
