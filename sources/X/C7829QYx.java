package X;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.QYx  reason: case insensitive filesystem */
public final class C7829QYx extends QYz {
    public double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final C11404SSb A04;

    public C7829QYx(C11404SSb sSb, ReadableMap readableMap) {
        super((ReadableMap) null);
        this.A04 = sSb;
        this.A03 = readableMap.getInt("input");
        this.A02 = readableMap.getDouble("min");
        this.A01 = readableMap.getDouble("max");
        this.A00 = this.A00;
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "DiffClampAnimatedNode[", A1A);
        A1A.append("]: InputNodeTag: ");
        A1A.append(this.A03);
        A1A.append(" min: ");
        A1A.append(this.A02);
        A1A.append(" max: ");
        A1A.append(this.A01);
        A1A.append(" lastValue: ");
        A1A.append(this.A00);
        A1A.append(" super: ");
        return AnonymousClass7TF.A0l(super.A03(), A1A);
    }
}
