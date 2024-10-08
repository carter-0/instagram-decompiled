package X;

/* renamed from: X.Ht5  reason: case insensitive filesystem */
public final class C56118Ht5 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C56118Ht5)) {
            return false;
        }
        C56118Ht5 ht5 = (C56118Ht5) obj;
        if (ht5.A01 == this.A01 && ht5.A00 == this.A00 && ht5.A03 == this.A03 && ht5.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A00(Float.floatToIntBits(this.A01) * 31, this.A00)) + this.A02;
    }

    public C56118Ht5(float f, float f2, int i, long j) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = j;
        this.A02 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RotaryScrollEvent(verticalScrollPixels=");
        A1A.append(this.A01);
        A1A.append(",horizontalScrollPixels=");
        A1A.append(this.A00);
        A1A.append(",uptimeMillis=");
        A1A.append(this.A03);
        A1A.append(",deviceId=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }
}
