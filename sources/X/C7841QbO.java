package X;

import com.facebook.react.bridge.WritableNativeMap;

/* renamed from: X.QbO  reason: case insensitive filesystem */
public final class C7841QbO extends W0S {
    public final String A00;
    public final String A01;

    public final String A07() {
        return "topMessage";
    }

    public final boolean A0D() {
        return false;
    }

    public C7841QbO(int i, int i2, String str, String str2) {
        super(i, i2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C13948Tm8 A05() {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("data", this.A00);
        A0U.putString("origin", this.A01);
        return A0U;
    }
}
