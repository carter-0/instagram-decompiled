package X;

public final class QQo extends C7618QQi implements C13945Tlr {
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

    public QQo(RFF rff, C10550Ru4 ru4, C11000S4u s4u) {
        super(ru4, s4u);
        this.A00 = rff;
    }

    public final int hashCode() {
        return Pxf.A0A(Integer.valueOf(super.hashCode()), this.A00);
    }
}
