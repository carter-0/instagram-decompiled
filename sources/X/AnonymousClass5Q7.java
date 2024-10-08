package X;

/* renamed from: X.5Q7  reason: invalid class name */
public final class AnonymousClass5Q7 implements C268024cd {
    public final float A00;
    public final float A01;

    public final /* synthetic */ int EJS(float f) {
        return C289055cw.A01(this, f);
    }

    public final /* synthetic */ float Ezu(long j) {
        return C291905i4.A00(this, j);
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

    public final /* synthetic */ long FH9(float f) {
        return C291905i4.A01(this, f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5Q7) {
                AnonymousClass5Q7 r5 = (AnonymousClass5Q7) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return 002.A0U("DensityImpl(density=", ", fontScale=", ')', this.A00, this.A01);
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

    public AnonymousClass5Q7(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* synthetic */ long FHA(float f) {
        return FH9(Ezv(f));
    }
}
