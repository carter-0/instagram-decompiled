package X;

/* renamed from: X.Vke  reason: case insensitive filesystem */
public final class C18056Vke {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18056Vke) {
                C18056Vke vke = (C18056Vke) obj;
                if (!(this.A05 == vke.A05 && this.A04 == vke.A04 && this.A02 == vke.A02 && this.A03 == vke.A03 && this.A01 == vke.A01 && this.A00 == vke.A00 && this.A07 == vke.A07 && this.A06 == vke.A06 && this.A08 == vke.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A08, ((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnComputePositionInfo(screenWidth=");
        sb.append(this.A05);
        sb.append(", screenHeight=");
        sb.append(this.A04);
        sb.append(", anchorX=");
        sb.append(this.A02);
        sb.append(", anchorY=");
        sb.append(this.A03);
        sb.append(", anchorWidth=");
        sb.append(this.A01);
        sb.append(", anchorHeight=");
        sb.append(this.A00);
        sb.append(", tooltipIntrinsicWidth=");
        sb.append(this.A07);
        sb.append(", tooltipIntrinsicHeight=");
        sb.append(this.A06);
        sb.append(", isRtl=");
        return G9t.A1C(sb, this.A08);
    }

    public C18056Vke(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }
}
