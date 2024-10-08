package X;

/* renamed from: X.Jup  reason: case insensitive filesystem */
public final class C60993Jup extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;

    public C60993Jup(String str, int i, int i2, int i3, long j) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60993Jup) {
                C60993Jup jup = (C60993Jup) obj;
                if (!(0qQ.A0K(this.A04, jup.A04) && this.A01 == jup.A01 && this.A02 == jup.A02 && this.A00 == jup.A00 && this.A03 == jup.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0O(this.A04) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + C51968G9o.A03(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoInfo(filepath=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(404));
        A1A.append(this.A01);
        A1A.append(", width=");
        A1A.append(this.A02);
        A1A.append(", height=");
        A1A.append(this.A00);
        A1A.append(", duration=");
        A1A.append(this.A03);
        return AnonymousClass7TG.A0p(A1A);
    }
}
