package X;

import org.json.JSONObject;

/* renamed from: X.Rxn  reason: case insensitive filesystem */
public final class C10769Rxn {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C10769Rxn(JSONObject jSONObject) {
        this.A05 = jSONObject.optString("billingPeriod");
        this.A04 = jSONObject.optString("priceCurrencyCode");
        this.A03 = jSONObject.optString("formattedPrice");
        this.A02 = jSONObject.optLong("priceAmountMicros");
        this.A01 = jSONObject.optInt("recurrenceMode");
        this.A00 = jSONObject.optInt("billingCycleCount");
    }
}
