package X;

import org.json.JSONArray;
import org.json.JSONObject;

public final class P0W implements C74490Pvk {
    public final JSONArray A00;
    public final JSONObject A01;

    public final String BZR() {
        String string = this.A01.getString("offline_threading_id");
        0qQ.A07(string);
        return string;
    }

    public final byte[] Baz() {
        C73573Pg3 pg3 = OJG.A00;
        String string = this.A01.getJSONObject("toplevel_payload").getString("encrypted_payload");
        return pg3.A00(string, C66580MXl.A06(string));
    }

    public final byte[] C32(int i) {
        C73573Pg3 pg3 = OJG.A00;
        String string = this.A00.getJSONObject(i).getJSONObject("encrypted_supplemental_payload").getString("encrypted_payload");
        return pg3.A00(string, C66580MXl.A06(string));
    }

    public final long C33(int i) {
        return C66580MXl.A08(this.A00.getJSONObject(i).getJSONObject("encrypted_supplemental_payload").getString("payloadTimestampMs"));
    }

    public final int C34() {
        return this.A00.length();
    }

    public final long C7a() {
        return C66580MXl.A08(this.A01.getJSONObject("toplevel_payload").getString("payloadTimestampMs"));
    }

    public P0W(JSONObject jSONObject) {
        this.A01 = jSONObject;
        this.A00 = jSONObject.getJSONArray("supplemental_payloads");
    }
}
