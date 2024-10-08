package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class S9C {
    public static WritableNativeMap A00(String str, int i) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i);
        if (str != null) {
            A0U.putString(DialogModule.KEY_MESSAGE, str);
        }
        A0U.putInt("PERMISSION_DENIED", 1);
        A0U.putInt("POSITION_UNAVAILABLE", 2);
        A0U.putInt("TIMEOUT", 3);
        return A0U;
    }
}
