package X;

/* renamed from: X.5gv  reason: invalid class name and case insensitive filesystem */
public final class C291295gv {
    public final AnonymousClass4OI A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C291295gv) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C291295gv(AnonymousClass4OI r1, Integer num, boolean z, boolean z2) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = num;
        this.A02 = z2;
    }
}
