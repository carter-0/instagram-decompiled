package X;

import java.util.List;

/* renamed from: X.VkZ  reason: case insensitive filesystem */
public final class C18051VkZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C307996Sh A03;
    public final C307996Sh A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18051VkZ) {
                C18051VkZ vkZ = (C18051VkZ) obj;
                if (!0qQ.A0K(this.A04, vkZ.A04) || !0qQ.A0K(this.A03, vkZ.A03) || !0qQ.A0K(this.A05, vkZ.A05) || this.A00 != vkZ.A00 || this.A01 != vkZ.A01 || this.A02 != vkZ.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A04))) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalSplitPaneLayoutData(topSectionRenderResult=");
        sb.append(this.A04);
        sb.append(", bottomSectionRenderResult=");
        sb.append(this.A03);
        sb.append(", detentPixels=");
        sb.append(this.A05);
        sb.append(", initialDetent=");
        sb.append(this.A00);
        sb.append(", topSectionMinHeight=");
        sb.append(this.A01);
        sb.append(", totalHeight=");
        return C51975G9x.A0j(sb, this.A02);
    }

    public C18051VkZ(C307996Sh r1, C307996Sh r2, List list, int i, int i2, int i3) {
        this.A04 = r1;
        this.A03 = r2;
        this.A05 = list;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
