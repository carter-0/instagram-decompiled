package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Rx2  reason: case insensitive filesystem */
public final class C10724Rx2 {
    public final C10160Rnb A00;
    public final String A01;
    public final String A02;
    public final C10163Rne A03;
    public final List A04;

    public C10724Rx2(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        C10163Rne rne = null;
        this.A01 = true == optString.isEmpty() ? null : optString;
        this.A02 = jSONObject.getString("offerIdToken");
        this.A00 = new C10160Rnb(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        this.A03 = optJSONObject2 != null ? new C10163Rne(optJSONObject2) : rne;
        ArrayList A1C = AnonymousClass7TE.A1C();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i = Pxg.A09(A1C, optJSONArray, i)) {
            }
        }
        this.A04 = A1C;
    }
}
