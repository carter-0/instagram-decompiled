package X;

/* renamed from: X.T4f  reason: case insensitive filesystem */
public final class C12721T4f implements C13746TgI {
    public C11357SOt A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final T4Y A03;

    public C12721T4f(T4Y t4y) {
        this.A03 = t4y;
    }

    public final C13746TgI A7R(String str) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A05(this.A00, str, this.A02);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final C13746TgI A7S(boolean z) {
        if (!this.A01) {
            this.A01 = true;
            this.A03.A03(this.A00, z ? 1 : 0, this.A02);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
