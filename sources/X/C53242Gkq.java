package X;

import com.facebook.proxygen.TraceFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Gkq  reason: case insensitive filesystem */
public final class C53242Gkq extends C55912HpZ {
    public final void A01(C69421Nl3 nl3) {
        JSONObject jSONObject;
        Object obj;
        if (nl3 == null) {
            try {
                jSONObject = this.A00;
                obj = JSONObject.NULL;
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject = this.A00;
            obj = nl3.toString();
        }
        jSONObject.put(TraceFieldType.ContentType, obj);
    }

    public final void A02(C69420Nl2 nl2) {
        JSONObject jSONObject;
        Object obj;
        if (nl2 == null) {
            try {
                jSONObject = this.A00;
                obj = JSONObject.NULL;
            } catch (JSONException unused) {
                return;
            }
        } else {
            jSONObject = this.A00;
            obj = nl2.toString();
        }
        jSONObject.put("action_type", obj);
    }

    public final /* bridge */ /* synthetic */ void A03(JLW jlw) {
        C55912HpZ hpZ = (C55912HpZ) jlw;
        String A00 = C66579MXk.A00(850);
        if (hpZ == null) {
            try {
                this.A00.put(A00, JSONObject.NULL);
            } catch (JSONException unused) {
            }
        } else {
            this.A00.put(A00, hpZ.A00);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(String str) {
        A00(Q2N.A01(19, 8, 41), str);
    }

    public C53242Gkq() {
        super(DbS.A11());
    }
}
