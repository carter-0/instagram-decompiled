package X;

public final class NPI extends AnonymousClass4AA {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NPI) && Float.compare(this.A00, ((NPI) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public NPI(float f) {
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
