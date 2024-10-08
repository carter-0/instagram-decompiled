package X;

public final class Ahw implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            Ahw ahw = (Ahw) obj;
            if (!(this.A00 == ahw.A00 && this.A01 == ahw.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * true) + C393169w0.A00(this.A00);
    }

    /* renamed from: A00 */
    public final Ahw clone() {
        try {
            Object clone = super.clone();
            0qQ.A0C(clone, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.enhancerenderer.EnhanceRenderer.CopyRendererProgramConfig");
            return (Ahw) clone;
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
