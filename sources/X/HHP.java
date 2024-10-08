package X;

public final class HHP extends C54718HPx {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HHP) && Float.compare(this.A00, ((HHP) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("RoundedSquare(cornerRadiusDp=", ')', this.A00);
    }

    public HHP(float f) {
        this.A00 = f;
    }
}
