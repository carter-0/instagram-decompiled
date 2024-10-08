package X;

/* renamed from: X.8op  reason: invalid class name and case insensitive filesystem */
public final class C366378op extends C353538Ia {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C366378op) && this.A00 == ((C366378op) obj).A00);
    }

    public C366378op(boolean z) {
        super("replace_clip_flow");
        this.A00 = z;
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C366378op() {
        this(false);
    }
}
