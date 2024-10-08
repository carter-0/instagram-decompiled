package X;

public final class SIM {
    public final Object A00;
    public final Throwable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SIM)) {
                return false;
            }
            SIM sim = (SIM) obj;
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(sim.A00)) {
                Throwable th = this.A01;
                if (th == null || sim.A01 == null) {
                    return false;
                }
                return JTQ.A1Y(th, th.toString());
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public SIM(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public SIM(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
