package X;

/* renamed from: X.5ho  reason: invalid class name and case insensitive filesystem */
public final class C291745ho {
    public static final C291745ho A02 = new C291745ho(1.0f, 0.0f);
    public final float A00;
    public final float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291745ho) {
                C291745ho r5 = (C291745ho) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return 002.A0U("TextGeometricTransform(scaleX=", ", skewX=", ')', this.A00, this.A01);
    }

    public C291745ho(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public C291745ho() {
        this(1.0f, 0.0f);
    }
}
