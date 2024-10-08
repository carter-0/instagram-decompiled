package X;

/* renamed from: X.7hJ  reason: invalid class name and case insensitive filesystem */
public final class C338037hJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C338037hJ r5 = (C338037hJ) obj;
            return this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A06 == r5.A06 && this.A05 == r5.A05;
        }
        return false;
    }

    public final C338037hJ A00(C338037hJ r10) {
        return new C338037hJ(this.A02 + r10.A02, this.A04 + r10.A04, this.A03 + r10.A03, this.A01 + r10.A01, this.A00 + r10.A00, this.A07 + r10.A07, this.A06 + r10.A06, r10.A05 + this.A05);
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + this.A04) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31) + this.A05;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeSetStats{mEffectiveChangesCount=");
        sb.append(this.A02);
        sb.append(", mInsertSingleCount=");
        sb.append(this.A04);
        sb.append(", mInsertRangeCount=");
        sb.append(this.A03);
        sb.append(", mDeleteSingleCount=");
        sb.append(this.A01);
        sb.append(", mDeleteRangeCount=");
        sb.append(this.A00);
        sb.append(", mUpdateSingleCount=");
        sb.append(this.A07);
        sb.append(", mUpdateRangeCount=");
        sb.append(this.A06);
        sb.append(", mMoveCount=");
        sb.append(this.A05);
        sb.append('}');
        return sb.toString();
    }

    public C338037hJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = i6;
        this.A06 = i7;
        this.A05 = i8;
    }

    public C338037hJ() {
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07 = 0;
        this.A06 = 0;
        this.A05 = 0;
    }
}
