package X;

/* renamed from: X.4ZW  reason: invalid class name */
public final class AnonymousClass4ZW {
    public final long A00;
    public final 1UQ A01;
    public final Float A02;
    public final Long A03;
    public final String A04;
    public final byte[] A05;

    public AnonymousClass4ZW(1UQ r2, Float f, Long l, String str, byte[] bArr, long j) {
        0qQ.A0B(str, 1);
        0qQ.A0B(bArr, 3);
        0qQ.A0B(r2, 6);
        this.A04 = str;
        this.A02 = f;
        this.A05 = bArr;
        this.A03 = l;
        this.A00 = j;
        this.A01 = r2;
    }

    public final boolean equals(Object obj) {
        AnonymousClass4ZW r8;
        if (this != obj) {
            if (obj instanceof AnonymousClass4ZW) {
                r8 = (AnonymousClass4ZW) obj;
            } else {
                r8 = null;
            }
            if (r8 == null || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0J(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || this.A00 != r8.A00 || this.A01 != r8.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A04.hashCode() * 31;
        Float f = this.A02;
        int i2 = 0;
        if (f != null) {
            i = f.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Long l = this.A03;
        if (l != null) {
            i2 = l.hashCode();
        }
        long j = this.A00;
        return ((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode();
    }
}
