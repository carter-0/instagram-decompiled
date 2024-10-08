package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.QbM  reason: case insensitive filesystem */
public final class C7839QbM extends W0S {
    public final int A00;
    public final int A01;

    public final String A07() {
        return "topContentSizeChange";
    }

    public C7839QbM(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.A01 = i3;
        this.A00 = i4;
    }

    public final C13948Tm8 A05() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putDouble(IgReactMediaPickerNativeModule.WIDTH, Pxe.A01(this.A01));
        A0U.putDouble(IgReactMediaPickerNativeModule.HEIGHT, Pxe.A01(this.A00));
        return A0U;
    }
}
