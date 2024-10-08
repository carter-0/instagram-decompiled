package X;

/* renamed from: X.Vkd  reason: case insensitive filesystem */
public final class C18055Vkd {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18055Vkd) {
                C18055Vkd vkd = (C18055Vkd) obj;
                if (!(Float.compare(this.A00, vkd.A00) == 0 && Float.compare(this.A03, vkd.A03) == 0 && Float.compare(this.A01, vkd.A01) == 0 && Float.compare(this.A04, vkd.A04) == 0 && Float.compare(this.A02, vkd.A02) == 0 && Float.compare(this.A05, vkd.A05) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A03), this.A01), this.A04), this.A02) + Float.floatToIntBits(this.A05);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathCubicCommandArgs(x1=");
        sb.append(this.A00);
        sb.append(", y1=");
        sb.append(this.A03);
        sb.append(", x2=");
        sb.append(this.A01);
        sb.append(", y2=");
        sb.append(this.A04);
        sb.append(", x3=");
        sb.append(this.A02);
        sb.append(", y3=");
        sb.append(this.A05);
        return AnonymousClass7TG.A0p(sb);
    }

    public C18055Vkd(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A05 = f6;
    }
}
