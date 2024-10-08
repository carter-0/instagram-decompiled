package X;

/* renamed from: X.GyB  reason: case insensitive filesystem */
public final class C54026GyB extends HPB {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54026GyB) {
                C54026GyB gyB = (C54026GyB) obj;
                if (!(Float.compare(this.A00, gyB.A00) == 0 && Float.compare(this.A01, gyB.A01) == 0 && Float.compare(this.A02, gyB.A02) == 0 && Float.compare(this.A03, gyB.A03) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(float f) {
        float A012 = C229632nm.A01((f - this.A00) / this.A01);
        float f2 = this.A02;
        return f2 + ((this.A03 - f2) * A012);
    }

    public final int hashCode() {
        return C51966G9m.A02(AnonymousClass7TF.A00(AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01), this.A02), this.A03);
    }

    public C54026GyB(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
