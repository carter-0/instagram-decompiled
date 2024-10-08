package X;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.QYi  reason: case insensitive filesystem */
public final class C7823QYi extends S2L {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E;
    public final S5X A0F;

    public static final boolean A00(C7823QYi qYi) {
        S5X s5x = qYi.A0F;
        if (Math.abs(s5x.A01) > qYi.A04) {
            return false;
        }
        if (Math.abs(qYi.A01 - s5x.A00) <= qYi.A00 || qYi.A07 == 0.0d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.S5X] */
    public C7823QYi(ReadableMap readableMap) {
        ? obj = new Object();
        obj.A00 = 0.0d;
        obj.A01 = 0.0d;
        this.A0F = obj;
        obj.A01 = readableMap.getDouble("initialVelocity");
        A01(readableMap);
    }
}
