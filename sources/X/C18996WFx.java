package X;

/* renamed from: X.WFx  reason: case insensitive filesystem */
public final class C18996WFx implements X0P {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C18996WFx) obj).A00);
    }

    public final int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        return this.A00.hashCode();
    }

    public C18996WFx(int i, boolean z) {
        this.A00 = 002.A0O("anim://", i);
        this.A01 = z;
    }
}
