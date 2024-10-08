package X;

/* renamed from: X.VkA  reason: case insensitive filesystem */
public final class C18030VkA {
    public final C18052Vka A00;
    public final C18046VkU A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18030VkA) {
                C18030VkA vkA = (C18030VkA) obj;
                if (!0qQ.A0K(this.A01, vkA.A01) || !0qQ.A0K(this.A00, vkA.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipInfo(tooltipPositionInfo=");
        sb.append(this.A01);
        sb.append(", tooltipAttributes=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public C18030VkA(C18052Vka vka, C18046VkU vkU) {
        this.A01 = vkU;
        this.A00 = vka;
    }
}
