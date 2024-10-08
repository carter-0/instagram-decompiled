package X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.Sp5  reason: case insensitive filesystem */
public final class C12207Sp5 implements C13565Tck {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public C12207Sp5(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
    }

    public final void Dx1(double d) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putInt("tag", this.A00);
        A0U.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, d);
        QZK reactApplicationContextIfActiveOrWarn = this.A01.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("onAnimatedValueUpdate", A0U);
        }
    }
}
