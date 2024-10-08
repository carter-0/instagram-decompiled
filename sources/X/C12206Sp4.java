package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.Sp4  reason: case insensitive filesystem */
public final class C12206Sp4 implements C13565Tck {
    public final /* synthetic */ int A00;
    public final /* synthetic */ QYp A01;

    public C12206Sp4(QYp qYp, int i) {
        this.A01 = qYp;
        this.A00 = i;
    }

    public final void Dx1(double d) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putInt("tag", this.A00);
        A0U.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, d);
        QZK reactApplicationContextIfActiveOrWarn = ((BaseJavaModule) this.A01.A02).getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("onAnimatedValueUpdate", A0U);
        }
    }
}
