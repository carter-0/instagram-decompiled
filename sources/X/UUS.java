package X;

import com.facebook.proxygen.TraceFieldType;
import org.json.JSONArray;
import org.json.JSONObject;

public final class UUS extends C69677Npz {
    public JSONArray A00 = new JSONArray();

    public final void A03() {
        this.A00 = new JSONArray();
    }

    public final void A04(long j) {
        JSONArray jSONArray = this.A00;
        JSONObject jSONObject = new JSONObject();
        int i = this.A00;
        String str = "UNKNOWN";
        if (i != 0) {
            if (i == 1) {
                str = "CELLULAR";
            } else if (i == 2) {
                str = "WIFI_BAND_2_4GHZ";
            } else if (i == 3) {
                str = "WIFI_BAND_5GHZ";
            }
        }
        jSONArray.put(jSONObject.put("uplink_type", str));
        jSONArray.put(new JSONObject().put(TraceFieldType.Duration, j));
    }
}
