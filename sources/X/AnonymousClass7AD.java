package X;

/* renamed from: X.7AD  reason: invalid class name */
public final class AnonymousClass7AD extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final 2FW A02;
    public final String A03;
    public final String A04;

    public AnonymousClass7AD(2FW r2, String str, String str2, int i, int i2) {
        0qQ.A0B(str2, 5);
        this.A04 = str;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AD) {
                AnonymousClass7AD r5 = (AnonymousClass7AD) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && 0qQ.A0K(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A03.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
