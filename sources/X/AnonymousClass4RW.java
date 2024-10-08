package X;

/* renamed from: X.4RW  reason: invalid class name */
public final class AnonymousClass4RW {
    public static final AnonymousClass4RW A01 = new AnonymousClass4RW(false);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass4RW) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 ^ true ? 1 : 0;
    }

    public AnonymousClass4RW(boolean z) {
        this.A00 = z;
    }
}
