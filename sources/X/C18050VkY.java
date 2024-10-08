package X;

import android.util.SizeF;

/* renamed from: X.VkY  reason: case insensitive filesystem */
public final class C18050VkY {
    public final float A00;
    public final float A01;
    public final float A02;
    public final SizeF A03;
    public final SizeF A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18050VkY) {
                C18050VkY vkY = (C18050VkY) obj;
                if (!0qQ.A0K(this.A03, vkY.A03) || Float.compare(this.A00, vkY.A00) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A03) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundedRect(size=");
        sb.append(this.A03);
        sb.append(", radius=");
        sb.append(this.A00);
        return AnonymousClass7TG.A0p(sb);
    }

    public C18050VkY(SizeF sizeF, float f) {
        this.A03 = sizeF;
        this.A00 = f;
        float f2 = 6.2831855f * f;
        float f3 = f * 2.0f;
        this.A04 = new SizeF(sizeF.getWidth() - f3, sizeF.getHeight() - f3);
        this.A02 = (((sizeF.getWidth() * 2.0f) + (sizeF.getHeight() * 2.0f)) - (f * 8.0f)) + f2;
        this.A01 = f2 / 4.0f;
    }
}
