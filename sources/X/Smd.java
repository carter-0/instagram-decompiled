package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class Smd implements C13802ThL {
    public JSONObject A00;

    public final int AoV() {
        try {
            return this.A00.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        } catch (JSONException unused) {
            return 0;
        }
    }

    public final String Bt6() {
        try {
            return this.A00.getString("severity");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String C2w() {
        try {
            return this.A00.getString("summary");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getDescription() {
        try {
            return this.A00.getString(DevServerEntity.COLUMN_DESCRIPTION);
        } catch (JSONException unused) {
            return null;
        }
    }
}
