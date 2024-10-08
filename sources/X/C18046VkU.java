package X;

import android.graphics.RectF;

/* renamed from: X.VkU  reason: case insensitive filesystem */
public final class C18046VkU {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final C16564UxH A03;
    public final C16545Uws A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18046VkU) {
                C18046VkU vkU = (C18046VkU) obj;
                if (!0qQ.A0K(this.A02, vkU.A02) || !0qQ.A0K(this.A01, vkU.A01) || !0qQ.A0K(this.A00, vkU.A00) || this.A04 != vkU.A04 || this.A03 != vkU.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipPositionInfo(tooltipRect=");
        sb.append(this.A02);
        sb.append(", contentRect=");
        sb.append(this.A01);
        sb.append(", arrowRect=");
        sb.append(this.A00);
        sb.append(", tooltipPosition=");
        sb.append(this.A04);
        sb.append(", arrowLocation=");
        return AnonymousClass7TG.A0n(this.A03, sb);
    }

    public C18046VkU(RectF rectF, RectF rectF2, RectF rectF3, C16564UxH uxH, C16545Uws uws) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = uws;
        this.A03 = uxH;
    }
}
