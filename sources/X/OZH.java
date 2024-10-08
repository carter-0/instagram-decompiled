package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class OZH {
    public final int A00;
    public final String A01;

    public static String A00(C69370NkA nkA) {
        return new OZH(nkA).A01();
    }

    public OZH(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final String A01() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put(RealtimeConstants.SEND_SUCCESS, false);
            A11.put(TraceFieldType.ErrorCode, this.A00);
            A11.put("error_message", this.A01);
        } catch (JSONException e) {
            0KC.A0F("ErrorResponse", "json serialization error", e);
        }
        return DbT.A10(A11);
    }

    public OZH(C69370NkA nkA) {
        this.A00 = nkA.A00;
        this.A01 = nkA.A02;
    }
}
