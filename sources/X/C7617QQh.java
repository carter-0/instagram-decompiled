package X;

/* renamed from: X.QQh  reason: case insensitive filesystem */
public abstract class C7617QQh extends C12172SoN implements C13945Tlr {
    public final RFF A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7617QQh) && super.equals(obj) && this.A00 == ((C7617QQh) obj).A00;
        }
        return true;
    }

    public final RFF B2A() {
        return this.A00;
    }

    public C7617QQh(RFF rff, C11000S4u s4u) {
        super(s4u);
        this.A00 = rff;
    }

    public final int hashCode() {
        return Pxf.A0A(Integer.valueOf(super.hashCode()), this.A00);
    }
}
