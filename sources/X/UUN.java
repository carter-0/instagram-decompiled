package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import org.json.JSONArray;
import org.json.JSONObject;

public final class UUN extends W36 {
    public int A00 = 3;
    public JSONArray A01 = new JSONArray();
    public JSONArray A02 = new JSONArray();
    public JSONArray A03 = new JSONArray();
    public JSONArray A04 = new JSONArray();
    public JSONObject A05;
    public JSONObject A06;
    public JSONObject A07;
    public JSONObject A08;

    private final String A00() {
        boolean z;
        int i = this.A00;
        synchronized (this) {
            z = this.A00;
        }
        if (i == 4) {
            if (z) {
                return "call";
            }
            return "ringing";
        } else if (z) {
            return "live";
        } else {
            return "in_preview";
        }
    }

    public static final JSONObject A01(UUN uun, UL4 ul4, long j) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sample_rate", ul4.A02);
        jSONObject.put(TraceFieldType.Bitrate, ul4.A00);
        jSONObject.put("channels", ul4.A01);
        jSONObject.put("codec_profile", C16805V6m.A00(ul4.A04));
        jSONObject.put("start_time_ms", j);
        jSONObject.put("end_time_ms", -1);
        if (uun.A00 == 4) {
            str = "call_stage";
        } else {
            str = "livestream_stage";
        }
        jSONObject.put(str, uun.A00());
        return jSONObject;
    }

    public static final JSONObject A02(UUN uun, ULY uly, long j) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("codec", C18106Vla.A01(uly.A06));
        jSONObject.put(IgReactMediaPickerNativeModule.WIDTH, uly.A05);
        jSONObject.put(IgReactMediaPickerNativeModule.HEIGHT, uly.A03);
        jSONObject.put("frame_rate", uly.A02);
        jSONObject.put("i_frame_interval", uly.A04);
        jSONObject.put(TraceFieldType.Bitrate, uly.A00);
        jSONObject.put("start_time_ms", j);
        jSONObject.put("end_time_ms", -1);
        if (uun.A00 == 4) {
            str = "call_stage";
        } else {
            str = "livestream_stage";
        }
        jSONObject.put(str, uun.A00());
        return jSONObject;
    }
}
