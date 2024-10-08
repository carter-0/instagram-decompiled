package X;

/* renamed from: X.Tvi  reason: case insensitive filesystem */
public final class C14413Tvi extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final int A05;
    public final int A06;

    public C14413Tvi(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass7TF.A1E(str, 1, str2);
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A04 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14413Tvi) {
                C14413Tvi tvi = (C14413Tvi) obj;
                if (!(0qQ.A0K(this.A03, tvi.A03) && this.A00 == tvi.A00 && this.A01 == tvi.A01 && this.A05 == tvi.A05 && this.A06 == tvi.A06 && this.A02 == tvi.A02 && 0qQ.A0K(this.A04, tvi.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A04, (((((((((AnonymousClass7TE.A0O(this.A03) + this.A00) * 31) + this.A01) * 31) + this.A05) * 31) + this.A06) * 31) + this.A02) * 31);
    }
}
