package X;

import org.json.JSONObject;

public final class SHZ {
    public Long A00 = C51971G9r.A0m();
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public boolean A04 = false;

    public static SHZ A00(String str) {
        SHZ shz = new SHZ();
        if (str != null) {
            JSONObject A17 = C66580MXl.A17(str);
            shz.A01 = A17.optString("app_id");
            shz.A02 = A17.optString("pkg_name");
            shz.A03 = A17.optString("token");
            shz.A00 = Long.valueOf(A17.optLong("time"));
            shz.A04 = A17.optBoolean("invalid");
        }
        return shz;
    }

    public final String A01() {
        JSONObject A11 = DbS.A11();
        A11.putOpt("app_id", this.A01);
        A11.putOpt("pkg_name", this.A02);
        A11.putOpt("token", this.A03);
        A11.putOpt("time", this.A00);
        A11.putOpt("invalid", Boolean.valueOf(this.A04));
        return A11.toString();
    }
}
