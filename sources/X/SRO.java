package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class SRO {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06 = AnonymousClass7TE.A1E();

    public SRO(String str, String str2) {
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = "Unknown";
        this.A02 = "Unknown";
        this.A01 = "Unknown";
    }

    public static void A01(SRO sro, JSONObject jSONObject, boolean z) {
        jSONObject.put("is_emp", z);
        jSONObject.put("d_model", sro.A02);
        jSONObject.put("d_manuf", sro.A01);
        jSONObject.put("locale", sro.A03);
        JSONObject A002 = C9567Rd7.A00(sro.A06);
        if (A002 != null) {
            jSONObject.put("extra_info", A002);
        }
    }

    public final JSONObject A02() {
        JSONObject jSONObject;
        String str;
        if (this instanceof C7857Qbh) {
            C7857Qbh qbh = (C7857Qbh) this;
            jSONObject = DbS.A11();
            try {
                A00(qbh, jSONObject);
                JSONObject A11 = DbS.A11();
                A11.put("event", qbh.A07);
                A11.put("exc", qbh.A06);
                A11.put("actn", qbh.A05);
                A11.put("ctnr", qbh.A04);
                A11.put("scn_on", qbh.A09);
                A11.put("s_boot", qbh.A00);
                A11.put("s_mqtt", qbh.A01);
                A11.put("s_net", qbh.A02);
                A11.put("s_scn", qbh.A03);
                A11.put("s_svc", qbh.A04);
                A01(qbh, A11, qbh.A08);
                jSONObject.put("extra", A11);
                return jSONObject;
            } catch (JSONException e) {
                e = e;
                str = "FbnsServiceLifecycleEvent";
                0KC.A0I(str, "Failed to serialize", e);
                return jSONObject;
            }
        } else if (this instanceof C7858Qbi) {
            C7858Qbi qbi = (C7858Qbi) this;
            jSONObject = DbS.A11();
            try {
                A00(qbi, jSONObject);
                JSONObject A112 = DbS.A11();
                A112.put("event", qbi.A08);
                A112.put("apn", qbi.A07);
                A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, qbi.A06);
                A112.put("exc", qbi.A05);
                A112.put("ctnr", qbi.A04);
                A112.put("scn_on", qbi.A0A);
                A112.put("s_boot", qbi.A00);
                A112.put("s_mqtt", qbi.A01);
                A112.put("s_net", qbi.A02);
                A112.put("s_scn", qbi.A03);
                A112.put("s_svc", qbi.A04);
                A01(qbi, A112, qbi.A09);
                jSONObject.put("extra", A112);
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                str = "FbnsRegistrationLifecycleEvent";
                0KC.A0I(str, "Failed to serialize", e);
                return jSONObject;
            }
        } else if (this instanceof C7859Qbj) {
            C7859Qbj qbj = (C7859Qbj) this;
            jSONObject = DbS.A11();
            try {
                A00(qbj, jSONObject);
                JSONObject A113 = DbS.A11();
                A113.put("event", qbj.A08);
                A113.put("pnid", qbj.A09);
                A113.put("dpn", qbj.A07);
                A113.put("ctnr", qbj.A04);
                A113.put("exc", qbj.A06);
                A113.put("d_delay_ms", qbj.A00);
                A113.put("scn_on", qbj.A0B);
                A113.put("s_boot", qbj.A01);
                A113.put("s_mqtt", qbj.A02);
                A113.put("s_net", qbj.A03);
                A113.put("s_scn", qbj.A04);
                A113.put("s_svc", qbj.A05);
                A01(qbj, A113, qbj.A0A);
                jSONObject.put("extra", A113);
                return jSONObject;
            } catch (JSONException e3) {
                e = e3;
                str = "FbnsNotifLifecycleEvent";
                0KC.A0I(str, "Failed to serialize", e);
                return jSONObject;
            }
        } else {
            jSONObject = DbS.A11();
            try {
                A00(this, jSONObject);
                jSONObject.put("locale", this.A03);
                jSONObject.put("d_model", this.A02);
                jSONObject.put("d_manuf", this.A01);
                jSONObject.put("net_type", "Unknown");
                jSONObject.putOpt("module", this.A04);
                Map map = this.A06;
                if (!map.isEmpty()) {
                    JSONObject A114 = DbS.A11();
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        C66584MXp.A18(A0u, A114);
                    }
                    jSONObject.put("extra", A114);
                    return jSONObject;
                }
            } catch (JSONException e4) {
                e = e4;
                str = "AnalyticsEvent";
                0KC.A0I(str, "Failed to serialize", e);
                return jSONObject;
            }
            return jSONObject;
        }
    }

    public static void A00(SRO sro, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, sro.A05);
        jSONObject.put("time", S9J.A00(sro.A00));
    }

    public final void A03(Map map) {
        String obj;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String obj2 = A1J.getKey().toString();
            if (A1J.getValue() == null) {
                obj = "";
            } else {
                obj = A1J.getValue().toString();
            }
            this.A06.put(obj2, obj);
        }
    }

    public final String toString() {
        return A02().toString();
    }

    public SRO(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.A00 = System.currentTimeMillis();
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }
}
