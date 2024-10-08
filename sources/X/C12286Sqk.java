package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.Sqk  reason: case insensitive filesystem */
public final class C12286Sqk implements C13585TdB {
    public final long A00;
    public final long A01;
    public final long A02;
    public final /* synthetic */ C12288Sqm A03;

    public C12286Sqk(C12288Sqm sqm, long j, long j2, long j3) {
        this.A03 = sqm;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public final JSONObject Ezz() {
        JSONObject A11 = DbS.A11();
        A11.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.A01);
        A11.put("data", this.A02);
        A11.put("cache", this.A00);
        return A11;
    }
}
