package X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aK  reason: invalid class name and case insensitive filesystem */
public final class C266774aK {
    public final float A00;
    public final C266724aF A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C266774aK r5 = (C266774aK) obj;
            if (Float.compare(r5.A00, this.A00) != 0 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mTargetTimeRange", this.A01.A04());
            jSONObject.put("mSpeed", (double) this.A00);
            return jSONObject.toString();
        } catch (JSONException e) {
            if (e.getMessage() == null) {
                return "";
            }
            return e.getMessage();
        }
    }

    public C266774aK(JSONObject jSONObject) {
        this.A01 = C266724aF.A00(jSONObject.getJSONObject("mTargetTimeRange"));
        this.A00 = (float) jSONObject.getDouble("mSpeed");
    }

    public C266774aK(C266724aF r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
