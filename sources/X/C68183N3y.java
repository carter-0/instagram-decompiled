package X;

/* renamed from: X.N3y  reason: case insensitive filesystem */
public final class C68183N3y extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C69292Nis A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68183N3y) {
                C68183N3y n3y = (C68183N3y) obj;
                if (!(this.A06 == n3y.A06 && this.A02 == n3y.A02 && this.A03 == n3y.A03 && this.A05 == n3y.A05 && this.A04 == n3y.A04 && this.A00 == n3y.A00 && this.A01 == n3y.A01 && this.A07 == n3y.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((this.A06 * 31) + this.A02) * 31) + this.A03) * 31) + this.A05) * 31) + this.A04) * 31) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A07);
    }

    public C68183N3y(C69292Nis nis, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A05 = i4;
        this.A04 = i5;
        this.A00 = i6;
        this.A01 = i7;
        this.A07 = nis;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FloatingViewState(width=");
        A1A.append(this.A06);
        A1A.append(", height=");
        A1A.append(this.A02);
        A1A.append(", leftMargin=");
        A1A.append(this.A03);
        A1A.append(", topMargin=");
        A1A.append(this.A05);
        A1A.append(", rightMargin=");
        A1A.append(this.A04);
        A1A.append(", bottomMargin=");
        A1A.append(this.A00);
        A1A.append(", cornerRadius=");
        A1A.append(this.A01);
        A1A.append(", corner=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }

    public C68183N3y() {
        this((C69292Nis) null, 0, 0, 0, 0, 0, 0, 0);
    }
}
