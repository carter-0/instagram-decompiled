package X;

/* renamed from: X.VkF  reason: case insensitive filesystem */
public final class C18035VkF {
    public final Object A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C18035VkF vkF = (C18035VkF) obj;
            if (this.A01 == vkF.A01) {
                Object obj2 = this.A00;
                Object obj3 = vkF.A00;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                return obj3 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + C51971G9r.A0E(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeneratorValue{done=");
        sb.append(this.A01);
        sb.append(", value=");
        return Pxg.A0p(this.A00, sb);
    }

    public C18035VkF(boolean z, Object obj) {
        this.A01 = z;
        this.A00 = obj;
    }
}
