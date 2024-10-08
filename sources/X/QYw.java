package X;

import com.facebook.react.bridge.ReadableMap;

public final class QYw extends QYz {
    public final double A00;
    public final int A01;
    public final C11404SSb A02;

    public QYw(C11404SSb sSb, ReadableMap readableMap) {
        super((ReadableMap) null);
        this.A02 = sSb;
        this.A01 = readableMap.getInt("input");
        this.A00 = readableMap.getDouble("modulus");
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "NativeAnimatedNodesManager[", A1A);
        A1A.append("] inputNode: ");
        A1A.append(this.A01);
        A1A.append(" modulus: ");
        A1A.append(this.A00);
        A1A.append(" super: ");
        return AnonymousClass7TF.A0l(super.A03(), A1A);
    }
}
