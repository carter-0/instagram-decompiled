package X;

/* renamed from: X.Vkb  reason: case insensitive filesystem */
public final class C18053Vkb {
    public final float A00;
    public final float A01;
    public final Boolean A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18053Vkb) {
                C18053Vkb vkb = (C18053Vkb) obj;
                if (Float.compare(this.A00, vkb.A00) != 0 || Float.compare(this.A01, vkb.A01) != 0 || !0qQ.A0K(this.A05, vkb.A05) || !0qQ.A0K(this.A03, vkb.A03) || !0qQ.A0K(this.A04, vkb.A04) || !0qQ.A0K(this.A02, vkb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A00(Float.floatToIntBits(this.A00) * 31, this.A01) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoxShadow(offsetX=");
        sb.append(this.A00);
        sb.append(", offsetY=");
        sb.append(this.A01);
        sb.append(C66579MXk.A00(78));
        sb.append(this.A05);
        sb.append(C273654mx.A00(1039));
        sb.append(this.A03);
        sb.append(", spreadDistance=");
        sb.append(this.A04);
        sb.append(", inset=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }

    public C18053Vkb(Boolean bool, Float f, Float f2, Integer num, float f3, float f4) {
        this.A00 = f3;
        this.A01 = f4;
        this.A05 = num;
        this.A03 = f;
        this.A04 = f2;
        this.A02 = bool;
    }
}
