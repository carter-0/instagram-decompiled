package X;

import org.json.JSONObject;

/* renamed from: X.QNv  reason: case insensitive filesystem */
public final class C7605QNv extends AnonymousClass3FZ implements AnonymousClass4LE {
    public final boolean BJ0() {
        return A06("is_basic_ads_opted_in");
    }

    public final boolean BJ1() {
        return A06("is_basic_ads_youth");
    }

    public final 1Az C7A() {
        return A04("tier", 1Az.A0B);
    }

    public final boolean CJw() {
        return !this.A00.isNull("is_basic_ads_opted_in");
    }

    public final boolean CJx() {
        return !this.A00.isNull("is_basic_ads_youth");
    }

    public C7605QNv(JSONObject jSONObject) {
        super(jSONObject);
    }
}
