package X;

public abstract class TA2 implements Cloneable {
    public C13541TcD A00 = C11996SkF.A01;

    public boolean equals(Object obj) {
        if (obj instanceof TA2) {
            return this.A00.equals(((TA2) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return C51971G9r.A0E(this.A00);
    }

    /* renamed from: A00 */
    public final TA2 clone() {
        try {
            return (TA2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
