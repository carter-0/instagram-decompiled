package X;

/* renamed from: X.5aR  reason: invalid class name */
public final class AnonymousClass5aR extends AnonymousClass0T0 implements C287085Yy {
    public final float A00;
    public final float A01;
    public final float A02;

    public final C267804cE AKt(C287615aU r5) {
        0qQ.A0B(r5, 0);
        return new C288775cS(r5, this.A01, this.A00, this.A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5aR) {
                AnonymousClass5aR r5 = (AnonymousClass5aR) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(0.0f, 0.0f) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(0.0f);
    }

    public AnonymousClass5aR(float f, float f2) {
        this.A01 = 0.9f;
        this.A00 = f;
        this.A02 = f2;
    }

    public AnonymousClass5aR() {
        this(400.0f, 400.0f);
    }
}
