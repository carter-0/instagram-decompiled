package X;

/* renamed from: X.5hn  reason: invalid class name and case insensitive filesystem */
public final class C291735hn {
    public final float A00;

    public final boolean equals(Object obj) {
        float f = this.A00;
        if (!(obj instanceof C291735hn) || Float.compare(f, ((C291735hn) obj).A00) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("BaselineShift(multiplier=", ')', this.A00);
    }

    public /* synthetic */ C291735hn(float f) {
        this.A00 = f;
    }
}
