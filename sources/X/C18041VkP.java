package X;

/* renamed from: X.VkP  reason: case insensitive filesystem */
public final class C18041VkP {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18041VkP) {
                C18041VkP vkP = (C18041VkP) obj;
                if (!(this.A03 == vkP.A03 && Float.compare(this.A00, vkP.A00) == 0 && Float.compare(this.A01, vkP.A01) == 0 && Float.compare(this.A02, vkP.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A00(AnonymousClass7TF.A00(this.A03 * 31, this.A00), this.A01) + Float.floatToIntBits(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C273654mx.A00(1377));
        sb.append(this.A03);
        sb.append(", offsetX=");
        sb.append(this.A00);
        sb.append(", offsetY=");
        sb.append(this.A01);
        sb.append(", radius=");
        sb.append(this.A02);
        return AnonymousClass7TG.A0p(sb);
    }

    public C18041VkP(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }
}
