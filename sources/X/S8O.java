package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.dialog.DialogModule;

public abstract class S8O {
    public static WritableNativeMap A01(Throwable th) {
        0I1.A06("ReactNative", th.getMessage(), th);
        return A00(th.getMessage());
    }

    public static WritableNativeMap A00(String str) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString(DialogModule.KEY_MESSAGE, str);
        return A0U;
    }
}
