package X;

/* renamed from: X.5QL  reason: invalid class name */
public final class AnonymousClass5QL implements C268024cd {
    public final float A00;
    public final float A01;
    public final AnonymousClass5QJ A02;

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezw(int i) {
        return ((float) i) / this.A00;
    }

    public final /* synthetic */ long Ezx(long j) {
        return C289055cw.A03(this, j);
    }

    public final /* synthetic */ float F05(long j) {
        return C289055cw.A00(this, j);
    }

    public final /* synthetic */ long FH8(long j) {
        return C289055cw.A04(this, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5QL) {
                AnonymousClass5QL r5 = (AnonymousClass5QL) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DensityWithConverter(density=");
        sb.append(this.A00);
        sb.append(", fontScale=");
        sb.append(this.A01);
        sb.append(", converter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final float AwL() {
        return this.A00;
    }

    public final float B77() {
        return this.A01;
    }

    public final /* synthetic */ float Ezv(float f) {
        return f / this.A00;
    }

    public final /* synthetic */ float F06(float f) {
        return f * this.A00;
    }

    public final long FH9(float f) {
        return AnonymousClass5Z7.A00(this.A02.AJw(f), 4294967296L);
    }

    public AnonymousClass5QL(AnonymousClass5QJ r1, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = r1;
    }

    public final float Ezu(long j) {
        if (AnonymousClass5Z5.A01(j) == 4294967296L) {
            return this.A02.AK0(AnonymousClass5Z5.A00(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
